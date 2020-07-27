package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.CartInfo;
import Entities.Itemall;
import java.util.ArrayList;
import DAO.ItemDAO;
import java.util.HashMap;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Cart | E-Shopper</title>\r\n");
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
      out.write("    <body>\r\n");
      out.write("        <header id=\"header\"><!--header-->\r\n");
      out.write("            <div class=\"header_top\"><!--header_top-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"contactinfo\">\r\n");
      out.write("                                <ul class=\"nav nav-pills\">\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"social-icons pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header_top-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"logo pull-left\">\r\n");
      out.write("                                <a href=\"home.jsp\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"btn-group pull-right\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("                                        USA\r\n");
      out.write("                                        <span class=\"caret\"></span>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"\">Canada</a></li>\r\n");
      out.write("                                        <li><a href=\"\">UK</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("                                        DOLLAR\r\n");
      out.write("                                        <span class=\"caret\"></span>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"\">Canadian Dollar</a></li>\r\n");
      out.write("                                        <li><a href=\"\">Pound</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <div class=\"shop-menu pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-user\"></i> Account</a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\r\n");
      out.write("                                    <li><a href=\"checkout.jsp\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\r\n");
      out.write("                                    <li><a href=\"cart.jsp\" class=\"active\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\r\n");
      out.write("                                    <li><a href=\"login.jsp\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
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
      out.write("                                    <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                            <li><a href=\"shop.jsp\">Products</a></li>\r\n");
      out.write("                                            <li><a href=\"product-details.jsp\">Product Details</a></li> \r\n");
      out.write("                                            <li><a href=\"checkout.jsp\">Checkout</a></li> \r\n");
      out.write("                                            <li><a href=\"cart.jsp\" class=\"active\">Cart</a></li> \r\n");
      out.write("                                            <li><a href=\"login.jsp\">Login</a></li> \r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li> \r\n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                            <li><a href=\"blog.jsp\">Blog List</a></li>\r\n");
      out.write("                                            <li><a href=\"blog-single.jsp\">Blog Single</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li> \r\n");
      out.write("                                    <li><a href=\"404.jsp\">404</a></li>\r\n");
      out.write("                                    <li><a href=\"contact-us.jsp\">Contact</a></li>\r\n");
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
      out.write("        </header><!--/header-->\r\n");
      out.write("        ");

            HashMap<Integer, Integer> map = (HashMap) request.getSession().getAttribute("hashMapItemCart");
            DAO.ItemDAO idao = new ItemDAO();
            ArrayList<Entities.CartInfo> listitem = new ArrayList<>();
            try {

                if (request.getSession().getAttribute("uMail") == null
                        || map == null || map.isEmpty()) {
                    String fail = "wrong";
                    request.getSession().setAttribute("cartFail", fail);
                    request.getRequestDispatcher("home.jsp").forward(request, response);
                }
                if (request.getParameter("delIdHash") != null) {
                    map.remove(Integer.parseInt(request.getParameter("delIdHash")));
                }
                for (Integer i : map.keySet()) {
                    Itemall iall = idao.getNameOfItemById(i);
                    int quantity = map.get(i);
                    int total = iall.getOutputPrice() * quantity;
                    listitem.add(new CartInfo(i,iall.getiPic(), iall.getiName(), iall.getOutputPrice(), quantity,total ));
                }

            } catch (Exception e) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You must login before buy something! Or You don't have any cart');");
                out.println("location='home.jsp';");
                out.println("</script>");
            }
        
      out.write("\r\n");
      out.write("        <section id=\"cart_items\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"breadcrumbs\">\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"active\">Shopping Cart</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-responsive cart_info\">\r\n");
      out.write("                    <table class=\"table table-condensed\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"cart_menu\">\r\n");
      out.write("                                <td class=\"image\">Item</td>\r\n");
      out.write("                                <td class=\"description\"></td>\r\n");
      out.write("                                <td class=\"price\">Price</td>\r\n");
      out.write("                                <td class=\"quantity\">Quantity</td>\r\n");
      out.write("                                <td class=\"total\">Total</td>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("items");
      _jspx_th_c_forEach_0.setItems( listitem);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <tr>\r\n");
            out.write("                                    <td class=\"cart_product\">\r\n");
            out.write("                                        <a href=\"\"><img src=\"douong/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getImg()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" height=\"110px\" width=\"110px\"></a>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                    <td class=\"cart_description\">\r\n");
            out.write("                                        <h4><a href=\"\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></h4>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                    <td class=\"cart_price\">\r\n");
            out.write("                                        <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                    <td class=\"cart_quantity\">\r\n");
            out.write("                                        <div class=\"cart_quantity_button\">\r\n");
            out.write("                                            <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                                        </div>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                    <td class=\"cart_total\">\r\n");
            out.write("                                        <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                    <td class=\"cart_delete\">\r\n");
            out.write("                                        <a class=\"cart_quantity_delete\" href=\"?delIdHash=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${items.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fa fa-times\"></i></a>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                </tr>\r\n");
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
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section> <!--/#cart_items-->\r\n");
      out.write("\r\n");
      out.write("        <section id=\"do_action\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"heading\">\r\n");
      out.write("                    <h3>What would you like to do next?</h3>\r\n");
      out.write("                    <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        <div class=\"chose_area\">\r\n");
      out.write("                            <ul class=\"user_option\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <input type=\"checkbox\">\r\n");
      out.write("                                    <label>Use Coupon Code</label>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <input type=\"checkbox\">\r\n");
      out.write("                                    <label>Use Gift Voucher</label>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <input type=\"checkbox\">\r\n");
      out.write("                                    <label>Estimate Shipping & Taxes</label>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"user_info\">\r\n");
      out.write("                                <li class=\"single_field\">\r\n");
      out.write("                                    <label>Country:</label>\r\n");
      out.write("                                    <select>\r\n");
      out.write("                                        <option>United States</option>\r\n");
      out.write("                                        <option>Bangladesh</option>\r\n");
      out.write("                                        <option>UK</option>\r\n");
      out.write("                                        <option>India</option>\r\n");
      out.write("                                        <option>Pakistan</option>\r\n");
      out.write("                                        <option>Ucrane</option>\r\n");
      out.write("                                        <option>Canada</option>\r\n");
      out.write("                                        <option>Dubai</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"single_field\">\r\n");
      out.write("                                    <label>Region / State:</label>\r\n");
      out.write("                                    <select>\r\n");
      out.write("                                        <option>Select</option>\r\n");
      out.write("                                        <option>Dhaka</option>\r\n");
      out.write("                                        <option>London</option>\r\n");
      out.write("                                        <option>Dillih</option>\r\n");
      out.write("                                        <option>Lahore</option>\r\n");
      out.write("                                        <option>Alaska</option>\r\n");
      out.write("                                        <option>Canada</option>\r\n");
      out.write("                                        <option>Dubai</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"single_field zip-field\">\r\n");
      out.write("                                    <label>Zip Code:</label>\r\n");
      out.write("                                    <input type=\"text\">\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"btn btn-default update\" href=\"\">Get Quotes</a>\r\n");
      out.write("                            <a class=\"btn btn-default check_out\" href=\"\">Continue</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        <div class=\"total_area\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>Cart Sub Total <span>$59</span></li>\r\n");
      out.write("                                <li>Eco Tax <span>$2</span></li>\r\n");
      out.write("                                <li>Shipping Cost <span>Free</span></li>\r\n");
      out.write("                                <li>Total <span>$61</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"btn btn-default update\" href=\"\">Update</a>\r\n");
      out.write("                            <a class=\"btn btn-default check_out\" href=\"\">Check Out</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section><!--/#do_action-->\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("            <div class=\"footer-widget\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"single-widget\">\r\n");
      out.write("                                <h2>Service</h2>\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                    <li><a href=\"\">Online Help</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Contact Us</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Order Status</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Change Location</a></li>\r\n");
      out.write("                                    <li><a href=\"\">FAQ’s</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"single-widget\">\r\n");
      out.write("                                <h2>Quock Shop</h2>\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                    <li><a href=\"\">T-Shirt</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Mens</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Womens</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Gift Cards</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Shoes</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"single-widget\">\r\n");
      out.write("                                <h2>Policies</h2>\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                    <li><a href=\"\">Terms of Use</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Privecy Policy</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Refund Policy</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Billing System</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Ticket System</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"single-widget\">\r\n");
      out.write("                                <h2>About Shopper</h2>\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                    <li><a href=\"\">Company Information</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Careers</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Store Location</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Affillate Program</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Copyright</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-sm-offset-1\">\r\n");
      out.write("                            <div class=\"single-widget\">\r\n");
      out.write("                                <h2>About Shopper</h2>\r\n");
      out.write("                                <form action=\"#\" class=\"searchform\">\r\n");
      out.write("                                    <input type=\"text\" placeholder=\"Your email address\" />\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\r\n");
      out.write("                                    <p>Get the most recent updates from <br />our site and be updated your self...</p>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
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
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
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
