<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="day10.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a {
		text-decoration: none;
		color: black;
	}

	#wrap {
		display: flex;
		flex-flow: column;
		align-items: center;
		
		margin: 200px auto;
		
		width: 500px
	}
	
	form {
		display: flex;
		flex-flow: column;
		
	}
	
	input {
		margin-bottom: 10px;
	}
	
	input[type=text],
	input[type=password] {
		width: 200px;
		
		border: none;
		border-bottom: 1px solid black;
	}
	
	input[type=submit] {
		width: 210px;
		height: 30px;
		
		border: 1px solid lightgrey;
		outline: none;
		background-color: white;
	}
</style>
</head>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<%
	Member[] members = new Member[] {
		new Member("test", "1234", "테스트"),
		new Member("admin", "1234", "관리자"),
		new Member("dong", "1234", "홍길동")
	};

	List<Member> list = new ArrayList<Member>(Arrays.asList(members));
	
	application.setAttribute("list", list);
%>
<body>
	<div id="wrap">
		<header><h1><a href="${path }/quiz01.jsp">LOGO</a></h1></header>