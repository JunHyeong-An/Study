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
	<c:set var="isChagePw" value="${memberDAO.changePassword(user.id, param.pw, param.newPw) }"/>
	
	<c:if test="${isChagePw }">
		<script type="text/javascript">
			alert('비밀번호가 변경되었습니다.');
			location.href = '${path}/account/myInfo.jsp';
		</script>
	</c:if>
</body>
</html>