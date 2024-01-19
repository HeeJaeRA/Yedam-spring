<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<h1>도서별 대여매출현황</h1>
	<table class="table">
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>대여총계</th>
				<th>대여횟수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${rentList}" var="rent">
				<tr>
					<td align="center">${rent.bookNo }</td>
					<td>${rent.bookName }</td>
					<td align="right">${rent.rentPrice }</td>
					<td align="right">${rent.rentStatus }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
