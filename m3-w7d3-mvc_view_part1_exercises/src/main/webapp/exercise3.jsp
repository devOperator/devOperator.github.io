<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<c:set var="firstFont" value= "${param.count}"/>
		<c:set var="changingFont" value= "${firstFont}"/>
		
		<style>
			li {
				list-style-type: none;
			}
			.littler_font {
				font-size: ${changingFont}px;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 	<c:set var="fibTwo" value= "${fibNum}"/>
			 		<c:set var="fibNum" value= "${fibOne + fibTwo}"/>
		 
		 <c:set var="changingFont" value= "${changingFont - count}"/>
		 --%>
		 
		 	<c:set var="changingFont" value= "${param.count}"/>		   		
		 
		  <c:forEach begin = "1" end = "${param.count}" var= "count">	
		  			<c:set var="changingFont" value= "${changingFont - 1}"/>		   		
			 		<li style= "font-size: ${changingFont}px"> ${param.word} </li>	
			 		  		 												
		  </c:forEach> 		 
		</ul>
		
	</body>
</html>