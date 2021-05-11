<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${path }/index/css/index.css">
    <link rel="stylesheet" href="${path }/account/css/secession.css">
</head>
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<body>
    <div id="wrap">
        <aside id="myProfile">
            <div id="profilePic">
                <img alt="photo in here" src="${user.profilePic }" width="300px" height="500px">
            </div>
            <div id="userName">
                ${user.name }
            </div>

            <div id="account">
                <a href="${path }/account/myInfo.jsp">Account</a>
            </div>
        </aside>

        <div id="backgroundOfMain">
            <header>
                <ul id="nav">
                    <li><span><a href="${path }/index/index.jsp">main</a></span></li>
                    <li><span>my posting</span></li>
                </ul>
                <div id="search">
                    <form action="" id="searchForm" name="searchForm">
                        <input type="text" class="inputs" id="searchBar" name="searchName"
                            placeholder="Find your Friends">
                        <div id="searchBtn">
                            GO!
                        </div>
                    </form>
                </div>
                <div id="logo">
                   <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
            	<form action="secessionProc.jsp" id="secessionForm" method="post">
	            	<h1 id="secessionTitle">회원탈퇴</h1>
	            	<p id="announce">회원 탈퇴를 완료하시려면 아이디와 비밀번호를 입력해주세요</p>
            		<input type="text" class="inputs secessionInput" name="id" placeholder="ID">
                	<input type="password" class="inputs secessionInput" id="secessionPw" name="pw" placeholder="Password">
                	<div class="changePwBtns" id="leave">
                    	Leave
                    </div>
            	</form>
            </main>
        </div>
    </div>
    <script type="text/javascript" src="js/secession.js"></script>
</body>
</html>