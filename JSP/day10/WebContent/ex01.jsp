<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
// 	session.setAttribute("test", "test");

	Cookie[] cks = request.getCookies();
	for(int i = 0; cks != null && i < cks.length; i++) {
		switch(cks[i].getName()) {
		case "JSESSIONID" :
// 			cks[i].setMaxAge(600);
// 			response.addCookie(cks[i]);
			break;
		}
	}
%>

<body>
	<h1>세션 쿠키</h1>
	<hr>
	<h2>session.getId() : <%=session.getId() %></h2>
	<h2>\${cookie.JSESSIONID.value } : ${cookie.JSESSIONID.value }</h2>
	<h2>\${sessionScope.test } : ${sessionScope.test }</h2>
	
</body>
</html>