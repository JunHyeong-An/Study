<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
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
	request.setCharacterEncoding("UTF-8");
	
	Map<String, String[]> map = request.getParameterMap();
	Enumeration names = request.getParameterNames();

	out.print("<fieldset>");
	out.print("<legend>");
	out.print("받은 값");
	out.print("</legend>");
	while(names.hasMoreElements()) {
		String key = (String)names.nextElement();
		String[] values = request.getParameterValues(key);
		
		System.out.print(key + " : ");
		for(String value : values) {
			System.out.println(value);
		}
		
		out.print(key + " : ");
		for(String value : values) {
			out.print(value + "<br>");
		}
	}
	out.print("</filedset>");
%>
</body>

</html>