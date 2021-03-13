<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
<link rel="" type="">
</head>
<body>
	<h2>All Contacts</h2>
	<table border="1">
		<tr>
			<th>No.</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Mobile</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${contacts}" var="contact" varStatus="index"></c:forEach>
		<tr>
			<td>${index.count} </td>
			<td>${contact.name}</td>
			<td>${contact.email}</td>
			<td>${contact.address}</td>
			<td>${contact.mobile}</td>
			<td><a href="#?contact.id">Edit</a>|<a href="#?contact.id" onclick=>Delete</a></td>

		</tr>


	</table>
</body>
</html>