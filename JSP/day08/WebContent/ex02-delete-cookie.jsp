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
	// 저장되어 있는 쿠키와 이름이 동일한 새로운 쿠키객체를 생성한다. 값은 아무거나 상관없다.
	// 쿠키의 값에는 특정 문자나 기호가 들어갈 수 없다.(넣으려면 웹인코딩 형식으로 가능)
	Cookie ck = new Cookie("comment", "아무값");
	ck.setMaxAge(0);
	
	Cookie[] cks = request.getCookies();
	response.addCookie(ck);
	
	response.sendRedirect("ex02.jsp");
	
%>
</body>
</html>