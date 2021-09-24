<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<input name="name" placeholder="이름을 입력하세요">
		<input type="submit">
	</form>
	
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	%>
	
	<h3><%=name != null ? name : "" %></h3>
</body>
</html>