<%-- 
    Document   : try
    Created on : 21-Nov-2020, 13:23:16
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <style>
html,
body,
header,
#intro{
    height: 95%;
}
nav{
    background: rgba(0,0,0,0.5);
}
    #brand,
    .nav-linke {
    font-size: 40px;
    line-height: 30px;
    padding-top: 10px;
    margin-left: 90px;
    font-family: "Sacramento", Arial, serif;
}
            #intro{
    background: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.8)),url("Resources/pic/wenav.jpg") no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
}
        </style>
            <!--Navbar-->
    
                <!--Navbar-->
    <header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
        <a id="brand">BookStore.Co</a>
        
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav mr-auto w-100 justify-content-end">
            
            <li class="nav-item hide">
                <a class="nav-linke">Thanks for checking in.</a>
            </li>
            <li class="nav-item hide">
            <a type="button" href="TopPage.jsp" class="btn btn-outline-success">Return on top</a>
              </li>
          </ul>
            </div>
        </div>
    </nav>


    <!--Content of header-->
  <div id="intro" class="view hm-black-strong">
    <div class="mask rgba-gradient d-flex justify-content-center align-items-center">
      <div class="container">
        <div class="row">        
          <div class="col-md-6 white-text text-center text-md-left mt-xl-5 mb-5 wow fadeInLeft" data-wow-delay="0.3s">
            <h1 class="h1-responsive font-weight-bold mt-sm-5" style="color: white;">Read with us </h1>
              <hr class="hr-light white-text">
              <h6 id="he" class="mb-4" style="color: white;">Our cooperate aim is to have you satisfied by our services, including reading, borrowing and buying books.</h6>
          </div>
        </div>
      </div>
    </div>
  </div>
  </header>
                <br><br>
    </body>
</html>
