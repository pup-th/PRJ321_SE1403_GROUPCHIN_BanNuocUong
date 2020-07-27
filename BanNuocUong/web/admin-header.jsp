<%-- 
    Document   : admin-header
    Created on : Jul 26, 2020, 6:24:27 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Edmin</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600
'
            rel='stylesheet'>
    </head>
    <style>
        
    </style>
    <body>
        
        <%
            String admin = "";
            if(request.getSession().getAttribute("aMail") != null){
                admin = request.getSession().getAttribute("aMail").toString() ;
               admin = admin.substring(0, admin.indexOf("@"));
            }
        %>

        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                        <i class="icon-reorder shaded"></i>
                    </a>

                    <a class="brand" href="index.jsp">
                        <%=admin%>
                    </a>

                    <div class="nav-collapse collapse navbar-inverse-collapse">  
                        <ul class="nav pull-right">  
                            <li><a href="contact-us.jsp"> About Us </a></li>
                            <li class="nav-user dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="images/avatar.png" class="nav-avatar" />
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu"> 
                                    <li><p><%=admin%></p></li>
                                    <hr>
                                    <li><a href="home.jsp">Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div><!-- /.nav-collapse -->
                </div>
            </div><!-- /navbar-inner -->
        </div><!-- /navbar --> 
            
        
        <div class="span3">
            <div class="sidebar">
                <ul class="widget widget-menu unstyled">
                    <li class="active"><a href="admin.jsp"><i class="menu-icon icon-dashboard"></i>Dashboard
                        </a></li> 
                </ul>
                <!--/.widget-nav-->


                <ul class="widget widget-menu unstyled"> 
                    <li><a href="form.jsp"><i class="menu-icon icon-paste"></i>Insert Item </a></li>
                    <li><a href="table.jsp"><i class="menu-icon icon-table"></i>Reports </a></li> 
                </ul>
                <!--/.widget-nav-->
                <ul class="widget widget-menu unstyled"> 
                    <li><a href="list-user.jsp"><i class="menu-icon icon-signout"></i>All Users </a></li>
                    <li><a href="home.jsp"><i class="menu-icon icon-signout"></i>Logout </a></li>
                </ul>
            </div>
        </div> 
        <script src="scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
        <script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="scripts/flot/jquery.flot.js" type="text/javascript"></script>
    </body>
</html>