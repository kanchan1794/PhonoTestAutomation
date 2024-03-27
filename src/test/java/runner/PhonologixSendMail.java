package runner;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class PhonologixSendMail {

    public static void main(String[] args) {

        // Your email configuration
        String from = "kanchan@clingmultisolutions.org";
        String password = "dtld ouyj rdzq lwek";// Use App Password for Gmail with 2FA
        //String[] toEmails = {"akshay@clingmultisolutions.org", "jijokudilil@gmail.com"};
        String[] toEmails = {"akshay@clingmultisolutions.org", "aryan@clingmultisolutions.org"};
        //String to = "kanchan1794@gmail.com";
        String subject = "Phonologix Test Report of Login, Therapist, Partner, leads, Plan, Transaction -Screenrecording";


        //String[] ccEmails = {"cc1@example.com", "cc2@example.com"};
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

            message.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(ccEmail));

            // Set the subject and content of the email
            message.setSubject(subject);
           // message.setText(body);


            // Create and attach the file to the email
            MimeBodyPart attachment1 = new MimeBodyPart();
            attachment1.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\Admin Dashboard Login.mp4");
            MimeBodyPart attachment2 = new MimeBodyPart();
            attachment2.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\THERAPIST MENU ADMIN DASHBOARD.mp4");
            MimeBodyPart attachment3 = new MimeBodyPart();
            attachment3.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PARTNER MENU-PHONOLOGIX ADMIN DASHBOARD.mp4");
            MimeBodyPart attachment4 = new MimeBodyPart();
            attachment4.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\LEADS MENU-PHONOLOGIX ADMIN DASHBOARD.mp4");
            MimeBodyPart attachment5 = new MimeBodyPart();
            attachment5.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\PLAN MENU-Phonologix Admin Dashboard.mp4");
            MimeBodyPart attachment6 = new MimeBodyPart();
            attachment6.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\Phonologix Test Cases Videos\\TRANSACTION MENU-PHONOLOGIX ADMIN DASHBOARD-.mp4");



            //attachmentBodyPart.attachFile("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\DashBoard.png");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(attachment1);
            multipart.addBodyPart(attachment2);
            multipart.addBodyPart(attachment3);
            multipart.addBodyPart(attachment4);
            multipart.addBodyPart(attachment5);
            multipart.addBodyPart(attachment6);
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


            messageBodyPart.setText("" +
                    "" +
                    "Login-Dashboard Functionality" +
                    "\n" +
                    "Test case 1: Test Phonologix Login Functionality" +
                    "-----Here phonologix admin should be able to in the dashboard login with valid credentials as well as admin shold be able to test positive functionality of\n" +
                    "Selecting value from dropdown list\n" +
                    "-----Navigating to the plan expiry report after clicking on plan expiry report\n" +
                    "-----Clicking and on Slot Booked Report and navigating on slot booked report\n" + "-----Clicking on Slot Complete Report and navigating to the slot completed report\n" + "-----Clicking on Assessments Report and naviagting to the assessments report\n"
            +
                    "\n" +
                    "Therpaist Module:\n" +
                            "Test Case 1: Test Phonologix Therapist Menu Functionality\n" +
                            "-----In This test case admin should be able to click on therapist menu and , admin should be able to see list and add submenu\n" +
                            "Test Case 2: Test Phonologix Therapist Submenu List Functionality\n" +
                            "-----In this when Admin clicks on List submenu then Admin should be able to see The details of list of therapist also here admin cn test search bar functionality by passing search keywords and so admin can see relevant search results \n" +
                            "Test Case 3: Phonologix Therapist Show Credentials Functionality\n" +
                            "-----In this Admin Clicks On Key Icon To View Therapist Credentials also  Admin Can Copy Therapist Credentials and verify Therapist Credentials AlertBox alert box\n" +
                            "Test case 4: Phonologix View Therapist Functionality\n" +
                            "-----In this when Admin Clicks On View Icon To View Therapist Details then admin can navigate to therapist details page\n" +
                            "also Admin can also clicks on edit button to edit the therapist details and we can edit the therapist details\n" +
                            "Test Case 5: Phonologix Page BreadCrumbs Functionality\n" +
                            "-----here our test scripts test the functionality of page bread crumbs or page naviagtions like When Admin clicks on perticular page number from page bread crumbs then admin can see the data on perticular page\n" +
                            "Test case 6: Phonologix Therapist Submenu List Scroll Vertically Inside Table Functionality\n" +
                            "-----This test case test the functionality of scroll verticall and horizantal in side therapist  list table"
           +
                    "\n" + "\n" +
                    "Partner module:\n" +
                            "Test case 1: Phonologix Partners Functionality\n" +
                            "-----here our test scripts check clicking operation on partner menu and displyaing the submenu list and add under partner menu </b>\n" +
                            "Test case 2: Phonologix Partners Submenu List Functionality\n" +
                            "-----in this first,  Admin should be able to click on Partners List and then Admin can see The details of list of Partners</b>\n" +
                            "Secondly when  Admin Enters Search Keywords to see partners record\n" +
                            "-----Then admin can see Relevant partners Search Results Generated\n" +
                            "Test case 3: Phonologix Partners Show Credentials Functionality\n" +
                            "-----this test case is to check working of view credentials functionality where so admin first Clicks On Key Icon To View Partners Credentials also here Admin Can Copy Partners Credentials next thing is Admin Can also verify Partners Credentials AlertBox\n" +
                            "Test case 4: Phonologix View Partners Functionality\n" +
                            "-----here main functionality is to click on view icon and then check the henceforth working so firstly Admin Clicks On View Icon To View Partners Details and then we can naviagated to partner details page\n" +
                            "secondly When Admin clicks on edit button then he /she can edit the partners details\n" +
                            "Test case 5:Phonologix Partners Page BreadCrumbs Functionality\n" +
                            "-----here test scripts test working of page breadcrumbs/ page naviagation so when  Admin clicks on perticular Partners page breadcrumbs\n" +
                            "Then admin can naviagtes to the perticular Partners page and can see the data\n" +
                            "Test case 6: Phonologix Partners Submenu List Scroll Vertical and horizantal Inside Table Functionality\n" +
                            "-----this test case test the functionality of scroll verticall and horizantal in side partner list table\n"

+
                    "\n" +
                    "Leads Module:\n" +
                            "Test case 1: Clicking on Phonologix Lead Menu Functionality\n" +
                            "-----This test case test positive flow of clicking on lead menu and displaying list and add submenus under lead menu\n" +
                            "Test Case 2: Phonologix Lead Submenu List Functionality\n" +
                            "-----here firstly When Admin clicks on Lead List submenu Then Admin can see The details of list of Leads\n" +
                            "Secondly it test the working of search field by entering Search Keywords for Leads \n" +
                            "and so Relevant Search Results For Leads Generated\n" +
                            "also  test the functionality of dropdown list so when Admin select value from lead dropdown list Then admin can see relevant lead record\n" +
                            "Test Case 3: Phonologix View Leads Details Functionality\n" +
                            "-----this test case check the working of view leads option so admin click on view leads and navigated to lead details page\n" +
                            "Test Case 4: Phonologix Edit Leads Details Functionality\n" +
                            "-----here, we can test the positive flow of edit lead details and so when admin click on edit button then he/she can edit the lead details\n" +
                            "Test Case 5: Phonologix Leads Page navigation Functionality\n" +
                            "----this test case test the working of page bread crumbs functionality by clicking on page number from bottom side of the leads page\n" +
                            "so When Admin click on leads perticular page number Then Admin can navigate to that leads page\n" +
                            "\n" +

                    "Plan Module\n" +
                            "Test Case 1: Test Phonologix Plan Menu Functionality\n" +
                            "-----here when admin click on Plan menu then, admin can see add and list submenu under the plan menu\n" +
                            "Test Case 2: Phonologix Plan Submenu List Functionality\n" +
                            "-----this test case test the features like clicking on list submenu and viewing the details of plans also it test the working of search functionality to search the plan record and clicking operation of view lan icons to see the plan details\n" +
                            "Test Case 3: Phonologix Edit Plan Functionality\n" +
                            "-----here admin can click on edit button to test the editing functionality to edit the plan details and see reflected changes\n" +
                            "Test Case 4: Phonologix Add Plan Functionality\n" +
                            "-----this test case is written to test the working of add submenu to add /create new plan details\n" +
                            "when Admin Clicks on plan Add Submenu Then Admin can Add New plan details\n" +
                            "Test Case 5: Phonologix Delete Plan Functionality\n" +
                            "-----This test case check the working of delete button to remove / delete the perticular plan\n"
+
            ""
                    + "\n" +
                    "Transaction Module\n" +
                    "Test Case 1: Test Phonologix Transaction Menu Functionality\n" +
                    "-----here when admin click on transaction menu, then admin can see transaction details also this test case also check the working of search field and check wether search field generates the correct result or not\n" +
                    "Test Case 2: Phonologix TransactionPage BreadCrumbs Functionality\n" +
                    "-----This test case check working of page navigation like  When Admin clicks on perticular page breadcrumbs from transaction menu\n" +
                    "Then admin can see the data on perticular page from transsaction menu\n" +
                    "\n" +
                    "Test Case 3: Phonologix Transaction Submenu List Scroll Vertically Inside Table Functionality\n" +
                    "-----here we can test working of horizantal and vertical scrolling inside transaction table\n" +
            "\n" +


                    "-----TOTAL NUMBER OF TEST CASES =26" + "\n" +

                    "\n"+
                    "Thanks & Regards," +
                    "\n" +
                    " Kanchan S Deshpande"



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
