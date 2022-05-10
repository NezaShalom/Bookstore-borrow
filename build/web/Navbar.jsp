<%-- 
    Document   : Navbar
    Created on : 18-Nov-2020, 08:51:45
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="Resources/css/mdb.min.css">
        <title>JSP Page</title>
    </head>
    
    <style>
        

    .brand {
    font-size: 40px;
    line-height: 20px;
    padding-top: 10px;
    margin-left: 90px;
    font-family: "Sacramento", Arial, serif;
}

.navbar-nav li a {
    margin-right: 40px;
}
    </style>
    <body>
        
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <ul class="brand"><strong>Librarian</strong></ul>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav mr-auto w-100 justify-content-end">
        <li class="nav-item active">
            <a class="nav-link" href="AddCategory.jsp">Categories<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Membershipregister.jsp">Membership</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Registerbo.jsp">Add Books</a>
        </li>
        <li class="nav-item">
        <a type="button" href="TopPage.jsp" class="btn btn-outline-success">Return on top</a>
        </li>    
      </ul>
    </div>
</nav>
    </body>
</html>
