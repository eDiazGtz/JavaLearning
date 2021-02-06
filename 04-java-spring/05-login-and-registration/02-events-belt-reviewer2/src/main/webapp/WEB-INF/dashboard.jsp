<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>Welcome to ${ user.firstName } ${ user.lastName }</h1>
<a href="/logout">Logout</a>
<a href="/weddings/new">Create Wedding</a>
<hr>
<table class="table table-dark table-hover">
<thead>
<tr>
<td>Wedding</td>
<td>Date </td>
<td>Guests</td>
<td>Actions</td>
</tr>
</thead>
<tbody>
<c:forEach items="${weddings}" var="wedding">
<tr>
	<td><a href="/weddings/${wedding.id}">${wedding.wedderOne} & ${wedding.wedderTwo}</a></td>
	<td>${wedding.date}</td>
	<td>${wedding.guests.size() }</td>
	<c:choose>
	<c:when test="${wedding.planner.id == user.id }">
	<td><a href="#">Edit</a> | <a href="#">Delete</a></td>
	</c:when>
	<c:when test="${wedding.guests.contains(user)}">
	<td><a href="#">Un-RSVP</a></td>
	</c:when>
	<c:otherwise>
	<td><a href="#">RSVP</a></td>
	</c:otherwise>	
	</c:choose>

</tr>

</c:forEach>
</tbody>

</table>

</div>

<form method="POST" action="/new">
				<div class="form-group">
			    	<label>Name:</label>
			    	<input class="form-control" type="text" name="name">
			    </div>
				<div class="form-group">
			    	<label>Name:</label>
			    	<input class="form-control" type="text" name="name">
			    </div>
				<div class="form-group">
			    	<label>Name:</label>
			    	<input class="form-control" type="text" name="name">
			    </div>
		<label for="cars">Choose a car:</label>
<select id="cars" name="carlist" form="carform">
  <option value="CA">CA</option>
  <option value="NV">NV</option>
  <option value="WA">WA</option>
</select>
			    <button class="btn btn-danger">Login</button>
			</form>


</body>
</html>