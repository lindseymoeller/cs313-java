/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.*;
//import javaproject.servlet.emailservlet;


/**
 *
 * @author Lindsey
 */
@Stateless
public class MailBean {

    public static void sendEmail(String fromEmail, String username, String password, String toEmail, String subject, String message) {
        
        try {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.port","465");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        
       
        Session mailSession = Session.getInstance(properties, null);
        //mailSession.setDebug(true);
        
        Message mailMessage = new MimeMessage(mailSession);
        
        Address address = new InternetAddress("moellerlinds@gmail.com");

        
            mailMessage.setFrom(new InternetAddress(fromEmail));
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mailMessage.setContent(message, "text/html");
            mailMessage.setSubject(subject);
            
            Transport transport = mailSession.getTransport("smtp");
            transport.connect("smtp.gmail.com", username, password);
            transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
            transport.close();
        
        } catch (Exception ex) {
            Logger.getLogger(MailBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
