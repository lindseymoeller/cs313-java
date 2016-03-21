<%-- 
    Document   : emailClient
    Created on : Mar 20, 2016, 10:36:35 AM
    Author     : Lindsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email Client</title>
    </head>
    <body>
        <h1>Contact Us</h1>
        <form action="MailDispatcherServlet" method="post">
            <table>
                <tr>
                    <td>
                        <b>To:</b>
                    </td>
                    <td>
                        <input type="text" name="email">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>Subject:</b>
                    </td>
                    <td>
                        <input type="text" name="subject">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>Message:</b>
                    </td>
                    <td>
                        <textarea name="message"></textarea>
                    </td>
                </tr>
                  <tr>
                    <td>
                    </td>
                    <td>
                        <input type="submit" value="Send">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
