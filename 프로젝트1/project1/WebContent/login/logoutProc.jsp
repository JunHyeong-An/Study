<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
	<%session.invalidate(); %>
	<c:remove var="user"/>
	<c:redirect url="login.jsp"/>
</body>
</html>