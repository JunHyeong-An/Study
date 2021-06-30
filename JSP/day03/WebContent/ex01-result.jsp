<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01-result.jsp</title>
</head>
<body>
	<%--
	JSP 액션 태크 : 스크립트릿을 열지 않고, 
				  자바에서 자주 사용되는 기능을 태크형태로 정의한 기본 제공 태그
				 XML 형식을 기초로 한다. 시작 태그 맨 오른쪽에 / 를 작성한다.
 	--%>

	<jsp:useBean id="m" class="day03.Member" />
	<%-- Member m = new Member(); // 기본 생성자로 객체를 생성한다. --%>

	<jsp:setProperty name="m" property="id" />
	<%-- 
		m.setId(request.getParameter("id")
	 	<input name="id">과 자바 빈즈 클래스의 멤버 필드 이름이 같다.
	 	<input name="id">과 자바 빈즈 클래스의 setter 이름이 일정한 패턴을 보인다.
	--%>
	<jsp:getProperty name="m" property="id" />
	
	<%-- 여기서부터 진짜로 --%>
	<jsp:useBean id="m2" class="day03.Member"/>
	<jsp:setProperty property="*" name="m2"/>
	
	<ul>
		<li><%=m2.getId() %></li>
		<li><%=m2.getPw() %></li>
		<li><%=m2.getName() %></li>
		<li><%=m2.getAge() %></li>
		<li><%=m2.getGender() %></li>
	</ul>

	<h3><%=m2 %></h3>
	
</body>
</html>












