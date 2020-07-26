<%-- 
    Document   : ndex
    Created on : Jul 25, 2020, 10:32:41 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Login | E-Shopper</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png"> 
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="559443797881-3h3h7b9hnls91oeoft4gei5vh9ng3odl.apps.googleusercontent.com">
        <script type="text/javascript">
            function onSignIn(googleUser) {
                gapi.auth2.getAuthInstance().disconnect();
                location.reload();
                var profile = googleUser.getBasicProfile();
                var email = profile.getEmail();
                window.location = "UserController?mail=" + email;
            }
        </script>
    </head><!--/head-->

    <body>
        <%
            String fail = "";
            String fillEmail = "";
            String fillPass = "";
            if (request.getAttribute("fail") != null) {
                fail = request.getAttribute("fail").toString();
            }
            if (request.getAttribute("fillEmail") != null
                    && request.getAttribute("fillPass") != null) {
                fillEmail = request.getAttribute("fillEmail").toString();
                fillPass = request.getAttribute("fillPass").toString();
            }
        %>

        <%@include file="header.jsp" %>
        <div class="login">
            <div class="login-top">
                <h2>LOG IN</h2>
            </div>
            <div class="login-bottom">
                <h3>Log in with a social network:</h3>
                <center><a class="g-signin2" data-onsuccess="onSignIn" center></a></center>
                <h3>Log in With registered details:</h3>
                <form action="UserController" method="POST">
                    <div class="user">
                        <input type="text" placeHolder="Email" name ="txtEmail" value="<%=fillEmail%>"  onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Email';
                                }">
                        <i></i>
                    </div>
                    <div class="user-in">
                        <input type="password"  name="txtPass" placeholder="Password" value="<%=fillPass%>" required ><i></i>
                    </div>
                    <c:if test="<%=fail != null%>">
                        <div id="fail" style="text-align: center; color: red; font-family: sans-serif;"><%=fail%></div>
                    </c:if>
                    <div class="keepme">
                        <div class="keep-loginbutton">
                            <input type="submit" value="Log in" /> 
                        </div>
                        <div class="clear"> </div>
                    </div>
                </form>
                <div class="forgot">
                    <div class="forgot-register">
                        <p>Don't have an account? <a href="register.jsp">Register Now</a></p>
                    </div> 
                </div>
            </div>
        </div> 
        <%@include file="footer.jsp" %>
    </body>
</html>