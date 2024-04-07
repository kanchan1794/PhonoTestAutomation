package runner;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class PhonologixSendMail {

    public static void main(String[] args) {

        // Your email configuration
        String from = "kanchan@clingmultisolutions.org";
        String password = "dtld ouyj rdzq lwek";// Use App Password for Gmail with 2FA
        String[] toEmails = {"akshay@clingmultisolutions.org", "jijokudilil@gmail.com"};
       // String[] toEmails = {"akshay@clingmultisolutions.org", "aryan@clingmultisolutions.org"};
       // String to = "rajnish.mishra@clingmultisolutions.org";
        String subject = "Update on Automation Testing Progress for Phonologix";


        //String[] ccEmails = {"cc1@example.com", "cc2@example.com"};d
      String ccEmail = "rajnish.mishra@clingmultisolutions.org";

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
            // Add TO recipients
            for (String toEmail : toEmails) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
}
// message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
            message.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(ccEmail));

            // Set the subject and content of the email
            message.setSubject(subject);
           // message.setText(body);


            // Create and attach the file to the email
            MimeBodyPart attachment1 = new MimeBodyPart();
            attachment1.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD LOGIN.mp4");
            MimeBodyPart attachment2 = new MimeBodyPart();
            attachment2.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD LEADS MENU.mp4");
            MimeBodyPart attachment3 = new MimeBodyPart();
            attachment3.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD THERAPIST MENU.mp4");
            MimeBodyPart attachment4 = new MimeBodyPart();
            attachment4.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD PARTNER MENU.mp4");
            MimeBodyPart attachment5 = new MimeBodyPart();
            attachment5.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD PLAN MENU.mp4");
            MimeBodyPart attachment6 = new MimeBodyPart();
            attachment6.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PHONOLOGIX ADMIN DASHBOARD TRANSACTION MENU.mp4");
            MimeBodyPart attachment7 = new MimeBodyPart();
            attachment7.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\DashBoard.png");
//            MimeBodyPart attachment8 = new MimeBodyPart();
//            attachment8.attachFile("http://13.201.76.6/feature-overview.html");


            //attachmentBodyPart.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\DashBoard.png");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(attachment1);
            multipart.addBodyPart(attachment2);
            multipart.addBodyPart(attachment3);
            multipart.addBodyPart(attachment4);
            multipart.addBodyPart(attachment5);
            multipart.addBodyPart(attachment6);
            multipart.addBodyPart(attachment7);
//            multipart.addBodyPart(attachment8);
            message.setContent(multipart);
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
//            messageBodyPart.setText("Hello Akshay Sir, Please Find The Phonologix Automation Test Report For The Login-Dashboard Therapist Module, Partner Module, leads Module, Plan Module And Transaction Module...\n" +
//                    "****Login Functionality Along With Dashboard Page Activities From Phonologix Admin Dashboard \n" +
//                    "****Below Are The Tested Activites \n"+
//                    "****Browser is Open Witn Staging URL And Admin Is Logged In\n" +
//                    "****Admin Can See the Dashboard\n"+
//                    "****Admin Can Select The Value From DropDown List\n"+
//                    "****When Admin Click On Plan Expiray Report The He/She Get Navigtes TO The Plan Expiry Report\n"+
//                    "****When Admin Click On Slot Booked Report The He/She Get Navigtes TO The Slot Booked Report\n"+"" +
//                    "****When Admin Click On Slot Completed Report The He/She Get Navigtes TO The Slot Completed Report\n"+
//                    "****When Admin Click On Assessments Report The He/She Get Navigtes TO The Assessments Report\n" +
//
//            "Total Number Of Test Scenarios :1" +
//                    "\n"+
//            "**********************************" +
//                    "\n"+
//            "Total Number Of Test Scenarios failed :0" +
//                    "\n"+
//            "Total Number Of Test Steps :10" +
//                    "\n"+
//            "**********************************" +
//                    "\n"+
//          "Total Number Of Test Steps failed :0" +
//                    "\n"+
//            "**********************************"+
//                    "\n"+
//            "Status Of The TestCase :Passed" +
//                    "\n"+
//                    "Also @AARYAN PLEASE FIND THE VIDEO OF LOGS MENU FROM PHONOLOGIX ADMIN DASHBOARD..." +
//            "When we click on page navigation from logs menu and if we click on page numbers after 1, then screen get distrubed as Page bread crumbs are beyond the Screen  and so our automated scripts are not able to locate the page navigation elements correctly.. as this is a bug" +
//                    "Also the same thing is happening with transaction menu");


            messageBodyPart.setText(
                    "\n" +
                    "Hey Jijo,\n" +
                    "\n" +
                    "Hope you're doing well!\n" +
                    "\n" +
                    "Just wanted to drop you a quick update on how things are going with our automation testing for Phonologix.\n" +
                    "\n" +
                    "We've been hard at work designing and executing test cases for the admin module, covering all the important stuff like Login, Dashboard, Therapist Menu, Partner Menu, Leads Menu, Plan Menu, and Transaction Menu. Each of these menus does its own thing, so we've been thorough in making sure everything works smoothly.\n" +
                    "\n" +
                    "Our testing approach has focused on conducting happy path testing to ensure the robustness and reliability of the Phonologix across all its functionalities. We are pleased to report that our efforts have yielded positive results thus far.\n" +
                    "\n" +
                    "Furthermore, we have successfully generated comprehensive test reports for these functionalities. These reports provide detailed insights into the performance and functionality of the Phonologix admin dashboard during the automation testing process. We would be more than happy to share these reports with you via email for your review and analysis.\n" +
                    "\n" +
                    "you can find phonologix test report dashboard link here- http://13.201.76.6/feature-overview.html" +
                    "\n" +
                    "\n" +
                    "To provide you with a clearer understanding of how automation testing operates in practice, we have also prepared GUI screen recordings of the executed test cases. These recordings offer visual demonstrations of the testing process, allowing for a more intuitive comprehension of our automation testing methodology and its outcomes.\n" +
                    "\n" +
                    "If you've got any questions or need more info, just give us a shout. We're here to help!\n" +
                    "\n" +
                    "Thank you for your attention, and we look forward to your feedback."




            );




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
