<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<c:if test="${empty user }">
	<c:redirect url="quiz01.jsp"/>
</c:if>

<h1>${user.name }님 반갑습니다.</h1>

<a href="${path}/logout.jsp"><button>로그아웃</button></a>
<%@include file="footer.jsp"%>