<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<style type="text/css">
header {
	width: 100%;
	display: flex;
	justify-content: center;
	align-content: center;
}

nav {
	display: flex;
	justify-content: center;
	align-content: center;
	width: 100%;
}

nav>ul {
	display: flex;
	justify-content: center;
	align-content: center;
	list-style: none;
	padding-left: 0;
}

nav>ul>li>a {
	padding-right: 20px;
	text-align: center;
}

a {
	text-decoration: none;
	color: inherit;
}
</style>
</head>
<body>
	<header>
		<a href="<%=request.getContextPath() %>"><h1>ITBANK</h1></a>
	</header>
<%
	String test = "itbank";
%>


	<nav>
		<ul>
			<li><a href="ex06.jsp">메일</a></li>
			<li><a href="ex07.jsp">카페</a></li>
			<li><a href="">블로그</a></li>
			<li><a href="">지식iN</a></li>
			<li><a href="">쇼핑</a></li>
		</ul>
	</nav>
	<hr>
</body>
</html>