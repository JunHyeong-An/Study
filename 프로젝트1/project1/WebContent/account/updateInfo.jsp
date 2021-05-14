<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="isUpdate" value="${memberDAO.update(pageContext.request, user.id) }"/>
	<c:if test="${isUpdate }">
		<script type="text/javascript">
			alert('다시 로그인 해주세요');
		</script>
		<c:redirect url="../login/logoutProc.jsp"/>	
	</c:if>
</body>
</html>