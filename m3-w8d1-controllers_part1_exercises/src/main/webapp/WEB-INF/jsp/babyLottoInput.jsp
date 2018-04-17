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
<c:url var="formAction" value="/babyLottoResult" />
<form method="GET" action="${formAction}">

	<div class="lti_formInputGroup">
		<label for="word" id="lasttwowords"> Ticket 1: 
			<input type="text" name="ticket1" id="lottonumbers" />
		</label><br>
		<label for="word" id="lasttwowords"> Ticket 2: 
			<input type="text" name="ticket2" id="lottonumbers" />
		</label><br>
		<label for="word" id="lasttwowords"> Ticket 3: 
			<input type="text" name="ticket3" id="lottonumbers" />
		</label><br>
		<label for="word" id="lasttwowords"> Ticket 4: 
			<input type="text" name="ticket4" id="lottonumbers" />
		</label><br>
		<label for="word" id="lasttwowords"> Ticket 5: 
			<input type="text" name="ticket5" id="lottonumbers" />
		</label><br>

	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
</form>

</body>
</html>