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
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Charmant
 */
@WebServlet("/Borrowbo")
public class Borrowserv extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd;
        
      PrintWriter out=response.getWriter();
    String a=request.getParameter("a");
    
      switch(a){
          case "borrowbook":
        try{
              
        Borrow bo = new Borrow();
        Member m= new Member();
        Book b= new Book();
        
        new BorrowDao().Borrowbo(Integer.parseInt(request.getParameter("clientID")), request.getParameter("BorowDate"), request.getParameter("dueeDate"), request.getParameter("booID"));
        
        response.sendRedirect("ClientsPage.jsp");
        
          } catch(Exception ex){
            out.println(ex.getMessage());  
          }
            break; 
      }
        
        }
    }
