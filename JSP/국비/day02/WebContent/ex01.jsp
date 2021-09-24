<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<p><input name="name" placeholder="이름"></p>
		<p><input name="age" placeholder="나이"></p>
		<p><input type="submit" value="전송"></p>
	</form>
	
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	if(name != null && age != null && name != "" && age != "") {
%>
	<h2><%=name %>님의 나이는 <%=age %>살 입니다.</h2>
	
<%} else {%>
	<h2>값을 모두 입력해주세요</h2>
<%} %>
</body>
</html>