/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.email;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.util.Properties;
import javax.ejb.Stateless;

/**
 *
 * @author Lindsey
 */
@Stateless
public class MailSender {

    public void sendEmail(String to, String from, String subject,
      String bodyText) throws MessagingException {
        
        try {
            Properties prop = System.getProperties();
    
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.auth", true);
            prop.put("mail.smtp.port","465");
            prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            prop.put("mail.smtp.socketFactory","465");
            prop.put("mail.smtp.socketFactory.fallback", "false");
        
            Session mailSession = Session.getDefaultInstance(props, null);
            
            Message mailMessage = new MimeMessage(mailSession);
            
            mail.setFrom(new InternetAddress(from));
            mail.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            mail.setSubject(subject);
            mail.setContent(messageBody,"text/html");

   Transport transport = mailSession.getTransport("smtp");
            //It helps us to establish connection to authenticat the fromEmail Username and password
            transport.connect("smtp.gmail.com", userName, password);
            
            transport.sendMessage(mail, mail.getAllRecipients());
        } catch (Exception e) {
        }
    }
}