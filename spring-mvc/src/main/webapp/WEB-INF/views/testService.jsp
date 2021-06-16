<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*"%>
    <%@ page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<body>
<h2>Sending data from Controller to view via Model And View </h2>

<% 
String name = (String)request.getAttribute("name");
ArrayList<String> listOfNames = (ArrayList<String>)request.getAttribute("nameList");
%>

<h2> Name is <%= name %> </h2>

<%= listOfNames %>

<% for(String s : listOfNames) { %>
<h2> Name is <%= s %> </h2>
<%
}
%>

</body>
</html>