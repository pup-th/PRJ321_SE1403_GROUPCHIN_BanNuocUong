<%-- 
    Document   : update
    Created on : Jul 28, 2020, 3:03:25 PM
    Author     : DELL
--%>

<%@page import="org.apache.catalina.User"%>
<%@page import="Entities.Users"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>INSERT | ADMIN</title>
        <link type="text/css" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="css/theme.css" rel="stylesheet">
        <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600
              ' rel='stylesheet'>
    </head>
    <body>
        <%@include file="admin-header.jsp" %>
        <%    String uMail = "";
            String uPassword = "";
            String uName = "";
            String uPhone = "";
            String uAddress = "";
            if (request.getParameter("update") != null) {
                UserDAO dAO  = new UserDAO();
                uMail = request.getParameter("update");
                Users u = dAO.getInfoUser(uMail);
                uPassword = u.getuPassword();
                uPhone = u.getuPhone();
                uName = u.getuName();
                uAddress = u.getuAddress();
            }

        %>

        <div class="span9">
            <div class="content">

                <div class="module">
                    <div class="module-head">
                        <h3>Update</h3>
                    </div>
                    <div class="module-body">  
                        <form class="form-horizontal row-fluid" action="AdminController" method="post"> 


                            <div class="control-group">
                                <label class="control-label" for="basicinput">Email</label>
                                <div class="controls">
                                    <input type="text" name="txtemail" value="<%=uMail%>" id="basicinput"  class="span8" disabled="">
                                    <span class="help-inline"></span>
                                </div>
                            </div>  

<!--                            <div class="control-group">
                                <label class="control-label" for="basicinput">PassWord</label>
                                <div class="controls">
                                    <input type="text" name="txtpassword" value="<%=uPassword%>" id="basicinput"  class="span8" disabled="">
                                    <span class="help-inline"></span>
                                </div>
                            </div>  -->

                            <div class="control-group">
                                <label class="control-label" for="basicinput">Name</label>
                                <div class="controls">
                                    <div class="input-append">
                                        <input type="text" name="txtname" value=" <%=uName%>"    class="span8"><span class="span8"></span>
                                    </div>
                                </div>
                            </div>

                            <div class="control-group">
                                <label class="control-label" for="basicinput">Phone</label>
                                <div class="controls">
                                    <input type="text"  name="txtphone" value=" <%=uPhone%>" id="basicinput" pattern="\[0-9]{10}" placeholder="Input quantity" class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="basicinput">Address</label>
                                <div class="controls">
                                    <input type="text"  name="txtaddress" pattern="\w+" value="<%=uAddress%> " id="basicinput" placeholder="Input taste" class="span8" required>
                                    <span class="help-inline"></span>
                                </div>
                            </div>                   
                            <div class="control-group">
                                <div class="controls">
                                    <input type="submit" class="btn" name="btnupdate" value="OK">
                                </div>
                            </div>
                        </form>
                    </div>
                </div> 
            </div><!--/.content-->
        </div>
    </body>
</html>
