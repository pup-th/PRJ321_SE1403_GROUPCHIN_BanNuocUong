package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Itemall;
import DAO.ItemDAO;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>HOME | GROUPCHIN</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->       \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("    </head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("    <body> \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String email = null;
            String s = "";

            if (request.getParameter("out") != null) {
                request.getSession().removeAttribute("uMail");
                request.getSession().removeAttribute("hashMapItemCart");
            } else {
                if (request.getSession().getAttribute("uMail") != null) {
                    email = request.getSession().getAttribute("uMail").toString();
                    s = email.substring(0, email.indexOf("@"));
                }
            }

        
      out.write("\r\n");
      out.write("        <header id=\"header\"><!--header--> \r\n");
      out.write("\r\n");
      out.write("<!--            <div class=\"header-middle\">header-middle\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                            <div style=\"float: left\">\r\n");
      out.write("                                <a href=\"home.jsp\"><h4>GROUP</h4><img src=\"images/home/chin.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>/header-middle-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-9\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                            <div style=\"float: left\">\r\n");
      out.write("                                <a href=\"home.jsp\"><h4>GROUP</h4><img src=\"images/home/chin.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"mainmenu pull-left\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("                                    <li><a href=\"home.jsp\" class=\"active\">HOME</a></li>\r\n");
      out.write("                                    <li><a href=\"cart.jsp\">CART</a></li> \r\n");
      out.write("                                    <li><a href=\"contact-us.jsp\">CONTACT</a></li> \r\n");
      out.write("                                        ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(email == null);
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n");
              out.write("                                            <li class=\"dropdown\"><a href=\"#\">ACCOUNT<i class=\"fa fa-angle-down\"></i></a>\r\n");
              out.write("                                                <ul role=\"menu\" class=\"sub-menu\">\r\n");
              out.write("                                                    <li><a href=\"login.jsp\">Login</a></li>\r\n");
              out.write("                                                    <li><a href=\"register.jsp\">Register</a></li>  \r\n");
              out.write("                                                </ul>\r\n");
              out.write("                                            </li>\r\n");
              out.write("                                        ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\r\n");
          out.write("                                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(email != null);
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                            <li class=\"dropdown\"><a href=\"#\">");
              out.print(s);
              out.write("<i class=\"fa fa-angle-down\"></i></a>\r\n");
              out.write("                                                <ul role=\"menu\" class=\"sub-menu\">\r\n");
              out.write("                                                    <li><a href=\"cart.jsp\">Cart</a></li>\r\n");
              out.write("                                                    <li><a href=\"profile1.jsp\">Profile</a></li>  \r\n");
              out.write("                                                    <li><a href=\"home.jsp?out=1\">Sign out\r\n");
              out.write("                                                        <script>\r\n");
              out.write("                                                                function myFunction() {\r\n");
              out.write("                                                                    gapi.auth2.getAuthInstance().disconnect();\r\n");
              out.write("                                                                    location.reload();\r\n");
              out.write("                                                                }\r\n");
              out.write("                                                            </script>\r\n");
              out.write("                                                        </a>\r\n");
              out.write("                                                    </li>  \r\n");
              out.write("                                                </ul>\r\n");
              out.write("                                            </li>\r\n");
              out.write("                                        ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write(" \r\n");
      out.write("                                    \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-bottom-->\r\n");
      out.write("        </header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"slider\"><!--slider-->\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div id=\"slider-carousel\"   class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"carousel-inner\">\r\n");
      out.write("                                <div class=\"item active\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <h1><span>GROUP</span>CHIN</h1>\r\n");
      out.write("                                        <h2>Pepsi</h2>\r\n");
      out.write("                                        <p>Wellcome to our shop</p> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <img src=\"douong/pepsi.jpg\" class=\"girl img-responsive\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <h1><span>GROUP</span>CHIN</h1>\r\n");
      out.write("                                        <h2>Number 1</h2>\r\n");
      out.write("                                        <p>Wellcome to our shop</p> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <img src=\"douong/number1.jpg\" class=\"girl img-responsive\" alt=\"\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <h1><span>GROUP</span>CHIN</h1>\r\n");
      out.write("                                        <h2>Dr Thanh</h2>\r\n");
      out.write("                                        <p>Wellcome to our shop</p> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-6\">\r\n");
      out.write("                                        <img src=\"douong/drthanh.jpg\" class=\"girl img-responsive\" alt=\"\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\r\n");
      out.write("                                <i class=\"fa fa-angle-left\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section><!--/slider-->\r\n");
      out.write("\r\n");
      out.write("        <section id=\"cart_items\"> \r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"left-sidebar\">\r\n");
      out.write("                            <h2>Sort</h2>\r\n");
      out.write("                            <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr--> \r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    ");
                                        String path = request.getContextPath() + "/home.jsp";
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"");
      out.print(path);
      out.write("?az=1\">A-Z</a></h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"");
      out.print(path);
      out.write("?za=1\">Z-A</a></h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"");
      out.print(path);
      out.write("?low=1\">Low -> High</a></h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\"><a href=\"");
      out.print(path);
      out.write("?high=1\">High -> Low</a></h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div><!--/category-products--> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
                        DAO.ItemDAO it = new DAO.ItemDAO();
                        ArrayList<Entities.Items> listName = new ArrayList<>();
                        listName = (request.getParameter("low") != null) ? it.sortItemByPricelowhigh()
                                : (request.getParameter("high") != null) ? it.sortItemByPricehighlow()
                                : (request.getParameter("az") != null) ? it.sortItemByNameaz()
                                : (request.getParameter("za") != null) ? it.sortItemByNameza()
                                : it.getNameOfItems();
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-9 padding-right\">\r\n");
      out.write("                        <div class=\"features_items\"><!--features_items-->\r\n");
      out.write("                            <h2 class=\"title text-center\">Items</h2>\r\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("item");
      _jspx_th_c_forEach_0.setItems(listName);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <div class=\"col-sm-4\">\r\n");
            out.write("                                    <div class=\"product-image-wrapper\">\r\n");
            out.write("                                        <div class=\"single-products\">\r\n");
            out.write("                                            <div class=\"productinfo text-center\">\r\n");
            out.write("                                                <img src=\"douong/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getImg()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" height=\"275px\" width=\"275px\"  />\r\n");
            out.write("                                                <h2>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\r\n");
            out.write("                                                <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p> \r\n");
            out.write("                                            </div>\r\n");
            out.write("                                            <div class=\"product-overlay\">\r\n");
            out.write("                                                <div class=\"overlay-content\">\r\n");
            out.write("                                                    <h2>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\r\n");
            out.write("                                                    <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                                                    <form action=\"CartController\" method=\"post\">\r\n");
            out.write("                                                        <input type=\"hidden\" name=\"cartQuantity\" value=\"1\"/>\r\n");
            out.write("                                                        <input type=\"hidden\" name=\"cartId\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getiId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"/>\r\n");
            out.write("                                                        <button class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</button>\r\n");
            out.write("                                                        <a href=\"productdetail.jsp?proid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getiId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Detail</a>\r\n");
            out.write("                                                    </form>\r\n");
            out.write("                                                </div>\r\n");
            out.write("                                            </div>\r\n");
            out.write("                                        </div>\r\n");
            out.write("                                    </div>\r\n");
            out.write("                                </div>\r\n");
            out.write("                            ");
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
      out.write("                        </div><!--features_items--> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Home | E-Shopper</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->       \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer id=\"footer\"><!--Footer-->\r\n");
      out.write("            <div class=\"footer-top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"companyinfo\">\r\n");
      out.write("                                <h2><span>GROUP</span>CHIN</h2>\r\n");
      out.write("                                <p></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-7\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"contact-us.jsp\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"background/phuc.jpg\" alt=\"\" />\r\n");
      out.write("                                        </div>  \r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Hoang Phuc</p>\r\n");
      out.write("                                    <h2> </h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"contact-us.jsp\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"background/qui.png\" alt=\"\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Hoang Qui</p>\r\n");
      out.write("                                    <h2> </h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"contact-us.jsp\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"background/tri.jpg\" alt=\"\" />\r\n");
      out.write("                                        </div><p>Minh Tri</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <h2> </h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"address\">\r\n");
      out.write("                                <img src=\"images/home/map.png\" alt=\"\" />\r\n");
      out.write("                                <p></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("\r\n");
      out.write("        </footer><!--/Footer-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("        <script src=\"js/price-range.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
