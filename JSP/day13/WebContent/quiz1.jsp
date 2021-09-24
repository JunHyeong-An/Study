<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="day13.MemberDAO"/>

	<table border="1">
		<tr>
			<th>ID</th><th>PW</th><th>NAME</th><th>AGE</th>
		</tr>
		<c:forEach var="m" items="${dao.memberList }">
			<tr>
				<td>${m.id }</td><td>${m.pw }</td><td>${m.name }</td><td>${m.age }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>