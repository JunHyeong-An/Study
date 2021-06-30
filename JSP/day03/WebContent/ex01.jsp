<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p {
		margin: 0;
		margin-bottom: 5px;
		
		font-weight: bold;
		font-size: 11pt;
	}
	
	legend {
		font-weight: bold;
	}
</style>
</head>
<%
	String myId = "test";	// 상황에 따라서 값은 달라질 수 있다.
							// html과 java가 같이 있는 코드는 무조건 java가 먼저 작동한다.
%>

<body>
	<fieldset>
		<legend>자바 클래스를 이용하여 파라미터 처리하기</legend>
		<form action="ex01-result.jsp">
			<p>아이디</p>
			<p><input type="text" name="id" placeholder="ID" value="<%=myId %>"></p>
			<p>비밀번호</p>
			<p><input type="text" name="pw" placeholder="Password"></p>
			<p>이름</p>
			<p><input type="text" name="name" placeholder="Input Your Name!"></p>
			<p>나이</p>
			<p><input type="number" name="age" max=100 min=0 placeholder="age"></p>
			<p>성별</p>
			<p>
				<label><input type="radio" name="gender" value="men">남자</label>
				<label><input type="radio" name="gender" value="women">여자</label>
			</p>
			<p><input type="submit" value="전송"></p>
		</form>
	</fieldset>
	
</body>
</html>