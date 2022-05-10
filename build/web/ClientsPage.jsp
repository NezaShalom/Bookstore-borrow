<%-- 
    Document   : ClientsPage
    Created on : 05-Nov-2020, 11:06:31
    Author     : Charmant
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Book"%>
<%@page import="DGenerate.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="try.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="Resources/css/bootstrap.min.css">
<style>
* {
  box-sizing: border-box;
}

#myInput {
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myTable {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #ddd;
  font-size: 18px;
}

#myTable th, #myTable td {
  text-align: left;
  padding: 12px;
}

#myTable tr {
  border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
  background-color: #f1f1f1;
}


/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    padding-top: 100px; /* Location of the box */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-con {
    position: relative;
    background-color: #fefefe;
    margin: auto;
    padding: 0;
    border: 1px solid #888;
    width: 80%;
    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
    -webkit-animation-name: animatetop;
    -webkit-animation-duration: 0.4s;
    animation-name: animatetop;
    animation-duration: 0.4s
}

/* Add Animation */
@-webkit-keyframes animatetop {
    from {top:-300px; opacity:0} 
    to {top:0; opacity:1}
}

@keyframes animatetop {
    from {top:-300px; opacity:0}
    to {top:0; opacity:1}
}

/* The Close Button */
.close {
    color: white;
    float: right;
    font-size: 28px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: #ffffff;
    text-decoration: none;
    cursor: pointer;
}

.modal-header {
    padding: 2px 16px;
    background-color: #25274d;
    color: white;
}

.modal-body {padding: 2px 16px;}

.modal-footer {
    padding: 2px 16px;
    background-color: #25274d;
    color: white;
}
</style>
</head>
<body>

    
    
    <div class="container-fluid">
      <ul class="nav nav-pills mb-3 nav-justified" id="pills-tab" role="tablist">
    <li class="nav-item">
      <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home" role="tab" aria-controls="pills-home" aria-selected="true">Buy books</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="pills-contact" aria-selected="false">Membership Previlege.</a>
    </li>
    </ul>
  
        
    <div class="tab-content" id="pills-tabContent">
    <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
    
        <!--buy-->
        

<div class="container-fluid">
            <div class="card-body p-0">
                <h2>Books in store</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<table id="myTable">
  <tr class="header">
    <th style="width:20%;">Book Name</th>
    <th style="width:20%;">Author</th>
    <th style="width:15%;">price</th>
    <th style="width:10%;">Quantity</th>
    <th style="width:10%;">Buy</th>
  </tr>
  <%
    Book b=new Book();
    List<Book> bl=(List<Book>)new GeneralDao().Print_All(b);
    int i=0;
    for(Book bo:bl){
      i++;
  %> 
  <tr>
    <td><%=bo.getTitle()%></td>
    <td><%=bo.getAuthors()%></td>
    <td><%=bo.getPurchasingPrice()%></td>
    <td><%=bo.getInitial_q()-bo.getQ_sold()%></td>
    <td><button class="btn btn-outline-secondary" onclick="pushTab(<%=i%>)">Add to cart</button></td>
  </tr>
  
<!-- The Modal -->
<div id="myModal<%=i%>" class="modal">

  <!-- Modal content -->
  <div class="modal-con">
    <div class="modal-header">
      <h2 style="float: left;">Book in the cart: <%=bo.getTitle()%></h2>
      <span class="close">&times;</span>
    </div>
            <div class="row justify-content-center mt-4">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header"><strong>Customer Details.</strong></div>
    <div class="modal-body">
      <form action="Buy?a=BuyBook&&id=<%=bo.getISBN()%>" method="post">
      
          <input type="text" class="form-control" name="name" placeholder="Your name" required><br>
      <input type="text" name="surname" class="form-control" placeholder="surname" required><br>
      <input type="email" name="email" class="form-control" placeholder="email" required><br>
      <input type="text" name="phone" class="form-control" placeholder="phone" required><br>
      <input type="tel" name="quantity" class="form-control" id="qua" placeholder="quantity" required><br/>
      <button onclick="calculate()" class="btn btn-success btn-user btn-block">Confirm</button>

      </form>
    </div></div></div></div>
    <div class="modal-footer">
        
        <h3 class="text-center">Thank for buying with us. ..</h3>
      
    </div>
  </div>

</div>
    <%}
    %>
</table>
            </div></div>
        
        
        
   </div>
    <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab">
        
        <!--Borrow a book -->
        
        
           <div class="row justify-content-center mt-4">
            <div class="col-md-6">
            <div class="card-body p-0">
                <h2>Borrow Books</h2>
        
        <div class='card-body'>
        
     <form action="Borrowbo?a=borrowbook" method="post">
      <label><b>Member ID</b></label>
      <input class="form-control" type="text" placeholder="Enter your ID" name="clientID">

      <label><b>Borrowing date</b></label>
      <input class="form-control" type="text" placeholder="Enter Date today" name="BorowDate">

      <label><b>Returning date</b></label>
      <input class="form-control" type="text" placeholder="Day to return" name="dueeDate">
      
      <label><b>Book ID</b></label>
      <input class="form-control" type="text" placeholder="Book ID" name="booID">

      <br>
      <center>
      <button class="btn btn-success btn-user btn-block" type="submit">Proceed with rent</button>
      </center>
        </form>
        
                </div>
            </div></div>
            </div>
        
        <br>
        
        <!--Return a book-->
        
        
        
                
        
           <div class="row justify-content-center mt-4">
            <div class="col-md-6">
            <div class="card-body p-0">
                <h2>Return a Books</h2>
        
        
        <div class='card-body'>
        
     <form action="Returnbo?q=Returnbooks" method="post">
      <label><b>borrow ID</b></label>
      <input class="form-control" type="text" placeholder="Enter your ID" name="borroID">

      <label><b>Date today</b></label>
      <input class="form-control" type="text" placeholder="Enter Date today" name="returndate">

      <br>
      <center>
      <button class="btn btn-success btn-user btn-block" type="submit">Return book</button>
      </center>
        </form>
        
                </div>
            </div></div>
            </div>
        
        
        
        
        
        
        </div>
    </div>
    </div>
<script>
  
function myFunction() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}

function calculate(){
var a,b,result;

a = document.getElementById("qua").value;
b = bo.getPurchasingPrice();
result = a * b;
document.getElementById("r").innerHTML = a + " * " + b + " = " + result;
}




// Get the modal
var modal;
      function pushTab(a) {
        // Get the modal
        modal = document.getElementById('myModal'+a);
        // When the user clicks the button, open the modal 
        modal.style.display = "block";
      }
      // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

      // When the user clicks on <span> (x), close the modal
      span.onclick = function () {
        modal.style.display = "none";
      };

      // When the user clicks anywhere outside of the modal, close it
      window.onclick = function (event) {
        if (event.target === modal) {
          modal.style.display = "none";
        }
      }
</script>

</body>
<script src="Resources/js/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
