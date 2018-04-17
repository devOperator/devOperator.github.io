<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

	<!-- <link rel="stylesheet" href="css/site.css" /> -->
		<style>
		<link rel="stylesheet" href="css/site.css" />
		
 			.top_seller { 
				color: red;
				font-size: 100%;
			}
			.price{   /* this class works, top seller class does not */
				color: red;
				font-size: 100%;
				display: inline;
			} 
			li {
				list-style-type: none;
			}
		</style>

<%-- 		<c:param name ="recipeId" value = "${recipe.recipeId}"> </c:param>
 --%>
<!-- <title>Product Detail View</title>
 -->
 <div>
	<div> 
	 	<img id = "detail_img" src= "img/${product.imageName}">
	 </div>
	 <div id = "detailed_info">
		 <div id = "detailed_name_seller_container">
			 <div id = "name_seller_element"> 
			 	<b> ${product.name} </b>
			 </div>
			 <div id = "name_seller_element">
				<c:if test = "${product.topSeller == true}">  
				<span class = "price"> BEST SELLER! </span>
				</c:if>
			 </div>
		</div>
		<div>
			by ${product.manufacturer} 
		</div>	 
		<div id = "detailed_stars">
		<c:choose>
			<c:when test = "${product.averageRating >= 4.5}">
				<img class = "stars" src="img/5-star.png">
			</c:when>
			<c:when test = "${product.averageRating >= 3.5}">
				<img class = "stars" src="img/4-star.png">
			</c:when>
			<c:when test = "${product.averageRating >= 2.5}">
				<img class = "stars" src="img/3-star.png">
			</c:when>
			<c:when test = "${product.averageRating >= 1.5}">
				<img class = "stars" src="img/2-star.png">
			</c:when>
			<c:otherwise> 
				<img  class = "stars" src="img/1-star.png">					
			</c:otherwise>	
		</c:choose>
		</div>
		<br><br><br>
		<div>
			<span class = "price">Price: $${product.price} </span>
		</div>
		<div>
			<b> Weight </b> ${fn:substringBefore(product.weightInLbs, '.')} lbs
			<%-- ${product.weightInLbs} --%>
		</div>
		<br>
		<div>
			<b> Description: </b> ${product.description}
		</div>
	</div>	 
</div>   


<c:import url="/WEB-INF/jsp/footer.jsp"/>