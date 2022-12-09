<!-- New line below to use the JSP Standard Tag Library -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
	<div class="content-2">
			<h1>New Ninja</h1>
			
			<form:form action="/ninjas/create" method="post" modelAttribute="ninja">
			
				<form:select path="dojo">
					<c:forEach var="eachDojo" items="${dojo}">
						<form:option value="${eachDojo.id}" path="person">
							<c:out value="${eachDojo.location}"/>	
						</form:option>
					</c:forEach>
 				</form:select>
				
			    <p>
			        <form:label path="firstName">First Name:</form:label>
			        <form:errors path="firstName"/>
			        <form:input path="firstName"/>
			    </p>
			    
			    <p>
			        <form:label path="lastName">Last Name:</form:label>
			        <form:errors path="lastName"/>
			        <form:input path="lastName"/>
			    </p>
			    
			    <p>
			        <form:label path="age">Age:</form:label>
			        <form:errors path="age"/>
			        <form:input path="age"/>
			    </p>
			    
 				
			    <input type="submit" value="Submit"/>
			</form:form> 
			
		</div>