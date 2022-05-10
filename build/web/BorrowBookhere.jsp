<%-- 
    Document   : BorrowBookhere
    Created on : 16-Nov-2020, 10:20:26
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Navbar.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
    </head>
    <body>
        <div class="row justify-content-center mt-4">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header"><strong>Borrow a book</strong></div>
            <div class='card-body'>
        
        <form action="Borrowbo?a=borrowbook" method="post">
      <label><b>Member ID</b></label>
      <input class="form-control" type="text" placeholder="Enter your ID" name="clientID">

      <label><b>Borrowing date</b></label>
      <input class="form-control" type="text" name="BorowDate">

      <label><b>Returning date</b></label>
      <input class="form-control" type="text" name="dueeDate">
      
      <label><b>Book ID</b></label>
      <input class="form-control" type="text" placeholder="Book ID" name="booID">

      <br>
      <center>
      <button class="btn btn-success" type="submit">Proceed with rent</button>
      </center>
        </form>
            </div></div></div></div> 
        
    </body>
</html>
