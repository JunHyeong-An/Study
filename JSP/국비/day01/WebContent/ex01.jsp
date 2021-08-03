<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		static public int add(int a, int b) {
			return a + b;
		}
	%>

	<%
		int num1 = add(15, 25);
		int num2 = add(3, 20);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		out.println("num2는 23!!!");
		
		if(num1 % 2 == 0) {
			out.println("<br>num1은 짝수이다!!");
		}
		String title = "jsp 기본 문법";
		
	%>
	<h1><%= title %></h1>
	
	1 + 2 = <%=add(1, 2) %>
	
	<table border="1">
		<tr>
			<th>문법</th>
			<th>설명</th>
		</tr>
		
		<tr>
			<td><strong>&lt;%@ %></strong></td>
			<td>derective, 지시자, 페이지 전반에 걸친 설정을 작성한다. import도 포함한다.</td>
		</tr>
		<tr>
			<td><strong>&lt;%! %></strong></td>
			<td>declaration, 선언부, 멤버 필드를 선언하거나 멤버 메서드를 작성한다.</td>
		</tr>
		<tr>
			<td><strong>&lt;% %></strong></td>
			<td>scriptlet, 스크립트릿, 메인에 대응되는 자바 코드를 작성하는 영역이다.</td>
		</tr>
		<tr>
			<td><strong>&lt;%= %></strong></td>
			<td>expression, 표현식, 값을 HTML에 출력한다. out.print()와 동일한 역할이다.</td>
		</tr>
	</table>
</body>
</html>