<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<body>
		
		<h1><c:out value="${personName.firstName}" /> <c:out value="${personName.lastName}" /></h1>
		<h2>Method: <c:out value="${method}" /></h2>
	</body>
</html>
