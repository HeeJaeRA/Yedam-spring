<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- http://localhost:8080/app/empList -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>전체 사원 조회</title>
	</head>
	<body>
		<button></button>
		<table>
			<thead>
				<tr>
					<th>No.</th>
					<th>employee_id</th>
					<th>last_name</th>
					<th>email</th>
					<th>hire_date</th>
					<th>job_id</th>
					<th>salary</th>
				</tr>
			</thead>
			<tbody>
				<!-- items: controller의 addAttribute 이름
                    var: 내부에서 사용할 임시 이름
                    varStatus: 상태용 변수, index(0부터 시작), count(1부터 시작) 등 여러 속성 존재함 -->
				<c:forEach items="${empList}" var="info" varStatus="sts">
					<tr onclick="location.href='empInfo?employeeId=${info.employeeId}'">
						<td>${sts.count}</td>
						<td>${info.employeeId}</td>
						<td>${info.lastName}</td>
						<td>${info.email}</td>
						<!-- 날짜 형식 Tue Jun 17 00:00:00 KST 2003 -> pattern 형식으로 포맷팅 -->
						<td>
							<fmt:formatDate value="${info.hireDate}" pattern="yyyy년 MM월 dd일" />
						</td>
						<td>${info.jobId}</td>
						<td>${info.salary}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>
<!-- JSP -> Servlet -> Java -> Html -> Css -> Javascript 순서로 실행됨 
c태그 안쪽에서 주석 작성할때 주의 필요 -->
