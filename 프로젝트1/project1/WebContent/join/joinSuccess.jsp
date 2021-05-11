<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/join/css/joinResult.css">
<body>
    <div id="wrap">
        <div id="welecomeMsg">
            <p>HELLO,<br></p>
            <p id="userName">${name}</p>
            <c:remove var="name"/>
        </div>
        <div id="subWelecomMsg">
            YOUR ACCOUNT IS CREATED!<br>
            PLEASE LOGIN<br>
            WITH YOUR USERNAME & PW
        </div>
        <div id="loginBtn">
            <div id="toLoginPage">
                <a href="${path }/login/login.jsp">Login Page</a>
            </div>
        </div>
    </div>
</body>
</html>