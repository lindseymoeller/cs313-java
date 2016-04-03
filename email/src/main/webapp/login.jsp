<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="style.css" type="text/css" rel="stylesheet" />  
        <img class="logo" alt="happ-email logo" src="happy.png">
        <br>
    </header>
    <body>
       
        <h1>Login</h1>
        <div id="form">
        <form action="Login" method="post">
            Username: <input type="text" name="username"/><br>
            Password: <input type="password" name="password"/><br>
           <button type="submit">Login</button>
        </form>
        </div>
    </body>
</html>
