<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%request.setCharacterEncoding("UTF-8"); %>	

<c:set var="email" value="${param.emailId}@${param.emailAddr }"/>
<jsp:useBean id="memberDTO" class="member.MemberDTO" />
<jsp:setProperty property="id" name="memberDTO" />
<jsp:setProperty property="pw" name="memberDTO" />
<jsp:setProperty property="name" name="memberDTO" />
<jsp:setProperty property="age" name="memberDTO" />
<jsp:setProperty property="email" value="${email }" name="memberDTO" />
<jsp:setProperty property="birth" name="memberDTO" />

<c:set var="isJoin" value="${memberDAO.join(memberDTO) }" />

<c:if test="${isJoin }">
	<c:set var="name" value="${param.name }" scope="session"/>
	<c:redirect url="joinSuccess.jsp"/>
</c:if>
<c:redirect url="joinFail.jsp"/>
</body>
</html>