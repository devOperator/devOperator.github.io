<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 
			<c:set var="fibOne" value="1" />
			<li> ${fibOne} </li>
		 	<c:set var="fibTwo" value="2" />
		 	<li> ${fibTwo} </li>
		 	<c:set var="fibNum" value = "3" />
		 	<li> ${fibNum} </li>
			 	
			 <c:forEach begin = "1" end = "22" var= "listNum">
			 		<c:set var="fibOne" value= "${fibTwo}"/>
			 		<c:set var="fibTwo" value= "${fibNum}"/>
			 		<c:set var="fibNum" value= "${fibOne + fibTwo}"/>
			 		<li> ${fibNum} </li>
			
			 </c:forEach> 
			 
			 
		</ul>
	</body>
</html>