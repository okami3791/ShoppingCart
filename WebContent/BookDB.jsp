<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Book DataBase</title>
</head>
<body bgColor = skyblue>
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<form action="BookServ" method="get">
<table>
<tr>
<td><h2>Welcome :<%out.print(session.getAttribute("custname")); %></h2>
</tr>
</table>
<table border="5" align="center" bgColor=lightsteelblue>
   <tr>
   		<td>Select Bk</td>
        <td>Book ID</td>
        <td>Book Name</td>
        <td>Author</td>
        <td>Price</td>
   </tr>
   <%
   
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost/bookdb";
       String username="root";
       String password="root";
       String query="select * from bookdet";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
   %>
           <tr>
           <td><input type="radio" NAME="rbutt" value="<%=rs.getString("bookid")%>"></td>
           <td><%=rs.getString("bookid") %></td>
           <td><%=rs.getString("bookname") %></td>
           <td><%=rs.getString("author") %></td>
           <td><%=rs.getInt("price") %></td>
 		   </tr>
 		     
   <%
       }
   %>
  
   <tr>
   <td><input type="submit" value="Submit"> 
   </table>
   <%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
   <input type="button" value="Logout" align="left" onclick ="document.location.href='Logout'">
</form>`
</body>
</html>
