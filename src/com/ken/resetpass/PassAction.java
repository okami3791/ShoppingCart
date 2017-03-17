package com.ken.resetpass;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class PassAction {

	 public boolean passUpdate( String usr ,String pass, String pass2){
	        String query,query2;
	        String dbUsername;
	        boolean login = false;
	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
	            Statement stmt = (Statement) con.createStatement();
	            query = "SELECT m_no FROM userinfo;";
	            
	            stmt.executeQuery(query);
	            ResultSet rs = stmt.getResultSet();

	            while(rs.next()){
	                dbUsername = rs.getString("m_no");	                
	                if(pass.equals(pass2) && dbUsername.equals(usr) )
	                {
	                	stmt.executeUpdate("UPDATE userinfo SET pass ='"+pass2+"' WHERE m_no='"+dbUsername+"'");
	                	login = true;
	                }
	            }
	        } catch (InstantiationException e) {
	            e.printStackTrace();
	        } catch (IllegalAccessException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return login;
	    }
}