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
	<c:set var="isInsertContent" value="${boardDAO.insertContent(param.writer, param.content) }"/>
	<c:redirect url="../index/index.jsp"/>
</body>
</html>