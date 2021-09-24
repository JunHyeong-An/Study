<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("login") == null) {
		response.sendRedirect("ex02.jsp");
	}
%>
	<h1>로그인 결과</h1>
	<hr>
	
	<h2>${login.name }(${login.id })님, 안녕하세요</h2>
	<a href="ex02-logout.jsp"><button>로그아웃</button></a>
</body>
</html>