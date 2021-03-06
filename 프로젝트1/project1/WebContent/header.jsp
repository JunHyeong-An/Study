<%@page import="comment.CommentDAO"%>
<%@page import="board.BoardDAO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">    
    <title>Document</title>
	<link rel="stylesheet" href="../common.css">
</head>
<%request.setCharacterEncoding("UTF-8"); %>
<c:set var="memberDAO" value="<%=MemberDAO.getInstance() %>"/>
<c:set var="boardDAO" value="<%=BoardDAO.getInstance() %>"/>
<c:set var="commentDAO" value="<%=CommentDAO.getInstance() %>"/>
<c:set var="path" value="${pageContext.request.contextPath }"/>