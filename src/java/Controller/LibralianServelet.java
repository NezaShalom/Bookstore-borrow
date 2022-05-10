/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DGenerate.GeneralDao;
import Model.Libralian;
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

@WebServlet("/Librali")
public class LibralianServelet extends HttpServlet{
     @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        RequestDispatcher rd;
        
        Libralian l=new Libralian();
        
        String a=request.getParameter("a");
        
        switch(a){
            case "InsertLibralian":
               l.setName(request.getParameter("Name"));
               l.setSurname(request.getParameter("Surname"));
               l.setUsername(request.getParameter("UserName"));
               l.setPhone(request.getParameter("Phone"));
               l.setEmail(request.getParameter("Email"));
               l.setPassword(request.getParameter("Passwd"));
               l.setSex(request.getParameter("sexx"));
//l.setGender(Gender.valueOf("gender"));
               
               new GeneralDao().Save(l);
               
               request.setAttribute("result", "Libralian Saved");
               rd=request.getRequestDispatcher("AdminPanel.jsp");
               rd.forward(request, response);
                break;
                
        }
       
}}
