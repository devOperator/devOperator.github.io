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

<h2>FizzBuzz Revisited</h2>
<c:url var="formAction" value="/fizzBuzzRevisitedResult" />
<form method="GET" action="${formAction}">

	<div class="fb_formInputGroup">
		<label for="divisor1" id="Divisable By: "> Divisable By: 
			<input type="text" name="divisableby1" id="Divisable By" />
		</label><br>
		<label for="divisor2" id="Divisable By: "> Divisable By: 
			<input type="text" name="divisableby2" id="Divisable By" />
		</label><br>
		<label for="alternativefizz" id="Alternative Fizz"> Alternative Fizz:
			<input type="text" name="alternativefizz" id="Alternative Fizz" />
		</label><br>
		<label for="alternativebuzz" id="Alternative Buzz"> Alternative Buzz:
			<input type="text" name="alternativebuzz" id="Alternative Buzz" />
		</label><br><br>
		<label for="Number1" id="Number1"> Number 1:
			<input type="text" name="Number1" id="Number 1" />
		</label><br>
		<label for="Number2" id="Number2"> Number 2:
			<input type="text" name="Number2" id="Number 2" />
		</label><br>
		<label for="Number3" id="Number3"> Number 3:
			<input type="text" name="Number3" id="Number 3" />
		</label><br>
		<label for="Number4" id="Number4"> Number 4:
			<input type="text" name="Number4" id="Number 4" />
		</label><br>
		<label for="Number5" id="Number5"> Number 5:
			<input type="text" name="Number5" id="Number 5" />
		</label>	<br><br>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>


</body>
</html>