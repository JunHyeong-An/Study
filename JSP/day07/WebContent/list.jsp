<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<jsp:useBean id="dao" class="day07.BookDAO"/>
<c:set var="list" value="${dao.getBookList() }"/>

<main>
	<table id="book-list">
		<thead>
			<tr>
				<th>도서명</th>
				<th>저자</th>
				<th>출판사</th>
				<th>출판일자</th>
				<th>보유수량</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			
			<tbody>
				<c:forEach var="book" items="${list }" varStatus="st">
					<tr>
						<td>${book.name }</td>
						<td>${book.author }</td>
						<td>${book.publisher }</td>
						<td>${book.regidate }</td>
						<td>${book.count }권</td>
						<td><a href="modify.jsp?name=${book.name }"><input type="button" value="수정" class="pointer"></a></td>
						<td>
							<a href="delete.jsp?name=${book.name }">
								<button class="pointer deleteBtn" data-name=${book.name } data-index="${st.index }">삭제</button>
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
	</table>
</main>

<script type="text/javascript">
        const deleteBtns = document.querySelectorAll('.deleteBtn');
        
        deleteBtns.forEach((btn) -> {
                btn.onclick = (event) -> {
                		const login = '${login.id }';
                		
                		if(login == '') {
                			alert('로그인 사용자만 삭제할 수 있습니다.');
                			location.href='login.jsp';
                			return;
                		}
                	
                        const bookName = event.target.dataset.name;
                        const bookIndex = event.target.dataset.index;
                        const answer = confirm('[' + bookName + ']' + ' 도서를 정말 삭제하시겠습니까?');
                        if(answer) {
                                location.replace('delete.jsp?index=' + bookIndex);
                        }
                };
        });
        
</script>
<footer>
	<%@include file="footer.jsp" %>
</footer>
