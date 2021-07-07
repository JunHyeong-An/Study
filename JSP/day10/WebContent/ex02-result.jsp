<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex02-result.jsp</h1>
	<hr>
	<%
		if(session.getAttribute("login") == null) response.sendRedirect("ex02.jsp");
	%>
	<h2>${sessionScope.login.id }님 안녕하세요</h2>
</body>
</html>