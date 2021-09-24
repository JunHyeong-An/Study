<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<main>
	<c:if test="${empty login }">
		<script>
			alert('로그인이 필요합니다.');
			location.href='login.jsp';
		</script>
<%-- 		<c:redirect url="/login.jsp"/> --%>
	</c:if>

	<c:if test="${pageContext.request.method == 'GET' }">
		<form method="post" id="add-form">
			<p><input type="text" name="name" placeholder="도서 이름" autofocus required></p>
			<p><input type="text" name="author" placeholder="작가 이름" required></p>
			<p><input type="text" name="publisher" placeholder="출판사" required></p>
			<p><input type="number" name="count" placeholder="개수" required></p>
			<p><input type="date" name="regidate" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>" required></p>
			<p><input type="submit" value="등록"></p>
		</form>	
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
	<%
		request.setCharacterEncoding("UTF-8");
	%>
		처리후 ,목록 페이지로 리다이렉트 예정
		${param.date }
		<jsp:useBean id="dao" class="day07.BookDAO"/>
		<jsp:useBean id="book" class="day07.BookDTO"/>
		<jsp:setProperty property="*" name="book"/>
		<c:if test="${dao.addBook(book) != 0 }">
			<c:redirect url="list.jsp"/>
		</c:if>
	</c:if>
</main>

<footer>
	<%@include file="footer.jsp" %>
</footer>
