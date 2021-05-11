<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/index/css/searchResultPage.css">
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<c:set var="searchList" value="${memberDAO.searchMember(param.searchValue) }"/>
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
                    <li><span id="main"><a href="${path }/index/index.jsp">main</a></span></li>
                    <li><span id="myPosting"><a href="${path }/index/myPosting.html">my posting</a></span></li>
                </ul>
                <%@ include file="search.jsp" %>
                <div id="logo">
                    <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
                <div id="searchList">
                	<c:forEach var="searchResult" items="${searchList }">
                	<a href="${path }/account/userInfo.jsp?id=${searchResult.id }">
                		<div class="searchResultBox">
	                		<img src="${searchResult.profilePic }" width="60px" height="60px"> 
	                		<span class="searchContent">${searchResult.id }</span> 
	                		<span class="searchContent">${searchResult.name }</span>
	                		<span class="searchContent" id="searchIntro">${searchResult.introduction }</span>
                		</div>
                	</a>
                	</c:forEach>
                </div>
            </main>
        </div>
    </div>
    <script src="js/search.js"></script>
	<script src="js/index.js"></script>
</body>
</html>