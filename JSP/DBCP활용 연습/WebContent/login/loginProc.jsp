<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<jsp:useBean id="dto" class="day16.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/>

<c:if test="${not empty dao.loginMember(dto) }">
	<c:set var="user" value="${dao.loginMember(dto) }" scope="session"/>
	<c:redirect url="loginSuc.jsp"/>
</c:if>
	<c:redirect url="loginFail.jsp"/>

<%@include file="../footer.jsp" %>
