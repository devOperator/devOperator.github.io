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

<h2>Review Submission Page</h2>
<c:url var="formAction" value="/reviewInput" />
<form method="POST" action="${formAction}">

	<div class="formInputGroup">
		<label for="userName" id="userName"> Username:
			<input type="text" name="username" id="userName" />
		</label><br>
		<label for="reviewTitle" id="reviewTitle"> Review Title:
			<input type="text" name="title" id="reviewTitle" />
		</label><br>
		<label for="reviewText" id="reviewText"> Review Text
			<input type="text" name="text" id="reviewText" />
		</label><br>
	</div>
	<div class="radioButtons">
		<label for="order">Star Rating: </label><br>
		<input type = "checkbox" name = "rating" value="5"/>
		5 stars
		<br>
		<input type = "checkbox" name = "rating" value="4"/>
		4 stars
		<br>
		<input type = "checkbox" name = "rating" value="3"/>
		3 stars
		<br>
		<input type = "checkbox" name = "rating" value="2"/>
		2 stars
		<br>
		<input type = "checkbox" name = "rating" value="1"/>
		1 star
		<br>
	</div>	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>


</body>
</html>