<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="day16.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/>
<c:set var="isJoin" value="${dao.insertMember(dto) }"/>

<c:if test="${isJoin }">
	<c:redirect url="joinSuc.jsp"/>
</c:if>
<%@include file="../footer.jsp"%>