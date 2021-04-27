<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<h1>회원 탈퇴</h1>

<fieldset>
	<form action="deleteProc.jsp">
		<h2>탈퇴하시겠습니까?</h2>
		<input type="hidden" value="${user.idx }" name="idx">
		<input type="submit" value="예">
	</form>
</fieldset>

</body>
</html>