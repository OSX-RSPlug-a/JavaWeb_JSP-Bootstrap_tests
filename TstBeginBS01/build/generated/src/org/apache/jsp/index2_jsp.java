package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      out.write("\t<head>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("            <title>Bootstrap tests</title>\n");
      out.write("\t\n");
      out.write("            <meta charset=\"UTF-8\" />\n");
      out.write("\t\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("            \n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("\t\n");
      out.write("            <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("            \n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</head>\n");
      out.write("\n");
      out.write("\t\t<header role=\"banner\" class=\"navbar navbar-fixed-top navbar-inverse\">\n");
      out.write("      \t\n");
      out.write("                    <div class=\"container\">\n");
      out.write("        \t\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("          \t\t\n");
      out.write("                            <button data-toggle=\"collapse-side\" data-target=\".side-collapse\" data-target-2=\".side-collapse-container\" type=\"button\" class=\"navbar-toggle pull-left\"><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button>\n");
      out.write("        \t\n");
      out.write("                        </div>\n");
      out.write("        \t\t\n");
      out.write("                        <div class=\"navbar-inverse side-collapse in\">\n");
      out.write("          \t\n");
      out.write("                            <nav role=\"navigation\" class=\"navbar-collapse\">\n");
      out.write("                        \n");
      out.write("                                <!-- top-menu -->                \t\t\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                            \n");
      out.write("              \t\t\t\t<li><a href=\"#Home\">Home</a></li>\n");
      out.write("                                        \n");
      out.write("              \t\t\t\t<li><a href=\"#users\">Users</a></li>\n");
      out.write("              \t\t\t\t\n");
      out.write("                                        <li><a href=\"#places\">Places</a></li>\n");
      out.write("              \t\t\t\t\n");
      out.write("                                        <li><a href=\"Log02.jsp\" onclick=\"window.open(this.href,'targetWindow','toolbar=no,location=no,status=no,menubar=no,scrollbars=yes,resizable=yes,width=800,height=800');return false;\"><!--<a href=\"Log02.jsp\">-->Register</a></li>\n");
      out.write("                        \n");
      out.write("                                </ul>\n");
      out.write("          \t\t\n");
      out.write("                            </nav>\n");
      out.write("        \t\n");
      out.write("                        </div>\n");
      out.write("      \t\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"jumbotron text-center\">\n");
      out.write("  \t\t\t\t\n");
      out.write("  \t\t\t\t<h1>My First Bootstrap Page</h1>\n");
      out.write("  \n");
      out.write("  \t\t\t\t<p>Resize this responsive page to see the effect!</p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("  \n");
      out.write("  \t\t\t\t<div class=\"row\">\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("      \t\t\t\n");
      out.write("      \t\t\t\t\t<h3>Column 1</h3>\n");
      out.write("      \n");
      out.write("      \t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>\n");
      out.write("      \t\t\t\t\t\n");
      out.write("      \t\t\t\t\t<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \n");
      out.write("    \t\t\t<div class=\"col-sm-4\">\n");
      out.write("      \n");
      out.write("      \t\t\t\t<h3>Column 2</h3>\n");
      out.write("      \n");
      out.write("      \t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>\n");
      out.write("      \t\t\t\t\n");
      out.write("      \t\t\t\t<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\n");
      out.write("    \t\t\t<div class=\"col-sm-4\">\n");
      out.write("      \t\t\t\n");
      out.write("      \t\t\t\t<h3>Column 3</h3>\n");
      out.write("      \n");
      out.write("      \t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>\n");
      out.write("      \t\t\t\t\n");
      out.write("      \t\t\t\t<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>\n");
      out.write("    \n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("            <br><br><br><br><br><br><br><br>\n");
      out.write("            \n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("    <!--footer start from here-->\n");
      out.write("    <footer>\n");
      out.write("  \n");
      out.write("        <div class=\"container\">\n");
      out.write("    \n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6 footerleft \">\n");
      out.write("        \n");
      out.write("                    <div class=\"logofooter\"> Logo</div>\n");
      out.write("        \n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>\n");
      out.write("                    \n");
      out.write("                    <p><i class=\"fa fa-map-pin\"></i> 00, Florest reserve, Anduin sec 42, New Nihon -        1111111, Insland</p>\n");
      out.write("                    \n");
      out.write("                    <p><i class=\"fa fa-phone\"></i> Phone (unkown) : +12 9999 999 999</p>\n");
      out.write("                    \n");
      out.write("                    <p><i class=\"fa fa-envelope\"></i> E-mail : info@webTests.com</p>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("                </div>\n");
      out.write("      \n");
      out.write("                <div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\n");
      out.write("        \n");
      out.write("                    <h6 class=\"heading7\">GENERAL LINKS</h6>\n");
      out.write("        \n");
      out.write("                    <ul class=\"footer-ul\">\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Career</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Privacy Policy</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Terms & Conditions</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Client Gateway</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Ranking</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Case Studies</a></li>\n");
      out.write("          \n");
      out.write("                        <li><a href=\"#\"> Frequently Ask Questions</a></li>\n");
      out.write("        \n");
      out.write("                    </ul>\n");
      out.write("      \n");
      out.write("                </div>\n");
      out.write("      \n");
      out.write("                <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\n");
      out.write("        \n");
      out.write("                    <h6 class=\"heading7\">LATEST POST</h6>\n");
      out.write("        \n");
      out.write("                    <div class=\"post\">\n");
      out.write("          \n");
      out.write("                        <p>test the all code:what it means for you <span>September 3,2016</span></p>\n");
      out.write("          \n");
      out.write("                        <p>test the all code:what it means for you <span>September 3,2016</span></p>\n");
      out.write("          \n");
      out.write("                        <p>test the all code:what it means for you <span>September 3,2016</span></p>\n");
      out.write("        \n");
      out.write("                    </div>\n");
      out.write("      \n");
      out.write("                </div>\n");
      out.write("      \n");
      out.write("                <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\n");
      out.write("        \n");
      out.write("                    <div class=\"col-md-2 footer-social animated fadeInDown\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                                        <h6 class=\"heading7\">Follow-Us</h6>\n");
      out.write("            \t\n");
      out.write("                                       \n");
      out.write("                                            <p><a href=\"#\"><img alt=\"Facebook Icon\" border=\"0\" height=\"30\" src=\"images/social-facebook.png\" width=\"30\"></a></p>\n");
      out.write("                \t\n");
      out.write("                                            <p><a href=\"#\"><img alt=\"Twitter Icon\" border=\"0\" height=\"30\" src=\"images/social-twitter.png\" width=\"30\"></a></p>\n");
      out.write("                \t\n");
      out.write("                                            <p><a href=\"#\"><img alt=\"Youtube Icon\" border=\"0\" height=\"30\" src=\"images/email_social_youtube.png\" width=\"30\"></a></p>\n");
      out.write("                \t\n");
      out.write("                                            <p><a href=\"#\"><img alt=\"Google&#43; Icon\" border=\"0\" height=\"30\" src=\"images/email_social_gplus.png\" width=\"30\"></a></p>\n");
      out.write("                \n");
      out.write("       \n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("      \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("  \n");
      out.write("            <div class=\"container\">\n");
      out.write("    \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("      \n");
      out.write("                    <p>© 2016 - All Rights with WebTestsJava</p>\n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("      \n");
      out.write("                    <ul class=\"bottom_ul\">\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">webTests.com</a></li>\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">About us</a></li>\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">Blog</a></li>\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">Faq's</a></li>\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("        \n");
      out.write("                        <li><a href=\"#\">Site Map</a></li>\n");
      out.write("      \n");
      out.write("                    </ul>\n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</html>");
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
