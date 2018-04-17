<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

    <link rel="stylesheet" href="css/site.css" />
         <style>
			.top_seller {
				color: red;
				font-size: 100%;
			}
			.price{
				color: red;
				font-size: 100%
			}
			li {
				list-style-type: none;
			}
		</style>
       <h3> Toy Department </h3>
       <c:forEach var="item" items="${productList}">
       		<section id = "container">
       			<div id = "left">
	       			<img src= "img/${item.imageName}">
       			</div>
       			<div id = "right">
					<c:out value="${item.name}" />
					<c:if test = "${item.topSeller == true}">  
							<li class = "top_seller"> BEST SELLER! </li>
					</c:if>	
					<c:out value="${item.manufacturer}" /><br>
				
 					<c:if test = "${item.price > 0}">   
							<li class = "price"> $${item.price} </li>
					</c:if>	
 					
						<c:out value="Weight ${item.weightInLbs} lbs" />					
					<c:choose>
						<c:when test = "${item.averageRating >= 4.5}">
							<img class = "stars" src="img/5-star.png">
						</c:when>
						<c:when test = "${item.averageRating >= 3.5}">
							<img class = "stars" src="img/4-star.png">
						</c:when>
						<c:when test = "${item.averageRating >= 2.5}">
							<img class = "stars" src="img/3-star.png">
						</c:when>
						<c:when test = "${item.averageRating >= 1.5}">
							<img class = "stars" src="img/2-star.png">
						</c:when>
						<c:otherwise> 
							<img  class = "stars" src="img/1-star.png">					
						</c:otherwise>	
					</c:choose>
				</div>
			</section>
			<hr>	
			<br>
       		
       </c:forEach>

<c:import url="/WEB-INF/jsp/footer.jsp"/>