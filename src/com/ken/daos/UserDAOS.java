package com.ken.daos;

import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import beans.UserInfo;

public class UserDAOS {
	static Connection con = null;
	static PreparedStatement pst = null;
	
	public UserDAOS()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insertUser(String m_no,String pass,String email,String add1 ,String add2,String pin,String city,String name)
	{
		try
		{
        pst = (PreparedStatement) con.prepareStatement("Insert into userinfo values(?,?,?,?,?,?,?,?)");
		
		pst.setString(1, m_no);
		pst.setString(2, pass);
		pst.setString(3, email);
		pst.setString(4, add1);
		pst.setString(5, add2);
		pst.setString(6, pin);
		pst.setString(7, city);
		pst.setString(8,name);
		
		int i = pst.executeUpdate();
		if (i!=0)
		{
			return true;
		}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;	
	}
}
