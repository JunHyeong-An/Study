<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/account/css/myInfo.css">
<c:set var="otherUser" value="${memberDAO.getInfo(param.id) }"/>
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<body>
    <div id="wrap">
        <aside id="myProfile">
            <div id="profilePic">
                <img alt="photo in here" src="${otherUser.profilePic }" width="300px" height="500px">
            </div>
            <div id="userName">
                ${otherUser.name }
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
                    <div id="name">${otherUser.id }</div>
                    <div id="info">
                        <table>
                            <tr>
                                <td>age</td> <td>${otherUser.age }</td>
                            </tr>
                            <tr>
                                <td>userName</td> <td>${otherUser.name }</td>
                            </tr>
                            <tr>
                                <td>email address</td> <td>${otherUser.email }</td>
                            </tr>
                        </table>
                        <textarea class="introduceWrite" id="myInfoWrite" placeholder="Introduce yourself..." readonly>${otherUser.introduction }</textarea>
                    </div>
                </div>
            </main>
        </div>
    </div>
	<script src="../index/js/search.js"></script>
</body>
</html>