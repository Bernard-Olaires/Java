<!-- New line below to use the JSP Standard Tag Library -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
	<div class="content-2">
			<h1>New License</h1>
			
			<form:form action="/licenses/create" method="post" modelAttribute="license">
			
				<form:select path="person">
					<c:forEach var="onePerson" items="${person}">
						<form:option value="${onePerson.id}" path="person">
							<c:out value="${onePerson.firstName}"/>
							<c:out value="${onePerson.lastName}"/>
							
						</form:option>
					</c:forEach>
 				</form:select>
				
			    <p>
			        <form:label path="state">State:</form:label>
			        <form:errors path="state"/>
			        <form:input path="state"/>
			    </p>
			    
			    <p>
			        <form:label path="expirationDate">Exp Date:</form:label>
			        <form:errors path="expirationDate"/>
			        <form:input path="expirationDate"/>
			    </p>
			    
			    <input type="submit" value="Submit"/>
			</form:form> 
			
		</div>