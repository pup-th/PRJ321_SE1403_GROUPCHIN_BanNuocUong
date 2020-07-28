package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.User;
import Entities.Users;
import DAO.UserDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin-header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>INSERT | ADMIN</title>\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600\n");
      out.write("              ' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Admin</title>\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600\r\n");
      out.write("'\r\n");
      out.write("            rel='stylesheet'>\r\n");
      out.write("    </head> \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

            String admin = "";
            if(request.getSession().getAttribute("aMail") != null){
                admin = request.getSession().getAttribute("aMail").toString() ;
               admin = admin.substring(0, admin.indexOf("@"));
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("            <div class=\"navbar-inner\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\">\r\n");
      out.write("                        <i class=\"icon-reorder shaded\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"brand\" href=\"index.jsp\">\r\n");
      out.write("                        ");
      out.print(admin);
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav-collapse collapse navbar-inverse-collapse\">  \r\n");
      out.write("                        <ul class=\"nav pull-right\">  \r\n");
      out.write("                            <li><a href=\"contact-us.jsp\"> About Us </a></li>\r\n");
      out.write("                            <li class=\"nav-user dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <img src=\"images/avatar.png\" class=\"nav-avatar\" />\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\"> \r\n");
      out.write("                                    <li><p>");
      out.print(admin);
      out.write("</p></li>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                    <li><a href=\"home.jsp\">Logout</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div><!-- /.nav-collapse -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /navbar-inner -->\r\n");
      out.write("        </div><!-- /navbar --> \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"span3\">\r\n");
      out.write("            <div class=\"sidebar\">\r\n");
      out.write("                <ul class=\"widget widget-menu unstyled\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"admin.jsp\"><i class=\"menu-icon icon-dashboard\"></i>Dashboard\r\n");
      out.write("                        </a></li> \r\n");
      out.write("                </ul>\r\n");
      out.write("                <!--/.widget-nav-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"widget widget-menu unstyled\"> \r\n");
      out.write("                    <li><a href=\"form.jsp\"><i class=\"menu-icon icon-paste\"></i>Insert Item </a></li>\r\n");
      out.write("                    <li><a href=\"table.jsp\"><i class=\"menu-icon icon-table\"></i>Reports </a></li> \r\n");
      out.write("                </ul>\r\n");
      out.write("                <!--/.widget-nav-->\r\n");
      out.write("                <ul class=\"widget widget-menu unstyled\"> \r\n");
      out.write("                    <li><a href=\"list-user.jsp\"><i class=\"menu-icon icon-signout\"></i>All Users </a></li>\r\n");
      out.write("                    <li><a href=\"home.jsp\"><i class=\"menu-icon icon-signout\"></i>Logout </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        <script src=\"scripts/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"scripts/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"scripts/flot/jquery.flot.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        ");
    String uMail = "";
            String uPassword = "";
            String uName = "";
            String uPhone = "";
            String uAddress = "";
            if (request.getParameter("update") != null) {
                UserDAO dAO  = new UserDAO();
                uMail = request.getParameter("update");
                Users u = dAO.getInfoUser(uMail);
                uPassword = u.getuPassword();
                uPhone = u.getuPhone();
                uName = u.getuName();
                uAddress = u.getuAddress();
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"span9\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <div class=\"module\">\n");
      out.write("                    <div class=\"module-head\">\n");
      out.write("                        <h3>Update</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"module-body\">  \n");
      out.write("                        <form class=\"form-horizontal row-fluid\" action=\"AdminController\" method=\"post\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"control-group\">\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Email</label>\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <input type=\"text\" name=\"txtemail\" value=\"");
      out.print(uMail);
      out.write("\" id=\"basicinput\"  class=\"span8\" disabled=\"\">\n");
      out.write("                                    <span class=\"help-inline\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("\n");
      out.write("<!--                            <div class=\"control-group\">\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">PassWord</label>\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <input type=\"text\" name=\"txtpassword\" value=\"");
      out.print(uPassword);
      out.write("\" id=\"basicinput\"  class=\"span8\" disabled=\"\">\n");
      out.write("                                    <span class=\"help-inline\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  -->\n");
      out.write("\n");
      out.write("                            <div class=\"control-group\">\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Name</label>\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <div class=\"input-append\">\n");
      out.write("                                        <input type=\"text\" name=\"txtname\" value=\" ");
      out.print(uName);
      out.write("\"   required pattern=\"\\w+\" class=\"span8\"><span class=\"span8\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"control-group\">\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Phone</label>\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <input type=\"text\"  name=\"txtphone\" value=\" ");
      out.print(uPhone);
      out.write("\" id=\"basicinput\" pattern=\"\\d{10}\" placeholder=\"Input quantity\" class=\"span8\" required>\n");
      out.write("                                    <span class=\"help-inline\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"control-group\">\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Address</label>\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <input type=\"text\"  name=\"txtaddress\" pattern=\"\\w+\" value=\"");
      out.print(uAddress);
      out.write(" \" id=\"basicinput\" placeholder=\"Input taste\" class=\"span8\" required>\n");
      out.write("                                    <span class=\"help-inline\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                   \n");
      out.write("                            <div class=\"control-group\">\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn\" name=\"btnupdate\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div><!--/.content-->\n");
      out.write("        </div>\n");
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
