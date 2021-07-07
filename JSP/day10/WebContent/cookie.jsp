<%@page import="day10.Member"%>
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
		Member m = (Member)session.getAttribute("user");
		String id = m.getId();
		String storeId = (String)session.getAttribute("storeId");
		String keepLogin = (String)session.getAttribute("keepLogin");
		
		if(storeId != null) {
			Cookie ck = new Cookie("id", id);
			ck.setMaxAge(600);
			response.addCookie(ck);
		}
		else {
			Cookie ck = new Cookie("id", "");
			ck.setMaxAge(0);
			response.addCookie(ck);
		}
		
		if(keepLogin != null) {
			Cookie ck = new Cookie("JSESSIONID", session.getId());
			ck.setMaxAge(600);
			response.addCookie(ck);
		}
		else {
			Cookie ck = new Cookie("JSESSIONID", session.getId());
			ck.setMaxAge(0);
			response.addCookie(ck);
		}
		
		response.sendRedirect("loginOK.jsp");
	%>
</body>
</html>