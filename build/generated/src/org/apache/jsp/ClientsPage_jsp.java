package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.Book;
import DGenerate.GeneralDao;

public final class ClientsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/try.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("html,\n");
      out.write("body,\n");
      out.write("header,\n");
      out.write("#intro{\n");
      out.write("    height: 95%;\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("    background: rgba(0,0,0,0.5);\n");
      out.write("}\n");
      out.write("    #brand,\n");
      out.write("    .nav-linke {\n");
      out.write("    font-size: 40px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    padding-top: 10px;\n");
      out.write("    margin-left: 90px;\n");
      out.write("    font-family: \"Sacramento\", Arial, serif;\n");
      out.write("}\n");
      out.write("            #intro{\n");
      out.write("    background: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.8)),url(\"Resources/pic/wenav.jpg\") no-repeat center center fixed;\n");
      out.write("    -webkit-background-size: cover;\n");
      out.write("    -moz-background-size: cover;\n");
      out.write("    -o-background-size: cover;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("            <!--Navbar-->\n");
      out.write("    \n");
      out.write("                <!--Navbar-->\n");
      out.write("    <header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <a id=\"brand\">BookStore.Co</a>\n");
      out.write("        \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("          <ul class=\"navbar-nav mr-auto w-100 justify-content-end\">\n");
      out.write("            \n");
      out.write("            <li class=\"nav-item hide\">\n");
      out.write("                <a class=\"nav-linke\">Thanks for checking in.</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item hide\">\n");
      out.write("            <a type=\"button\" href=\"TopPage.jsp\" class=\"btn btn-outline-success\">Return on top</a>\n");
      out.write("              </li>\n");
      out.write("          </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Content of header-->\n");
      out.write("  <div id=\"intro\" class=\"view hm-black-strong\">\n");
      out.write("    <div class=\"mask rgba-gradient d-flex justify-content-center align-items-center\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">        \n");
      out.write("          <div class=\"col-md-6 white-text text-center text-md-left mt-xl-5 mb-5 wow fadeInLeft\" data-wow-delay=\"0.3s\">\n");
      out.write("            <h1 class=\"h1-responsive font-weight-bold mt-sm-5\" style=\"color: white;\">Read with us </h1>\n");
      out.write("              <hr class=\"hr-light white-text\">\n");
      out.write("              <h6 id=\"he\" class=\"mb-4\" style=\"color: white;\">Our cooperate aim is to have you satisfied by our services, including reading, borrowing and buying books.</h6>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </header>\n");
      out.write("                <br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"Resources/css/bootstrap.min.css\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write("  background-position: 10px 10px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 12px 20px 12px 40px;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  margin-bottom: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable th, #myTable td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr {\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr.header, #myTable tr:hover {\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("    display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    z-index: 1; /* Sit on top */\n");
      out.write("    padding-top: 100px; /* Location of the box */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    height: 100%; /* Full height */\n");
      out.write("    overflow: auto; /* Enable scroll if needed */\n");
      out.write("    background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write(".modal-con {\n");
      out.write("    position: relative;\n");
      out.write("    background-color: #fefefe;\n");
      out.write("    margin: auto;\n");
      out.write("    padding: 0;\n");
      out.write("    border: 1px solid #888;\n");
      out.write("    width: 80%;\n");
      out.write("    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("    -webkit-animation-name: animatetop;\n");
      out.write("    -webkit-animation-duration: 0.4s;\n");
      out.write("    animation-name: animatetop;\n");
      out.write("    animation-duration: 0.4s\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add Animation */\n");
      out.write("@-webkit-keyframes animatetop {\n");
      out.write("    from {top:-300px; opacity:0} \n");
      out.write("    to {top:0; opacity:1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes animatetop {\n");
      out.write("    from {top:-300px; opacity:0}\n");
      out.write("    to {top:0; opacity:1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button */\n");
      out.write(".close {\n");
      out.write("    color: white;\n");
      out.write("    float: right;\n");
      out.write("    font-size: 28px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("    color: #ffffff;\n");
      out.write("    text-decoration: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-header {\n");
      out.write("    padding: 2px 16px;\n");
      out.write("    background-color: #25274d;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-body {padding: 2px 16px;}\n");
      out.write("\n");
      out.write(".modal-footer {\n");
      out.write("    padding: 2px 16px;\n");
      out.write("    background-color: #25274d;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <ul class=\"nav nav-pills mb-3 nav-justified\" id=\"pills-tab\" role=\"tablist\">\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link active\" id=\"pills-home-tab\" data-toggle=\"pill\" href=\"#pills-home\" role=\"tab\" aria-controls=\"pills-home\" aria-selected=\"true\">Buy books</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" id=\"pills-contact-tab\" data-toggle=\"pill\" href=\"#pills-contact\" role=\"tab\" aria-controls=\"pills-contact\" aria-selected=\"false\">Membership Previlege.</a>\n");
      out.write("    </li>\n");
      out.write("    </ul>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("    <div class=\"tab-content\" id=\"pills-tabContent\">\n");
      out.write("    <div class=\"tab-pane fade show active\" id=\"pills-home\" role=\"tabpanel\" aria-labelledby=\"pills-home-tab\">\n");
      out.write("    \n");
      out.write("        <!--buy-->\n");
      out.write("        \n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("            <div class=\"card-body p-0\">\n");
      out.write("                <h2>Books in store</h2>\n");
      out.write("\n");
      out.write("<input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\" title=\"Type in a name\">\n");
      out.write("\n");
      out.write("<table id=\"myTable\">\n");
      out.write("  <tr class=\"header\">\n");
      out.write("    <th style=\"width:20%;\">Book Name</th>\n");
      out.write("    <th style=\"width:20%;\">Author</th>\n");
      out.write("    <th style=\"width:15%;\">price</th>\n");
      out.write("    <th style=\"width:10%;\">Quantity</th>\n");
      out.write("    <th style=\"width:10%;\">Buy</th>\n");
      out.write("  </tr>\n");
      out.write("  ");

    Book b=new Book();
    List<Book> bl=(List<Book>)new GeneralDao().Print_All(b);
    int i=0;
    for(Book bo:bl){
      i++;
  
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(bo.getTitle());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(bo.getAuthors());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(bo.getPurchasingPrice());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(bo.getInitial_q()-bo.getQ_sold());
      out.write("</td>\n");
      out.write("    <td><button class=\"btn btn-outline-secondary\" onclick=\"pushTab(");
      out.print(i);
      out.write(")\">Add to cart</button></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("<!-- The Modal -->\n");
      out.write("<div id=\"myModal");
      out.print(i);
      out.write("\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <!-- Modal content -->\n");
      out.write("  <div class=\"modal-con\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("      <h2 style=\"float: left;\">Book in the cart: ");
      out.print(bo.getTitle());
      out.write("</h2>\n");
      out.write("      <span class=\"close\">&times;</span>\n");
      out.write("    </div>\n");
      out.write("            <div class=\"row justify-content-center mt-4\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\"><strong>Customer Details.</strong></div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("      <form action=\"Buy?a=BuyBook&&id=");
      out.print(bo.getISBN());
      out.write("\" method=\"post\">\n");
      out.write("      \n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Your name\" required><br>\n");
      out.write("      <input type=\"text\" name=\"surname\" class=\"form-control\" placeholder=\"surname\" required><br>\n");
      out.write("      <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"email\" required><br>\n");
      out.write("      <input type=\"text\" name=\"phone\" class=\"form-control\" placeholder=\"phone\" required><br>\n");
      out.write("      <input type=\"tel\" name=\"quantity\" class=\"form-control\" id=\"qua\" placeholder=\"quantity\" required><br/>\n");
      out.write("      <button onclick=\"calculate()\" class=\"btn btn-success btn-user btn-block\">Confirm</button>\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("    </div></div></div></div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        \n");
      out.write("        <h3 class=\"text-center\">Thank for buying with us. ..</h3>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    ");
}
    
      out.write("\n");
      out.write("</table>\n");
      out.write("            </div></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   </div>\n");
      out.write("    <div class=\"tab-pane fade\" id=\"pills-contact\" role=\"tabpanel\" aria-labelledby=\"pills-contact-tab\">\n");
      out.write("        \n");
      out.write("        <!--Borrow a book -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <div class=\"row justify-content-center mt-4\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card-body p-0\">\n");
      out.write("                <h2>Borrow Books</h2>\n");
      out.write("        \n");
      out.write("        <div class='card-body'>\n");
      out.write("        \n");
      out.write("     <form action=\"Borrowbo?a=borrowbook\" method=\"post\">\n");
      out.write("      <label><b>Member ID</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Enter your ID\" name=\"clientID\">\n");
      out.write("\n");
      out.write("      <label><b>Borrowing date</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Enter Date today\" name=\"BorowDate\">\n");
      out.write("\n");
      out.write("      <label><b>Returning date</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Day to return\" name=\"dueeDate\">\n");
      out.write("      \n");
      out.write("      <label><b>Book ID</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Book ID\" name=\"booID\">\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <center>\n");
      out.write("      <button class=\"btn btn-success btn-user btn-block\" type=\"submit\">Proceed with rent</button>\n");
      out.write("      </center>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <!--Return a book-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                \n");
      out.write("        \n");
      out.write("           <div class=\"row justify-content-center mt-4\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card-body p-0\">\n");
      out.write("                <h2>Return a Books</h2>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class='card-body'>\n");
      out.write("        \n");
      out.write("     <form action=\"Returnbo?q=Returnbooks\" method=\"post\">\n");
      out.write("      <label><b>borrow ID</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Enter your ID\" name=\"borroID\">\n");
      out.write("\n");
      out.write("      <label><b>Date today</b></label>\n");
      out.write("      <input class=\"form-control\" type=\"text\" placeholder=\"Enter Date today\" name=\"returndate\">\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <center>\n");
      out.write("      <button class=\"btn btn-success btn-user btn-block\" type=\"submit\">Return book</button>\n");
      out.write("      </center>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("<script>\n");
      out.write("  \n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, table, tr, td, i;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("    if (td) {\n");
      out.write("      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    }       \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function calculate(){\n");
      out.write("var a,b,result;\n");
      out.write("\n");
      out.write("a = document.getElementById(\"qua\").value;\n");
      out.write("b = bo.getPurchasingPrice();\n");
      out.write("result = a * b;\n");
      out.write("document.getElementById(\"r\").innerHTML = a + \" * \" + b + \" = \" + result;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("// Get the modal\n");
      out.write("var modal;\n");
      out.write("      function pushTab(a) {\n");
      out.write("        // Get the modal\n");
      out.write("        modal = document.getElementById('myModal'+a);\n");
      out.write("        // When the user clicks the button, open the modal \n");
      out.write("        modal.style.display = \"block\";\n");
      out.write("      }\n");
      out.write("      // Get the <span> element that closes the modal\n");
      out.write("        var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("      // When the user clicks on <span> (x), close the modal\n");
      out.write("      span.onclick = function () {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("      };\n");
      out.write("\n");
      out.write("      // When the user clicks anywhere outside of the modal, close it\n");
      out.write("      window.onclick = function (event) {\n");
      out.write("        if (event.target === modal) {\n");
      out.write("          modal.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"Resources/js/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
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