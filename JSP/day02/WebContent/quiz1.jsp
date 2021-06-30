<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String date = new Date().toLocaleString();
	String ip = request.getRemoteAddr();
	
	String str = "안녕";
	
	session.setAttribute("str", str);
	

// 	 PAGE 

// 	 한번의 요청을 처리하는 하나의 JSP 페이지 내에서 공유될 값을 저장한다. (커스텀 태그에서 새로운 변수를 추가 할 때 사용)

// 	 request

// 	 REQUEST 

// 	 한번의 요청을 처리하는데 사용되는 모든 JSP 페이지에서 공유될 값을 저장한다. (정보를 전달하기 위해 사용)

// 	 session 

// 	 SESSION 

// 	 한 사용자와 관련된 정보를 JSP들이 공유하기 위해서 사용한다. (사용자의 로그인 정보와 같은 것들을 저장)

// 	 application 

// 	 APPLICATION 

// 	 모든 사용자와 관련해서 공유할 정보를 저장한다. (임시 디렉터리 경로와 같은 웹 어플리케이션의 설정 정보를 저장)

%>

	<form action="quiz1-result.jsp">
		<p><input name="name" placeholder="이름" autofocus required autocomplete></p>
		<p><input type="number" name="age" placeholder=""나이" required min="0" max="100"></p>
		<p><input type="submit" value="확인"></p>
		<p><input type="hidden" value="<%= date%>" name="date">
		<p><input type="hidden" value="<%= ip %>" name="ip">
	</form>
	
</body>
</html>