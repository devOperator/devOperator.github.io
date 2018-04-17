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

<c:if test = "${param.squirrelcount >= 40 && param.squirrelcount <= 60
|| param.yesweekend != null && param.squirrelcount > 60  }">
SUCCESS
	<div class="details_view">
    			<img class="" src="img/squirrel-cigar-party-success.jpg">
	</div>
</c:if>

<c:if test = "${param.squirrelcount < 40 || param.squirrelcount > 60
&& param.noweekend != null}">
FAILURE
	<div class="details_view">
    			<img class="" src="img/squirrel-cigar-party-failure.jpg">
	</div>
</c:if>

</body>
</html>