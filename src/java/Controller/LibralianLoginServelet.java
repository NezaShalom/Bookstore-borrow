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
@WebServlet("/LibraLog")
public class LibralianLoginServelet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        RequestDispatcher rd;
        
        String a=request.getParameter("a");
        
        switch(a){
            case "insertLogin":
                try{
                    Libralian au=new GeneralDao().Login(request.getParameter("username"), request.getParameter("password"));
                if(au != null){
                    request.setAttribute("Libralian", au);
                    rd=request.getRequestDispatcher("Registerbo.jsp");
                    rd.forward(request, response);
                }else{
                    request.setAttribute("Error", "Check Username or password");
                    rd=request.getRequestDispatcher("LoginLibralian.jsp");
                    rd.forward(request, response);
                }
                }catch(Exception ex){
                    
                }
                break;
        }
    }
}
