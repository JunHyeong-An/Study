<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h1>회원가입</h1>
<fieldset>
	<form action="joinProc.jsp" method="post">
		<div class="inputDiv">
			<input class="ipt" type="text" name="userId" placeholder="ID">
		</div>
		<div class="inputDiv">
			<input class="ipt" type="text" name="userPw" placeholder="Password">
		</div>
		<div class="inputDiv">
			<input class="ipt" type="text" name="userName" placeholder="NAME">
		</div>
		<div class="inputDiv">
			<input class="ipt" type="text" name="age" placeholder="AGE">
		</div>
		<div class="inputDiv">
			<label><input type="radio" value="남" name="gender">남성</label>
			<label><input type="radio" value="여" name="gender">여성</label>
		</div>
		<div class="inputDiv">
			<input class="btn" type="submit" value="회원가입">
		</div>
	</form>
</fieldset>

<%@ include file="../footer.jsp"%>