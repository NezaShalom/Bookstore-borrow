<%-- 
    Document   : ReturnBoook
    Created on : 19-Nov-2020, 11:10:20
    Author     : Charmant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
      <form action="Returnbo?q=Returnbooks" method="post">
            
      <label><b>borrow ID</b></label>
      <input  type="text" name="borroID">
      
      <label><b>Date today</b></label>
      <input type="text" name="returndate">
      
      <button type="submit">Proceed with rent</button>
      
      
        </form>
    </body>
</html>
