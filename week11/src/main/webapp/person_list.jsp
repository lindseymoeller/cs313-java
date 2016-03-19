
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

