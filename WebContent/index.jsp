<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="user/findAllUser">Find All User</a>
	<br><br>
	<form action="user/insertUser" method="post">
		Username:<input name="username" type="text">
		<br><br>
		Email:<input name="email" type="text">
		<br><br>
		<input type="submit" value="Register">
		<input type="reset" value="Reset">
	</form>
	<br><br>
	<a href="user/testRequestBody">Test RequestBody</a>
	<br><br>
</body>
</html>