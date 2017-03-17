<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body bgColor = skyblue>
<table bgColor=#0070BB width=100%>
<tr>
<td>
<h1 align="center">ONLINE SHOPPING STORE FOR BOOKS.</h1>
</td>
</tr>
</table>
<form action="UserServ" method="get">
<h3 align="center"><u> Please Enter the Following details ::</u><br>
<sub>((*)Marked are mandatory )</sub><br>
<br>
</h3>
<table bgColor=lightsteelblue align=center>
<tr>
<td>Name ::</td><td><input type="text" name= "name"></td>
</tr>
<tr>
<td>Mobile Number ::</td><td> <input type="text" name="m_no" >*</td>
</tr>
<tr>
<td>Password ::</td><td> <input type="password" name="pass">*</td>
</tr>
<tr>
<td>Email ID ::</td><td> <input type="text" name="email">*</td>
</tr>
<tr>
<td>Address Line 1 ::</td><td> <input type="text" name="add1">*</td>
</tr>
<tr>
<td>Address Line 2 ::</td><td> <input type="text" name="add2"><br></td>
</tr>
<tr>
<td>City ::</td><td><input type="text" name="city">*</td>
</tr>
<tr>
<td>Pin Code ::</td><td> <input type="text" name="pin">*</td>
</tr>
<tr>
<td><input type="submit" value="Submit">
</table>


</form>
</body>

</html>