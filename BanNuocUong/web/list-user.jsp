<%-- 
    Document   : list-user
    Created on : Jul 26, 2020, 6:24:08 PM
    Author     : Asus
--%>

<%@page import="DAO.AdminDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIST USERS | ADMIN</title>
    </head>
    <body>
        <%@include file="admin-header.jsp" %>
        <%            UserDAO uDAO = new UserDAO();
            ArrayList<String> listMail = new ArrayList<String>();
            
            if(request.getParameter("del")!= null){
                new AdminDAO().deleteUser(request.getParameter("del"));
            }
            listMail = uDAO.getAll();
        %>
        <div class="span9">
            <div class="content">
                <div class="module">
                    <div class="module-head">
                        <h3>
                            All Members
                        </h3>
                    </div> 
                    <div class="module-body">
                        <c:forEach var="user" items="<%=listMail%>">
                            <div class="row-fluid">
                                <div class="span6">
                                    <div class="media user">
                                        <a class="media-avatar pull-left" href="#">
                                            <img src="images/avatar.png">
                                        </a>
                                        <div class="media-body">
                                            <h3 class="media-title">
                                                ${user}
                                            </h3>
                                            <p>
                                                <small class="muted"> </small></p>
                                            <div class="media-option btn-group shaded-icon">
                                                <a class="btn btn-small" href="?del=${user}">
                                                    <i class="icon-trash"></i>
                                                </a> 
                                            </div>
                                        </div>
                                    </div>
                                </div> 
                            </div>
                        </c:forEach> 
                    </div>
                </div>
            </div>
            <!--/.content-->
        </div>
    </body>
</html>
