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
	<c:set var="isDelete" value="${memberDAO.secession(param.id, param.pw) }"/>
	<%session.invalidate(); %>
	<script type="text/javascript">
		alert('회원탈퇴가 완료되었습니다.');
		setTimeout(() => {
			location.href = '../login/login.jsp';	
		}, 1);
	</script>
	
</body>
</html>