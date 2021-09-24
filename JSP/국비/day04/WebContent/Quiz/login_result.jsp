<%@page import="day04.MemberData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>	
<% 
	String msg = (String)session.getAttribute("msg");
%>

<%=msg %>

</body>
</html>