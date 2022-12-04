<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>  
    
    <!-- New line below to use the JSP Standard Tag Library -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
	<meta charset="UTF-8">
	<title>Burger Tracker</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
	<div class="container">
		<h1> Burgers </h1>
		<div class="content-table">
			<table>
				<thead>
					<tr>
						<th>Burger Name</th>
						<th>Restaurant Name</th>
						<th>Rating (out of 10)</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="burger" items="${burgers}">
						<tr>
							<td> <c:out value="${burger.burgerName}"/> </td>
							<td> <c:out value="${burger.resturantName}"/> </td>
							<td> <c:out value="${burger.rating}"/> </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
		<div class="content-2">
			<h1>New Burger</h1>
			<form:form action="/burger/new" method="post" modelAttribute="burger">
			    <p>
			        <form:label path="burgerName">Burger Name:</form:label>
			        <form:errors path="burgerName"/>
			        <form:input path="burgerName"/>
			    </p>
			    <p>
			        <form:label path="resturantName">Restaurant Name:</form:label>
			        <form:errors path="resturantName"/>
			        <form:textarea path="resturantName"/>
			    </p>
			    <p>
			        <form:label path="rating">Rating:</form:label>
			        <form:errors path="rating"/>
			        <form:input path="rating"/>
			    </p>
			    <input type="submit" value="Submit"/>
			</form:form> 
			
		</div>
	
	</div>
	

</body>

</html>