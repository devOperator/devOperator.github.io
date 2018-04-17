<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<body>
		<h1>Name: <c:out value="${personName.firstName}" /> <c:out value="${personName.lastName}" /></h1>
		<h2>Method: <c:out value="${method}" /></h2>
	
		<c:url var="nameCollectorURL" value="/nameCollectorResult" />
		<form action="${nameCollectorURL}" method="POST">
		
			<label for="firstName">First Name: </label>
			<input type="text" name="firstName" />
			<br />
			<label for="lastName">Last Name: </label>
			<input type="text" name="lastName" />
			<br />
			<input type="Submit" />
		</form>
	</body>
</html>
