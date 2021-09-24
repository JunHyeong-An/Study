<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/board/css/post.css">
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<c:set var="content" value="${boardDAO.selectContent(param.idx) }"/>
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
                    <li><span id="myPosting"><a href="${path }/index/myPosting.jsp">my posting</a></span></li>
                </ul>
                <%@ include file="../index/search.jsp" %>
                <div id="logo">
                    <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
            	<form action="modifyProc.jsp" id="postForm" method="post" enctype="multipart/form-data">
            		<div id="postDiv">
	            		<div id="fileDiv">
		            		<p class="postTitle">FileUpload</p>
	                		<input type="file" id="postFile" name="postFile">
		                </div>
		                <div id="textDiv">
		                	<p class="postTitle">Text</p>
		                	<textarea id="postText" name="postText">${content.content }</textarea>
		                	<input type="hidden" value="${user.id }" name="writer">
		                	<input type="hidden" value="${content.idx }" name="idx">
		                	<p class="notice" id="textNotice"></p>
		                </div>
		                <input type="button" id="postBtn" value="Post!!">
            		</div>
            	</form>
            	
            </main>
        </div>
    </div>
    <script src="js/modify.js"></script>
</body>
</html>