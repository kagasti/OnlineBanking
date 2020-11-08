<%-- 
    Document   : Index.jsp
    Created on : Oct 1, 2020, 6:15:39 PM
    Author     : kagasti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login - Agasti Online Bank</title>
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
    <body>
        <div class="background-card">
            <h1>Agasti Online Bank</h1>
            <h2 style ="text-align: center;"> Login</h2><br>
            <form action = "<%=request.getContextPath()%>/login" method="post">
                <input type="text" name="user" placeholder="Username">
                <input type="password" name="pass" placeholder="Password">
            
                <input type="submit" name="login" class="button button-submit" value="Login">
            </form>
                
            <h3 style ="color: red;" href="#">Forgot Password?</h3><br>
            <form action="CreateAccount.jsp">
                <input style ="background-color: #ff6f00;" type="submit" 
                       name="createaccount" class="button button-submit" value="Create Account">
            </form>
        </div>
    </body>
</html>
