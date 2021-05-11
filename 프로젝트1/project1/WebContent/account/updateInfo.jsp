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
	<c:set var="isUpdate" value="${memberDAO.update(pageContext.request, user.id) }"/>
	<c:if test="${isUpdate }">
		<c:redirect url="../login/logoutProc.jsp"/>	
	</c:if>
</body>
</html>