<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

    <table>
    
    	<tr>
		<th>  </th>
	   	<c:forEach var="item" items="${productList}">
  		<td><img id = "table_img" src= "img/${item.imageName}"></td>
   		</c:forEach>
	</tr>
	<tr id = "odd_row">	 
		<th>Name</th>
		<c:forEach var="item" items="${productList}">
  		<td> ${item.name} </td>
   		</c:forEach>		 	
	</tr>
	<tr>	 
		<th>Rating</th>
		<c:forEach var="item" items="${productList}">			
  			<c:choose>
				<c:when test = "${item.averageRating >= 4.5}">
					<td><img class = "table_stars" src="img/5-star.png"></td>
				</c:when>
				<c:when test = "${item.averageRating >= 3.5}">
					<td><img class = "table_stars" src="img/4-star.png"></td>
				</c:when>
				<c:when test = "${item.averageRating >= 2.5}">
					<td><img class = "table_stars" src="img/3-star.png"></td>
				</c:when>
				<c:when test = "${item.averageRating >= 1.5}">
					<td><img class = "table_stars" src="img/2-star.png"></td>
				</c:when>
				<c:otherwise> 
					<td><img  class = "table_stars" src="img/1-star.png"></td>					
				</c:otherwise>	
			</c:choose> 
   		</c:forEach> 	
	</tr>
	<tr id = "odd_row">	 
		<th>Mfr</th>
		<c:forEach var="item" items="${productList}">
  		<td> ${item.manufacturer} </td>
   		</c:forEach>	 
			
	</tr>
	<tr>
		<th>Price</th>
		<c:forEach var="item" items="${productList}">
		<td><c:out value="$${item.price}" ></c:out></td>
		</c:forEach>	 
	</tr>

	<tr id = "odd_row">	 
		<th>Wt. (in lbs)</th>
		<c:forEach var="item" items="${productList}">
		<td><c:out value= "${fn:substringBefore(item.weightInLbs, '.')}" ></c:out></td>
		</c:forEach>
		 	
	</tr>
    </table>
      
<c:import url="/WEB-INF/jsp/footer.jsp"/> 