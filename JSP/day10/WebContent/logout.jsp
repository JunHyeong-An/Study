<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="header.jsp" %>
	<c:remove var="user" scope="session"/>
	<c:redirect url="quiz01.jsp"/>