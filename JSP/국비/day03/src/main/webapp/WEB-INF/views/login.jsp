<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<script type="text/javascript">
	$(document).ready(function() {
		const msg = "${msg}";
		if(msg != '') alert(msg);
	});
</script>
	<form method="post">
		<p>
			<input type="text" name="userId" placeholder="ID">
		</p>
		<p>
			<input type="password" name="userPw" placeholder="Password">
		</p>
		<c:if test="${not empty loginFailMsg }">
			<p style="color: red;">
				${loginFailMsg }
			</p>
		</c:if>
		
		<p>
			<input type="submit" value="Login">
		</p>
	</form>
</body>
</html>