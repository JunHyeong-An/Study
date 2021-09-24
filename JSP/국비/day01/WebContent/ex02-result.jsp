<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-result.jsp</title>
</head>
<body>
	
<%
	int num1 = Integer.parseInt(request.getParameter("n1"));
	int num2 = Integer.parseInt(request.getParameter("n2"));
	
	int result = num1 + num2;
%>

결과 : <%= result %><br>

<!-- 항상 JSP코드 혹은 JAVA코드가 html코드보다 먼저 실행 -->
<a href="ex02.jsp"><button>이전페이지로</button></a>

</body>
</html>