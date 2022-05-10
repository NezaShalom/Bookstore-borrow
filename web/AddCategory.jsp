<%-- 
    Document   : AddCategory
    Created on : 05-Nov-2020, 11:05:07
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Navbar.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <title>JSP Page</title>
        
    </head>
    <body>
        <div class="row justify-content-center mt-4">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header"><strong>Category</strong></div>
                    <div class='card-body'>
           <form action="Cate?a=InsertCategory" method="post">
               <input class="form-control" placeholder="Enter category" type="text" name="Name" required><br>
          <center>
          <button class="btn btn-primary btn-user btn-block" type="submit">Add Category</button>
          </center>
           </form></div>
         </div>
        </div>
        </div>
        
    </body>
</html>
