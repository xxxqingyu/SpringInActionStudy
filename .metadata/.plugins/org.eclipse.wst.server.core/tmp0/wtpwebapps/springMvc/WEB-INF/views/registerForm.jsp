<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" />
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form method="POST">
		First Name: <input type="text" name="firstName"><br />
		Last Name: <input type="text" name="lastName"><br />
		UserName: <input type="text" name="userName"><br />
		Password: <input type="password" name="password"><br />
		
		<input type="submit" value="Register"/>
	</form>
</body>
</html>