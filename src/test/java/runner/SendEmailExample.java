package runner;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailExample {


    public static void main(String[] args) {
        // Sender's email address and password
        String from = "kanchan1794@gmail.com";
        String password = "gptg ofqx deai wrjh";

        // Recipient's email address
        String to = "kanchan@clingmultisolutions.org";

        // Setup properties for the mail session
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Create a Session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set the sender and recipient addresses
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set the subject and content of the email
            message.setSubject("Selenium JavaMail Example");
            message.setText("This is a test email sent using JavaMail and Selenium.");

            // Send the email
           Transport.send(message);
            //Transport.send(message, from, password);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

