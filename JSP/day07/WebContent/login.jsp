<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>	

<%
	String id = request.getParameter("id");
	String storeId = request.getParameter("storeId");
	
	if(storeId != null) {
		Cookie ck = new Cookie("id", id);
		response.addCookie(ck);
		
		Cookie[] cks = request.getCookies();
		if(cks != null) {
			for(Cookie c : cks) {
				if(c.getName().equals("id")) 
					pageContext.setAttribute("id", c.getValue());
			}
		}
	}
	else {
		Cookie ck = new Cookie("id", "");
		ck.setMaxAge(0);
		response.addCookie(ck);	
	}
	
	
%>

<main>
	<c:if test="${pageContext.request.method == 'GET' }">
		<form action="" method="post">
			<p><input type="text" name="id" value="${cookie.id.value }" placeholder="ID"></p>
			<p><input type="password" name="pw" placeholder="Password"></p>
			<p>
				<label>
					<input type="checkbox" name="storeId" ${cookie.id.value == null ? '' : 'checked' }>
					ID 저장
				</label>
			</p>
			<p><input type="submit"></p>
		</form>	
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="dao" class="day07.BookMemberDAO"/>
		<jsp:useBean id="dto" class="day07.BookMemberDTO"/>
		<jsp:setProperty property="*" name="dto"/>
		<c:set var="user" value="${dao.login(dto) }" />
	
		<c:if test="${not empty user }">
			<c:set var="login" value="${user }" scope="session" />
			<%session.setMaxInactiveInterval(600);%>
			<c:redirect url="index.jsp" />
		</c:if>
		\${user } : ${user }<br>
		\${login.id } : ${login.id }
	</c:if>
</main>
<footer>
	<%@include file="footer.jsp" %>
</footer>
