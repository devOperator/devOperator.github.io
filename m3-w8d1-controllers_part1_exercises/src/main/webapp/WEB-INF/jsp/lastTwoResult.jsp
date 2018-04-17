<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="wordCt" value= "1"/>		   			
	<c:set var="paramPrefix" value= "param.word"/>	
	
	${param.word1}  
	${param.word2}  
	${param.word3}  
	${param.word4}  
	${param.word5}  
	${param.word6}  
	${param.word7}  
	${param.word8}  
	${param.word9} 
	${param.word10}  <br>

	<c:forEach var="converted" items="${ltc.convertedWords}" >		
	 		 ${converted}
	 	</c:forEach>	
	 	

</body>
</html>