<%@page import="day09.Member"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	List<Member> list = Arrays.asList(new Member[] {
			new Member("test", "1234", "테스트"),
			new Member("admin", "1", "관리자"),
			new Member("iu", "1234", "이지은")
	});

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	Member user = new Member();
	user.setId(id);
	user.setPw(pw);
	
	for(Member m : list) {
		if(m.getId().equals(user.getId())) {
			if(m.getPw().equals(user.getPw())) {
				session.setAttribute("login", m);
				session.setMaxInactiveInterval(10);
			}
		}
	}
	long time = session.getLastAccessedTime() - session.getCreationTime();
	time /= 1000;
	
%>
	<h2>session.getId() : <%=session.getId() %></h2>
	<h2>session.getCreationTime() : <%=session.getCreationTime() %></h2>
	<h2>session.getLastAccessedTime() : <%=session.getLastAccessedTime() %></h2>
	<h2>접속중인 시간 : <%=time %></h2>
	<h2>id : ${login.id }</h2>
	<h2>pw : ${login.pw }</h2>
	<h2>name : ${login.name }</h2>
	<h2>session.getMaxInactiveInterval() : <%=session.getMaxInactiveInterval() %></h2>
	
<%
	if(session.getAttribute("login") != null) {
%>
		<a href="ex02-result.jsp"><button>다음으로</button></a>
	
<%
	}
%>
<body>
	
</body>
</html>















