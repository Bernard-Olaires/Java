<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- New line below to use the JSP Standard Tag Library -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>All Books</title>
	<!-- CSS link to js file -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	
	<!-- JS link to jsp file -->
	<script type="text/javascript" src="js/app.js"></script>
</head>

<body>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Language</th>
					<th># of Pages</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
					<tr>
						<td> <c:out value="${book.id}"/> </td>
						<td> <a href="/books/${book.id}"> <c:out value="${book.title}"/> </a> </td>
						<td> <c:out value="${book.language}"/> </td>
						<td> <c:out value="${book.numberOfPages}"/> </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>