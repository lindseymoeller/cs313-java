/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lindsey
 */
@WebServlet(urlPatterns = {"/Details"})
public class Details extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Details</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Details at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        try {
           Class.forName("com.mysql.jdbc.Driver");
            
           String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
           String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
           String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
           String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
           Connection conn;
           
           if (host != null) {
           conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/week11", username, password);
        } else {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/week11", "root", "LurchP0w3rcat");
                }

// Connection conn = DriverManager.getConnection("jdbc:mysql://127.10.211.130:3306/week11", "adminvGHXXNN", "4WJLFgC9pttk");
            
           
           Statement stmt = conn.createStatement();
           String sql = "SELECT first, last, birthday FROM people WHERE id = " + request.getParameter("id");
           
           ResultSet rs = stmt.executeQuery(sql);
           rs.next();
               try (PrintWriter out = response.getWriter()) {
           /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
           out.println("<html>");
           out.println("<head>");
           out.println("<title>Person</title>");            
           out.println("</head>");
           out.println("<body>");
           out.println("<h1>" + rs.getString("first") + " " + rs.getString("last") + " " + rs.getString("birthday") + "</h1>");
           out.println("</body>");
           out.println("</html>");
            }
               
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
       }
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
        processRequest(request, response);
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
