<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- New line below to use the JSP Standard Tag Library -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- FORM TAG -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>

<%@ page isErrorPage="true" %>  

<html>

<head>
	<meta charset="UTF-8">
	<title>Dashboard</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
	<div class="container">
		<h1>Welcome, <c:out value="${loggedUser.userName}"/> </h1>
		<a href="/logout">Log Out</a>
	</div>
</body>

</html>