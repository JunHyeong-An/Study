<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	
%>
<body>
	<h1>Ex03.jsp</h1>
	<hr>
	<h3>
		request.getContextPath() : <%=request.getContextPath() %></h3>

	<ul>
		<li><%=pageContext.getAttribute("name") %></li>
		<li><%=request.getAttribute("age") %></li>
		<li><%=session.getAttribute("address")%></li>
		<li><%=application.getAttribute("list") %></li>
	</ul>
	<a href="Ex02.jsp"><button>Ex02.jsp</button></a>
	<ul>
		<li><%=application.getServerInfo() %></li>
		<li><%=application.getMajorVersion() %>.<%=application.getMinorVersion() %></li>
		<li><%=application.getResource(".") %></li>
	</ul>
</body>
</html>