<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	<c:if test="${empty login }">
		<c:redirect url="login.jsp"/>
	</c:if>
	<jsp:useBean id="dao" class="day07.BookDAO"/>
	<jsp:useBean id="dto" class="day07.BookDTO"/>
	<jsp:setProperty property="*" name="dto"/>
	<c:if test="${dao.deleteBook(dto) != 0 }">
	<%-- list.remove() 메서드는 int index를 받거나, Object를 받는다.
		 int가 아닌 다른 형태로 전달받을 수 있으니, 객체를 직접 전달해서 삭제하도록 하자 --%>
		<c:redirect url="list.jsp"/>
	</c:if>
	
</body>
</html>