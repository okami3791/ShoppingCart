<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgColor = skyblue>
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>
<form action="LoginServ" method="get">
<h2 align="center">Enter UserName and Password</h2><br>
<table bgColor=lightsteelblue align=center>
<tr>
<td>UserName(mobile number) ::</td>
<td><input type="text"  name="username"/><br></td>
</tr>
<tr>
<td>Password  :: </td>
<td><input type="password"  name="password"/><br></td>
</tr>
<tr>
<td><input type="button" value= "SignUp" name="Sign Up" onclick ="document.location.href='SignUp.jsp'"/></td>
<td><input type="submit" value="Login" name="Login"/><br></td>
</tr>
<tr>
<td><a href="ForgotPswd.jsp">Forgot Password?</a>
</td>
</tr>
</table>
</form>
</body>
</html>