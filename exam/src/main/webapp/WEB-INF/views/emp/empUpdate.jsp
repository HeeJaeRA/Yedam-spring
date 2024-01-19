<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empUpdate.jsp</title>
</head>
<body>
<h4>사원수정</h4>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<form action="${path}/empUpdate" method="post">
    <div>employeeId<input name="employeeId" value="${emp.employeeId}" readonly="readonly"></div>
	<div>firstName<input name="firstName" value="${emp.firstName}"></div>	
	<div>lastName<input name="lastName" value="${emp.lastName}"></div>
	<div>hireDate<input type="date" name="hireDate" 
	              value='<fmt:formatDate value="${emp.hireDate}" pattern="yyyy-MM-dd"/>'></div>
	<div>email<input name="email" value="${emp.email}"></div>
	<div>jobId<input name="jobId" value="${emp.jobId}"></div>
	<button>등록</button>
	<button type="button" id="btnDelete">삭제</button>
</form>
<script>
	btnDelete.addEventListener("click", function(){
		location.href="${path}/empDelete?employeeId=${emp.employeeId}";
	});
</script>
</body>
</html>