<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact Details</title>
</head>
<body>
	<h2>Welcome Please Enter Details</h2><br>

	<h2><font color ="green" >${succ_msg}</font> </h2>
	<h2><font color ="red" >${fail_msg}</font> </h2>
	<form action="addContact" modelAttribute="contact"></form>
	<form:hidden path="id" />
	Name
	<form:input path="name" /><br>
	Address
	<form:input path="address" /><br>
	Email
	<form:input path="email" /><br>
	Mobile
	<form:input path="mobile" /><br>
	
	<input type="reset" value=reset>
	<input type="submit" value=submit>
	<a herf="viewcontacts">View All Contact</a>
</body>
</html>