<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Cart</title>
</head>
<body bgcolor="skyblue">
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>

<form action="CartServ" method="get">
<h4 align="center">Order details ::</h4>
<table bgColor=lightsteelblue align=center>
<tr>
<td>Customer name ::</td><td><%out.print(session.getAttribute("custname")); %></td>
</tr>
<tr>
<td>City ::</td><td><%out.print(session.getAttribute("city")); %></td>
</tr>
<tr>
<td>Phone Number ::</td><td><%out.print(session.getAttribute("mobile")); %></td>
</tr>
</table>

<h3 align="center">You have selected the following ::</h3>
<table bgColor=lightsteelblue align=center>
<tr>
<td>Book Name :: </td><td><% out.print(session.getAttribute("n")); %></td>
</tr>
<tr>
<td>Author :: </td><td><%out.print(session.getAttribute("a")); %></td>
</tr>
<tr>
<td>Price ::</td><td><%out.print(session.getAttribute("p")); %></td>
</tr>
<tr>
<td>Quantity ::</td><td><%out.print(session.getAttribute("quan")); %></td>
</tr>
<tr>
<td><input type="submit" name="Confirm" value="Confirm"></td>
<td><input type="button" value="Cancel" onclick = "document.location.href='BookDB.jsp'"></td>
</tr>

</table>
<input type="button" value="Logout" onclick ="document.location.href='Logout'">
</form></html>