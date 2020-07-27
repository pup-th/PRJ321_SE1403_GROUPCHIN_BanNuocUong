<%-- 
    Document   : admin
    Created on : Jul 26, 2020, 6:23:54 PM
    Author     : Asus
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <body>
        <%@include file="admin-header.jsp" %>
        <%            int numberUser = new UserDAO().numberUsers();
            int numberOrder = new UserDAO().numberOrders();
            int numberMoney = new UserDAO().numberMoney();
            
        %>
        <!--/.span3-->
        <div class="span9">
            <div class="content">
                <div class="btn-controls">
                    <div class="btn-box-row row-fluid">
                        <a href="#" class="btn-box big span4"><i class=" icon-random"></i><b><%=numberOrder%></b>
                            <p class="text-muted">
                                Orders</p>
                        </a><a href="#" class="btn-box big span4"><i class="icon-user"></i><b><%=numberUser%></b>
                            <p class="text-muted">
                                Users</p>
                        </a><a href="#" class="btn-box big span4"><i class="icon-money"></i><b><%=numberMoney%> VND</b>
                            <p class="text-muted">
                                Money</p>
                        </a>
                    </div>
                    <div class="btn-box-row row-fluid">
                        <a href="table.jsp" class="btn-box big span4"><i class=" icon-envelope"></i><b> </b>
                            <p class="text-muted">
                                Report</p>
                        </a><a href="list-user.jsp" class="btn-box big span4"><i class="icon-group"></i><b> </b>
                            <p class="text-muted">
                                 List Users</p>
                        </a><a href="form.jsp" class="btn-box big span4"><i class="icon-exchange"></i><b> </b>
                            <p class="text-muted">
                                insert</p>
                        </a>
                    </div> 
                </div>  
                <!--/.module-->
            </div>
            <!--/.content-->
        </div>
        <!--/.span9--> 

    </body>
</html>