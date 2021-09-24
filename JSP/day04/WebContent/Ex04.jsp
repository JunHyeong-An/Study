<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! // 함수는 무조건 선언부에서
	// 요청을 유지하면서, 서버 내의 다른 페이지로 이동하는 기술
	public void forward(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		// 아래 두 줄을 스크립트릿에서 그대로 작성해도 사용가능
		RequestDispatcher rd = request.getRequestDispatcher("Ex01.jsp");
		rd.forward(request, response);
	}
// 	클라이언트가 ex04.jsp를 요청한다.
// 	서버는 ex04를 요청받았지만 ex01.jsp 내용을 보여주고 싶다.
// 	ex01.jsp를 실행하고 나온 응답 결과를 가져다가
// 	전달받은 response객체의 getWriter() 혹은 out 객치를 이용하여 화면에 코드를 찍어준다.
%>

<%
// 	request.setAttribute("name", "ex04");
// 	response.sendRedirect("Ex01.jsp");
// 	request.getRequestDispatcher("Ex02.jsp").forward(request, response);
// 	forward(request, response);	// 주소는 변경되지 않고, 페이지 내용만 다른 페이지로 바뀐다.

// 	response.sendRedirect("Ex01.jsp");	// 주소가 바뀌면서, 페이지 내용이 바뀐다.
%>
<jsp:forward page="Ex01.jsp">
	<jsp:param value="test" name="name"/>
</jsp:forward>
</body>
</html>