<%-- 
    Document   : table
    Created on : Jul 26, 2020, 6:23:41 PM
    Author     : Asus
--%>

<%@page import="DAO.ItemDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>REPORTS | ADMIN</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600
' rel='stylesheet'>
    </head>
    <body> 
        <%@include file="admin-header.jsp" %>
        <div class="span9">
            <div class="content">

                <div class="module">
                    <div class="module-head">
                        <h3>Reports</h3>
                    </div>
                    <div class="module-body">
                        <p>
                            <strong>Top Drink</strong> 
                        </p>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>Name</th>
                                    <th>Quantity</th> 
                                </tr>
                            </thead>
                            <tbody>
                                <%                                    
                                    DAO.AdminDAO adminDao = new AdminDAO();
                                    ArrayList<Entities.Items> list = adminDao.reportListTopDrink();
                                    int count = 0;
                                %>
                            <c:forEach var="listuser" items="<%=list%>">
                                <tr>
                                    <td><%=++count%></td>
                                    <td>${listuser.getName()}</td>
                                    <td>${listuser.getQuantity()}</td>
                                </tr>
                            </c:forEach> 
                            </tbody>
                        </table> 
                        <br /> 
                        <br /> 
                        <p>
                            <strong>Top Buyer User</strong> 
                        </p>
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>Name</th> 
                                    <th>Order</th> 
                                    <th>Payment</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    ArrayList<Entities.OrderDetail> listUser = adminDao.reportListTopUser();
                                    count = 0;
                                %>
                            <c:forEach var="list" items="<%=listUser%>">
                                <tr>
                                    <td><%=++count%></td>
                                    <td>${list.getuMail()}</td>
                                    <td>${list.getoId()}</td>
                                    <td>${list.getPrice()}</td>
                                </tr>
                            </c:forEach> 
                            </tbody>
                        </table>
                            
                            <br>
                            <br>
                            <p>
                            <strong>List Item</strong> 
                        </p>
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>Name</th> 
                                    <th>Price</th> 
                                    <th>Quantity</th>
                                    <th>Taste</th>
                                    <th>Expiry Date</th>
                                    <th>Picture Name</th>
                                    <th>Delete</th>
                                    <th>Update</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    if(request.getParameter("delItem") != null){
                                        new ItemDAO().deleteItem(Integer.parseInt(request.getParameter("delItem")));
                                    }
                                    ArrayList<Entities.Itemall> listItem = new ItemDAO().getAll();
                                    count=0;
                                %>
                            <c:forEach var="i" items="<%=listItem%>">
                                <tr>
                                    <td><%=++count%></td>
                                    <td>${i.getiName()}</td>
                                    <td>${i.getpId()}</td>
                                    <td>${i.getQuantity()}</td>
                                    <td>${i.getTaste()}</td>
                                    <td>${i.getExpiryDate()}</td>
                                    <td>${i.getiPic()}</td>
                                    <td><a href="?delItem=${i.getiId()}">Delete</a></td>
                                    <td><a href="form.jsp?update=${i.getiId()}">Update</a></td>
                                </tr>
                            </c:forEach> 
                            </tbody>
                        </table>
                    </div>
                </div>  
            </div><!--/.content-->
        </div><!--/.span9-->  
    </body>
</html> 
