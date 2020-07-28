package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.AdminDAO;
import java.util.ArrayList;
import DAO.UserDAO;

public final class list_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin-header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>LIST USERS | ADMIN</title>\r\n");
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
      out.write("\r\n");
      out.write("        ");
            UserDAO uDAO = new UserDAO();
            ArrayList<String> listMail = new ArrayList<String>();
            
            if(request.getParameter("del")!= null){
                new AdminDAO().deleteUser(request.getParameter("del"));
            }
            listMail = uDAO.getAll();
        
      out.write("\r\n");
      out.write("        <div class=\"span9\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"module\">\r\n");
      out.write("                    <div class=\"module-head\">\r\n");
      out.write("                        <h3>\r\n");
      out.write("                            All Members\r\n");
      out.write("                        </h3>\r\n");
      out.write("                    </div> \r\n");
      out.write("                    <div class=\"module-body\">\r\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("user");
      _jspx_th_c_forEach_0.setItems(listMail);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                            <div class=\"row-fluid\">\r\n");
            out.write("                                <div class=\"span6\">\r\n");
            out.write("                                    <div class=\"media user\">\r\n");
            out.write("                                        <a class=\"media-avatar pull-left\" href=\"#\">\r\n");
            out.write("                                            <img src=\"images/avatar.png\">\r\n");
            out.write("                                        </a>\r\n");
            out.write("                                        <div class=\"media-body\">\r\n");
            out.write("                                            <h3 class=\"media-title\">\r\n");
            out.write("                                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("                                            </h3>\r\n");
            out.write("                                            <p>\r\n");
            out.write("                                                <small class=\"muted\"> </small></p>\r\n");
            out.write("                                            <div class=\"media-option btn-group shaded-icon\">\r\n");
            out.write("                                                <a class=\"btn btn-small\" href=\"?del=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                                                    <i class=\"icon-trash\"></i>\r\n");
            out.write("                                                </a> \r\n");
            out.write("                                            </div>\r\n");
            out.write("                                            <div class=\"media-option btn-group shaded-icon\">\r\n");
            out.write("                                                <a class=\"btn btn-small\" href=\"update.jsp?update=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                                                    <i class=\"icon-upload\"></i>\r\n");
            out.write("                                                </a> \r\n");
            out.write("                                            </div>\r\n");
            out.write("                                        </div>\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </div> \r\n");
            out.write("                            </div>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.content-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
