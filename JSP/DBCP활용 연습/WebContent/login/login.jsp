<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

<h1><a href="${path }/index.jsp">로그인</a></h1>
	<fieldset>
		<form action="loginProc.jsp" method="get">
			<div class="inputDiv">
				<input class="ipt" type="text" name="userId" placeholder="ID">
			</div>
			<div class="inputDiv">
				<input class="ipt" type="password" name="userPw" placeholder="Password">
			</div>
			<div class="inputDiv">
				<input type="submit" value="로그인">
			</div>
		</form>
		
	</fieldset>

<%@include file="../footer.jsp"%>