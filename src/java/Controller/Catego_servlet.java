/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DGenerate.GeneralDao;
import Model.Categories;
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
@WebServlet("/Cate")
public class Catego_servlet extends HttpServlet{
    @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        RequestDispatcher rd;
        
        Categories c=new Categories();
    
        String a = request.getParameter("a");
        
        switch(a){
            case "InsertCategory":
               c.setCategory(request.getParameter("Name"));
               
               new GeneralDao().Save(c);
               
               request.setAttribute("result", "Category Saved");
               rd=request.getRequestDispatcher("AddCategory.jsp");
               rd.forward(request, response);
                break;
        }
}}
