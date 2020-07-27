package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import DAO.UserDAO;
import java.util.ArrayList;

public final class profile1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html> \r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("        <title>Bootstrap Example</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Login | E-Shopper</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\"> \r\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\r\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com\">\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                var readURL = function (input) {\r\n");
      out.write("                    if (input.files && input.files[0]) {\r\n");
      out.write("                        var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("                        reader.onload = function (e) {\r\n");
      out.write("                            $('.avatar').attr('src', e.target.result);\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                $(\".file-upload\").on('change', function () {\r\n");
      out.write("                    readURL(this);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            th, td {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("            <div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"logo pull-left\">\r\n");
      out.write("                                <a href=\"home.jsp\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-middle-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
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
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"search_box pull-right\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Search\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-bottom-->\r\n");
      out.write("        </header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
                        DAO.UserDAO dao = new DAO.UserDAO();
            String user = request.getSession().getAttribute("uMail").toString();
            Entities.Users u = dao.getInfoUser(user);
            String name = u.getuName();
            String mail = u.getuMail();
            String phone = u.getuPhone();
            String address = u.getuAddress();
        
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"container bootstrap snippet\">\r\n");
      out.write("            <div class=\"row\"> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-3\"><!--left col-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"text-center\">\r\n");
      out.write("                        <img src=\"images/avatar.png\" class=\"avatar img-circle img-thumbnail\" alt=\"avatar\">\r\n");
      out.write("                    </div></hr><br>   \r\n");
      out.write("\r\n");
      out.write("                </div><!--/col-3-->\r\n");
      out.write("                <div class=\"col-sm-9\">\r\n");
      out.write("                    <ul class=\"nav nav-tabs\">\r\n");
      out.write("                        <li class=\"active\"><a data-toggle=\"tab\" href=\"#home\">Profile</a></li>\r\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#messages\">Change password</a></li>\r\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#settings\">Purchase history</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"tab-content\">\r\n");
      out.write("                        <div class=\"tab-pane active\" id=\"home\">\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <form class=\"form\" action=\"ChangeController\" method=\"post\" id=\"registrationForm\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"omail\" value=\"");
      out.print( mail);
      out.write("\"/>\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <label for=\"first_name\"><h4>Full Name</h4></label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"nname\" id=\"first_name\" placeholder=\"full name\" title=\"enter your full name if any.\" value=\"");
      out.print(name);
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <label for=\"last_name\"><h4>Email</h4></label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"nmail\" id=\"last_name\" placeholder=\"email\" title=\"enter your email if any.\" value=\"");
      out.print( mail);
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <label for=\"phone\"><h4>Phone</h4></label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"nphone\" id=\"phone\" placeholder=\"enter phone\" title=\"enter your phone number if any.\" value=\"");
      out.print( phone);
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <label for=\"mobile\"><h4>Address</h4></label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"naddress\" id=\"mobile\" placeholder=\"enter mobile number\" title=\"enter your mobile number if any.\" value=\"");
      out.print( address);
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-xs-12\">\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <button class=\"btn btn-lg btn-success\" type=\"submit\" name=\"btnSaveinfo\"><i class=\"glyphicon glyphicon-ok-sign\"></i>Save</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                            <hr>\r\n");
      out.write("\r\n");
      out.write("                        </div><!--/tab-pane-->\r\n");
      out.write("                        <div class=\"tab-pane\" id=\"messages\">\r\n");
      out.write("\r\n");
      out.write("                            <h2></h2>\r\n");
      out.write("                            ");

                                String oldpass = dao.getPassword(mail);
                                String fail = "";
                                if (request.getAttribute("changeFail") != null) {
                                    fail = request.getAttribute("changeFail").toString();
                                }
                            
      out.write("\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <form class=\"form\" action=\"PasswordController\" method=\"post\" id=\"registrationForm\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"hidden\" name=\"checkopass\" value=\"");
      out.print( oldpass);
      out.write("\"/>\r\n");
      out.write("                                        <input type=\"hidden\" name=\"omail\" value=\"");
      out.print( mail);
      out.write("\"/>\r\n");
      out.write("                                        <label for=\"first_name\"><h4>Old password</h4></label>\r\n");
      out.write("                                        <input type=\"text\" pattern=\"\\w{6,}\" class=\"form-control\" name=\"opass\" id=\"first_name\" placeholder=\"old password\" title=\"enter your old password if any.\">\r\n");
      out.write("\r\n");
      out.write("                                        <label for=\"last_name\"><h4>New password</h4></label>\r\n");
      out.write("                                        <input type=\"text\"  pattern=\"\\w{6,}\" class=\"form-control\" name=\"npass\" id=\"last_name\" placeholder=\"new password\" title=\"enter your new password if any.\">\r\n");
      out.write("\r\n");
      out.write("                                        <label for=\"phone\"><h4>Confirm password</h4></label>\r\n");
      out.write("                                        <input type=\"text\"  pattern=\"\\w{6,}\" class=\"form-control\" name=\"cpass\" id=\"phone\" placeholder=\"confirm password\" title=\"enter your confirm password if any.\">\r\n");
      out.write("                                        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(fail.isEmpty());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <p style=\"color: red\">");
          out.print(fail);
          out.write("</p>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-xs-12\">\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <button class=\"btn btn-lg btn-success\" type=\"submit\" name=\"btnSavepass\"><i class=\"glyphicon glyphicon-ok-sign\"></i>Save</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        </div><!--/tab-pane--> \r\n");
      out.write("                        <div class=\"tab-pane\" id=\"settings\">\r\n");
      out.write("                            <table>\r\n");
      out.write("                                ");
                                    
                                    DAO.UserDAO userdao = new UserDAO();
                                    ArrayList<Entities.OrderDetail> listorder = userdao.getHisPurchase(mail);
                                    int count = 1;
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                                    out.println("<tr align='center'>");
                                    out.println("<th>No.</th>");
                                    out.println("<th>Item Name</th>");
                                    out.println("<th>Quantity</th>");
                                    out.println("<th>Price</th>");
                                    out.println("<th>Order Date</th>");
                                    out.println("<th>Total</th>");
                                    out.println("</tr>");
                                    for (Entities.OrderDetail elem : listorder) {
                                        int price = userdao.getPriceItemById(elem.getiId());
                                        out.println("<tr align='center'>");
                                        out.println("<td>" + count++ + "</td>");
                                        out.println("<td>" + userdao.getNameItemById(elem.getiId()) + "</td>");
                                        out.println("<td>" + elem.getQuantity() + "</td>");
                                        out.println("<td>" + price + "</td>");
                                        out.println("<td>" + sdf.format(elem.getOrderDate()) + "</td>");
                                        out.println("<td>" + (price * elem.getQuantity()) + "</td>");
                                        out.println("<tr>");
                                    }
                                
      out.write("\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--/tab-pane-->\r\n");
      out.write("                </div><!--/tab-content-->\r\n");
      out.write("\r\n");
      out.write("            </div><!--/col-9-->\r\n");
      out.write("        </div><!--/row-->\r\n");
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
      out.write("                                <h2><span>e</span>-shopper</h2>\r\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-7\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"images/home/iframe1.png\" alt=\"\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"overlay-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Circle of Hands</p>\r\n");
      out.write("                                    <h2>24 DEC 2014</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"images/home/iframe2.png\" alt=\"\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"overlay-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Circle of Hands</p>\r\n");
      out.write("                                    <h2>24 DEC 2014</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"images/home/iframe3.png\" alt=\"\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"overlay-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Circle of Hands</p>\r\n");
      out.write("                                    <h2>24 DEC 2014</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"video-gallery text-center\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"iframe-img\">\r\n");
      out.write("                                            <img src=\"images/home/iframe4.png\" alt=\"\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"overlay-icon\">\r\n");
      out.write("                                            <i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <p>Circle of Hands</p>\r\n");
      out.write("                                    <h2>24 DEC 2014</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"address\">\r\n");
      out.write("                                <img src=\"images/home/map.png\" alt=\"\" />\r\n");
      out.write("                                <p>505 S Atlantic Ave Virginia Beach, VA(Virginia)</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <p class=\"pull-left\">Copyright © 2013 E-SHOPPER Inc. All rights reserved.</p>\r\n");
      out.write("                        <p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
