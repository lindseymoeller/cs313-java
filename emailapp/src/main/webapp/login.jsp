<%-- 
    Document   : login
    Created on : Mar 21, 2016, 12:05:18 AM
    Author     : jenna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login to send email</h1>
        <table>
        <form action="Login" method="post">
            <tr>
                <td>Email address:</td>
                <td> <input type="email" name="email" placeholder="email"/><br><br></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type ="password" name="password" placeholder="password"/><br><br></td>
            </tr>
            <tr>
                <td><button type="submit">Login</button></td>
            </tr>
        </form>
        </table>
    </body>
</html>
