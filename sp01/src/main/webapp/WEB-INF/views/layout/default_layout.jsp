<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> <%@ taglib
uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Web Site</title>
		<!-- 전체 적용: css, js, 라이브러리 -->
		<!-- bootstrap5 css, js -->
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
			crossorigin="anonymous"
		/>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
			crossorigin="anonymous"
		></script>
	</head>
	<body>
		<header>
			<tiles:insertAttribute name="header" />
		</header>
		<main>
			<tiles:insertAttribute name="content" />
		</main>
		<footer>
			<tiles:insertAttribute name="footer" />
		</footer>
	</body>
</html>
