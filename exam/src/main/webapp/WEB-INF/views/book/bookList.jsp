<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container">
	<h1>도서 조회/수정</h1>
	<table class="table">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td>${book.bookNo }</td>
					<td>${book.bookName }</td>
					<td><img style="width: 30px;" src="<c:url value="/resources/images/${book.bookCoverimg }" />"></td>
					<td>
						<fmt:formatDate value="${book.bookDate }" pattern="yyyy/MM/dd" />
					</td>
					<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###" /></td>
					<td>${book.bookPublisher }</td>
					<td>${book.bookInfo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
