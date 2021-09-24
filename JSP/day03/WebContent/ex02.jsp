<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		QueryString 형식
		문서이름?변수1=값1&변수2=값2&변수3=값3&...
	 -->
	
	<form action="" method="post">
	<%--
		form에서만 사용하는 것이 아니라, HTTP 규격에 의해서 요청을 전달한느 '방식'
	
		GET : 주소창을 통해서 쿼리스트링 형식으로 파라미터를 전달한다. 빠르다.
		POST : 1) 파라미터를 노출시키고 싶지 않거나, 2) 문자열이 아닌 데이터를 전송하고자 할 때
	 --%>
		<p><input type="text" name="id" placeholder="ID"></p>
		<p><input type="password" name="pw" placeholder="Password"></p>
		<p><input type="submit" value="로그인"></p>
	</form>
	<hr>
	
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id != null && pw != null) {
%>
	<h2>id : <%=id %></h2>
	<h2>pw : <%=pw %></h2>
<%	
	}
%>
</body>
</html>