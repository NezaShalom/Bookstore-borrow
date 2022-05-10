/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class AdminVer extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            if(uname.equals("Shalom") && pass.equals("1Igira@")){
                
                response.sendRedirect("AdminPanel.jsp");
            } 
            else {
                response.sendRedirect("AdminPage.jsp");
            }
        }
    }

