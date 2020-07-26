package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Edmin</title>\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String admin = "";
            if(request.getSession().getAttribute("admin") != null){
                admin = request.getSession().getAttribute("admin").toString() ;
               admin = admin.substring(0, admin.indexOf("@"));
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"navbar navbar-fixed-top\">\n");
      out.write("            <div class=\"navbar-inner\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\">\n");
      out.write("                        <i class=\"icon-reorder shaded\"></i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <a class=\"brand\" href=\"index.jsp\">\n");
      out.write("                        ");
      out.print(admin);
      out.write("\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"nav-collapse collapse navbar-inverse-collapse\">\n");
      out.write("                        <ul class=\"nav nav-icons\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\">\n");
      out.write("                                    <i class=\"icon-envelope\"></i>\n");
      out.write("                                </a></li>\n");
      out.write("                            <li><a href=\"#\">\n");
      out.write("                                    <i class=\"icon-eye-open\"></i>\n");
      out.write("                                </a></li>\n");
      out.write("                            <li><a href=\"#\">\n");
      out.write("                                    <i class=\"icon-bar-chart\"></i>\n");
      out.write("                                </a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <form class=\"navbar-search pull-left input-append\" action=\"#\">\n");
      out.write("                            <input type=\"text\" class=\"span3\">\n");
      out.write("                            <button class=\"btn\" type=\"button\">\n");
      out.write("                                <i class=\"icon-search\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <ul class=\"nav pull-right\">  \n");
      out.write("                            <li><a href=\"contact-us.jsp\"> About Us </a></li>\n");
      out.write("                            <li class=\"nav-user dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"images/avatar.png\" class=\"nav-avatar\" />\n");
      out.write("                                    <b class=\"caret\"></b>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\"> \n");
      out.write("                                    <li><a href=\"home.jsp\">Logout</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.nav-collapse -->\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /navbar-inner -->\n");
      out.write("        </div><!-- /navbar --> \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <div class=\"span3\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <ul class=\"widget widget-menu unstyled\">\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\"><i class=\"menu-icon icon-dashboard\"></i>Dashboard\n");
      out.write("                        </a></li> \n");
      out.write("                </ul>\n");
      out.write("                <!--/.widget-nav-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"widget widget-menu unstyled\"> \n");
      out.write("                    <li><a href=\"form.jsp\"><i class=\"menu-icon icon-paste\"></i>Insert Item </a></li>\n");
      out.write("                    <li><a href=\"table.jsp\"><i class=\"menu-icon icon-table\"></i>Reports </a></li> \n");
      out.write("                </ul>\n");
      out.write("                <!--/.widget-nav-->\n");
      out.write("                <ul class=\"widget widget-menu unstyled\"> \n");
      out.write("                    <li><a href=\"list-user.jsp\"><i class=\"menu-icon icon-signout\"></i>All Users </a></li>\n");
      out.write("                    <li><a href=\"home.jsp\"><i class=\"menu-icon icon-signout\"></i>Logout </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <script src=\"scripts/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"scripts/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"scripts/flot/jquery.flot.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
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
