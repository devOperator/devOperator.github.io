<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />
<script src ="messageDeletion.js"> </script> 

<c:url var="formAction" value="/deletemessages" />


<h2>Latest Messages</h2>
<ol class="message-list">
	<c:forEach items="${messages}" var="message">
		<li class="message">
			<c:url var="messageHref" value="/messages">
				<c:param name="userName" value="${message.fromUsername}" />
			</c:url>
			<span class="username"><a href="${messageHref}">${message.fromUsername}</a></span>
			<span class="message-text"><c:out value="${message.text}" /></span>
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
			<c:if test= "${message.fromUsername == currentUser}">
				<form action = "${formAction}" method = "POST" id = "delete_button">
					<input type = "hidden" name = "id" value = "${message.id}" />
					<input type="submit" value="Delete" id = "delete">
				</form>
				<!-- <button type="button"> Delete </button> -->
			</c:if> 
		</li>
	</c:forEach>
</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		