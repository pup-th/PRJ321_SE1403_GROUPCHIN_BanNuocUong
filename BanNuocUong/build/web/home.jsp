<%-- 
    Document   : login
    Created on : Jul 25, 2020, 10:33:18 PM
    Author     : Asus
--%>

<%@page import="Entities.Itemall"%>
<%@page import="DAO.ItemDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>HOME | GROUPCHIN</title>
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
        <section id="slider"><!--slider-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="slider-carousel"   class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#slider-carousel" data-slide-to="1"></li>
                                <li data-target="#slider-carousel" data-slide-to="2"></li>
                            </ol>

                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="col-sm-6">
                                        <h1><span>GROUP</span>CHIN</h1>
                                        <h2>Pepsi</h2>
                                        <p>Wellcome to our shop</p> 
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="douong/pepsi.jpg" class="girl img-responsive" alt="" />

                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>GROUP</span>CHIN</h1>
                                        <h2>Number 1</h2>
                                        <p>Wellcome to our shop</p> 
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="douong/number1.jpg" class="girl img-responsive" alt="" />
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>GROUP</span>CHIN</h1>
                                        <h2>Dr Thanh</h2>
                                        <p>Wellcome to our shop</p> 
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="douong/drthanh.jpg" class="girl img-responsive" alt="" />
                                    </div>
                                </div>

                            </div>

                            <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div>
        </section><!--/slider-->

        <section id="cart_items"> 
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Sort</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr--> 
                                <div class="panel panel-default">
                                    <%                                        String path = request.getContextPath() + "/home.jsp";
                                    %>
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="<%=path%>?az=1">A-Z</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="<%=path%>?za=1">Z-A</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="<%=path%>?low=1">Low -> High</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title"><a href="<%=path%>?high=1">High -> Low</a></h4>
                                    </div>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading" > 
                                        <div class="search_box pull-right">
                                            <form action="">
                                                <input type="text" name="txtSearch" placeholder="Search">
                                            </form>
                                        </div> 
                                    </div>
                                </div>
                            </div><!--/category-products--> 
                        </div>
                    </div>
                    <%                        DAO.ItemDAO it = new DAO.ItemDAO();
                        ArrayList<Entities.Items> listName = new ArrayList<>();
                        listName = (request.getParameter("low") != null) ? it.sortItemByPricelowhigh()
                                : (request.getParameter("high") != null) ? it.sortItemByPricehighlow()
                                : (request.getParameter("az") != null) ? it.sortItemByNameaz()
                                : (request.getParameter("za") != null) ? it.sortItemByNameza()
                                : (request.getParameter("txtSearch") != null) ? it.searchItemByString(request.getParameter("txtSearch"))
                                : it.getNameOfItems();
                    %>
                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">Items</h2>
                            <c:forEach var="item" items="<%=listName%>">
                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img src="douong/${item.getImg()}" alt="" height="275px" width="275px"  />
                                                <h2>${item.getPrice()}</h2>
                                                <p>${item.getName()}</p> 
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>${item.getPrice()}</h2>
                                                    <p>${item.getName()}</p>
                                                    <form action="CartController" method="post">
                                                        <input type="hidden" name="cartQuantity" value="1"/>
                                                        <input type="hidden" name="cartId" value="${item.getiId()}"/>
                                                        <button class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</button>
                                                        <a href="productdetail.jsp?proid=${item.getiId()}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Detail</a>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach> 
                        </div><!--features_items--> 
                    </div>
                </div>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
</html>