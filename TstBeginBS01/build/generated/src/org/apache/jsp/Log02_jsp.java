package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Log02_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        <head>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <title>JSP Log page test</title>\n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("\t\n");
      out.write("            <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("            \n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("            \n");
      out.write("            <script src=\"js/function.js\" type=\"text/javascript\"></script>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("     \n");
      out.write("            <h3>Registration</h3>\n");
      out.write("    \n");
      out.write("            <hr>\n");
      out.write("    \n");
      out.write("            <div class=\"row\">\n");
      out.write("        \n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                \n");
      out.write("                        <label>Username</label>\n");
      out.write("                \n");
      out.write("                        <div class=\"input-group\"> <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-user\"></span></span>\n");
      out.write("                    \n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"Username\" id=\"Username\" placeholder=\"Requested Username\" required value=\"\">\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                \n");
      out.write("                        <label>Email</label>\n");
      out.write("                \n");
      out.write("                        <div class=\"input-group\"> <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-envelope\"></span></span>\n");
      out.write("                    \n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"Email\" id=\"Email\" placeholder=\"Requested Email - EX.: Jhon@mail.c\" required value=\"\">\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                \n");
      out.write("                        <label>Password</label>\n");
      out.write("                \n");
      out.write("                        <div class=\"input-group\"> <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></span>\n");
      out.write("                    \n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" required data-toggle=\"popover\" title=\"Password Strength\" data-content=\"Enter Password...\" autofocus=\"document\">\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                \n");
      out.write("                        <label>Confirm Password</label>\n");
      out.write("                \n");
      out.write("                        <div class=\"input-group\"> <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-resize-vertical\"></span></span>\n");
      out.write("                    \n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"confirm\" id=\"confirm\" placeholder=\"Confirm Password\" required>\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\" class=\"btn btn-primary pull-right\">\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
