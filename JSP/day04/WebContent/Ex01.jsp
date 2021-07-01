<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
// 	String str = (String)request.getAttribute("name");
	String str = (String)request.getParameter("name");
%>

<body>
	<h1>Ex01.jsp 내장객체의 종류</h1>
	<hr>
	
	<ul>
		<li>★request : parameter, attribute, header, address, hostname, port</li>
		<li>★response : getWriter, sendError, sendRedirect</li>
		<li>out : print, println...</li>
		<li>page : JSP 자신, this</li>
		<li>config : JSP 초기 파라미터를 저장하는 객체</li>
		<li>★session : 각 클라이언트와 서버가 통신하는 개별 단위 객체(로그인 정보 저장), 페이지가 바뀌더라도 유지해야하는 정보들 저장</li>
		<li>★application : JSP 서블릿 컨텍스트, 서버 당 동시에 하나만 있다.(저장소로 사용할 수도 있다.)</li>
		<li>★pageContext : JSP에서 다른 내장객체에 접근할 수 있는 메서드를 제공</li>
		<li>exception : page 지시자에서 isErrorPage=true로 설정된 경우 사용 가능</li>
	</ul>
	
	<h3>객체를 저장할 수 있는 내장객체 - pageContext, request, session, application</h3>
	<%=str %>
	
	<fieldset>
		<legend>parameter vs attribute</legend>
		<ul>
			<li>parameter는 String이고 ,attribute는 Object이다.</li>
			<li>parameter는 사용자 입력값이고, attribute는 개발자가 넣은 객체이다.</li>
			<li>parameter는 setter가 없고, attribute는 getter/setter가 모두 있다.</li>
			<li>자바는 객체 지향 언어이므로, 입력 parameter로 받지만, 처리는 attribute로 하는 것이 보통이다.</li>
		</ul>
	</fieldset>
</body>
</html>