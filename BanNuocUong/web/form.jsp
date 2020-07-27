<%-- 
    Document   : form
    Created on : Jul 26, 2020, 6:23:49 PM
    Author     : Asus
--%>

<%@page import="java.sql.Date"%>
<%@page import="Entities.Itemall"%>
<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600
              ' rel='stylesheet'>
    </head>
    <body>
        <%@include file="admin-header.jsp" %>
        <%            ItemDAO iDAO = new ItemDAO();
            String name = "";
            String taste = "";
            String pic = "";
            int price = 0;
            int quan = 0;
            int id = 0;
            Date exDate = null;
            if (request.getParameter("update") != null) {
                Itemall itemAll = iDAO.getNameOfItemById(Integer.parseInt(request.getParameter("update")));
                id = itemAll.getiId();
                name = itemAll.getiName();
                price = itemAll.getpId();
                quan = itemAll.getQuantity();
                taste = itemAll.getTaste();
                exDate = itemAll.getExpiryDate();
                pic = itemAll.getiPic();
            }
        %>
        <div class="span9">
            <div class="content">

                <div class="module">
                    <div class="module-head">
                        <h3>Insert new Item</h3>
                    </div>
                    <div class="module-body">  
                        <form class="form-horizontal row-fluid" action="AdminController" method="post"> 
                            <div class="control-group">
                                <label class="control-label" for="basicinput">Id</label>
                                <div class="controls">
                                    <input type="text" name="txtId" value="<%=id%>" id="basicinput" placeholder="Type something here..." class="span8" disabled="">
                                    <span class="help-inline"></span>
                                </div>
                            </div>  
                            <div class="control-group">
                                <label class="control-label" for="basicinput">Name of Item</label>
                                <div class="controls">
                                    <input type="text" name="txtName" value="<%=name%>" id="basicinput" placeholder="Type something here..." class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div>  

                            <div class="control-group">
                                <label class="control-label" for="basicinput">Price</label>
                                <div class="controls">
                                    <div class="input-append">
                                        <input type="text" name="txtPrice" value="<%=price%>"  placeholder="5.000" required pattern="\d+" class="span8"><span class="add-on">$</span>
                                    </div>
                                </div>
                            </div>

                            <div class="control-group">
                                <label class="control-label" for="basicinput">Quantity</label>
                                <div class="controls">
                                    <input type="text"  name="txtQuantity" value="<%=quan%>" id="basicinput" pattern="\d+" placeholder="Type something here..." class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="basicinput">Taste</label>
                                <div class="controls">
                                    <input type="text"  name="txtTaste" value="<%=taste%>" id="basicinput" placeholder="Type something here..." class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div> 
                            <div class="control-group">
                                <label class="control-label" for="basicinput">Expiry Date</label>
                                <div class="controls">
                                    <input type="date"  name="txtDate" value="<%=exDate%>" id="basicinput" placeholder="Type something here..." class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div> 

                            <div class="control-group">
                                <label class="control-label" for="basicinput">Picture Name</label>
                                <div class="controls">
                                    <input type="text" name="txtPic"  value="<%=pic%>" id="basicinput" placeholder="Type something here..." class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div> 
                            <div class="control-group">
                                <div class="controls">
                                    <button type="submit" class="btn" name="btnInserItem">Insert</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>



            </div><!--/.content-->
        </div><!--/.span9-->
    </body>
</html> 