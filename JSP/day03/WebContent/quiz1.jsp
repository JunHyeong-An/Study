<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>quiz1 - 로그인 비슷하게 구현하기</h1>
	<form action="quiz1-result.jsp" method="post">
		<p><input type="text" name="id" placeholder="ID"
				  autocomplete="off" autofocus required></p>
				  
		<p><input type="password" name="pw" placeholder="Password" required></p>
		<p><input type="submit" value="로그인"></p>
	</form>
</body>
</html>