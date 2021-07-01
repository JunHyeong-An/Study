<%@page import="day04.Member"%>
<%@page import="day04.MemberData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>	
<% 	
	Member[] members = new Member[] {
			new Member("test", "123", "홍길동"),
			new Member("rorod", "123", "고길동"),
			new Member("hi", "123", "김길동")
	};

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String msg = null;
	
	for(Member m : members) {
		if(m.getId().equals(id) && m.getPw().equals(pw)) {
			msg = "로그인 성공!! " + m.getName() + "님 반갑습니다!!";
			break;
		}
		else msg = "로그인 실패..";
	}
	session.setAttribute("msg", msg);
%>
	<jsp:forward page="login_result.jsp"/>
	
	
</body>
</html>	