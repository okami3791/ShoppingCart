package com.ken.login;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class LoginAction {
	
	 String dbName,dbMobile,dbCity;
	 
	 public boolean loginCheck(String username, String password){
	        String query;
	        String dbUsername, dbPassword;
	        boolean login = false;

	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
	            Statement stmt = (Statement) con.createStatement();
	            query = "SELECT m_no, pass, name,city FROM userinfo;";
	            stmt.executeQuery(query);
	            ResultSet rs = stmt.getResultSet();

	            while(rs.next()){
	                dbUsername = rs.getString("m_no");
	                dbPassword = rs.getString("pass");
	                
	                if(dbUsername.equals(username) && dbPassword.equals(password)){
	                    dbName =rs.getString("name");
	                    dbCity = rs.getString("city");
	                    dbMobile = rs.getString("m_no");
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

	public String custName()
	{
		return dbName;
	}
	public String Mobile()
	{
		return dbMobile;
	}
	public String City()
	{
		return dbCity;
	}
	

}
