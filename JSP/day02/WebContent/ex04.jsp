<%@page import="java.util.HashMap"%>
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
	response.setCharacterEncoding("UTF-8");

	String charEncoding = response.getCharacterEncoding();
	String contentType = response.getContentType();
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(200, "정상");
	map.put(302, "변경된 주소");
	map.put(400, "클라이언트 오류");	// 400번대의 상태 메시지는 클라이언트에서 문제가 발생한 경우
	map.put(401, "인증이 되지 않음");
	map.put(402, "권한이 없음");
	map.put(404, "페이지를 찾을 수 없음");
	
	map.put(500, "서버오류");	// 500번대의 상태 메시지는 서버에서 문제가 발생한 경우
	
	
	int sc = 400;
	
	response.sendError(sc, map.get(sc));
%>

	<h2>charEncoding : <%=charEncoding %></h2>
	<h2>contentType : <%=contentType %></h2>

</body>
</html>