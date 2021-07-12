<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>human 테이블 내용 불러오기</h1>
	<hr>
	
	<%
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##itbank";
		String pw = "it";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String sql = "select * from human";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
	%>
</body>
</html>