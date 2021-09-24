<%@page import="day03.Member2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="m2" class="day03.Member2" />
	<jsp:setProperty property="*" name="m2" />
<!-- 
	내장객체 request, response
	
	
 -->

	<%!Member2[] members = { new Member2("itbank", "it", "아이티뱅크"), new Member2("danbi", "mine", "단비"),
			new Member2("iu", "iu1234", "아이유"), };
	String msg = null;%>



	<%
// 		boolean flag = true;
	
		for (int i = 0; i < members.length; i++) {
			if (m2.toString().equals(members[i].toString())) {
				msg = members[i].getName() + "님 반갑습니다";
// 				flag = true;
				break;
			}
// 			flag = false;
			msg = "로그인 실패";
		}
		
// 		if(!flag) response.sendRedirect("quiz1.jsp");
	%>

	<%=msg%>
</body>
</html>