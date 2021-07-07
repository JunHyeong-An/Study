<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String keepSession = request.getParameter("keepSession");
	
	HashMap<String, String> login = new HashMap<String, String>();
	login.put("id", id);
	login.put("pw", pw);
	
	session.setAttribute("login", login);
	
	if(keepSession != null) {
		Cookie jsessionid = new Cookie("JSESSIONID", session.getId());
		jsessionid.setMaxAge(600);
		response.addCookie(jsessionid);	
	}
	
	response.sendRedirect("ex02-result.jsp");
%>
<body>
	
</body>
</html>