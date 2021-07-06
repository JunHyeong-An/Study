<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<%
	Cookie[] cks = request.getCookies();

	if(cks != null) {
		String fontColor = null;
		String backgroundColor = null;
		
		for(Cookie ck : cks) {
			if(ck.getName().equals("backgroundColor")) {
				backgroundColor = ck.getValue();
			}
			
			if(ck.getName().equals("fontColor")) {
				fontColor = ck.getValue();
			}
		}
		
		pageContext.setAttribute("backgroundColor", backgroundColor);
		pageContext.setAttribute("fontColor", fontColor);
	}
%>

<body style="background-color: ${backgroundColor}; color: ${fontColor };">
	<div id="wrap">
		<header><h1>quiz1.jsp - 색상 테마 쿠키에 저장하기</h1></header>
		<hr>
		<div>
			<form method="post" action="cookie-result.jsp">
				<select name="theme">
					<option value="white" ${backgroundColor eq 'white' ? 'selected' : '' }>Basic</option> <%--글자 black --%>
					<option value="grey" ${backgroundColor eq 'grey' ? 'selected' : '' }>Dark</option>	<%--글자 white --%>
					<option value="skyblue" ${backgroundColor eq 'skyblue' ? 'selected' : '' }>Blue</option><%--글자 blue --%>
					<option value="salmon" ${backgroundColor eq 'salmon' ? 'selected' : '' }>Salmon</option><%--글자 red --%>
				</select>
				<input type="submit" value="색상변경">
			</form>
		</div>
		
		<h2>para</h2>
		qwe
		<p id="para">1234334132432</p>
			
<%-- 		\${backgroundColor} : ${backgroundColor}<br> --%>
<%-- 		\${fontColor } : ${fontColor } --%>
	</div>
</body>
</html>