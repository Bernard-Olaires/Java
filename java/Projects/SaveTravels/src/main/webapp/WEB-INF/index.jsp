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
	<title>Insert title here</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
	<div class="container">
		<h1>Save Travels</h1>
		<div class="content-table">
			<table>
				<thead>
					<tr>
						<th>Expenses</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="expense" items="${expenses}">
						<tr>
							<td> <c:out value="${expense.name}"/> </td>
							<td> <c:out value="${expense.vendor}"/> </td>
							<td> <c:out value="${expense.price}"/> </td>
							<td> <a href="/expenses/${expense.id}/edit">Edit</a> </td>
						</tr> 
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<h2>Add an Expense:</h2>
		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div>
				<form:label path="name">Expense Name:</form:label>
				<form:errors path="name"/>
				<form:input path="name" type="text"/>
			</div>
			
			<div>
				<form:label path="vendor">Vendor:</form:label>
				<form:errors path="vendor"/>
				<form:input path="vendor" type="text"/>
			</div>
			
			<div>
				<form:label path="price">Price:</form:label>
				<form:errors path="price"/>
				<form:input path="price" type="text"/>
			</div>
			
			<div>
				<form:label path="description">Description:</form:label>
				<form:errors path="description"/>
				<form:input path="description" type="text"/>
			</div>
			
			<input type="submit" value="Submit">
		</form:form>
	</div>
	
</body>

</html