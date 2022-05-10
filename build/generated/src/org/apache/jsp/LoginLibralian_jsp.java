package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginLibralian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/sb-admin-2.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)),url(Resources/pic/pexels-cottonbro-2925307.jpg) no-repeat top center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <!-- Outer Row -->\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("\n");
      out.write("            <div class=\"col-xl-10 col-lg-12 col-md-9\">\n");
      out.write("\n");
      out.write("                <div class=\"card o-hidden border-0 shadow-lg my-5\">\n");
      out.write("                    <div class=\"card-body p-0\">\n");
      out.write("                        <!-- Nested Row within Card Body -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"p-5\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <h1 class=\"h4 text-gray-900 mb-4\">Welcome Back!</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <form action=\"LibraLog?a=insertLogin\" method=\"post\" class=\"user\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-control-user\" name=\"username\" placeholder=\"Enter Username Address...\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control form-control-user\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"custom-control custom-checkbox small\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\">\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"customCheck\">Remember\n");
      out.write("                                                    Me</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-user btn-block\">\n");
      out.write("                                            Login\n");
      out.write("                                        </button>\n");
      out.write("                                    \n");
      out.write("                                    </form>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <a class=\"small\" href=\"forgot-password.html\">Forgot Password?</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <a class=\"small\" href=\"register.html\">Create an Account!</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <img src=\"Resources/pic/pexels-polina-zimmerman-3747526.jpg\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <!--\n");
      out.write("        <form action=\"LibraLog?a=insertLogin\" method=\"post\">\n");
      out.write("          <label for=\"Username\">Username:</label><br>\n");
      out.write("          <input type=\"text\" name=\"username\"><br>\n");
      out.write("        \n");
      out.write("          <label for=\"paswd\">Password:</label><br>\n");
      out.write("          <input type=\"password\" name=\"password\"><br>\n");
      out.write("        \n");
      out.write("          <input type=\"submit\" value=\"Submit\">\n");
      out.write("         \n");
      out.write("        </form>\n");
      out.write("        -->\n");
      out.write("        \n");
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
