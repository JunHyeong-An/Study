<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="css/index.css">
<c:if test="${empty user }">
	<c:redirect url="../login/login.jsp"/>
</c:if>
<c:set var="boardList" value="${boardDAO.selectContentList() }"/>
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
            <div id="post">
                <a href="${path }/board/post.jsp">Post</a>
            </div>
        </aside>

        <div id="backgroundOfMain">
            <header>
                <ul id="nav">
                    <li><span id="main"><a href="${path }/index/index.jsp">main</a></span></li>
                    <li><span id="myPosting"><a href="${path }/index/myPosting.jsp">my posting</a></span></li>
                </ul>
                <%@ include file="search.jsp" %>
                <div id="logo">
                    <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
                <div id="contentList">
                	<c:forEach var="content" items="${boardList }" varStatus="st">
                	<!-- 내가 쓴글 -->
                		<c:if test="${content.writer eq user.id }">
	                		<div class="MyContentBoxLocation">
		                        <div class="contentBox MyContentBox">
		                			<input type="hidden" value="${st.index }" class="index">
		                            <div class="MyContent">
		                            	<p class="name">${user.name }</p>
		                                <p class="writeDate">${content.writeDate }</p>
		                                <c:if test="${not empty content.img }">
		                                	<img class="contentImg" src="${content.img }">
		                                </c:if>
		                                
		                                <p class="MyContent">
		                                    ${content.content }
		                                </p>
		                                <p class="underMenu">
		                                	<a href="${path }/board/modify.jsp?idx=${content.idx}">[수정]</a>
		                                	<span class="delete">[삭제]</span>
		                                	<input type="hidden" value="${content.idx }" class="idx">
		                                </p>
		                                
		                                <!--댓글 -->
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
				                                    		<c:if test="${comment.writer == user.id }">
				                                    			<span class="commentDelete">[삭제]</span>
				                                    			<input type="hidden" value="${comment.idx }" class="commentIdx">
				                                    		</c:if>
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
		                                <!--댓글 끝 -->
		                                
		                            </div>
		                            <div class="MyName">
		                            	<div class="profileImg">
		                            		<img src="${user.profilePic }" width="60px" height="60px">
		                            	</div>
		                            	${content.writer }
		                            </div>
		                        </div>
	                    	</div>
                		</c:if>
                		<!-- 내가 쓴글 -->
                		
                		<!-- 다른 사람이 쓴글 -->
	                	<c:if test="${content.writer != user.id }">
	                		<c:set var="fileName" value="${memberDAO.getUserProfilPic(content.writer) }"/>
	                		<c:set var="name" value="${memberDAO.getUserName(content.writer) }"/>
							<div class="contentBox">
								<input type="hidden" value="${st.index }" class="index">
								<div class="user">
									<div class="profileImg">
		                            	<a href="${path }/account/userInfo.jsp?id=${content.writer}">
		                            		<img src="${fileName }" width="60px" height="60px">
		                            	</a>
		                            </div>
									<a href="${path }/account/userInfo.jsp?id=${content.writer}">
										${content.writer }
									</a>
								</div>
								<div class="content">
									<p class="name">${name }</p>
									<p class="writeDate">${content.writeDate }</p>
									<c:if test="${not empty content.img }">
		                                	<img class="contentImg" src="${content.img }">
		                            </c:if>
									<p class="content">${content.content }</p>
									
								<!--댓글 -->
								<div class="comment">comment</div>
								<div class="commentList" style="display: none;">
									<c:set var="commentList" value="${commentDAO.getCommentList(content.idx) }" />
									<c:if test="${not empty commentList }">
										<c:forEach var="comment" items="${commentList }">
											<c:set var="commentUserImg" value="${memberDAO.getUserProfilPic(comment.writer) }" />
											<div class="commentBox">
												<p class="commentWriter">
													<span class="commentImgStyle"> 
														<img alt="img" src="${commentUserImg }" width="30px" height="30px">
													</span> 
													${comment.writer }
												</p>
												<p class="commentWriteDate">${comment.writeDate }</p>
												<p class="commentContent">${comment.content }</p>
												<c:if test="${user.id eq comment.writer }">
													<p class="underMenu">
														<c:if test="${comment.writer == user.id }">
															<span class="commentDelete">[삭제]</span> 
															<input type="hidden" value="${comment.idx }" class="commentIdx">
														</c:if>
													</p>
												</c:if>
											</div>
										</c:forEach>
									</c:if>

									<c:if test="${empty commentList }">
										<div class="commentBox">
											<p class="commentContent">첫 댓글을 남겨봐요!!</p>
										</div>
									</c:if>
									<div class="commentInput">
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
								<!--댓글 끝 -->
									
								</div>
							</div>
					</c:if>
					<!-- 다른 사람이 쓴글 끝 -->
					</c:forEach>
                </div>
				
				<!-- 짧은 글 쓰기 -->
                <div id="insertContent">
                    <div id="insertInfo">
                        <div id="circle">
                            <img src="${user.profilePic }" width="100px" height="100px">
                        </div>
                        <div id="attachment">Attachment</div>
                	</div>
                    <form action="../board/shortContentInsert.jsp" id="writeForm" method="post">
                        <textarea id="writeContent" name="content" placeholder="What do you think?"></textarea>
                        <p class="notice" id="contentNotice"></p>
                        <input type="hidden" value="${user.id }" name="writer">
                    </form>
                </div>
                <!-- 짧은 글 쓰기 끝 -->
            </main>
        </div>
    </div>
	<script src="js/index.js"></script>
	<script src="js/paging.js"></script>
    <script src="js/search.js"></script>
</body>
</html>