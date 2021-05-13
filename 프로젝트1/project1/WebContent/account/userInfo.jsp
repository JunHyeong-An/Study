<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/account/css/myInfo.css">
<c:set var="otherUser" value="${memberDAO.getInfo(param.id) }"/>
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<c:if test="${user.id eq param.id }">
	<c:redirect url="myInfo.jsp"/>
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
                    <li><span><a href="${path }/account/myInfo.jsp">my posting</a></span></li>
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
                
                <!-- 글목록 -->
                <c:set var="boardList" value="${boardDAO.selectContentList() }"/>
				<div id="userPostDiv">
					<c:forEach var="post" items="${boardList }">
						<div class="commentBox">
							<p class="commentWriter">
								<span class="commentImgStyle"> 
									<img alt="img" src="${commentUserImg }" width="30px" height="30px">
								</span> 
								${post.writer }
							</p>
							<p class="commentWriteDate">${post.writeDate }</p>
							<p class="commentContent">${post.content }</p>
							<p class="underMenu">
								<input type="hidden" value="${post.idx }" class="commentIdx">
							</p>
						</div>
					</c:forEach>
				</div>
			</main>
        </div>
    </div>
	<script src="../index/js/search.js"></script>
</body>
</html>