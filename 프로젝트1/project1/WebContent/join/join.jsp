<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<link rel="stylesheet" href="${path }/join/css/join.css">
<body>
    <div id="wrap">
        <div id="joinTitle">Join Page</div>
        <div id="joinBox">
            <form action="joinProc.jsp" id="joinForm" method="post">
                <div class="inputDiv">
                    <input type="text" class="inputs" id="id" name="id" placeholder="ID">
                </div>
                <div class="notice" id="noticeId"></div>
                
                <div class="inputDiv">
                    <input type="password" class="inputs" id="pw" name="pw" placeholder="PASSWORD">
                </div>
                <div class="notice" id="noticePw"></div>

                <div class="inputDiv">
                    <input type="password" class="inputs" id="rePw" name="rePw" placeholder="VERIFY YOUR PASSWORD">
                </div>
                <div class="notice" id="noticeRePw"></div>

                <div class="inputDiv">
                    <input type="text" class="inputs" id="name" name="name" placeholder="NAME">
                </div>
                <div class="notice" id="noticeName"></div>
                
                <div class="inputDiv">
                    <input type="number" class="inputs" id="age" name="age" placeholder="AGE" max="100" min="1">
                </div>
                <div class="notice" id="noticeAge"></div>

                <div class="inputDiv" id="emailBox">
                    <input type="text" class="inputs" id="email" name="emailId" placeholder="Email"> <span id="atSign">@ </span> 
                    <select name="emailAddr" id="emailSelect">
                        <option value="naver.com">
                            naver.com
                        </option>
                        <option value="gmail.com">
                            gmail.com
                        </option>
                        <option value="daum.com">
                            daum.com
                        </option>
                        <option value="userInput" id="userInput">
							직접입력
                        </option>
                    </select>
                </div>
                <div class="notice" id="noticeEmail"></div>

                <div class="inputDiv">
                    <input type="date" class="inputs" id="birth" name="birth" placeholder="DATE OF BIRTH">
                </div>
                <div class="notice" id="noticeBirth"></div>
                

                <!-------------------------------------------------------------------------------------------------->
                <div id="btnBox">
                    <div id="joinBtn">Join!</div>
                </div>
            </form>
        </div>
    </div>
    <script src="js/join.js"></script>
</body>
</html>