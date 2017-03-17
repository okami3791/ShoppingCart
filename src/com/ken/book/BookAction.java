package com.ken.book;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.hibernate.mapping.Array;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BookAction {

	public Book BookURL(String ID)
	{
		 Book bk=null;
		String query;
		String bkid = null,bknm=null,aut=null,pri=null;
		String val=null;
		
	  try {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb", "root", "root");
          Statement stmt = (Statement) con.createStatement();
          query = "SELECT bookid,bookname,author, price FROM bookdet;";
          stmt.executeQuery(query);
          ResultSet rs = stmt.getResultSet();
          
          while(rs.next()){
        	  bkid = rs.getString("bookid");
        	  if(bkid.equals(ID))
        	  {
             	  bknm = rs.getString("bookname");
             	  aut = rs.getString("author");
             	  pri = rs.getString("price");
                  bk = new Book();
                  bk.setBookid(bkid);
                  bk.setBookname(bknm);
                  bk.setAuthor(aut);
                  bk.setPrice(pri);
                  } 
        	  }
          }
	  catch (InstantiationException e) {
          e.printStackTrace();
      } catch (IllegalAccessException e) {
          e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      } catch (SQLException e) {
          e.printStackTrace();
      }
	return bk;
  }
}
