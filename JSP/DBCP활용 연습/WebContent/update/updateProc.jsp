<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="day16.MemberDTO"/>
<jsp:setProperty property="*" name="dto"/>

<c:if test="${dao.updateMember(dto) }">
	<c:remove var="user"/>
	<c:redirect url="../login/login.jsp"/>
</c:if>
<c:redirect url="updateFail.jsp"/>
</body>
</html>