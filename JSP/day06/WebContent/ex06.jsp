<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="day06.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Member[] arr = {
		new Member("이지은", 29),
		new Member("홍길동", 22),
		new Member("고길동", 24),
		new Member("이길동", 27),
		new Member("김길동", 19),
	};
	
	ArrayList<Member> list = new ArrayList<Member>(Arrays.asList(arr));
	
	pageContext.setAttribute("arr", arr);
	pageContext.setAttribute("list", list);
%>

	<h1>c:forEach</h1>
	<hr>
	<h3>배열의 요소를 화면에 반복문으로 출력하기</h3>
	
	<ul>
		<c:forEach var="member" items="${arr }">
			<li>${member.name } : ${member.age }</li>
		</c:forEach>
	</ul>
	
	<h3>리스트의 요소를 화면에 반복문으로 출력하기</h3>
	
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>st.index</th>
			<th>st.count</th>
			<th>st.first</th>
			<th>st.last</th>
			<th>이름</th>
			<th>나이</th>
			<th>성인여부</th>
		</tr>
		
		<c:forEach var="member" items="${list }" varStatus="st">
			<tr style="background-color: ${st.index % 2 == 0 ? 'skyblue' : 'salmon'};
					   color : ${st.last ? 'yellow' : 'inherit'};">
				<td>${st.index}</td>
				<td>${st.count }</td>
				<td>${st.first }</td>
				<td>${st.last }</td>
				<td>${member.name }</td>
				<td>${member.age }</td>
				<td>${member.age >= 20 ? '성인' : '미성년자'}</td>
			</tr>
		</c:forEach>
	</table>
	
	<h3>횟수에 의한 반복</h3>
	
	<ul>
		<c:forEach var="i" begin="1" end="10" step="1">
			<li style="color : ${i % 2 == 0 ? 'red' : 'blue'};">
				${i } : 
				<c:if test="${i % 2 == 0 }">
					짝수
				</c:if>
				
				<c:if test="${i % 2 != 0 }">
					홀수
				</c:if>
			</li>
			
		</c:forEach>
	</ul>
	
	
	
</body>
</html>














