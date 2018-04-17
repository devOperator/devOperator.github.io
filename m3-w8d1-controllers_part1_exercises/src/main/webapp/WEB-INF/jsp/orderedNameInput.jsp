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


<h2>Enter Name</h2>
<c:url var="formAction" value="/orderedResult" />
<form method="GET" action="${formAction}">

	<div class="formInputGroup">
		<label for="firstName" id="firstName"> 
		<input type="text" name="firstName" id="First Name" />
		</label>
		<label for="middleInitial" id="middleInitial"> 
		<input type="text" name="middleInitial" id="Middle Initial" />
		</label>
		<label for="lastName" id="lastName"> 
		<input type="text" name="lastName" id="Last Name" />
		</label>
	</div>
	<div class="radioButtons">
		<label for="order">Choose Order: </label> 
			<input type = "radio" name = "radios" value="option1"/>
			First MI Last
			<br>
			<input type = "radio" name = "radios" value="option2"/>
			First Last
			<br>
			<input type = "radio" name = "radios" value="option3"/>
			Last, First MI
			<br>
			<input type = "radio" name = "radios" value="option4"/>
			Last, First
			<br>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>




</body>
</html>