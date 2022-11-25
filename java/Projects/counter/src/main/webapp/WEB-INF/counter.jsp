<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class="container">
		<div class="content">
			<p>You have visited <a href="/"> <c:out value="${page}"/> </a> <c:out value="${count}"/> time(s).</p>
			<p> <a href="/">Test another visit?</a> </p>
			<p>	<a href="/double-counter/">Add 2 visits</a> </p>
			<p><a href="/reset-counter/">Reset counter</a> </p>
		</div>
	</div>
</body>
</html>