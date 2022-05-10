/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DGenerate.GeneralDao;
import Model.Member;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/Membership")
public class Membershipserv extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
              
      PrintWriter out=response.getWriter();
      RequestDispatcher rd;
        
    String a=request.getParameter("a");
    
      switch(a){
          case "admember":
          
              
        Member m = new Member();

        m.setName(request.getParameter("nameme"));
        m.setSurname(request.getParameter("surnameme"));
        m.setPhone(request.getParameter("phoneme"));
        m.setEmail(request.getParameter("emailme"));
        
        new GeneralDao().Save(m);
               
               request.setAttribute("result", "Member Saved");
               rd=request.getRequestDispatcher("Membershipregister.jsp");
               rd.forward(request, response);
        
          break;
    }
    }
}
