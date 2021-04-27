<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h1><a href="${path }/index.jsp">회원목록</a></h1>
<c:set var="memberList" value="${dao.selectList() }"/>
<fieldset>
	<table border="1">
		<tr>
			<th>아이디</th><th>이름</th><th>나이</th><th>성별</th><th>가입 날짜</th>
		</tr>
		<c:forEach var="dto" items="${memberList }">
			<tr>
				<td>${dto.userId }</td><td>${dto.userName }</td><td>${dto.age }</td><td>${dto.gender }</td><td>${dto.regidtDate }</td>
			</tr>
		</c:forEach>	
	</table>
</fieldset>

<%@include file="footer.jsp" %>
	