<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">

<hr>
<a href="/dashboard">Dashboard</a>

<hr>
<form:form action="/songs/new" method="POST" modelAttribute="song">

<p>
<form:label path="title">Title
<form:errors path="title"/>
<form:input path="title"/>
</form:label>
</p>

<p>
<form:label path="artist">Artist
<form:errors path="artist"/>
<form:input path="artist"/>
</form:label>
</p>

<p>
<form:label path="rating">Rating (1-10)
<form:errors path="rating"/>
<form:select path="rating">
	<form:option value="1" label="1"/>
	<form:option value="2" label="2"/>
	<form:option value="3" label="3"/>
	<form:option value="4" label="4"/>
	<form:option value="5" label="5"/>
	<form:option value="6" label="6"/>
	<form:option value="7" label="7"/>
	<form:option value="8" label="8"/>
	<form:option value="9" label="9"/>
	<form:option value="10" label="10"/>
</form:select>
</form:label>
</p>

<button>Add Song</button>

</form:form>
</div>
</body>
</html>