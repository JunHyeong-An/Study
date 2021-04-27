<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<c:if test="${not empty user }">
	${user.userName }
</c:if>

	<ul>
		<li><a href="${path }/join/join.jsp">회원가입</a></li>
		<li><a href="${path }/memberList.jsp">회원목록</a>
		<li><a href="${path }/login/login.jsp">로그인</a></li>
		<li><a href="${path }/update/update.jsp">정보수정</a></li>
		<li><a href="${path }/delete/delete.jsp">회원탈퇴</a></li>
	</ul>
<%@include file="footer.jsp" %>