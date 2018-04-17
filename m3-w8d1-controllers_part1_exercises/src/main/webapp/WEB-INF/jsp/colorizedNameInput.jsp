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

<!-- Choose Color
Check Boxes
Red Blue Green   -->

<h2>Enter Name</h2>
<c:url var="formAction" value="/colorizedResult" />
<form method="GET" action="${formAction}">

	<div class="formInputGroup">
		<label for="firstName" id="firstName"> 
		<input type="text" name="firstName" id="First Name" />
		</label>
		<label for="lastName" id="lastName"> 
		<input type="text" name="lastName" id="Last Name" />
		</label>
	</div>
	<div class="radioButtons">
		<label for="order">Choose Colors: </label> 
			<input type = "checkbox" name = "red" value="red"/>
			Red
			<br>
			<input type = "checkbox" name = "blue" value="blue"/>
			Blue
			<br>
			<input type = "checkbox" name = "green" value="green"/>
			Green
			<br>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>






</body>
</html>