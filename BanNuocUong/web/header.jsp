<%-- 
    Document   : header
    Created on : Jul 26, 2020, 5:38:46 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
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

        %>
        <header id="header"><!--header--> 

            <div class="header-middle"><!--header-middle-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="logo pull-left">
                                <a href="home.jsp"><img src="images/home/logo.png" alt="" /></a>
                            </div>
                        </div> 
                    </div>
                </div>
            </div><!--/header-middle-->

            <div class="header-bottom"><!--header-bottom-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-9">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <div class="mainmenu pull-left">
                                <ul class="nav navbar-nav collapse navbar-collapse">
                                    <li><a href="home.jsp" class="active">HOME</a></li>
                                    <li><a href="cart.jsp">CART</a></li> 
                                    <li><a href="contact-us.jsp">CONTACT</a></li> 
                                        <c:choose>
                                            <c:when test="<%=email == null%>"> 
                                            <li class="dropdown"><a href="#">ACCOUNT<i class="fa fa-angle-down"></i></a>
                                                <ul role="menu" class="sub-menu">
                                                    <li><a href="login.jsp">Login</a></li>
                                                    <li><a href="register.jsp">Register</a></li>  
                                                </ul>
                                            </li>
                                        </c:when>
                                        <c:when test="<%=email != null%>">
                                            <li class="dropdown"><a href="#"><%=s%><i class="fa fa-angle-down"></i></a>
                                                <ul role="menu" class="sub-menu">
                                                    <li><a href="cart.jsp">Cart</a></li>
                                                    <li><a href="profile.jsp">Register</a></li>  
                                                    <li><a href="home.jsp?out=1">Sign out
                                                        <script>
                                                                function myFunction() {
                                                                    gapi.auth2.getAuthInstance().disconnect();
                                                                    location.reload();
                                                                }
                                                            </script>
                                                        </a>
                                                    </li>  
                                                </ul>
                                            </li>
                                        </c:when>
                                    </c:choose> 
                                    
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="search_box pull-right">
                                <input type="text" placeholder="Search"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-bottom-->
        </header>
    </body>
</html>
