/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DGenerate.GeneralDao;
import Model.Book;
import Model.Book_Status;
import Model.Categories;
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
@WebServlet("/Regist")
public class Regist_Servelet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        RequestDispatcher rd;
    
        Book k = new Book();
        Categories ca=new Categories();
        String a=request.getParameter("a");
        
        switch(a){
            case "InsertBooks": 
             try{  
               k.setAuthors(request.getParameter("authors"));
               k.setCategories((Categories) new GeneralDao().Serch_By_Id(ca, Integer.parseInt(request.getParameter("Categorie"))));
               k.setISBN(request.getParameter("ISBN"));
               k.setInitial_q(Integer.parseInt(request.getParameter("initial_q")));
               k.setPublicationYear(Date.valueOf(request.getParameter("pubYear")));
               k.setPurchasingPrice(Long.parseLong(request.getParameter("purchPrice")));
               k.setQ_sold(0);
               k.setRecordingDate(new java.util.Date());
               k.setStatus(Book_Status.Available);
               k.setTitle(request.getParameter("title"));
               
               new GeneralDao().Save(k);
                       
               //request.setAttribute("result", "Book Saved");
               response.sendRedirect("Registerbo.jsp");
               //rd.forward(request, response);
               }catch(Exception ex){
          
               }
               break;
               
               
        case "edit":
        Book b=new Book();
        
               b.setISBN(request.getParameter("isbnii"));
               b.setAuthors(request.getParameter("authorsi"));
               b.setTitle(request.getParameter("titlei"));
               b.setPublicationYear(Date.valueOf(request.getParameter("pubYeari")));
               b.setPurchasingPrice(Long.parseLong(request.getParameter("purchPricei")));
               
        new GeneralDao().Update(b);
        response.sendRedirect("Registerbo.jsp");
        break;
        
        
//      case "delete":
//        Book books=(Book) new GeneralDao().Serch_By_String_Id(k, request.getParameter("boiid"));
//        new GeneralDao().Delete(books);
//        response.sendRedirect("Registerbo.jsp");
//        break;
        }
        
    }
}
