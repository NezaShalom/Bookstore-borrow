<%-- 
    Document   : AdminPanel
    Created on : 05-Nov-2020, 11:06:14
    Author     : Charmant
--%>

<%@page import="Model.Bought"%>
<%@page import="Model.Person"%>
<%@page import="Model.Member"%>
<%@page import="Model.Categories"%>
<%@page import="Model.Libralian"%>
<%@page import="java.util.List"%>
<%@page import="DGenerate.GeneralDao"%>
<%@page import="Model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Resources/css/sb-admin-2.min.css">
        <link rel="stylesheet" href="Resources/css/all.min.css">
        
        <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
    </head>
    <body>
        
        
        
        
        
        <body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-text mx-3">Book Store <sup>"</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="index.html">
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <span>Table overview</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Utilities:</h6>
                        <a class="collapse-item" href="clienttable.html">Clients</a>
                        <a class="collapse-item" href="membertable.html">Member</a>
                        <a class="collapse-item" href="librariantable.html">Libralian</a>
                        <a class="collapse-item" href="booktable.html">Book in store</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Addons
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                    aria-expanded="true" aria-controls="collapsePages">
                    <span>Workers</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Deal with workers:</h6>
                        <a class="collapse-item" href="Hirelibrarian.html">Hire Librarian</a>
                        <a class="collapse-item" href="Addmember.html">Membership</a>
                        
                    </div>
                </div>
            </li>

            <!-- Nav Item - Charts -->
            <li class="nav-item">
                <a class="nav-link" href="#hire">
                    <span>Charts</span></a>
            </li>

            <!-- Nav Item - Tables -->
            <li class="nav-item">
                <a class="nav-link" href="#mem">
                    <span>Tables</span></a>
            </li>

            

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                    <div class="col-md-10">
                        <h1><small>Manage Your Site</small></h1>
                    </div>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">
                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Shalom IGIRANEZA</span>
                                <img class="img-profile rounded-circle"
                                     src="Resources/pic/undraw_profile_2.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    
                    <!-- Content Row -->
                    <div class="row">

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                Earnings (Monthly)</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">400,000 Rwf</div>
                                        </div>                                   
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-success shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                Earnings (Annual)</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">10,000,000 Rwf</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-info shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-info text-uppercase mb-1">Tasks
                                            </div>
                                            <div class="row no-gutters align-items-center">
                                                <div class="col-auto">
                                                    <div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">50%</div>
                                                </div>
                                                <div class="col">
                                                    <div class="progress progress-sm mr-2">
                                                        <div class="progress-bar bg-info" role="progressbar"
                                                            style="width: 50%" aria-valuenow="50" aria-valuemin="0"
                                                            aria-valuemax="100"></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pending Requests Card Example -->
                        <div class="col-xl-3 col-md-6 mb-4">
                            <div class="card border-left-warning shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">
                                                Pending Requests</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">18</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>                            
                        </div>

            </div>
            <!-- End of Main Content -->
    <!-- End of Page Wrapper -->
        
        
    
                        
            
    <div class="container-fluid">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Membership List</h6>
            </div>
                <div class="card-body">
                    <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                       

          <tr>  
            <th style="width:20%;">Name</th>
            <th style="width:20%;">Surname</th>
            <th style="width:30%;">Email</th>
            <th style="width:10%;">Tel Number</th>
          </tr>               

    <%
    Member m=new Member();
    List<Member> me=(List<Member>)new GeneralDao().Print_All(m);
    int mi=0;
    for(Member memb:me){
      mi++;
  %>
                            
            <tr>
                <td><%=memb.getName()%></td>
                <td><%=memb.getSurname()%></td>
                <td><%=memb.getEmail()%></td>
                <td><%=memb.getPhone()%></td>
            </tr>
            
                                
                </tbody>
            <%}
    %>
                    </table>
      
            </div>
        </div>
        </div>
       </div>
    
    
    
    
                    
               <div class="container-fluid">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Librarian List</h6>
            </div>
                <div class="card-body">
                    <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                       

          <tr>
            <th style="width:20%;">Librarian Name</th>
            <th style="width:20%;">Username</th>
            <th style="width:30%;">Password</th>
            <th style="width:10%;">Email</th>
            <th style="width:20%;">Tel Number</th>
          </tr>               

    <%
    Libralian l=new Libralian();
    List<Libralian> li=(List<Libralian>)new GeneralDao().Print_All(l);
    int w=0;
    for(Libralian lia:li){
      w++;
  %>
                            
            <tr>
                <td><%=lia.getName()%></td>
                <td><%=lia.getUsername()%></td>
                <td><%=lia.getPassword()%></td>
                <td><%=lia.getEmail()%></td>
                <td><%=lia.getPhone()%></td>
            </tr>
            
                                
                </tbody>
            <%}
    %>
                    </table>
      
            </div>
        </div>
        </div>
       </div>

                    
                    
                    
                    
                    
                    
                    
      <div class="container-fluid">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Categories Data</h6>
            </div>
                <div class="card-body">
                    <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                       

          <tr>
            <th style="width:20%;">Categories ID</th>
            <th style="width:20%;">Categories Name</th>
            
          </tr>               

    <%
    Categories ca=new Categories();
    List<Categories> cat=(List<Categories>)new GeneralDao().Print_All(ca);
    int ce=0;
    for(Categories cate:cat){
      ce++;
  %>
                            
            <tr>
                <td><%=cate.getId()%></td>
                <td><%=cate.getCategory()%></td>
            </tr>
            
                                
                </tbody>
            <%}
    %>
                    </table>
      
            </div>
        </div>
        </div>
       </div>
                    
     
                    
                    
                    
                    
     <div class="container-fluid">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Clients Details & Bought books</h6>
            </div>
                <div class="card-body">
                    <div class="table-responsive">
                    <table class="table table-bordered"  id="dataTable" width="100%" cellspacing="0">
                       
                        
                        
                        <thead>
                            <tr>
            <th style="width:8%;">ISBN</th>
            <th style="width:10%;">Book Id</th>
            <th style="width:20%;">SurName</th>
            <th style="width:20%;">Name</th>
            <th style="width:20%;">Client Email</th>
            <th style="width:20%;">Client Phone</th>
            <th style="width:20%;">Purchase Date</th>
            <th style="width:20%;">Quantity Bought</th>
          </tr> </thead>              

    <%
    Bought bou=new Bought();
    List<Bought> bouo=(List<Bought>)new GeneralDao().Print_All(bou);
    int booo=0;
    for(Bought boug:bouo){
      booo++;
  %>
                            
            <tr>
                <td><%=boug.getId()%></td>
                <td><%=boug.getBook().getISBN()%></td>
                <td><%=boug.getSurname()%></td>
                <td><%=boug.getName()%></td>
                <td><%=boug.getEmail()%></td>
                <td><%=boug.getPhone()%></td>
                <td><%=boug.getDate()%></td>
                <td><%=boug.getQuantity()%></td>
            </tr>
            
                                
                </tbody>
            <%}
    %>
                    </table>
      
            </div>
        </div>
        </div>
       </div>
      
    
                    
                    
                    
                    
     
        <div class="container-fluid">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                
                        <div class="row justify-content-center mt-4">
                            <div class="col-md-8">
                                <h1 class="h4 text-gray-900 mb-4 text-center">Hire a Librarian!</h1>
                             
                                <form action="Librali?a=InsertLibralian" method="post">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="Name" name="Name"
                                            placeholder="First Name">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-user" id="Surname" name="Surname"
                                            placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="form-group row">
                                <div class="col-sm-8 mb-3 mb-sm-0">
                                    <input type="email" class="form-control form-control-user" id="Email" name="Email"
                                        placeholder="Email Address">
                                </div>
                                <div class="col-sm-4">
                                    <input type="password" class="form-control form-control-user" id="Passwd" name="Passwd"
                                        placeholder="Password">
                                </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user"
                                             id="UserName" name="UserName" placeholder="Username">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-user"
                                             id="Phone" name="Phone" placeholder="Phone num">
                                    </div>
                                </div>
                                    <div class="col-sm-6">
                                        <!--<input type="text" class="form-control form-control-user"
                                             name="sexx" placeholder="Gender">
                                        -->
                                        
                                         <label name="Gender"><b>Choose Gender</b></label>          
                                            <select class="form-control" name="sexx" id="Gender">
                                            <option value="M">male</option>
                                            <option value="F">female</option>
                                            </select>

                                    </div>
                                    <br>
                                    <button class="btn btn-primary btn-user btn-block" type="submit" value="Submit">
                                    Add to workers
                                </button>
                            </form>
                        </div>
                </div>
            </div>
        </div>
    
       
    
    
    
    
    
    
        
        
        
        
        
        </div></div>
            <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="AdminPage.jsp">Logout</a>
                </div>
            </div>
        </div>
    </div>

        
    </body> 
        <script src="Resources/js/jquery.min.js"></script>
    <script src="Resources/js/bootstrap.bundle.min.js"></script>
    <script src="Resources/js/jquery.easing.min.js"></script>
    
    <script src="Resources/js/sb-admin-2.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  
</html>