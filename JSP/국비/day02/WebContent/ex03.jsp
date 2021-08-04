<%@page import="java.io.PrintWriter"%>
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
	PrintWriter pw = response.getWriter();

	pw.println("<h1>ex03.jsp</h1>");
	pw.println("<hr>");
	pw.println("<p>안녕하세요</p>");
	pw.println("pw : " + pw.toString() + "<br>");
	pw.println("out : " + out.toString());
%>
</body>
</html>