<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="css/index.css">
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
                    <li><span id="main"><a href="${path }/index/index.jsp">main</a></span></li>
                    <li><span id="myPosting"><a href="${path }/index/myPosting.html">my posting</a></span></li>
                </ul>
                <%@ include file="search.jsp" %>
                <div id="logo">
                    <a href="${path }/index/index.jsp">ITSTAGRAM</a>
                </div>
            </header>
            
            <main>
                <div id="contentList">
                    <!-- 내가 쓴글 -->
                    <div class="MyContentBoxLocation">
                        <div class="MyContentBox">
                            <div class="MyContent">
                                <p class="title">TITLE</p>
                                <p class="writeDate">writeDate</p>
                                <p class="MyContent">
                                    \${user.profilePic } : ${user.profilePic }<br>
                                    \${user.id } : ${user.id }<br>
                                    \${user.regiDate } : ${user.regiDate }<br>	
                                    \${user.birth } : ${user.birth }
                                </p>
                                <div class="comment">comment</div>
                                <div class="commentList">
                                    <div class="commentBox">
                                        <p class="commentWriter">wrtier</p>
                                        <p class="commentWriteDate">writeDate</p>
                                        <p class="commentContent">Labore minim eu dolor amet laborum ea reprehenderit nulla magna.</p>
                                        
                                    </div>
                                    <div class="commentBox">
                                        <p class="commentWriter">wrtier</p>
                                        <p class="commentWriteDate">writeDate</p>
                                        <p class="commentContent">Labore minim eu dolor amet laborum ea reprehenderit nulla magna.</p>
                                    </div>
                                    <div class="commentInput">
                                        <form id="commentForm">
                                            <input type="text" class="inputs" name="comment" placeholder="write comment!!">
                                            <input type="button" value="comment!"> 
                                        </form>
                                    </div>
                                </div> 
                            </div>
                            <div class="MyName">MyName</div>
                        </div>
                    </div>
                    <!-- 다른 사람이 쓴글 -->

                    <div class="contentBox">
                        <div class="user">username</div>
                        <div class="content">
                            <p class="title">TITLE</p>
                            <p class="writeDate">writeDate</p>
                            <p class="content">
                                Velit eu ipsum minim id.
                            </p>
                            <div class="comment">comment</div>
                            <div class="commentList">
                                <div class="commentBox">
                                    <p class="commentWriter">wrtier</p>
                                    <p class="commentWriteDate">writeDate</p>
                                    <p class="commentContent">Labore minim eu dolor amet laborum ea reprehenderit nulla magna.</p>
                                    
                                </div>
                                <div class="commentBox">
                                    <p class="commentWriter">wrtier</p>
                                    <p class="commentWriteDate">writeDate</p>
                                    <p class="commentContent">Labore minim eu dolor amet laborum ea reprehenderit nulla magna.</p>
                                </div>
                                <div class="commentInput">
                                    <form class="commentForm">
                                        <input type="text" class="inputs" name="comment" placeholder="write comment!!">
                                        <input type="button" class="commentBtn" value="add!">
                                    </form>
                                </div>
                            </div> 
                        </div>
                    </div>
                    <!-- ê¸ì°ë ê³³ -->
                </div>

                <div id="insertContent">
                    <div id="insertInfo">
                        <div id="circle">
                            Me
                        </div>
                        <div id="attachment">Attachment</div>
                	</div>
                    <form id="writeForm">
                        <input type="text" class="inputs" name="title" placeholder="TITLE">
                        <textarea id="writeContent" name="content" placeholder="What do you think?"></textarea>
                        <input type="hidden" name="id">
                    </form>
                </div>
            </main>
        </div>
    </div>
    <script src="js/search.js"></script>
	<script src="js/index.js"></script>
</body>
</html>