<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
	<div class="content-2">
			<h1>Edit Burger</h1>
			<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
				<input type="hidden" name="_method" value="put">
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