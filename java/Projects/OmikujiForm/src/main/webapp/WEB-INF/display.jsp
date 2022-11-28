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
		<div class="header">
			<h1>Here's Your Omikuji</h1>
		</div>
		<div class="content">
			<p>
				In <c:out value="${number}"/>  years, you will live in <c:out value="${city}"/> with 
				<c:out value="${person}"/> as your roommate, selling origamis for a living. The next time you
				see a <c:out value="${living}"/>, you will have good luck. Also, <c:out value="${nice}"/>
			
			</p>
		</div>
	</div>

</body>

</html>