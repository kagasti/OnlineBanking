<%-- 
    Document   : CreateAccount
    Created on : Oct 1, 2020, 6:29:44 PM
    Author     : kagasti
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Create Account - Agasti Online Bank</title>
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
    <body>
        <div class="background-card">
            <h1>Agasti Online Bank</h1>
            <h2 style ="text-align: center;"> Create Account</h2><br>
            <form action="WriteToDB.jsp">

                <input type="text" name="fName" placeholder="First Name">
                <input type="text" name="lName" placeholder="Last Name">
                <input type="email" name="email" placeholder="example@agastibank.com">
                <input type="text" name="pNum" placeholder="123-456-7890">
                <input type="text" name="uname" placeholder="Username">
                <input type="password" name="pass" placeholder="Password"><br><br>
            
                <input type="submit" class="button button-submit" value="Create Account">
            </form>
        </div>
    </body>
</html>
