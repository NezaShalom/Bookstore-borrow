<%-- 
    Document   : AdminPage
    Created on : 05-Nov-2020, 11:05:58
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
        body{
            background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)),url(Resources/pic/pexels-pixabay-357514.jpg) no-repeat top center;
        }
    </style>
    
    
    <body>
       <!--
        <form action="Login">
            <label for="Name">Name</label>
            <input type="text" name="uname">
            <label for="Password">Password</label>
            <input type="password" name="pass">
            
            <input type="submit" value="login">
        </form>
        -->

        
        
         <div class="container">
        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Administrator page!</h1>
                                    </div>
                                    <form action="Login" class="user">
                                        <div class="form-group">
                                            <input type="text" class="form-control form-control-user" name="uname" placeholder="Enter Username Address...">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user" name="pass" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Remember
                                                    Me</label>
                                            </div>
                                        </div>
                                        <button type="submit" value="login" class="btn btn-primary btn-user btn-block">
                                            Login
                                        </button>
                                    
                                    </form>
                                    <hr>
                                    
                                    <a type="button" href="TopPage.jsp" class="btn btn-outline-success btn-user btn-block">Return on top</a>
              
                                </div>
                            </div>


                            <div class="col-lg-6">
                                <img src="Resources/pic/pexels-polina-zimmerman-3747526.jpg">
                            </div>

                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>
        
    </body>
</html>
