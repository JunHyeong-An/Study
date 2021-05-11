<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="memberList" value="${memberDAO.getMemberList() }"/>
<div id="search">
	<form action="${path }/index/searchResultPage.jsp" id="searchForm" name="searchForm">
		<div id="searchInput">
			<input type="text" class="inputs" id="searchBar" name="searchValue"
				placeholder="Find your Friends" autocomplete="off">
			<div id="searchResultList">
				<c:forEach var="member" items="${memberList }" varStatus="st">
					<input type="hidden" class="member" value="${member.id }">
					<input type="hidden" class="memberName" value="${member.name }">
					<div id="noResult">일치하는 검색 결과가 없습니다.</div>
					<a href="${path }/account/userInfo.jsp?id=${member.id }">
						<div class="searchResult">
							<img src="${member.profilePic }" width="40px" height="40px">
							<span class="searchEle">${member.id }</span> <span class="searchEle">${member.name }</span>
						</div>
					</a>
				</c:forEach>
				<div id="moreSearchResult">
					검색결과 더보기
				</div>
			</div>
		</div>
		<div id="searchBtn">GO!</div>
	</form>
</div>