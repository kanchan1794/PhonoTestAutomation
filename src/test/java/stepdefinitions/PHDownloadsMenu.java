package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHDemoGoalsMenuPage;
import pageobjectclasses.PHDownloadsMenuPage;

public class PHDownloadsMenu extends PHBrowserConfig {


    PHDownloadsMenuPage ObjPHDownMBPage = new PHDownloadsMenuPage(driverThread.get());

    @When("Admin clicks on Download menu")
    public void adminClicksOnDownloadsMenu() throws Exception {
        //ScreenRecorderUtil.startRecord("DEMO GOALS MENU - PHONOLOGIX ADMIN DASHBOARD");
        ObjPHDownMBPage.ClickDownlodsMenu();
        System.out.println("ADMIN CAN CLICK ON DOWNLOADS MENU");
    }


    @Then("Admin can see Process to download Session Report")
    public void adminCanSeeProcessToDownloadSessionReport() {
        System.out.println("ADMIN CAN SEE PROCESS TO DOWNLOAD SESSION REPORT");


    }
    @When("Admin clicks on download session report")
    public void adminClicksOnDownloadSessionReport() {
        ObjPHDownMBPage.ClickOnDownloadSessionreport();

        System.out.println("ADMIN CLICKS ON DOWNLOAD SESSON REPORT");
    }


    @Then("Admin can select required details to download the report")
    public void adminCanSelectRequiredDetailsToDownloadTheReport() throws InterruptedException {
        ObjPHDownMBPage.SelectRequiredDetails();
        System.out.println("ADMIN CAN SELECT REQUIRE DETAILS TO DOWNLOAD THE REPORT");

    }

    @And("Admin can download particular session report")
    public void adminCanDownloadParticularSessionReport() {
        System.out.println("ADMIN CAN DOWNLOAD PARTICULAR SESSION REPORT");
    }

}