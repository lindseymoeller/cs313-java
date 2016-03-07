<%-- 
    Document   : viewPosts
    Created on : Mar 3, 2016, 11:11:54 AM
    Author     : Lindsey
--%>

<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
        <h1>View Posts Page</h1>
            <div>  
                <h3>Posts</h3><br/>
                <c:forEach var="post" items="${posts}">
                    Posted By: ${username} <br>
                    On: ${date}  <br>
                    Post: ${post.text} <br><br><br>
                   
     </c:forEach>
            </div>
        <a href="newPost.jsp">New Post</a>
    </body>
</html>
