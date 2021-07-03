<%@page import="day06.Member"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL Core</h1>
	<hr>
	<h3>c:set - attribute를 추가한다. scope를 지정하지 않으면 기본값으로 pageContext에 추가한다.</h3>
	
	<c:set var="member1" value="이지은" scope="page"/>
	<c:set var="member2" scope="request">홍진호</c:set>
	<c:set var="member3" scope="session">배성재</c:set>
	<c:set var="member4" scope="application">고은아</c:set>
	
	<%
		String member1 = (String)pageContext.getAttribute("member1");
	%>
	
	<p>\${member1 } : ${member1 }
	<p>\${requestScope.member2 } : ${requestScope.member2 }
	<p>\${sessionScope.member3 } : ${sessionScope.member3 }
	<p>\${applicationScope.member4 } : ${applicationScope.member4 }
	
	<c:set var="num1">1104</c:set>
	<p>\${num1 + 3 } : ${num1 + 3 }
	<p>${num1 }${num1 }
	
	<jsp:useBean id="member5" class="day06.Member" scope="session"/>	<%-- 객체 생성 --%>
	<c:set target="${member5 }" property="name" value="김희철"/>	<%--target = 대상 객체의 주소값!! --%>
	<c:set target="${member5 }" property="age" value="38"/>
	<p>\${ member5.name } : ${ member5.name }
	<p>\${ member5.age } : ${ member5.age }
	<p>\${member5 } : ${member5 }
	
	<%
		Member member6 = new Member();
		member6.setName("김희철");
		member6.setAge(38);
		session.setAttribute("member6", member6);
	%>
	<c:remove var="member1"/>
	<c:remove var="member2"/>
	<c:remove var="member3"/>
	<c:remove var="member4"/>
	<c:remove var="member5"/>
	
	<h3>c:remove - 지정한 scope의 attribute를 제거한다. 단, 객체의 속성만 제거할 수는 없다.</h3>

	<p>\${member1 } : ${member1 }
	<p>\${requestScope.member2 } : ${requestScope.member2 }
	<p>\${sessionScope.member3 } : ${sessionScope.member3 }
	<p>\${applicationScope.member4 } : ${applicationScope.member4 }
	
	
</body>
</html>













