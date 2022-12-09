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
		<!--- ... --->
	<h1>Person Details:</h1>
	<table class="table">
	    <thead class="thead-dark">
	        <tr>
	            <th>Name</th>
	            <th>License Number</th>
	            <th>State</th>
	            <th>Exp Date</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td>
	                <c:out value="${person.firstName}"/>
	                <c:out value="${person.lastName}"/>
	            </td>
	            <td><c:out value="${person.license.number}"/></td>
	            <td><c:out value="${person.license.state}"/></td>
	            <td>
	                <c:out value="${person.license.expirationDate}"/>
	            </td>
	        </tr>
	    </tbody>
	</table>
	<!--- ... --->
	
</body>

</html>