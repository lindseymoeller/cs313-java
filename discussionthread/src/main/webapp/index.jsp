<%-- 
    Document   : login_form
    Created on : Mar 2, 2016, 11:26:29 PM
    Author     : Lindsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
    </head>
    <body>
        <h1>Sign in</h1>
        <form action="SignIn" method="post">
            <input type="text" name="username"/>
            <input type="password" name="password"/>
           <button type="submit">Sign in</button>
        </form>
    </body>
</html>
