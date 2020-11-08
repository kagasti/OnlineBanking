<%-- 
    Document   : HomePage
    Created on : Oct 1, 2020, 6:40:56 PM
    Author     : kagasti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Home Page - Agasti Online Bank</title>
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
    </head>
    <body>
        <div class="background-card">
            <h1>Agasti Online Bank</h1>
            <h2 style ="text-align: center;"> Home Page</h2><br>
            <form action ="BalanceInquiry.jsp">
                <input type="submit" name="login" class="button button-submit" value="Banance Inquiry">
            </form>
            <form action ="DepositFund.jsp">
                <input type="submit" name="login" class="button button-submit" value="Deposit Fund">
            </form>
            <form action ="WithdrawFund.jsp">
                <input type="submit" name="login" class="button button-submit" value="Withdraw Fund">
            </form>
            <form action ="TransferFund.jsp">
                <input type="submit" name="login" class="button button-submit" value="Transfer Fund">
            </form>
            <form action ="RequestAssistance.jsp">
                <input type="submit" name="login" class="button button-submit" value="Request Assistance">
            </form>
            <form action="Index.jsp">
                <input style ="background-color: #ff0000;" type="submit" 
                       name="login" class="button button-submit" value="Logout">
            </form>
        </div>
    </body>
</html>