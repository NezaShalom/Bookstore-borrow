package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DGenerate.GeneralDao;
import Model.Book;
import DGenerate.CategoryDao;
import java.util.List;
import Model.Categories;

public final class Registerbo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/mdb.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    .brand {\n");
      out.write("    font-size: 40px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    padding-top: 10px;\n");
      out.write("    margin-left: 90px;\n");
      out.write("    font-family: \"Sacramento\", Arial, serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav li a {\n");
      out.write("    margin-right: 40px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <ul class=\"brand\"><strong>Librarian</strong></ul>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <ul class=\"navbar-nav mr-auto w-100 justify-content-end\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"AddCategory.jsp\">Categories<span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Membershipregister.jsp\">Membership</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"Registerbo.jsp\">Add Books</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a type=\"button\" href=\"TopPage.jsp\" class=\"btn btn-outline-success\">Return on top</a>\n");
      out.write("        </li>    \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='row justify-content-center mt-4'>\n");
      out.write("            <div class='col-md-6'>\n");
      out.write("                <div class='card'>\n");
      out.write("                    <div class='card-header'><strong>Add Books</strong></div>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("        <form action=\"Regist?a=InsertBooks\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <label for=\"ISBN\"><b>ISBN</b></label><br>\n");
      out.write("            <input class=\"form-control\" type=\"text\" id=\"ISBN\" name=\"ISBN\" required>\n");
      out.write("          <label for=\"title\"><b>title</b></label><br>\n");
      out.write("          <input class=\"form-control\" type=\"text\" id=\"title\" name=\"title\" required>\n");
      out.write("          \n");
      out.write("          <label for=\"authors\"><b>authors</b></label><br>\n");
      out.write("          <input class=\"form-control\" type=\"text\" id=\"authors\" name=\"authors\" required>\n");
      out.write("          \n");
      out.write("          <label for=\"pubYear\"><b>publication Year</b></label><br>\n");
      out.write("          <input class=\"form-control\" type=\"date\" id=\"pubYear\" name=\"pubYear\" required>\n");
      out.write("          \n");
      out.write("          <label for=\"purchPrice\"><b>Price</b></label><br>\n");
      out.write("          <input class=\"form-control\" type=\"number\" id=\"purchPrice\" name=\"purchPrice\" required>\n");
      out.write("          \n");
      out.write("          <label for=\"initial_q\"><b>Quantity</b></label><br>\n");
      out.write("          <input class=\"form-control\" type=\"text\" id=\"initial_q\" name=\"initial_q\" required>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <label name=\"Categorie\"><b>Choose Category</b></label>          \n");
      out.write("          <select class=\"form-control\" name=\"Categorie\" id=\"Categorie\">\n");
      out.write("              ");
Categories ca=new Categories();
                List<Categories> cate=(List<Categories>)new CategoryDao().CategoryList();
                for(Categories c:cate){
      out.write("\n");
      out.write("                <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c.getCategory());
      out.write("</option>\n");
      out.write("                ");
}
              
      out.write("\n");
      out.write("          </select>\n");
      out.write("          <br>\n");
      out.write("          \n");
      out.write("          <center>\n");
      out.write("          <button class=\"btn btn-outline-success btn-user btn-block\" type=\"submit\">Add Book</button>\n");
      out.write("          </center>\n");
      out.write("        </form> \n");
      out.write("          \n");
      out.write("        </div></div></div></div>\n");
      out.write("          \n");
      out.write("              ");

                  if(request.getAttribute("result") == "Book Saved"){
      out.write("\n");
      out.write("                  <h2 style=\"color: green;\">Book Saved</h2>\n");
      out.write("                  ");
}
                  
      out.write("\n");
      out.write("        \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    <br>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("        <div class=\"card shadow mb-4\">\n");
      out.write("            <div class=\"card-header py-3\">\n");
      out.write("                <h6 class=\"m-0 font-weight-bold text-primary\">List of books</h6>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table table-bordered\"  id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <thead>\n");
      out.write("      \n");
      out.write("      <th>ISBN</th>\n");
      out.write("      <th>Author</th>\n");
      out.write("      <th>Title</th>\n");
      out.write("      <th>Pub Year</th>\n");
      out.write("      <th>P. price</th>\n");
      out.write("      <th>In addition</th>\n");
      out.write("    </thead>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      ");
 
        Book b=new Book();
        List<Book> bh=(List<Book>)new GeneralDao().Print_All(b);
        for(Book be:bh){
      out.write("\n");
      out.write("       <tr>\n");
      out.write("         <td>");
      out.print(be.getISBN());
      out.write("</td>\n");
      out.write("         <td>");
      out.print(be.getAuthors());
      out.write("</td>\n");
      out.write("         <td>");
      out.print(be.getTitle());
      out.write("</td>\n");
      out.write("         <td>");
      out.print(be.getPublicationYear());
      out.write("</td>\n");
      out.write("         <td>");
      out.print(be.getPurchasingPrice());
      out.write("</td>\n");
      out.write("         <td><a href=\"bookedit.jsp?boiid=");
      out.print(be.getISBN());
      out.write("\"><button class=\"btn btn-info\">Edit</button></a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    \n");
      out.write("    </table>     \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
