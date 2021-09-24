<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>quiz/index.jsp</h1>
	<hr>
	
	<fieldset>
		<legend>로그인</legend>
		<form action="login.jsp" method="post">
			ID : <input name="id" required autofocus><br>
			PW : <input type="password" name="pw" required><br>
			<input type="submit" value="로그인">
		</form>
	</fieldset>
</body>
</html>