<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:url value="/css/site.css" var="cssURL" />
<link rel="stylesheet" type="text/css" href="${cssURL}">
<title>Solar System Geek</title>
</head>

<body>

<c:url value="/" var="homePageURL" />
<a href="${homePageURL}"> 
    <c:url value="/img/ssg_logo.png" var="logoURL" />
    <img src="${logoURL}" id="logo" />
</a>

<div id="content">

<c:url value="/ourPage" var="ourPageURL" >
	<c:param name="username">abcuser1</c:param>
</c:url>

<c:url value="/aboutUs" var="aboutUsURL" />    
    <nav>
    		<ul>
    			<li><a href="${homePageURL}">Home</a></li>
    			<li><a href="${aboutUsURL}">About Us</a></li>
    			<li><a href="${ourPageURL}">Our Page</a></li>
    		</ul>
    </nav>
    
    <h1><c:out value="${param.pageTitle }" /></h1>