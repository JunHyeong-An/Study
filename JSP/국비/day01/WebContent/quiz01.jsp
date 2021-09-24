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
<!-- 여기는 주석입니다. 브라우저에서 안보입니다. -->
	<%!
		public String getToday() {
			String today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
			String result = String.format("지금은 %s 입니다.", today);
			return result;
		}
	%>
	
	<h2><%=getToday() %></h2>
</body>
</html>