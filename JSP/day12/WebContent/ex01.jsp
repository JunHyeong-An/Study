<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex01.jsp - database 접속 확인</h1>
	<hr>
<%
	String driver = "oracle.jdbc.driver.OracleDriver";
	String user = "c##itbank";
	String password = "it";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "select sysdate from dual";
	
	Class.forName(driver);	// 지정한 드라이버 클래스를 메모리에 불러온다.
	
	Connection con = DriverManager.getConnection(url, user, password);	// 접속
	Statement st = con.createStatement();	// 연결 상태 불러오기(현재 상태가 정상이면 명령을 전달할 것임)
	ResultSet rs = st.executeQuery(sql);	// 명령을 전달해서 결과목록을 받아옴
	
	out.print("<ul>");
	while(rs.next()) {
		String data = rs.getString(1);
		out.print("<li>" + data + "</li>");
	}
	out.print("</ul>");
	
	rs.close();
	st.close();
	con.close();
%>
	
</body>
</html>