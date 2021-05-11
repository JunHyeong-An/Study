<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="css/login.css">
<body>
    <div id="wrap">
        <div id="logo">
            <div id="circle"></div>
            <h1 id="loginTitle">ITSTARGRAM</h1>
        </div>
        

        <div id="loginBox">
            <form action="loginProc.jsp" id="loginForm" method="post">
                <div id="inputBox">
                    <div class="inputDiv">
                        <input type="text" class="inputs" id="id" name="id" placeholder="ID">
                    </div>
                    <div class="notice" id="noticeId"></div>
                    <div class="inputDiv">
                        <input type="password" class="inputs" id="pw" name="pw" placeholder="PASSWORD">
                    </div>
                    <div class="notice" id="noticePw"></div>
                <p id="noticeLogin">${msg }</p>
                </div>
                <c:remove var="msg"/>
                <div id="btnBox">
                    <div class="btnDiv">
                        <input type="button" id="loginBtn" class="btn" value="LOG IN">
                    </div>
                    <div class="btnDiv">
                        <a href="${path }/join/join.jsp">
                        	<input type="button" id="joinBtn" class="btn" value="JOIN">
                        </a>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script src="js/login.js"></script>
</body>
</html>