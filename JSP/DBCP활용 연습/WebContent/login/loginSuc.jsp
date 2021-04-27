<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

<h1>로그인 성공!!</h1>
<h3>${user.userName }님 반갑습니다!!</h3>
<h2><a href="${path }/index.jsp">메인화면으로</a></h2>

<%@include file="../footer.jsp"%>