<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
             <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Enter Number of Squirrel Guests</h2>
<c:url var="formAction" value="/cigarPartyResult" />
<form method="GET" action="${formAction}">

	<div class="formInputGroup">
		<label for="squirrelcount" id="squirrel count"> How many Squirrels?
		<input type="text" name="squirrelcount" id="squirrel count" />
		</label>
	</div>
	<div class="radioButtons">
		<label for="order">Is this a weekend affair?: </label> 
			<input type = "checkbox" name = "yesweekend" value="Yes"/>
			Yes
			<br>
			<input type = "checkbox" name = "noweekend" value="No"/>
			No
			<br>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>


</body>
</html>