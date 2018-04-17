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

<c:forEach var = "number" items = "${fbr.numbers}">
	<c:choose>
		<c:when test = "${number % param.divisableby1 == 0 && number % param.divisableby2 == 0}">
		 	${number} ${param.alternativefizz} ${param.alternativebuzz}
		 	<br>
		</c:when>
		<c:when test = "${number % param.divisableby1 == 0}">
		 	${number} ${param.alternativefizz}
		 	<br>
		</c:when>
		<c:when test = "${number % param.divisableby2 == 0}">
		 	${number} ${param.alternativebuzz}
		 	<br>
		 </c:when>
		<c:otherwise> 
			${number}
			<br>
		</c:otherwise>
	</c:choose>
</c:forEach>
</body>
</html>

