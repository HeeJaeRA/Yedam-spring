<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원목록</h3>
<form action="empList">
	사번<input name="employeeId">
	부서<input type="checkbox" name="depts"  value="10">10
	   <input type="checkbox" name="depts"  value="20">20
	   <input type="checkbox" name="depts"  value="30">30
	직무<select name="jobId">
		  <option value="">선택
	      <option value="IT_PROG">IT_PROG
	      <option value="ST_CLERK">ST_CLERK
	      <option value="ST_MAN">ST_MAN
	   </select>
	입사일자 <input type="date" name="sdt">~<input type="date" name="edt">
	<button>검색</button>
</form>
<c:forEach items="${list}" var="emp">
	<a href="empUpdate/${emp.employeeId}">${emp.employeeId}</a> 
	${emp.firstName} 
	${emp.departmentId} 
	${emp.jobId}<br>
</c:forEach>

</body>
</html>