<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
	<fieldset>
		<legend>회원가입</legend>
		<form action="register.jsp" method="post">
			<b>아이디</b>
			<input name="id" placeholder="아이디를 입력하세요" required><br>
			<b>비밀번호</b>
			<input type="password" name="pw" placeholder="Password" required><br>
			<b>비밀번호 확인</b>
			<input type="password" name="rePw" placeholder="Password_confirm" required><br>
			<b>이름</b>
			<input name="name" placeholder="이름을 입력하세요"><br>
			<input type="submit">
		</form>
	</fieldset>
</body>
</html>