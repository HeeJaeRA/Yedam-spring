<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container">
	<h1>도서 등록</h1>
	<form name="insertForm" action="bookInsert" method="post">
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="text" name="bookNo" readonly /></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName" /></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCoverimg" /></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="text" name="bookDate" /></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="text" name="bookPrice" /></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher" /></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit">등록</button>
	</form>
</div>
<script>
	// 자바스크립트
	document.querySelector('form[name="insertForm"]').addEventListener('submit', boardInsertJs);

	function boardInsertJs(event) {
		event.preventDefault();

		let title = document.getElementsByName('bookName')[0];

		if (title.value == '') {
			alert('도서명이 입력되지 않았습니다.');
			title.focus();
			return;
		}

		alert('도서등록이 완료 되었습니다.')
		insertForm.submit();
	}

</script>
