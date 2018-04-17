<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<style>
			#silver { /* two numbers same */
				color: silver;
			}
			
			#green { /* all same */
				color: green;
			}
		</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Baby Lotto</title>
</head>
<body>

	<c:forEach var = "ticket" items = "${ticketList}">
			<c:choose>
		<c:when test = "${ticket.number1 == ticket.number2 && ticket.number2 == ticket.number3}">
		 	<p id = "green">
 				${ticket.number1},
				${ticket.number2},
				${ticket.number3} 	
		 	</p>
		</c:when>
		<c:when test = "${ticket.number1 == ticket.number2 || ticket.number2 == ticket.number3 || ticket.number1 == ticket.number3}">
		 	<p id = "silver">
 				${ticket.number1},
				${ticket.number2},
				${ticket.number3} 	
		 	</p>
		</c:when>
		<c:otherwise> 
			${ticket.number1},
			${ticket.number2},
			${ticket.number3}
			<br>
		</c:otherwise>
	</c:choose>			
		

		<br>
	</c:forEach>

</body>
</html>