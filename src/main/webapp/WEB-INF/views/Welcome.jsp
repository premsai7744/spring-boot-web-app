<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user/login" method="post">
	<h2 style="color:orange; font-style: italic; font: cursive;">Welcome to E-Commerce</h2>
	<p style="color:blue; font-weight: bold;">UserName:<input type="text" name="uname"><br>
	Password:<input type="password" name="pword"><br></p>
	<input type="submit" value="Login" style="background-color: green;color: white; font-size: medium; border-style: none;">
	</form>
	<p style="color: red;" >Don't have Account? <a href="user/register">Register</a> </p>
</body>
</html>