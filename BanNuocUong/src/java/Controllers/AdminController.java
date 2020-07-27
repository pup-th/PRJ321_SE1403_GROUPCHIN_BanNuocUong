/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.ItemDAO;
import Entities.Itemall;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class AdminController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getParameter("btnInserItem") != null) {
                int price = Integer.parseInt(request.getParameter("txtPrice"));
                int quantity = Integer.parseInt(request.getParameter("txtQuantity"));
                String name = request.getParameter("txtName");
                String taste = request.getParameter("txtTaste");
                Date expiryDate = Date.valueOf(request.getParameter("txtexpiryDate"));
                Itemall itemall = new Itemall(name, price, quantity, taste, expiryDate, name);
                ItemDAO idao = new ItemDAO();
                idao.insert(itemall);
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            }
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
        ItemDAO idao = new ItemDAO();
        if (request.getParameter("btnInserItem") != null) {
            int price = Integer.parseInt(request.getParameter("txtPrice"));
            int quantity = Integer.parseInt(request.getParameter("txtQuantity"));
            String name = request.getParameter("txtName");
            String taste = request.getParameter("txtTaste");
            String pic = request.getParameter("txtPic");
            Date expiryDate = Date.valueOf(request.getParameter("txtDate"));
            if(request.getParameter("txtid")==null){
                Itemall itemall = new Itemall(name, price, quantity, taste, expiryDate, pic); 
                idao.insert(itemall);
            }else{
                int id = Integer.parseInt(request.getParameter("txtId"));
                idao.updateItem(id, name, price, quantity, taste, expiryDate, pic);
                request.getRequestDispatcher("table.jsp").forward(request, response);
            }
            request.getRequestDispatcher("admin.jsp").forward(request, response);
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
