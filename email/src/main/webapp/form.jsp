<%-- 
    Document   : form
    Created on : Mar 9, 2016, 11:08:19 PM
    Author     : Lindsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Email</title>
        <link href="style.css" type="text/css" rel="stylesheet" />  
        <img class="logo" alt="happ-email logo" src="happy.png">
        <br>
    </header>
    <body>
       
        <h1>Send an Email</h1>
        <div id="form">
        <form action="SendEmail" method="post">
            <table>
                <tr>
                    <td>
                        To:
                    </td>
                    <td>
                        <input type="text" name="email" size="113" placeholder="email address"/><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        Subject:
                    </td>
                    <td>
                       <input type="text" name="subject" size="113" placeholder="subject"/><br> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Message:  
                    </td>
                    <td>
                        <textarea rows="8" cols="115" name="message" placeholder="message..."></textarea>
                    </td>
                </tr>
           </table>
            <br>
           <button type="submit">Send Email</button>
        </form>
        </div>
    </body>
</html>
