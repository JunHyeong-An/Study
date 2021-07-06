<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String backgroundColor = request.getParameter("theme");
	String fontColor = null;
	
	if(backgroundColor.equals("white")) fontColor = "black";
	else if(backgroundColor.equals("grey")) fontColor = "white";
	else if(backgroundColor.equals("skyblue")) fontColor = "blue";
	else if(backgroundColor.equals("salmon")) fontColor = "red";
	
	Cookie ck1 = new Cookie("backgroundColor", backgroundColor);
	Cookie ck2 = new Cookie("fontColor", fontColor);
	
	response.addCookie(ck1);
	response.addCookie(ck2);
	response.sendRedirect("quiz1.jsp");
%>

<body>
</body>
</html>