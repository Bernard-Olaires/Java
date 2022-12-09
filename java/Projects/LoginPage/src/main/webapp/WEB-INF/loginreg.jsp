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
	<title>Login and Registration</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
	<header>
		<h1>Login and Regestration</h1>
	</header>
	<div class="flex-container">
		<div class="form-1">
			<h3>Register</h3>
			<form:form action="/register" method="post" modelAttribute="registerUser">
			
				<div>
					<form:label path="userName">Name:</form:label>
					<form:input path="userName"/> 
					<form:errors path="userName"/>
				</div>
				
				<div>
					<form:label path="email">Email:</form:label>
					<form:input path="email" type="email"/> 
					<form:errors path="email"/>
				</div>
				
				<div>
					<form:label path="password">Password:</form:label>
					<form:password path="password"/> 
					<form:errors path="password"/>
				</div>
				
				<div>
					<form:label path="confirm">Confirm Password:</form:label>
					<form:password path="confirm"/> 
					<form:errors path="confirm"/>
				</div>
				
				<input type="submit" value="Register" />
				
			</form:form>
		</div>
	</div>
</body>

</html>