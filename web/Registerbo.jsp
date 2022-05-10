<%-- 
    Document   : Registerbo
    Created on : 05-Nov-2020, 11:07:23
    Author     : Charmant
--%>

<%@page import="DGenerate.GeneralDao"%>
<%@page import="Model.Book"%>
<%@page import="DGenerate.CategoryDao "%>
<%@page import="java.util.List"%>
<%@page import="Model.Categories"%>
<%@include file="Navbar.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Resources/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class='row justify-content-center mt-4'>
            <div class='col-md-6'>
                <div class='card'>
                    <div class='card-header'><strong>Add Books</strong></div>
                    <div class='card-body'>
        <form action="Regist?a=InsertBooks" method="post">
            
            <label for="ISBN"><b>ISBN</b></label><br>
            <input class="form-control" type="text" id="ISBN" name="ISBN" required>
          <label for="title"><b>title</b></label><br>
          <input class="form-control" type="text" id="title" name="title" required>
          
          <label for="authors"><b>authors</b></label><br>
          <input class="form-control" type="text" id="authors" name="authors" required>
          
          <label for="pubYear"><b>publication Year</b></label><br>
          <input class="form-control" type="date" id="pubYear" name="pubYear" required>
          
          <label for="purchPrice"><b>Price</b></label><br>
          <input class="form-control" type="number" id="purchPrice" name="purchPrice" required>
          
          <label for="initial_q"><b>Quantity</b></label><br>
          <input class="form-control" type="text" id="initial_q" name="initial_q" required>
          
          
          <label name="Categorie"><b>Choose Category</b></label>          
          <select class="form-control" name="Categorie" id="Categorie">
              <%Categories ca=new Categories();
                List<Categories> cate=(List<Categories>)new CategoryDao().CategoryList();
                for(Categories c:cate){%>
                <option value="<%=c.getId()%>"><%=c.getCategory()%></option>
                <%}
              %>
          </select>
          <br>
          
          <center>
          <button class="btn btn-outline-success btn-user btn-block" type="submit">Add Book</button>
          </center>
        </form> 
          
        </div></div></div></div>
          
              <%
                  if(request.getAttribute("result") == "Book Saved"){%>
                  <h2 style="color: green;">Book Saved</h2>
                  <%}
                  %>
        
                  
                  
                  
                  
                  
    <br>
    <hr>
    <br>
    
         <div class="container-fluid">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">List of books</h6>
            </div>
                <div class="card-body">
                    <div class="table-responsive">
                    <table class="table table-bordered"  id="dataTable" width="100%" cellspacing="0">
                       
                        
                        
                        <thead>
      
      <th>ISBN</th>
      <th>Author</th>
      <th>Title</th>
      <th>Pub Year</th>
      <th>P. price</th>
      <th>In addition</th>
    </thead>
    
      
      <% 
        Book b=new Book();
        List<Book> bh=(List<Book>)new GeneralDao().Print_All(b);
        for(Book be:bh){%>
       <tr>
         <td><%=be.getISBN()%></td>
         <td><%=be.getAuthors()%></td>
         <td><%=be.getTitle()%></td>
         <td><%=be.getPublicationYear()%></td>
         <td><%=be.getPurchasingPrice()%></td>
         <td><a href="bookedit.jsp?boiid=<%=be.getISBN()%>"><button class="btn btn-info">Edit</button></a></td>
        </tr>
        <%}%>
    
    </table>     
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
    </body>
</html>
