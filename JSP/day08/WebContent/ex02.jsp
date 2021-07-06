<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cks = request.getCookies();
		String ckName = null;
		String ckValue = null;
	
		if(cks != null) {
			for(Cookie ck : cks) {
				if(ck.getName().equals("comment")) {
					ckName = ck.getName();
					ckValue = ck.getValue();
					
					String urlDecoded = URLDecoder.decode(ckValue, "UTF-8");
					
					pageContext.setAttribute("comment", urlDecoded);
				}
			}
		}
		else {
	%>
		<script type="text/javascript">
			alert('첫방문이시네요 환영합니다.');
		</script>
	<%
		}
	%>
	
<!-- 	
	1) 사용자가 값을 서버에 전송 (parameter)
	2) 서버는 값을 받아서 문자열 값을 쿠키로 만들어내고 response에 담아서 같이 보낸다.
	3) 클라이언트는 전달받은 쿠키를 브라우저의 쿠키 저장소에 보관한다.
	4) 같은 사이트에 재방문시, 클라이언트가 보관하던 쿠키를 request에 같이 묶어서 보낸다.
	5) 서버는 쿠키를 확인하고, 쿠키에 담긴 값을 활용하여 응답을 구성하여 보낸다.
	6) 쿠키의 규약 상, 사용할 수 없는 글자도 있어서 URLEncoding을 활용하는 경우가 많다 
-->
	
	<h1>사용자 입력 폼</h1>
	<hr>
	
	<form action="ex02-result.jsp">
		<input name="comment" value="${comment }" placeholder="메모를 입력하세요" required>
		<input type="submit" value="전송">
	</form>
	
	<h2>\${cookie.comment.value } : ${comment}</h2>
	
	<button id="js-cookieBtn">javascript 쿠키 확인</button>
	<a href="ex02-delete-cookie.jsp"><button>쿠키 삭제</button></a>
	
	<script type="text/javascript">
		document.getElementById("js-cookieBtn").onclick = function() {
			alert(document.cookie);
		}
	</script>
</body>
</html>