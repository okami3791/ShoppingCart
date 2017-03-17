<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping</title>
</head>
<body bgColor = skyblue>
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>
<form action="ShopServ" method="get">
<h3 align="center"> You have Selected the Following Books</h3><br>
<table bgColor=lightsteelblue align=center>
<tr>
<td>Book Name :: </td><td><% out.print(session.getAttribute("n")); %></td>
</tr>
<tr>
<td>Author :: </td><td><%out.print(session.getAttribute("a")); %></td>
</tr>
<tr>
<td>Price ::</td><td><%out.print(session.getAttribute("p")); %></td>
<tr>
<td><h4>Please select the number of books required ::</h4></td></tr>
<tr>
<td>Quantity ::</td><td><input type="text" name="quan"></td>
</tr>
<tr>
<td><input type="submit" name="Purchase" value="Purchase"></td>
<td><input type="button" value="Cancel" onclick = "document.location.href='BookDB.jsp'"></td>
</tr>

</table>
<input type="button" value="Logout" onclick ="document.location.href='Logout'">
</form>
</body>
</html>