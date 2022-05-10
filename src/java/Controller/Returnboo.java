/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DGenerate.BorrowDao;
import Model.Book;
import Model.Borrow;
import Model.Member;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Charmant
 */
@WebServlet("/Returnbo")
public class Returnboo extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
    PrintWriter out=response.getWriter();
    String q=request.getParameter("q");
    
      switch(q){
          case "Returnbooks":
          try{
   
        Borrow bo = new Borrow();
        Member m= new Member();
        Book b= new Book();

        new BorrowDao().Returnbook(Integer.parseInt(request.getParameter("borroID")), request.getParameter("returndate"));
        
        
           response.sendRedirect("ClientsPage.jsp");
        
          } catch(Exception ex){
            out.println(ex.getMessage());  
          }
            break; 
      }
        
    }
}
