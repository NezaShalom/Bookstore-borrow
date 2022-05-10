<%-- 
    Document   : TopPage
    Created on : 12-Nov-2020, 21:55:29
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
    </head>
    
    <style>
  
        html,
body,
header,
#intro{
    height: 100%;
}
   .introw{
    padding-top: 15%;
    background: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.8)),url("Resources/pic/qa.jpg") no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
   height: 100%;
   }
   
    </style>
    
    <body>
        
        
        
        
        <header>
            <!--Content of header-->
  <div class="introw row justify-content-center">  
          <div class="col-md-8">
          
          <a type="button" href="AdminPage.jsp" class="btn btn-primary btn-lg btn-block">User Administrator</a>
          <a type="button" href="LoginLibralian.jsp" class="btn btn-secondary btn-lg btn-block">Librarian</a>
          <a type="button" href="ClientsPage.jsp" class="btn btn-success btn-lg btn-block">Clients</a>
          
        </div>
  </div>
  </header>
        
    </body>
</html>
