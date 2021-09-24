<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="${path }/index/css/index.css">
<link rel="stylesheet" href="${path }/account/css/myInfo.css">
<link rel="stylesheet" href="${path }/account/css/userInfo.css">
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
                    <li><span><a href="${path }/index/myPosting.jsp">my posting</a></span></li>
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
                
                <c:set var="boardList" value="${boardDAO.selectContentList() }"/>
                <div id="userPostDiv">
                <h1 id="userPostingTitle">Posting</h1>
	                <div id="userPostingList">
                		<c:forEach var="content" items="${boardList }">
                		<c:set var="fileName" value="${memberDAO.getUserProfilPic(content.writer) }"/>
						<c:set var="name" value="${memberDAO.getUserName(content.writer) }"/>
                		<c:if test="${param.id eq content.writer }">
		                		<div class="postDiv">
		                		<div class="user">
									<div class="profileImg">
			                          	<img src="${fileName }" width="60px" height="60px">
			                        </div>
									<a href="${path }/account/userInfo.jsp?id=${content.writer}">
										${content.writer }
									</a>
								</div>
	                			<div class="postBox">
	                				<p class="name">${content.writer }</p>
		                			<p class="writeDate">${content.writeDate }</p>
		                			<c:if test="${not empty content.img }">
		                				<img alt="img" src="${content.img }" class="contentImg">
		                			</c:if>
		                			<p>${content.content }</p>
		          					
		          					<div class="comment">comment</div>
		                                <div class="commentList" style="display: none;">
		                                	<c:set var="commentList" value="${commentDAO.getCommentList(content.idx) }"/>
		                               		<c:if test="${not empty commentList }">
	                               				<c:forEach var="comment" items="${commentList }">
	                               					<c:set var="commentUserImg" value="${memberDAO.getUserProfilPic(comment.writer) }"/>
			                               			<div class="commentBox">
		                               				   <p class="commentWriter">
		                               				   		<img alt="img" src="${commentUserImg }" width="30px" height="30px">
		                               				   		${comment.writer }
		                               				   	</p>
				                                        <p class="commentWriteDate">${comment.writeDate }</p>
				                                        <p class="commentContent">${comment.content }</p>
				                                    	<p class="underMenu">
				                                    		<span class="commentDelete">[삭제]</span>
				                                    		<input type="hidden" value="${comment.idx }" class="commentIdx">
				                                    	</p>
				                                 	</div>	
	                               				</c:forEach>
		                               		</c:if>
	
											<c:if test="${empty commentList }">
												<div class="commentBox">
													<p class="commentContent">첫 댓글을 남겨봐요!!</p>
												</div>
											</c:if>
		                                    <div class="commentInput">
		                                        <form action="../board/commentProc.jsp" method="post" class="commentForm">
		                                        	<input type="hidden" value="${user.id }" name="writer">
		                                        	<input type="hidden" value="${content.idx }" name="contentIdx">
		                                            <input type="text" class="inputs commentText" name="content" placeholder="write comment!!"> 
													<input type="button" class="commentBtn" value="add!">
		                                        </form>
		                                    </div>
		                                </div> 
		                			</div>
		                		</div>
                		</c:if>
                		</c:forEach>
		            </div>
                </div>
			</main>
        </div>
    </div>
    <script src="js/userInfo.js"></script>
    <script src="../index/js/search.js"></script>
</body>
</html>