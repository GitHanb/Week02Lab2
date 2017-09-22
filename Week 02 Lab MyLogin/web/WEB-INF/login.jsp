<%-- 
    Document   : login
    Created on : 21-Sep-2017, 8:09:58 AM
    Author     : 636334
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="mainPage" method="post">
                Username: <input type="text" name="username" value="${username}"><br>
                Password: <input type="text" name="password" value="${password}"><br>
                <input type="submit" value="Login">  
            </form>
            ${loginErrorMessage}
        </div>
    </body>
</html>
