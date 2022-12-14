<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>





<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>Hoppers Receipt</title>
	
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
	
</head>
<body>

	<h1>Customer Name: <c:out value="${name}"/></h1>
	
	<p>Item Name: <c:out value="${item}"/></p>
	
	<p>Price: <c:out value="${5.25}"/></p>
	
	<p>Description: <c:out value="${description}"/></p>
	
	<p>Vendor: <c:out value="${vendor}"/></p>
	
</body>
</html>