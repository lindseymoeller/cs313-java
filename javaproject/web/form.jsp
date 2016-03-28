<%-- 
    Document   : form
    Created on : Mar 25, 2016, 2:49:39 PM
    Author     : Lindsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Email</title>
    </head>
    <body>
        <h1>Send Email</h1>
         <form  method="post" action="EmailServlet">
            <table>
                <tr>
                    <td>
                        To:
                    </td>
                    <td>
                        <input type="text" name="email" size="40" placeholder="email address"/><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        Subject:
                    </td>
                    <td>
                       <input type="text" name="subject" size="40" placeholder="subject"/><br> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Message:  
                    </td>
                    <td>
                        <textarea rows="8" cols="50" name="message" placeholder="message..."></textarea>
                    </td>
                </tr>
           </table>
            <br>
            <input type="submit" value="Send Email">
        </form>
    </body>
</html>
