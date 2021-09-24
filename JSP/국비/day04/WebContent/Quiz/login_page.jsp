<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
	<fieldset>
		<legend>로그인</legend>
		<form action="login.jsp" method="post">
			<b>아이디</b>
			<input name="id" placeholder="아이디를 입력하세요" required><br>
			<b>비밀번호</b>
			<input type="password" name="pw" placeholder="Password" required><br>
			<input type="submit">
		</form>
	</fieldset>
</body>
</html>