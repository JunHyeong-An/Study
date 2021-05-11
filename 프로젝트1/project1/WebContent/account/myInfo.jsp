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
                        <table>
                            <tr>
                                <td>age</td> <td>${user.age }</td>
                            </tr>
                            <tr>
                                <td>userName</td> <td>${user.name }</td>
                            </tr>
                            <tr>
                                <td>email address</td> <td>${user.email }</td>
                            </tr>
                        </table>
                        <textarea class="introduceWrite" id="myInfoWrite" placeholder="Introduce yourself..." readonly>${user.introduction }</textarea>
                    </div>
                </div>
                <aside id="changePw">
                    <form id="changePwForm">
                        <div id="asideBtns">
                            <div class="changePwBtns" id="manage">
                                <a href="accountManage.jsp">Manage</a>
                            </div>
                            <div class="changePwBtns" id="leave">
                                <a href="${path }/account/secession.jsp">Leave</a>
                            </div>
                        </div>
                    </form>                    
                </aside>
            </main>
        </div>
    </div>
	<script src="../index/js/search.js"></script>
</body>
</html>