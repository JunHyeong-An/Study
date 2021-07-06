<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#storeId,
	label{
		cursor: pointer;
	}
</style>
<%
	String id = request.getParameter("id");
	String storeId = request.getParameter("storeId");
	
	System.out.println("id : " + id);
	System.out.println("storeId : " + storeId);
	
	if(storeId != null) {
		Cookie ck = new Cookie("id", id);
		Cookie ck2 = new Cookie("storeId", storeId);
		
		response.addCookie(ck);
		response.addCookie(ck2);
		
		response.sendRedirect("quiz2.jsp");
	}
	else {
		Cookie ck = new Cookie("id", "");
		Cookie ck2 = new Cookie("storeId", "");
		
		ck.setMaxAge(0);
		ck2.setMaxAge(0);
		
		response.addCookie(ck);
		response.addCookie(ck2);
	}
%>

</head>
<body>
	<h1>quiz2.jsp - ID 자동 저장</h1>
	<hr>
	<form method="post">
		<p><input type="text" name="id" placeholder="ID" value="${cookie.id.value != null ? cookie.id.value : '' }" required></p>
		<p><input type="password" name="pw" placeholder="Password" required></p>
		<p>
			<input type="checkbox" name="storeId" id="storeId" ${cookie.storeId.value != null ? 'checked' : ''} >
			<label for="storeId">ID 저장하기</label>
		</p>
		<p><input type="submit" value="로그인"></p>
	</form>
</body>
</html>