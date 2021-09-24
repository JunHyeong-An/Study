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
	<jsp:useBean id="commentDTO" class="comment.CommentDTO"/>
	<jsp:setProperty property="*" name="commentDTO"/>
	<c:set var="isInsert" value="${commentDAO.insertComment(commentDTO) }"/>
	<c:if test="${isInsert }">
		<script type="text/javascript">
			location.href = document.referrer;
		</script>
	</c:if>
</body>
</html>