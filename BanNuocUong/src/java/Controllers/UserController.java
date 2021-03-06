/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.AdminDAO;
import DAO.UserDAO;
import Entities.Users;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            
            UserDAO uDAO = new UserDAO();
            AdminDAO aDAO = new AdminDAO();
            String email = request.getParameter("txtEmail");
            String pass = request.getParameter("txtPass");
            String name = request.getParameter("txtName");
            String phone = request.getParameter("txtPhone");
            String address = request.getParameter("txtAddress");
            if (address == null) {
                if (email != null && pass != null) {
                    String user = uDAO.checkLogin(email, pass);
                    String admin = aDAO.checkLogin(email, pass);
                    if(!admin.isEmpty()){
                        request.getSession().setAttribute("aMail", admin);
                        request.getRequestDispatcher("admin.jsp").forward(request, response);
                    }else{
                        if (!user.isEmpty()) {
                            request.getSession().setAttribute("uMail", user);
                            request.getRequestDispatcher("home.jsp").forward(request, response); 
                        } else {
                            request.getSession().setAttribute("fail", "Wrong Username or Password");
                            request.getRequestDispatcher("login.jsp").forward(request, response); 
                        }
                    }
                } else {
                    String mail = request.getParameter("mail");
                    if (mail != null) {
                        String uMail = uDAO.checkLoginByGoogle(mail);
                        String aMail = aDAO.checkLoginByGoogle(mail);
                        if(!aMail.isEmpty()){
                            request.getSession().setAttribute("aMail", aMail);
                            request.getRequestDispatcher("admin.jsp").forward(request, response);
                        }else{
                            if (uMail.equals("")) {
                                request.getSession().setAttribute("fail", "You don't have account on our website, please Register");
                                request.getRequestDispatcher("login.jsp").forward(request, response); 
                            } else {
                                request.getSession().setAttribute("uMail", mail);
                                request.getRequestDispatcher("home.jsp").forward(request, response); 
                            }
                        }
                    }
                }
            } else {
                try {
                    Users u = new Users(email, pass, name, phone, address);
                    uDAO.register(u);
                    request.setAttribute("fillEmail", email);
                    request.setAttribute("fillPass", pass);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
            request.getRequestDispatcher("404-error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        try{
            UserDAO uDAO = new UserDAO();
            AdminDAO aDAO = new AdminDAO();
            String email = request.getParameter("txtEmail");
            String pass = request.getParameter("txtPass");
            String name = request.getParameter("txtName");
            String phone = request.getParameter("txtPhone");
            String address = request.getParameter("txtAddress");
            if (address == null) {
                if (email != null && pass != null) {
                    String user = uDAO.checkLogin(email, pass);
                    String admin = aDAO.checkLogin(email, pass);
                    if(!admin.isEmpty()){ 
                        request.getSession().setAttribute("aMail", admin);
                        request.getRequestDispatcher("admin.jsp").forward(request, response);
                    }else{
                        if (!user.isEmpty()) {
                            request.getSession().setAttribute("uMail", user);
                            request.getRequestDispatcher("home.jsp").forward(request, response); 
                        } else {
                            request.getSession().setAttribute("fail", "Wrong Username or Password");
                            request.getRequestDispatcher("login.jsp").forward(request, response); 
                        }
                    }
                } else {
                    String mail = "";
                    if (request.getParameter("mail") != null) {
                        mail = request.getParameter("mail");
                        String uMail = uDAO.checkLoginByGoogle(mail);
                        String aMail = aDAO.checkLoginByGoogle(mail);
                        if(!aMail.isEmpty()){
                            request.getSession().setAttribute("aMail", aMail);
                            request.getRequestDispatcher("admin.jsp").forward(request, response);
                        }else{
                            if (uMail.equals("")) {
                                request.getSession().setAttribute("fail", "You don't have account on our website, please Register");
                                request.getRequestDispatcher("login.jsp").forward(request, response); 
                            } else {
                                request.getSession().setAttribute("uMail", mail);
                                request.getRequestDispatcher("home.jsp").forward(request, response); 
                            }
                        }
                    }
                }
            } else {
                try {
                    Users u = new Users(email, pass, name, phone, address);
                    uDAO.register(u);
                    request.setAttribute("fillEmail", email);
                    request.setAttribute("fillPass", pass);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
            request.getRequestDispatcher("404-error.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
