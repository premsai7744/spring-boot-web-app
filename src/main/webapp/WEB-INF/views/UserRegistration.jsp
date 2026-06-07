<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:orange; font-style: italic;">Register details to create account</h2>
<form action="create/account" method="post">
<p style="color:blue; font-size: medium;">
UserName:<input type="text" name="uName"><br>
Password:<input type="password" name="pword"><br>
FirstName:<input type="text" name="fName"><br>
LastName:<input type="text" name="lName"><br>
DateOfBirth:<input type="date" name="dob"><br>
Gender:<input type="text" name="gender"><br>
EmailId:<input type="email" name="email"><br>
Contact:<input type="text" name="contact"><br></p>
<input type="submit" value="Create account" style="color:white; background-color:Green; border-style:none;">
</form> 
</body>
</html>