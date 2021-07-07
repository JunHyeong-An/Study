<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<c:if test="${not empty sessionScope.user}">
	<c:redirect url="loginOK.jsp"/>	
</c:if>

<form method="post" action="${path}/loginProc.jsp">
	<input type="text" name="id" placeholder="ID" value="${not empty cookie.id.value ? cookie.id.value : '' }">
	<input type="password" name="pw" placeholder="Password">
	<div id="check">
		<input type="checkbox" name="storeId" ${not empty cookie.id.value  ? 'checked' : '' }>ID기억하기
		<input type="checkbox" name="keepLogin" ${not empty cookie.id.value  ? 'checked' : ''}>로그인 상태유지
	</div>	
	<input type="submit" value="로그인">
</form>
<%@include file="footer.jsp" %>
