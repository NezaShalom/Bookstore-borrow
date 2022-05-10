<%-- 
    Document   : bookedit
    Created on : 21-Nov-2020, 15:47:00
    Author     : Charmant
--%>

<%@page import="DGenerate.GeneralDao"%>
<%@page import="Model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
      Book be=new Book();
      Book books=(Book) new GeneralDao().Serch_By_String_Id(be, request.getParameter("boiid"));
              
      %>
      <form action="Regist?a=edit&&isbnii=<%=books.getISBN()%>" method="post">
          
        Books : 
               <input type="text" value="<%=books.getAuthors() %>" name="authorsi">
                <input type="text" value="<%=books.getTitle()%>" name="titlei">
               <input type="text" value="<%=books.getInitial_q() %>" name="initial_qi">
               <input type="text" value="<%=books.getPublicationYear() %>" name="pubYeari">
               <input type="text" value="<%=books.getPurchasingPrice() %>" name="purchPricei">
               
        <button>Update</button>
      </form>
        
        
        
        
    </body>
</html>
