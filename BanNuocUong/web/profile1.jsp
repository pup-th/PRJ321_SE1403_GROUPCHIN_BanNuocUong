<%@page import="java.text.SimpleDateFormat"%>
<%@page import="DAO.UserDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE HTML>
<html> 
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
        <script>
            $(document).ready(function () {


                var readURL = function (input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            $('.avatar').attr('src', e.target.result);
                        }

                        reader.readAsDataURL(input.files[0]);
                    }
                }


                $(".file-upload").on('change', function () {
                    readURL(this);
                });
            });
        </script>
        <style>
            th, td {
                padding: 15px;
                text-align: left;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%                        DAO.UserDAO dao = new DAO.UserDAO();
            String user = request.getSession().getAttribute("uMail").toString();
            Entities.Users u = dao.getInfoUser(user);
            String name = u.getuName();
            String mail = u.getuMail();
            String phone = u.getuPhone();
            String address = u.getuAddress();
        %>
        <hr>
        <div class="container bootstrap snippet">
            <div class="row"> 
            </div>
            <div class="row">
                <div class="col-sm-3"><!--left col-->


                    <div class="text-center">
                        <img src="images/avatar.png" class="avatar img-circle img-thumbnail" alt="avatar">
                    </div></hr><br>   

                </div><!--/col-3-->
                <div class="col-sm-9">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#home">Profile</a></li>
                        <li><a data-toggle="tab" href="#messages">Change password</a></li>
                        <li><a data-toggle="tab" href="#settings">Purchase history</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="home">
                            <hr>
                            <form class="form" action="ChangeController" method="post" id="registrationForm">
                                <div class="form-group">
                                    <input type="hidden" name="omail" value="<%= mail%>"/>
                                    <div class="col-xs-6">
                                        <label for="first_name"><h4>Full Name</h4></label>
                                        <input type="text" class="form-control" name="nname" id="first_name" placeholder="full name" title="enter your full name if any." value="<%=name%>">
                                    </div>
                                </div>
                                <div class="form-group">

                                    <div class="col-xs-6">
                                        <label for="last_name"><h4>Email</h4></label>
                                        <input type="text" class="form-control" name="nmail" id="last_name" placeholder="email" title="enter your email if any." value="<%= mail%>">
                                    </div>
                                </div>

                                <div class="form-group">

                                    <div class="col-xs-6">
                                        <label for="phone"><h4>Phone</h4></label>
                                        <input type="text" class="form-control" name="nphone" id="phone" placeholder="enter phone" title="enter your phone number if any." value="<%= phone%>">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-xs-6">
                                        <label for="mobile"><h4>Address</h4></label>
                                        <input type="text" class="form-control" name="naddress" id="mobile" placeholder="enter mobile number" title="enter your mobile number if any." value="<%= address%>">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <br>
                                        <button class="btn btn-lg btn-success" type="submit" name="btnSaveinfo"><i class="glyphicon glyphicon-ok-sign"></i>Save</button>
                                    </div>
                                </div>
                            </form>

                            <hr>

                        </div><!--/tab-pane-->
                        <div class="tab-pane" id="messages">

                            <h2></h2>
                            <%
                                String oldpass = dao.getPassword(mail);
                                String fail = "";
                                if (request.getAttribute("changeFail") != null) {
                                    fail = request.getAttribute("changeFail").toString();
                                }
                            %>
                            <hr>
                            <form class="form" action="PasswordController" method="post" id="registrationForm">
                                <div class="form-group">

                                    <div class="col-xs-6">

                                        <input type="hidden" name="checkopass" value="<%= oldpass%>"/>
                                        <input type="hidden" name="omail" value="<%= mail%>"/>
                                        <label for="first_name"><h4>Old password</h4></label>
                                        <input type="text" pattern="\w{6,}" class="form-control" name="opass" id="first_name" placeholder="old password" title="enter your old password if any.">

                                        <label for="last_name"><h4>New password</h4></label>
                                        <input type="text"  pattern="\w{6,}" class="form-control" name="npass" id="last_name" placeholder="new password" title="enter your new password if any.">

                                        <label for="phone"><h4>Confirm password</h4></label>
                                        <input type="text"  pattern="\w{6,}" class="form-control" name="cpass" id="phone" placeholder="confirm password" title="enter your confirm password if any.">
                                        <c:if test="<%=fail.isEmpty()%>">
                                            <p style="color: red"><%=fail%></p>
                                        </c:if>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <br>
                                        <button class="btn btn-lg btn-success" type="submit" name="btnSavepass"><i class="glyphicon glyphicon-ok-sign"></i>Save</button>
                                    </div>
                                </div>
                            </form>

                        </div><!--/tab-pane-->
                        <%
//                            ArrayList<Entities.OrderDetail> listorder = new ArrayList<>();
//                            DAO.UserDAO userdao = new UserDAO();
//                            listorder = userdao.getHisPurchase(mail);

                        %>
                        <div class="tab-pane" id="settings">
                            <table>
                                <%                                    DAO.UserDAO userdao = new UserDAO();
                                    ArrayList<Entities.OrderDetail> listorder = userdao.getHisPurchase(mail);
                                    int count = 1;
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
                                    out.println("<tr align='center'>");
                                    out.println("<th>No.</th>");
                                    out.println("<th>Item Name</th>");
                                    out.println("<th>Quantity</th>");
                                    out.println("<th>Price</th>");
                                    out.println("<th>Order Date</th>");
                                    out.println("<th>Total</th>");
                                    out.println("</tr>");
                                    for (Entities.OrderDetail elem : listorder) {
                                        int price = userdao.getPriceItemById(elem.getiId());
                                        out.println("<tr align='center'>");
                                        out.println("<td>" + count++ + "</td>");
                                        out.println("<td>" + userdao.getNameItemById(elem.getiId()) + "</td>");
                                        out.println("<td>" + elem.getQuantity() + "</td>");
                                        out.println("<td>" + price + "</td>");
                                        out.println("<td>" + sdf.format(elem.getOrderDate()) + "</td>");
                                        out.println("<td>" + (price * elem.getQuantity()) + "</td>");
                                        out.println("<tr>");
                                    }
                                %>
                            </table>
                        </div>
                    </div><!--/tab-pane-->
                </div><!--/tab-content-->

            </div><!--/col-9-->
        </div><!--/row-->
        <%@include file="footer.jsp" %>
    </body>
</html>