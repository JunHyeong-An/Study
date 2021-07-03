<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>회원 정보</legend>
		
		<ul>
			<li>ID : ${sessionScope.loginAccount.id }</li>
			<li>PW : ${sessionScope.loginAccount.pw }</li>
			<li>NAME : ${sessionScope.loginAccount.name }</li>
			<li>AGE : ${sessionScope.loginAccount.age }</li>
		</ul>
	</fieldset>
</body>
</html>