<%-- 
    Document   : MembershipBorrow
    Created on : 15-Nov-2020, 13:05:05
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Navbar.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="Resources/css/sweetalert.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class='row justify-content-center mt-4'>
            <div class='col-md-6'>
                <div class='card'>
                    <div class='card-header'><strong>Add Member</strong></div>
                    <div class='card-body'>
        <form action="Membership?a=admember" method="post">
            <div class="form-group">
            <input type="text" placeholder="Enter Username" name="nameme" class="form-control" required>
            </div>
            <div class='form-group'>
            <input type="text" placeholder="Enter Surname" name="surnameme" class='form-control' required>
            </div>
            <div class='form-group'>
            <input type="text" placeholder="Enter Phone" name="phoneme" class='form-control' required>
            </div>
            <div class='form-group'>
            <input type="email" placeholder="Enter Email" name="emailme" class='form-control' required>
            </div> <center>
                <button class='btn btn-primary btn-user btn-block' type="submit" onclick="valid()">Membership Offer</button>
            </center>
       </form>
            </div>
            </div>
        </div>
            
        </div>
        
        <script>
            Function valid(){
                
            }
        </script>
        
    </body>
    <script src="Resources/js/sweetalert.min.js">
</html>
