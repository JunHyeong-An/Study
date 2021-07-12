<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex02.jsp - Database 접속 여부 확인하기(버전확인)</h1>
	<hr>
	<%
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user="c##itbank";
		String pw = "it";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "select * from v$version";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, pw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String result = rs.getString(1);
			pageContext.setAttribute("result", result);
		}
	%>
	
	${result }
</body>
</html>