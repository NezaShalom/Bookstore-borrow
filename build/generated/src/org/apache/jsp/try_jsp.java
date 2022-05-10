package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
