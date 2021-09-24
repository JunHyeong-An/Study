<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="day04.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<body>
	<jsp:useBean id="member" class="day04.Member" />
	<jsp:setProperty property="*" name="member" />

	<%
		System.out.println("ID : " + member.getId());
		System.out.println("PW : " + member.getPw());
		System.out.println("RePw : " + member.getRePw());
		System.out.println("name : " + member.getName());

		String regMsg = null;
		boolean isReg = true;
		
		if(member.getPw().equals(member.getRePw())) {
			Member memberData = new Member(member.getId(), member.getPw(), member.getName());
			session.setAttribute("memberData", memberData);
			regMsg = "회원가입 성공!!";
		}
		else {
			regMsg = "회원가입 실패..";
			
			isReg = false;
			response.sendRedirect("index.html");
			System.out.println(regMsg);
		}
		
		session.setAttribute("isReg", isReg);
		session.setAttribute("regMsg", regMsg);
	%>
	<script type="text/javascript">
		location.href="register_result.jsp";
	</script>
</body>
</html>



