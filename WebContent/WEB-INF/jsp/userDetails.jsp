<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="user/updateUserById" method="post">
		ID:<input readonly type="text" value="${user.id }">
		<br><br>
		USERNAME:<input type="text" value="${user.username }">
		<br><br>
		EMAIL:<input type="text" value="${user.email }">
		<br><br>
		<input type="submit" value="Update">
		<input type="reset" value="Reset">
	</form>
</body>
</html>