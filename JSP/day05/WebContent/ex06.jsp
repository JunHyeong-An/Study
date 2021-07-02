<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex06.jsp</h1>
	<hr>
	
<%
	for(int i = 0; i < 5; i++) {
		pageContext.setAttribute("i", i);
%>
		<li>${(i + 1) * 100 }</li>
<%
	}
%>
</body>
</html>