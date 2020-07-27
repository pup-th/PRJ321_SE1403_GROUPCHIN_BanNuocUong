/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class PasswordController extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            String checkopass = "";
//            String md5pass = "";
//            if (request.getParameter("btnSavepass") != null) {
//                String opass = request.getParameter("opass");
//                String npass = request.getParameter("npass");
//                String cpass = request.getParameter("cpass");
//                String mail = request.getParameter("omail");
//                md5pass = request.getParameter("checkopass");
//                MessageDigest md = MessageDigest.getInstance("MD5");
//                byte[] hashInBytes = md.digest(opass.getBytes(StandardCharsets.UTF_8));
//                StringBuilder sb = new StringBuilder();
//                for (byte b : hashInBytes) {
//                    sb.append(String.format("%02x", b));
//                }
//                checkopass = sb.toString();
//                if (npass.equals(cpass)
////                        && md5pass.equals(checkopass)
//                        ) {
//                    DAO.UserDAO dao = new DAO.UserDAO();
//                    dao.updatePassword(mail, npass);
//                    request.getRequestDispatcher("profile1.jsp").forward(request, response);
//                } else {
//                    request.setAttribute("changeFail", "Wrong password or Wrong confirm!");
//                }
//            } 
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        
            String checkopass = "";
            String md5pass = "";
            if (request.getParameter("btnSavepass") != null) {
                try {
                    String opass = request.getParameter("opass");
                    String npass = request.getParameter("npass");
                    String cpass = request.getParameter("cpass");
                    String mail = request.getParameter("omail");
                    md5pass = request.getParameter("checkopass");
                    
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    byte[] hashInBytes = md.digest(opass.getBytes(StandardCharsets.UTF_8));
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hashInBytes) {
                        sb.append(String.format("%02x", b));
                    }
                    
                    checkopass = sb.toString();
                    if (npass.equals(cpass)
//                        && md5pass.equals(checkopass)
                            ) {
                        DAO.UserDAO dao = new DAO.UserDAO();
                        dao.updatePassword(mail, npass);
                        request.getRequestDispatcher("home.jsp").forward(request, response);
                    } else {
                        request.setAttribute("changeFail", "Wrong password or Wrong confirm!");
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(PasswordController.class.getName()).log(Level.SEVERE, null, ex);
                }
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
