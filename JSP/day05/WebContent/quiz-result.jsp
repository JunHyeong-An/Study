<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="day05.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>quiz-result.jsp</h1>
<hr>

<% 
	if(request.getAttribute("twice") == null) {
		response.sendRedirect("quiz01.jsp");
		return;
	}
	Member[] twice = (Member[])request.getAttribute("twice");
	
	int[] arr = new int[] {1, 2, 3};
// 	List<Member> twices = Arrays.asList(twice);
%>
	<ul>
		<%for(Member m : twice) {
			pageContext.setAttribute("m", m);%>
			<li>이름 : ${m.name }, 나이 : ${m.age } </li>
		<%} %>
	</ul>
</body>
</html>