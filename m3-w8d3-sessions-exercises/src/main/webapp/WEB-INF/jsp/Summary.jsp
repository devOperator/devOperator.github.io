<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Here are your favorite things</title>
</head>
	<body>	
			favorite color: ${answerMap.answer1} <br>
			favorite drink: ${answerMap.answer2} <br>
			favorite travel location: ${answerMap.answer3} <br>	
	</body>
</html>

<%-- 
<c:forEach var = "post" items = "${postList}">
	${post.username}
</c:forEach> --%>