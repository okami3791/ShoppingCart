package com.ken.shop;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CartDAO {

	static Connection con = null;
	static PreparedStatement pst = null;
	
	public CartDAO()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/custdb","root","root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public boolean insertCust(int oid,String custnm,String custno, String custcity ,String custqty,String bkid,String date)
	{
		try
		{
			pst = (PreparedStatement) con.prepareStatement("Insert into customer_details values(?,?,?,?,?,?,?)");
			pst.setInt(1, oid);
			pst.setString(2, custnm);
			pst.setString(3, custno);
			pst.setString(4, custcity);
			pst.setString(5, custqty);
			pst.setString(6, bkid);
			pst.setString(7, date);
			
			int i = pst.executeUpdate();
			if (i!=0){
			return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;		
	}
}