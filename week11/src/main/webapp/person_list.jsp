<%-- 
    Document   : person_list
    Created on : Mar 15, 2016, 8:22:28 PM
    Author     : Timothy
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Person List</h1>
        
        <c:forEach var="person" items="${persons}"> 
            <a href="Details?id=${person[0]}">${person[1]} ${person[2]}</a><br/> 
       </c:forEach>
    </body>
</html>
