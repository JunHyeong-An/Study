<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<fieldset>
		<legend>USER LIST</legend>
		<ul>
			<c:forEach var="user" items="${list }">
				<li>${user.userId }</li>
			</c:forEach>
		</ul>
	</fieldset>
</body>
</html>