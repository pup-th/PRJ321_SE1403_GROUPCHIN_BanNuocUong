<%-- 
    Document   : cart
    Created on : Jul 25, 2020, 10:48:52 PM
    Author     : Asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Entities.CartInfo"%>
<%@page import="Entities.Itemall"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ItemDAO"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>CART | GROUPCHIN</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head><!--/head-->

    <body>
        <%@include file="header.jsp" %>
        <%
            HashMap<Integer, Integer> map = (HashMap) request.getSession().getAttribute("hashMapItemCart");
            DAO.ItemDAO idao = new ItemDAO();
            ArrayList<Entities.CartInfo> listitem = new ArrayList<>();
            int totalall = 0;
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
                    totalall += total;
                }

            } catch (Exception e) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You must login before buy something! Or You don't have any cart');");
                out.println("location='home.jsp';");
                out.println("</script>");
            }
        %>
        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="home.jsp">Home</a></li>
                        <li class="active">Shopping Cart</li>
                    </ol>
                </div>
                <div class="table-responsive cart_info">
                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu">
                                <td class="image">Item</td>
                                <td class="description"></td>
                                <td class="price">Price</td>
                                <td class="quantity">Quantity</td>
                                <td class="total">Total</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="items" items="<%= listitem%>">
                                <tr>
                                    <td class="cart_product">
                                        <a href=""><img src="douong/${items.getImg()}" alt="" height="110px" width="110px"></a>
                                    </td>
                                    <td class="cart_description">
                                        <h4><a href="">${items.getName()}</a></h4>
                                    </td>
                                    <td class="cart_price">
                                        <p>${items.getPrice()}</p>
                                    </td>
                                    <td class="cart_quantity">
                                        <div class="cart_quantity_button">
                                            <p>${items.getQuantity()}</p>
                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p>${items.getTotal()}</p>
                                    </td>
                                    <td class="cart_delete">
                                        <a class="cart_quantity_delete" href="?delIdHash=${items.getId()}"><i class="fa fa-times"></i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->

        <section id="do_action">
            <div class="container">
                <div class="heading">
                    <h3>Do you want to pay your cart?</h3>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="total_area">
                            <h3 align="center">Bill</h3>
                            <ul>
                                <li>Cart Total <span><%= totalall %></span></li>
                                <li>Shipping Cost <span>Free</span></li>
                                <li>Total <span><%= totalall %></span></li>
                            </ul>
                            <form action="BuyController" method="post">
                                <button class="btn btn-default update" name="btnBuyForBill">Buy</button>                                
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#do_action-->

        <%@include file="footer.jsp" %>



        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>