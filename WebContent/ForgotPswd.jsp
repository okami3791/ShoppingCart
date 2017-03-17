<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Forgot Password</title>
    
</head>
<body bgColor=skyblue >

<form action="PassServ" method="get">
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>
<H4 align=center><U>Update Password</U></H4>
<table bgColor=lightsteelblue align=center>
<tr>
<td>Enter UserName(Mobile Number) ::</td><td><input type="text" name="usr"/></td>
</tr>
<tr>
<td>Enter New Password ::</td><td> <input type="password" name="newpass"/></td>
</tr>
<tr>
<td>Re-Enter New Password ::</td><td> <input type="password" name ="newpass2"></td>
</tr>
<tr>
<td><input  align="middle" type="submit" value="Submit" name="submit"></td>
</tr>
</table>
<input type="button" value="Logout" onclick ="document.location.href='Logout'">
</form>
</body>
</html>
