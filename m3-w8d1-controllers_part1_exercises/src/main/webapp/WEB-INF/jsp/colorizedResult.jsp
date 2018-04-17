<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style>
			li {
				list-style-type: none;
			}
			
			.red {
				color: red;
			}
			
			.blue {
				color: blue;
			}
			
			.green {
				color: green;
			}
		</style>
<title>Insert title here</title>
</head>
<body>

<c:if test = "${param.red != null}">
	<li class = "red"> ${param.firstName} ${param.lastName} </li>
	<br>
</c:if>
<c:if test = "${param.blue != null}">
	<li class = "blue"> ${param.firstName} ${param.lastName} </li>
	<br>
</c:if> 
<c:if test = "${param.green != null}">
	<li class = "green"> ${param.firstName} ${param.lastName} </li>
	<br>
</c:if>  


</body>
</html>