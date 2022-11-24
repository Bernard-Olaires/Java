<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp demo</title>
</head>
<body>

	<h1>This is a test of the jsp</h1>
	
	<% for (int i = 0; i < 5; i++) {%>
		<h1><%= i %></h1>
	<%} %>
	
	<h3>The time is: <%= new Date() %></h3>
	
	<h1>Hi <c:out value="${name}"/> </h1>
	
	
	
	
</body>
</html>