<%-- 
    Document   : ParamEg
    Created on : Oct 16, 2020, 5:41:11 PM
    Author     : kagas
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Conformation Page - Agasti Online Bank</title>
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
    <body>
        <div class="background-card" align="center">
            <h1>Agasti Online Bank</h1>
            <h2 style ="text-align: center;">Confirm your information:</h2>
            
        <jsp:useBean id="createacc1" class="com.javaBeans.CreateAcc" />
        <jsp:setProperty name="createacc1" property="fName" param="fName" />
        <jsp:setProperty name="createacc1" property="lName" param="lName" />
        <jsp:setProperty name="createacc1" property="email" param="email" />
        <jsp:setProperty name="createacc1" property="pNum" param="pNum" />
        <jsp:setProperty name="createacc1" property="uname" param="uname" />
        <jsp:setProperty name="createacc1" property="pass" param="pass" />
        
        <h3 style ="text-align: left"> 
            First Name: <jsp:getProperty name="createacc1" property="fName" /> <br><br>
            Last Name: <jsp:getProperty name="createacc1" property="lName" /> <br><br>
            E-mail: <jsp:getProperty name="createacc1" property="email" /> <br><br>
            Phone Number: <jsp:getProperty name="createacc1" property="pNum" /> <br><br>
            Username: <jsp:getProperty name="createacc1" property="uname" /> <br><br>
            Password: <jsp:getProperty name="createacc1" property="pass" /> <br><br>
        </h3>
        <form action ="Index.jsp">
                <input type="submit" name="login" class="button button-submit" value="Submit">
        </form>   
        <% createacc1.writeToDatabase();
        %>
        </div>
    </body>
</html>

