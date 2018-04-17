<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" >
	<c:param name="pageTitle" value="These Divs" />
</c:import>

<h2>Hello user ${param.username}</h2>

<c:import url="/WEB-INF/jsp/ourDiv.jsp" >
	<c:param name="divName" value="One" />
</c:import>
<c:import url="/WEB-INF/jsp/ourDiv.jsp" >
	<c:param name="divName" value="Two" />
</c:import>

<c:import url="/WEB-INF/jsp/footer.jsp" />