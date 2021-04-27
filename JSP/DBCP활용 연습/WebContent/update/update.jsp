<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<h1>정보 수정</h1>
<hr>
<fieldset>
	<form action="updateProc.jsp" method="post">
		<div class="inputDiv">
			ID : <input type="text" value="${user.userId }" name="userId" readonly>
		</div>
		<div>
			Password : <input type="password" value="${user.userPw }" readonly>
		</div>
		<div>
			NAME : <input type="text" value="${user.userName }" readonly>
		</div>
		<div>
			<input type="number" name="age">
		</div>
		
		<div>
			<label><input type="radio" value="남" name="gender">남성</label>
			<label><input type="radio" value="여" name="gender">여성</label>
		</div>
		
		<input type="submit" value="수정하기">
	</form>
</fieldset>

<%@include file="../footer.jsp"%>