<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
	<c:forEach items="${spittleList}" var="spittle">
	<li id="spittle_${spittle.id} />">
		${spittle.message}
		<div class="spittleMessage">
			${spittle.message}
		</div>
		<div>
			<span class="spittleTime">${spittle.time}</span>
			<span class="spittleLocation">
				(
					${spittle.latitude},
					${spittle.longitude}
				)
			</span>
		</div>
	</li>
	</c:forEach>
</ul>
</body>
</html>