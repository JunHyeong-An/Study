<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파라미터를 검색조건으로 활용하기</h1>
	<hr>
	
	<form>
		<div><input type="text" name="id" placeholder="검색할  ID를 입력하세요" required autofocus></div>
		<div><input type="submit" value="검색"></div>
	</form>
	
	<c:if test="${not empty param.id }">
		<jsp:useBean id="dao" class="day13.MemberDAO"/>
		<c:set var="dto" value="${dao.getMember(param.id) }"/>
		
		<fieldset>
			<legend>검색결과</legend>
			<c:if test="${empty dto }">
				<h2>검색 결과가 없습니다.</h2>
			</c:if>
			<c:if test="${not empty dto }">
				<ul>
					<c:forEach var="dto" items="${dto }">
						<li>ID : ${dto.id }</li>
						<li>PW : ${dto.pw }</li>
						<li>NAME : ${dto.name }</li>
						<li>AGE : ${dto.age }</li>
					</c:forEach>
				</ul>
			</c:if>
			<a href="quiz2.jsp"><input type="button" value="돌아가기"></a>
		</fieldset>
	</c:if>
</body>
</html>