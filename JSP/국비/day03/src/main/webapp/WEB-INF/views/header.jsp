<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style type="text/css">
	a {
		text-decoration: none;
		color: inherit;
	}
	
	a:hover {
		text-decoration: underline;
		cursor: pointer;
	}
	
}
</style>
</head>
<body>
	<h1 style="background-color: ${bgcolor};"><a href="${path }">Hello!!안녕하세요!!</a></h1>
	<hr>