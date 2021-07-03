<%@page import="java.util.Arrays"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="day06.Account"%>
<%@page import="java.util.ArrayList"%>
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
		Account[] arr = new Account[] {
			new Account("test", "1234", "홍길동", 19),
			new Account("test1", "1234", "고길동", 23),
			new Account("test2", "1234", "김길동", 39)	
		};
	
		ArrayList<Account> list = new ArrayList<Account>(Arrays.asList(arr));
// 		application.setAttribute("list", list);
	
	%>
	<c:set var="list" value="${list }" scope="application"/>
	
	<c:forEach var="account" items="${list }">
		<c:if test="${account.id eq param.id and account.pw eq param.pw }">
			<c:set var="loginAccount" value="${account }" scope="session"/>
			<c:redirect url="success.jsp"/>
		</c:if>
		<c:redirect url="failure.jsp"/>
	</c:forEach>
	
</body>
</html>