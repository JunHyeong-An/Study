<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<c:if test="${empty login }">
	<script>
		alert('로그인이 필요합니다.');
		location.href='login.jsp';
	</script>
</c:if>

<main>
	<c:if test="${pageContext.request.method == 'GET' }">
	<jsp:useBean id="firstDAO" class="day07.BookDAO"/>
	<jsp:useBean id="firstDTO" class="day07.BookDTO"/>
	<c:set var="book" value="${firstDAO.getBook(param.name) }"/>
		<c:if test="${book.name eq param.name }">
			<c:set var="target" value="${book }"/>
		</c:if>	
		
		<c:if test="${empty target }">
			<h3>잘못된 접근 입니다.</h3>
		</c:if>
		
		<c:if test="${not empty target }">
			<form method="post" id="modify.jsp">
				<p><input type="text" name="name" value="${target.name }" placeholder="도서 이름" autofocus required></p>
				<p><input type="text" name="author" value="${target.author }" placeholder="작가 이름" required></p>
				<p><input type="text" name="publisher" value="${target.publisher }" placeholder="출판사" required></p>
				<p><input type="date" name="regidate" value="${target.regidate }" required></p>
				<p><input type="number" name="count" value="${target.count }" placeholder="보유수량"></p>
				<input type="hidden" name="index" value="${param.name }">
				
				<p><input type="submit" value="수정"></p>
			</form>
		</c:if>
		
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<jsp:useBean id="dao" class="day07.BookDAO"/>
		<jsp:useBean id="user" class="day07.BookDTO"/>
		<jsp:setProperty property="*" name="user"/>
		<c:if test="${dao.modifyBook(param.name, user) != 0 }">
			<c:redirect url="list.jsp"/>
		</c:if>
	</c:if>
	
</main>

<footer>
	<%@include file="footer.jsp" %>
</footer>
