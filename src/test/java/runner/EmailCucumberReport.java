package runner;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.io.*;

public class EmailCucumberReport {
    public static void main(String[] args) {
        // Directory where Cucumber HTML reports are stored
        String reportDirectory = "C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports";

        // Read and aggregate content of all HTML files
        String emailContent = aggregateHTMLReports(reportDirectory);

        // Send email with aggregated HTML content
        sendEmail(emailContent);
    }

    private static String aggregateHTMLReports(String reportDirectory) {
        StringBuilder content = new StringBuilder();
        File dir = new File(reportDirectory);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles((dir1, name) -> name.toLowerCase().endsWith(".html"));
            if (files != null) {
                for (File file : files) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return content.toString();
    }

    private static void sendEmail(String emailContent) {
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
            message.setContent(emailContent, "text/html");

            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

