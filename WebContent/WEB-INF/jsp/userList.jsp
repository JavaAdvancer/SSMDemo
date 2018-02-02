<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户列表</title>
</head>
<body>
	<c:if test="${empty listUser }">
		没有员工信息
	</c:if>
	<c:if test="${!empty listUser }">
		<table>
			<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>Email</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			
			<c:forEach items="${listUser }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.username }</td>
					<td>${user.email }</td>
					<td><a href="showUserDetails?id=${user.id}">Edit</a></td>
					<td><a href="deleteUserById?id=${user.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		</table>
	</c:if>
</body>
</html>