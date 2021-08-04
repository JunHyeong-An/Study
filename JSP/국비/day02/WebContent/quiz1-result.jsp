<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 이름, 나이, 성인/미성년, 요청자 ip, 요청받은 시점의 현재 시간 -->
<%
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String date = request.getParameter("date");
	String ip = request.getParameter("ip");
	String adultOrNot = null;
	
	String str = (String)session.getAttribute("str"); // attribute는 session층에서 주고 받는다.
	System.out.print(str);
	
	if(age >= 20) {
		adultOrNot = "성인입니다.";
	}
	else {
		adultOrNot = "미성년입니다.";
	}
	
%>

이름 : <%=name %><br>
나이 : <%=age %><br>
<%=adultOrNot%><br>
시간 : <%=date %><br>
ip : <%=ip %><br>

<%=str %>
</body>
</html>