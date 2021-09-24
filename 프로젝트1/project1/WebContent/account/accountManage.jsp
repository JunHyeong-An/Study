<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/account/css/myInfo.css">

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
                <a href="${path }/login/logoutProc.jsp">Log out</a>
            </div>
        </aside>

        <div id="backgroundOfMain">
            <header>
                <ul id="nav">
                    <li><span><a href="${path }/index/index.jsp">main</a></span></li>
                    <li><span>my posting</span></li>
                </ul>
                <%@ include file="../index/search.jsp" %>
                <div id="logo">
                   <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
                <div id="myInfo">
                    <div id="name">${user.id }</div>
                    <div id="info">
                    	<form action="updateInfo.jsp" method="post" id="updateForm" enctype="multipart/form-data">
	                    	<table>
	                            <tr>
	                                <td>age</td> 
	                                <td>
	                                	<input type="number" class="inputs updateInput" id="updateAge" value="${user.age }" name="age">
	                                </td>
	                            </tr>
	                            <tr>
	                                <td>userName</td> 
	                                <td>
	                                	<input type="text" class="inputs updateInput" id="updateName" value="${user.name }" name="name">
	                                </td>
	                            </tr>
	                            <tr>
	                                <td>email address</td> 
	                                <td>
	                                	<input type="text" class="inputs updateInput" id="updateEmail" value="${user.email }" name="email">
	                                </td>
	                            </tr>
	                            <tr>
	                            	<td>
	                            		<input type="file" name="profilePic">
	                            	</td>
	                            </tr>
	                        </table>
	                        <textarea class="introduceWrite" name="introduction" placeholder="Introduce yourself...">${user.introduction }</textarea>
	                        <div id="submitDiv">
	                            <div id="submitBtn">
	                                submit
	                            </div>
	                        </div>
                    	</form>
                    </div>
                </div>
                <aside id="changePw">
                    <form action="changePwProc.jsp" method="post" id="changePwForm">
                        <div id="changePwTitle">Change Password</div>
                        <input type="password" class="chPwInputs" placeholder="password" id="pw" name="pw">
                        <p class="notice" id="pwNotice"></p>
                        <input type="password" class="chPwInputs" placeholder="new password" id="newPw" name="newPw">
                        <p class="notice" id="newPwNotice"></p>
                        <input type="password" class="chPwInputs" placeholder="verify password" id="reNewPw">
                        <p class="notice" id="ReNewPwNotice"></p>
                        <div id="changePwFormSubmit">
                            submit
                        </div>
                    </form>                    
                </aside>
            </main>
        </div>
    </div>
    <script src="js/myInfo.js"></script>
    <script src="js/changePw.js"></script>
    <script src="../index/js/search.js"></script>
</body>
</html>