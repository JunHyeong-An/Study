<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<script>
		$(document).ready(function() {
			const msg = "${msg}";
			const modFlag = '${flag}'
			
			if(msg != '') alert(msg);
			if(modFlag) location.href = '${path}/login';
			
			$("#btn").click(function() {
				let flag = confirm("정말 수정하시겠습니까?");
				
				if(flag) $("form").submit();
			});
		});
	</script>
	<fieldset>
		<legend>MODIFY</legend>
		<form method="post">
			<p>
				<input type="text" name="userId" placeholder="ID" value="${user.userId }">
			</p>
			<p>
				<input type="text" name="userName" placeholder="NAME" value="${user.userName }">
			</p>
			<p>
				<input type="text" name="phone" placeholder="PHONE NUMBER" value="${user.phone }">
			</p>
			<p>
				<input type="text" name="birth" placeholder="BIRTH" value="${user.birth }">
			</p>
			<input type="hidden" name="idx" value="${user.idx }">
			<p>
				<input type="button" id="btn" value="MODIFY">
			</p>
		</form>
	</fieldset>
</body>
</html>