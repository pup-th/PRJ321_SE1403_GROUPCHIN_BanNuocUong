<%-- 
    Document   : productdetail
    Created on : Jul 26, 2020, 9:54:48 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.Date"%>
<%@page import="Entities.Itemall"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>PRODUCT DETAIL | GROUPCHIN</title>
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
        <script>//<![CDATA[
            $('input.input-qty').each(function () {
                var $this = $(this),
                        qty = $this.parent().find('.is-form'),
                        min = Number($this.attr('min')),
                        max = ${param.quantity}
                ,
                        if (min == 0) {
                    var d = 0
                } else
                    d = min
                $(qty).on('click', function () {
                    if ($(this).hasClass('minus')) {
                        if (d > min)
                            d += -1
                    } else if ($(this).hasClass('plus')) {
                        var x = Number($this.val()) + 1
                        if (x <= max)
                            d += 1
                    }
                    $this.attr('value', d).val(d)
                })
            })
        </script>
        <style>
            .priceitem{
                font-family: 'Roboto', sans-serif;
                font-size: 30px;
                font-weight: 700;
                color: #FE980F;
            }
        </style>
    </head><!--/head-->

    <body>
        <%@include file="header.jsp" %>

        <%
            DAO.ItemDAO itemdao = new ItemDAO();
            int id = -1;
            try {
                id = Integer.parseInt(request.getParameter("proid"));    
            } catch (Exception e) {
                request.getRequestDispatcher("404-error.jsp").forward(request, response);
            } 
            Itemall iall = itemdao.getNameOfItemById(id);
            String img = iall.getiPic();
            String size = iall.getSize();
            int price = iall.getOutputPrice();
            int quantity = iall.getQuantity();
            int status = iall.getStatus();
            String taste = iall.getTaste();
            Date expirydate = iall.getExpiryDate();
            String name = iall.getiName();
        %>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                    </div>

                    <div class="col-sm-9 padding-right">
                        <div class="product-details"><!--product-details-->
                            <div class="col-sm-5">
                                <div class="view-product">
                                    <img src="douong/<%= img%>" alt="" />
                                    <!--<h3>ZOOM</h3>-->
                                </div>
                            </div>
                            <div class="col-sm-7">
                                <div class="product-information"><!--/product-information-->
                                    <img src="images/product-details/new.jpg" class="newarrival" alt="" />
                                    <h2><%= name%></h2>
                                    <img src="images/product-details/rating.png" alt="" /></br>
                                    <span class="priceitem">đ <%= price%></span>
                                    <form action="CartController" method="post">
                                        <label>Quantity:</label>
                                        <input type="number" name="cartQuantity" value="1" min="1" max="<%= quantity%>"/>
                                        <i class="fa fa-shopping-cart"></i><input type="submit" value="Add to cart" name="btnAddcart" class="btn btn-fefault cart"/>
                                        <input type="hidden" value="<%= id %>" name="cartId"/>
                                    </form>
                                    <p><b>Expiry Date:</b> <%= expirydate%></p>
                                    <p><b>Taste:</b> <%= taste%></p>
                                    <p><b>Size:</b> <%= size%></p>
                                    <p><b>Status:</b>
                                        <%
                                            if (status == 1) {
                                                out.print("Stocking");
                                            } else {
                                                out.print("Out of stock");
                                            }
                                        %>
                                    </p>
                                    <a href=""><img src="images/product-details/share.png" class="share img-responsive"  alt="" /></a>
                                </div><!--/product-information-->
                            </div>
                        </div><!--/product-details-->

                    </div>
                </div>
            </div>
        </section>

                                        <%@include file="footer.jsp" %>


        <script src="js/jquery.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>