package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.mail.*;
import javax.mail.internet.*;
import java.awt.*;
import java.util.Properties;
import java.io.*;

public class EmailHTMLReport {
    public static void main(String[] args) {
        // Load HTML content from file
        String htmlContent = loadHTMLReport("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html");

        // Send email with HTML content as body
        sendEmail(htmlContent);
        String filePath = "C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\file-src-test-java-featurefiles-01_PHDashboard-feature.html";
        openHTMLFile(filePath);
    }

    private static String loadHTMLReport(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void sendEmail(String htmlContent) {
        final String from = "kanchan@clingmultisolutions.org";
        final String password = "dtld ouyj rdzq lwek";// Use App Password for Gmail with 2FA


        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("kanchan1794@gmail.com")); // Recipient email
            message.setSubject("Cucumber Test Report");

            // Create a multipart message
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(htmlContent, "text/html");

            // Create a multipart message
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Set content for the message
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    static void openHTMLFile(String filePath) {
        File htmlFile = new File(filePath);
        if (htmlFile.exists() && !htmlFile.isDirectory()) {
            try {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("HTML file does not exist or is a directory.");
        }


    }
}

