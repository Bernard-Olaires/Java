<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
	<div class="content-2">
			<h1>New Person</h1>
			<form:form action="/licenses/create" method="post" modelAttribute="person">
				
			    <p>
			        <form:label path="firstName">First Name:</form:label>
			        <form:errors path="firstName"/>
			        <form:input path="firstName"/>
			    </p>
			    
			    <p>
			        <form:label path="lastName">Last Name:</form:label>
			        <form:errors path="lastName"/>
			        <form:input type="date" path="lastName"/>
			    </p>
			    
			    <input type="submit" value="Submit"/>
			</form:form> 
			
		</div>