<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="nav">
	<a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath }/">Home</a>
	<a class="nav-link" href="${pageContext.request.contextPath }/empList">전체 사원 조회</a>
	<a class="nav-link" href="${pageContext.request.contextPath }/empInsert">사원 정보 등록</a>
	<a class="nav-link" href="${pageContext.request.contextPath }/boardList">게시판 조회</a>
	<a class="nav-link" href="${pageContext.request.contextPath }/boardInsert">게시글 등록</a>
	<a class="nav-link disabled" aria-disabled="true">Disabled</a>
</nav>
