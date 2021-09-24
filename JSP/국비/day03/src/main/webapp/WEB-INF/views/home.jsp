<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<script>
		$(document).ready(function() {
			$("#logout").click(function (){
				const logoutPath = '${path }/logout';
				let flag = confirm("로그아웃 하시겠습니까?");
				
				if(flag) location.href = logoutPath;
			});	
		});
	</script>
	<c:if test="${not empty user }">
		<h3>Login Info</h3>
		<h4>${user.userName }(${user.userId })</h4>
	</c:if>
	<ul>
		<li><a href="${path }/userList">USER LIST</a></li>
		
		<c:if test="${empty user }">
			<li><a href="${path }/login">LOGIN</a></li>
			<li><a href="${path }/join">JOIN</a></li>
		</c:if>
		
		<c:if test="${not empty user }">
			<li><a href="${path }/modify">MODIFY</a></li>
			<li><a id="logout">LOGOUT</a></li>
		</c:if>
	</ul>
	
	<script>
		
	</script>
</body>
</html>