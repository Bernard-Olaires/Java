<!-- additional tags to add -->
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<h2>Edit Expense:</h2>
		<form:form action="/expenses/${id}/edit" method="post" modelAttribute="expense">
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