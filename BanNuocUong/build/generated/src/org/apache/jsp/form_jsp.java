package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Date;
import Entities.Itemall;
import DAO.ItemDAO;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Admin</title>\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600\r\n");
      out.write("              ' rel='stylesheet'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("        <title>Edmin</title>\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"css/theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href=\"images/icons/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link type=\"text/css\" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

            String admin = "";
            if(request.getSession().getAttribute("admin") != null){
                admin = request.getSession().getAttribute("admin").toString() ;
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
      out.write("                    <div class=\"nav-collapse collapse navbar-inverse-collapse\">\r\n");
      out.write("                        <ul class=\"nav nav-icons\">\r\n");
      out.write("                            <li class=\"active\"><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-envelope\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            <li><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-eye-open\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            <li><a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon-bar-chart\"></i>\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"navbar-search pull-left input-append\" action=\"#\">\r\n");
      out.write("                            <input type=\"text\" class=\"span3\">\r\n");
      out.write("                            <button class=\"btn\" type=\"button\">\r\n");
      out.write("                                <i class=\"icon-search\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"nav pull-right\">  \r\n");
      out.write("                            <li><a href=\"contact-us.jsp\"> About Us </a></li>\r\n");
      out.write("                            <li class=\"nav-user dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <img src=\"images/avatar.png\" class=\"nav-avatar\" />\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\"> \r\n");
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
      out.write("\r\n");
      out.write("        ");
            ItemDAO iDAO = new ItemDAO();
            String name = "";
            String taste = "";
            String pic = "";
            int price = 0;
            int quan = 0;
            int id = 0;
            Date exDate = null;
            if (request.getParameter("update") != null) {
                Itemall itemAll = iDAO.getNameOfItemById(Integer.parseInt(request.getParameter("update")));
                id = itemAll.getiId();
                name = itemAll.getiName();
                price = itemAll.getpId();
                quan = itemAll.getQuantity();
                taste = itemAll.getTaste();
                exDate = itemAll.getExpiryDate();
                pic = itemAll.getiPic();
            }
        
      out.write("\r\n");
      out.write("        <div class=\"span9\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"module\">\r\n");
      out.write("                    <div class=\"module-head\">\r\n");
      out.write("                        <h3>Insert new Item</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"module-body\">  \r\n");
      out.write("                        <form class=\"form-horizontal row-fluid\" action=\"AdminController\" method=\"post\"> \r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Id</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"text\" name=\"txtId\" value=\"");
      out.print(id);
      out.write("\" id=\"basicinput\" placeholder=\"Type something here...\" class=\"span8\" disabled=\"\">\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>  \r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Name of Item</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"text\" name=\"txtName\" value=\"");
      out.print(name);
      out.write("\" id=\"basicinput\" placeholder=\"Type something here...\" class=\"span8\" required>\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>  \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Price</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <div class=\"input-append\">\r\n");
      out.write("                                        <input type=\"text\" name=\"txtPrice\" value=\"");
      out.print(price);
      out.write("\"  placeholder=\"5.000\" required pattern=\"\\d+\" class=\"span8\"><span class=\"add-on\">$</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Quantity</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"text\"  name=\"txtQuantity\" value=\"");
      out.print(quan);
      out.write("\" id=\"basicinput\" pattern=\"\\d+\" placeholder=\"Type something here...\" class=\"span8\" required>\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Taste</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"text\"  name=\"txtTaste\" value=\"");
      out.print(taste);
      out.write("\" id=\"basicinput\" placeholder=\"Type something here...\" class=\"span8\" required>\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Expiry Date</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"date\"  name=\"txtDate\" value=\"");
      out.print(exDate);
      out.write("\" id=\"basicinput\" placeholder=\"Type something here...\" class=\"span8\" required>\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <label class=\"control-label\" for=\"basicinput\">Picture Name</label>\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <input type=\"text\" name=\"txtPic\"  value=\"");
      out.print(pic);
      out.write("\" id=\"basicinput\" placeholder=\"Type something here...\" class=\"span8\" required>\r\n");
      out.write("                                    <span class=\"help-inline\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <div class=\"controls\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn\" name=\"btnInserItem\">Insert</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div><!--/.content-->\r\n");
      out.write("        </div><!--/.span9-->\r\n");
      out.write("    </body>\r\n");
      out.write("</html> ");
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
