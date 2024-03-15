package runner;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class PhonologixSendMail {

    public static void main(String[] args) {
//        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//
//        // Create a new instance of the ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        // Navigate to the webpage
//        driver.get("https://example.com");
//
//        // Attach a file using Selenium
//        WebElement fileInput = driver.findElement(By.id("fileInputId"));
//        fileInput.sendKeys("path/to/your/attachment.txt");


        // Your email configuration
        String from = "kanchan@clingmultisolutions.org";
        String password = "dtld ouyj rdzq lwek";// Use App Password for Gmail with 2FA
        String to = "kanchan@clingmultisolutions.org";
        String subject = "Phonologix Test Report";
        //String body = "please find the report";
        String ccEmail = "kanchan1794@gmail.com";

        // Email server properties
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

            message.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(ccEmail));

            // Set the subject and content of the email
            message.setSubject(subject);
           // message.setText(body);


            // Create and attach the file to the email
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            //attachmentBodyPart.attachFile("/home/ec2-user/PhonoTestAutomation/target/cucumber-report-html/cucumber-html-reports");
          attachmentBodyPart.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html");
//attachmentBodyPart.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html.zip");
            // Create Multipart and add message and attachment to it

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(attachmentBodyPart);
            message.setContent(multipart);
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
            messageBodyPart.setText("please find the Phonologix Automation Test report providing google drive link https://drive.google.com/drive/folders/1xW2Jhj5xsMBIpUaZ49tF1cFom0Zf7m6f?usp=drive_link");

            // Create a multipar message
           // Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);




            // Send the email
            Transport.send(message);

            System.out.println("Email with attachment sent successfully.");

        } catch (MessagingException | java.io.IOException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
