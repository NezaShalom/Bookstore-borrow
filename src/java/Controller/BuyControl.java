/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DGenerate.BookDao;
import Model.Bought;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sudo
 */
@WebServlet("/Buy")
public class BuyControl extends HttpServlet{
  @Override
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
    PrintWriter out=response.getWriter();
    
    String a=request.getParameter("a");
    
    switch(a){
      case "BuyBook":
        try{
          Bought bought=new Bought();

          bought.setBook(new BookDao().SearchBook(request.getParameter("id")));
          bought.setDate(new Date());
          bought.setEmail(request.getParameter("email"));
          bought.setName(request.getParameter("name"));
          bought.setSurname(request.getParameter("surname"));
          bought.setPhone(request.getParameter("phone"));
          bought.setQuantity(Integer.parseInt(request.getParameter("quantity")));
          new BookDao().BuyBooks(request.getParameter("id"), Integer.parseInt(request.getParameter("quantity")), bought);
          
          response.sendRedirect("ClientsPage.jsp");
          
        }catch(Exception ex){
          out.println(ex.getMessage());
        }
        break;
    }
  }
}
