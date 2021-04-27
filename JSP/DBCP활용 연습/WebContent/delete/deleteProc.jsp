<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp"%>
	<jsp:useBean id="dto" class="day16.MemberDTO"/>
	<jsp:setProperty property="*" name="dto"/>
	
	<c:if test="${dao.deleteMember(dto) }">
		<c:remove var="user"/>
		<c:redirect url="../index.jsp"/>
	</c:if>
</body>
</html>