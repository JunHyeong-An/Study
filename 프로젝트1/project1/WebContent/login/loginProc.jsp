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
	<c:set var="user" value="${memberDAO.login(param.id, param.pw) }" scope="session"/>
	<c:if test="${not empty user }">
		<c:redirect url="../index/index.jsp"/>
	</c:if>
	<c:set var="msg" value="아이디 혹은 비밀번호가 일치하지 않습니다." scope="session"/>
	<c:redirect url="login.jsp"/>
</body>
</html>