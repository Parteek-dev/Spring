<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

<h3>Thanks for submitting the details</h3>
<p>${Header} ${desc}</p>
<hr>

<h2>Name: ${user.email} </h2>
<h2>Email: ${user.username}</h2>
<h2>Check out: ${user.isChecked}</h2>


</body>
</html>