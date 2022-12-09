<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
	<div class="content-2">
			<h1>New Dojo</h1>
			<form:form action="/dojos/create" method="post" modelAttribute="dojo">
				
			    <p>
			        <form:label path="location">Location:</form:label>
			        <form:errors path="location"/>
			        <form:input path="location"/>
			    </p>
			    
			    <input type="submit" value="Submit"/>
			</form:form> 
			
		</div>