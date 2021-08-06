<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<script>
		$(document).ready(function() {
			const joinMsg = '${joinMsg}';
			const joinFlag = '${joinFlag}';
			
			if(joinMsg != '') alert(joinMsg);
			
			if(joinFlag) location.href = '${path}/login';
		});
	</script>
	<fieldset>
		<legend>JOIN</legend>
		<form method="post">
			<p>
				<input type="text" name="userId" placeholder="ID">
			</p>
			<p>
				<input type="password" name="userPw" placeholder="Password">
			</p>
			<p>
				<input type="text" name="userName" placeholder="NAME">
			</p>
			<p>
				<input type="text" name="phone" placeholder="PHONE NUMBER">
			</p>
			<p>
				<input type="text" name="birth" placeholder="BIRTH">
			</p>
			<p>
				<input type="submit" value="JOIN">
			</p>
		</form>
	</fieldset>
</body>
</html>