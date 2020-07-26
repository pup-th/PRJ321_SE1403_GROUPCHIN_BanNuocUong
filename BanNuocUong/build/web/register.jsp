<%-- 
    Document   : register
    Created on : Jul 15, 2020, 8:59:13 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="login">
            <div class="login-top">
                <h2>Register</h2>
            </div>
            <div class="login-bottom">
                <h3>Fill out all information: </h3>
                <form action="UserController" method="POST">
                    <div class="user">
                        <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Form email: phuc@gmail.com" placeHolder="Email" name ="txtEmail" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = 'Email';
                                }"><i></i>
                    </div>
                    <div class="user-in">
                        <input type="password" pattern="\w{8,}" title="At least 8 characters" placeholder="Password" name="txtPass" required ><i></i>
                    </div>
                    <div class="user">
                        <input type="text" placeholder="Your name" name="txtName" required><i></i>
                    </div>
                    <div class="user">
                        <input type="text" pattern="\d{10}" title="Must be 10 digits" placeholder="Phone number" name="txtPhone" required><i></i>
                    </div>
                    <div class="user">
                        <input type="text" placeholder="Address" name="txtAddress" required><i></i>
                    </div>
                    <div class="forgot">
                        <div class="forgot-register">
                            <p>Already have an account?<a href="login.jsp"> Login Now</a></p>
                        </div> 
                    </div>
                    <div class="keepme">
                        <div class="keep-loginbutton">
                            <input type="submit" value="Register" />
                        </div>
                        <div class="clear"> </div>
                    </div>
                </form>
            </div>
        </div> 
        <%@include file="footer.jsp" %>
    </body>
</html>
