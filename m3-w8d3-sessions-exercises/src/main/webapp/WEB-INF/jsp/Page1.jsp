<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
<title>New Geek Post</title>
<c:url var="formAction" value="/alienForumOutput" />
<form method="POST" action="${formAction}">

  --%>
<form method="POST" action="Page1">
	<div class="formInputGroup">
		<label for="answer1" id="answer1"> What is your favorite color? :
		<input type="text" name="answer1" id="amswer1" />
		</label>
	</div>
		<input class="formSubmitButton" type="submit" value="Submit!" />
</form>

</body>
</html>