/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;

import java.io.IOException;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Lindsey
 */
@WebServlet(urlPatterns = {"/SendEmail"})
public class SendEmail extends HttpServlet {

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
            out.println("<title>Email sent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Congratulations!</h1>");
            out.println("<p><p>You just sent your first HappE-mail!\n" +
"            To send another email, click <a href=\"form.jsp\">here</a>!</p></p>");
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
        request.getRequestDispatcher("/success.jsp").forward(request, response);
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
        request.getRequestDispatcher("/success.jsp").forward(request, response);
        
        String to = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        
        String from = "moellerlinds@gmail.com";
        String username = "moellerlinds";
        String password = "dont4get?";
        
        
            //API
            URL url = new URL("https://www.googleapis.com/gmail/v1/users/moellerlinds@gmail.com/messages/send");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            //String line = reader.readLine();
    }
    
        public class EmailClass { 
            
            
        //mail.sendMail(email, subject, message, from, username, password);
   } //catch (Exception e) {
       //     System.out.println(e.getMessage());
        //}

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
