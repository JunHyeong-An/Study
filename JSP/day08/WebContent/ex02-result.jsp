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
		request.setCharacterEncoding("UTF-8");
	
		String comment = request.getParameter("comment");
		if(comment == null) {
			response.sendRedirect("ex02.jsp");
		}
		else {	// 입력값이 존재하면
			Cookie ck = new Cookie("comment", comment);
			ck.setMaxAge(60 * 60 * 24 * 7);
			// 쿠키가 유지되는 시간을 설정한다.(second 단위 정수)
			response.addCookie(ck);	// 서버가 클라이언트에세 보내는 메시지
		}
	%>
	<h2>입력값 : <%=comment %></h2>
	<a href="ex02.jsp"><button>입력페이지로</button></a>
</body>
</html>