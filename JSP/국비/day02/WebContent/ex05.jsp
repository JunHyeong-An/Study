<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>response.sendRedirct(url)</h1>
	<hr>
	
	<form>	<!-- action을 지정하지 않았으므로, 현재 페이지에서 파라미터를 전달받아서 처리한다. -->
		<label><input type="radio" name="target" value="https://www.naver.com">네이버</label>
		<label><input type="radio" name="target" value="https://www.google.com">구글</label>
		<label><input type="radio" name="target" value="https://www.youtube.com">유튜브</label>
		<input type="submit" value="이동">
	</form>
	
<%
	String target = request.getParameter("target");
	if(target != null) {
		response.sendRedirect(target);
		// 주소창 내용이 변경된다.
	}
%>
</body>
</html>