<%@page import="java.util.Arrays"%>
<%@page import="day07.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
// 	if(application.getAttribute("list") == null) {
// 		Book[] arr = new Book[] {
// 			new Book("수학의 정석", "홍성대", "성지출판(주)", "1966-01-01", 5000),
// 			new Book("달러구트 꿈 백화점", "이미예", "팩토리나인", "2020-07-08", 500),
// 			new Book("공정하다는 착각", "마이클 샌델", "와이즈베리", "2020-12-01", 1000),
// 			new Book("주린이도 술술 읽는 친절한 주식책", "최정희, 이슬기", "메이트북스", "2020-09-01", 345),
// 			new Book("스토리텔링 바이블", "대니얼 조슈아 루빈", "블랙피쉬", "2020-12-06", 500),
// 			new Book("어떻게 말해줘야 할까", "오은영", "김영사", "2020-10-08", 700),
// 			new Book("마음챙김의 시", "류시화", "수오서재", "2020-09-15", 123)
// 		};
// 		ArrayList<Book> list = new ArrayList<Book>(Arrays.asList(arr));			// 책은 list
// 		application.setAttribute("list", list);		
// 	}
// 	if(application.getAttribute("memberList") == null) {
// 		System.out.println("회원 데이터를 생성하여 등록합니다.");
// 		Member[] arr2 = new Member[] {
// 			new Member("test","1234","테스트","test@naver.com"),
// 			new Member("admin","P@ssw0rd","관리자","admin@naver.com"),
// 			new Member("danbi","1","나단비","danbi@naver.com")
// 		};
// 		application.setAttribute("memberList", Arrays.asList(arr2));
// 	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<c:if test="${not empty param.backgroundColor }">
	<jsp:useBean id="theme" class="day07.Theme"/>
	<jsp:setProperty property="backgroundColor" name="theme"/>
</c:if>

<body>
	<header style="background-color: ${theme.backgroundColor}; color: ${theme.fontColor};">
		<h1><a href="${cpath }">도서 관리 프로그램</a></h1>
		<div>
			<form action="">
				<select name="backgroundColor">
					<option value="basic" ${theme.backgroundColor eq 'basic' ? 'selected' : '' }>basic</option>
					<option value="salmon" ${theme.backgroundColor eq 'salmon' ? 'selected' : '' }>salmon</option>
					<option value="blue" ${theme.backgroundColor eq 'blue' ? 'selected' : '' }>blue</option>
					<option value="yellow" ${theme.backgroundColor eq 'yellow' ? 'selected' : '' }>yellow</option>
				</select>
				<input type="submit">
			</form>
		</div>
		<div class="login-info">
			<c:if test="${not empty login }">
				<strong>${login.name }</strong>(${login.id })
				<%=session.getMaxInactiveInterval() %>
			</c:if>
		</div>
		<nav>
			<ul>
				<li><a href="${cpath }/${not empty login ? 'logout.jsp' : 'login.jsp' }">${not empty login ? '로그아웃' : '로그인' }</a></li>
				<li><a href="${cpath }/list.jsp">전체 목록</a></li>
				<li><a href="${cpath }/add.jsp">도서 추가</a></li>
			</ul>
		</nav>
	</header>