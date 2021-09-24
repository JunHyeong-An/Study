<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex07-result.jsp</title>
<style type="text/css">
	ul {
		display: flex;
		margin-right: 0px;
	}
</style>

</head>

<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String[] langs = request.getParameterValues("lang");
	String lastSchool = request.getParameter("lastSchool");
	
	boolean isFullForm = name != null && age != null && gender != null
						&& langs != null && lastSchool != null;
	
	if(!isFullForm) {
		response.sendRedirect("ex07.jsp");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.print("lang : ");
		for(String lang : langs) {
			System.out.print(lang);
		}System.out.println();
		System.out.println("lastSchool : " + lastSchool);
	}
%>

<%
	Map<String, String[]> map = request.getParameterMap();
	
	Set<String> keyset = map.keySet();
	// 중복을 허용하지 않는 집합, index가 존재하지 않는다.
	
	out.print("<fieldset>");
	for(String key : keyset) {
		String[] values = map.get(key);
		out.print(key + " : ");
		for(String value : values) {
			out.print(value + ", ");
		}
	}
%>

<%
	Map<String, String[]> map2 = request.getParameterMap();
	Enumeration<String> names = request.getParameterNames();
	
	out.print("<fieldset>");
	while(names.hasMoreElements()) {
		String key = names.nextElement();
		String[] values = request.getParameterValues(key);
		out.print(key + " : ");
		for(String value : values) {
			out.print(value + " ");
		}
		out.print("<br>");
	}
	out.print("</fieldset");
%>
<body>
	<h1>여러 파라미터 처리하기</h1>
	<hr>
	
	<fieldset>
		<legend>값들</legend>
		<ul>
			<dt>이름 : </dt>
			<dd><%=name %></dd>
			<dt>나이 : </dt>
			<dd><%=age %></dd>
			<dt>성별 : </dt>
			<dd><%=gender %></dd>
			<dt>배운 언어 : </dt>
			<dd>
				<%for(String lang : langs) {%>
					<%=lang %>, 
				<%} %>
			</dd>
			<dt>최종학력 : </dt>
			<dd><%=lastSchool %></dd>
		</ul>
	</fieldset>
</body>
</html>