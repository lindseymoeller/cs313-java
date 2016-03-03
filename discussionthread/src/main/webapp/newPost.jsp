<%-- 
    Document   : newPost
    Created on : Mar 2, 2016, 11:47:40 PM
    Author     : Lindsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>New Post</h1>
        <p>Hello, ${username}</p>
        <a href="ViewPosts">View Posts</a>
        <p>Write a new post:</p>
        <form action="CreatePost" method="post">
            <textarea rows="4" cols="50" name="txtpost"></textarea>
            <br>
           <button type="submit">Post</button>
        </form>
    </body>
</html>
