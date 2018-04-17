<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<h2>Please login</h2>

<c:url var="loginURL" value="/login" />
<form action="${loginURL}" method="POST">
	<label for="username">Username</label>
	<input type="text" name="username" />
	<br />
	<label for="password">Password</label>
	<input type="text" name="password" />
	<br />
	<input type="submit" />
	
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
