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

<h2>Last Two Input</h2>
<c:url var="formAction" value="/lastTwoResult" />
<form method="GET" action="${formAction}">

	<div class="lti_formInputGroup">
		<label for="word" id="lasttwowords"> Word1: 
			<input type="text" name="word1" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word2: 
			<input type="text" name="word2" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word3: 
			<input type="text" name="word3" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word4: 
			<input type="text" name="word4" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word5: 
			<input type="text" name="word5" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word6: 
			<input type="text" name="word6" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word7: 
			<input type="text" name="word7" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word8: 
			<input type="text" name="word8" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word9: 
			<input type="text" name="word9" id="words" />
		</label><br>
		<label for="word" id="lasttwowords"> Word10: 
			<input type="text" name="word10" id="words" />
		</label><br>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>

</body>
</html>