<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp - 두 수의 덧셈</title>
</head>
<body>
	
	<h1>두 수의 덧셈</h1>
	
	<hr>
	
	<form action="ex02-result.jsp" name="addForm">
		<input type="number" name="n1" min="0" max="100">
		+
		<input type="number" name="n2" min="0" max="100">
		=
		<input type="submit">
	</form>
	
</body>
</html>