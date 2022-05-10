<%-- 
    Document   : LoginLibralian
    Created on : 17-Nov-2020, 12:02:53
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="Resources/css/sb-admin-2.min.css">
        <title>JSP Page</title>
    </head>
    
    <style>
        body{
            background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)),url(Resources/pic/pexels-cottonbro-2925307.jpg) no-repeat top center;
        }
    </style>
    <body>
        
        
        
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
                                        <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                    </div>
                                    <form action="LibraLog?a=insertLogin" method="post" class="user">
                                        <div class="form-group">
                                            <input type="text" class="form-control form-control-user" name="username" placeholder="Enter Username Address...">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user" name="password" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Remember
                                                    Me</label>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-user btn-block">
                                            Login
                                        </button>
                                    
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <a class="small" href="forgot-password.html">Forgot Password?</a>
                                    </div>
                                    <div class="text-center">
                                        <a class="small" href="register.html">Create an Account!</a>
                                    </div>
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
        
        <!--
        <form action="LibraLog?a=insertLogin" method="post">
          <label for="Username">Username:</label><br>
          <input type="text" name="username"><br>
        
          <label for="paswd">Password:</label><br>
          <input type="password" name="password"><br>
        
          <input type="submit" value="Submit">
         
        </form>
        -->
        
    </body>
</html>
