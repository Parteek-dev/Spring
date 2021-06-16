<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<body>
<h2>Sending data from Controller to view via Model Attribute </h2>

<% 
String name = (String)request.getAttribute("name");
%>

<h2> Name is <%= name %> </h2>


</body>
</html>