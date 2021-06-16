<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!--     using with expression language -->
    <%@ page isELIgnored="false" %> 
    
<!--     Using JSTL core tags , to use this must add the JSTL dependency in POM.xml -->
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using EL to print the data </title>
</head>
<body>
<h1>Using EL to print the data  </h1>

<h3>Name is ${name}</h3>
<h3>Local Time  is ${localTime}</h3>
<h3>Name of list  is ${nameList}</h3>

<h2> using direct to print data </h2>
<c:forEach var="item" items="${nameList}">
<h3>${item}</h3>
</c:forEach>

<h2> using c:out to print data </h2>
<c:forEach var="item" items="${nameList}">
<h3><c:out value="${item}" /></h3>
</c:forEach>

</body>
</html>