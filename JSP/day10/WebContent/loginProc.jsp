<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	<jsp:useBean id="member" class="day10.Member"/>
	<jsp:setProperty property="id" name="member"/>
	<jsp:setProperty property="pw" name="member"/>
	
	<c:forEach var="m" items="${list }">
		<c:if test="${m.id eq member.id and m.pw eq member.pw }">
			<c:set var="user" value="${m }" scope="session"/>
			<c:set var="storeId" value="${param.storeId }" scope="session"/>
			<c:set var="keepLogin" value="${param.keepLogin }" scope="session"/>
			<c:redirect url="/cookie.jsp"/>
		</c:if>
		<c:redirect url="quiz01.jsp"/>
	</c:forEach>
</body>
</html>