<%@page import="day04.MemberData"%>
<%@page import="day04.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<%
	String regMsg = (String)session.getAttribute("regMsg");
	boolean isReg = (boolean)session.getAttribute("isReg");
	Member memberData = (Member)session.getAttribute("memberData");
	MemberData data = new MemberData();
	
	if(isReg) {
		data.setMemberData(memberData);
		System.out.println(data.memberDatas.get(0).getId());
	}
%>

<h3><%=regMsg %></h3>
</body>
</html>