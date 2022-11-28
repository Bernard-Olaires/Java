<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Omikuji Form</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>

	<div class="container">
		<div class="header">
			<h1>Omikuji Form</h1>
		</div>
		<div class="content">
			<form action="/show" method='POST'>
			
				<label>Pick any number from 5 to 25.</label>
				<input type="number" name="number">
				
				<label>Enter the name of any city.</label>
				<input type="text" name="city">
				
				<label>Enter a name of any real person.</label>
				<input type="text" name="person">
				
				<label>Enter professional endeavor or hobby:</label>
				<input type="text" name="hobby"> 
				
				<label>Enter any type of living thing.</label>
				<input type="text" name="living">
				
				<label> Say something nice to someone.</label>
				<textarea name="nice" cols="30" rows="10"></textarea>
			
				
				<input type="submit">
				
				
			</form>
		</div>
	</div>
	

</body>

</html>