package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHScreeningTestMenuPage;

import java.awt.*;

public class PHDemogoalsMenu extends PHBrowserConfig {


    PHScreeningTestMenuPage ObjPHSTMBPage = new PHScreeningTestMenuPage(driverThread.get());

    @When("Admin clicks on Screening Test menu")
    public void adminClicksOnScreeningTestMenu() throws InterruptedException {
        ObjPHSTMBPage.ClickScreeningTestMenu();
        System.out.println("ADMIN CAN CLICK ON TUTORIALS MENU");
    }


     @Then("Admin can see Screening Test Details")
    public void adminCanSeeScreeningTestDetails() {
         System.out.println("ADMIN CAN CLICK ON SCREENING TEST MENU");

    }

    @When("Admin Click on View report-Screening Test")
    public void adminClickOnViewReportScreeningTest() throws InterruptedException, AWTException {
        ObjPHSTMBPage.ViewScreeningTestreport();
        System.out.println("ADMIN CLICK ON VIEW REPORT-SCREENING TEST");



    }

    @Then("Admin Can See Perticular Screening Test report")
    public void adminCanSeePerticularScreeningTestReport() {
        System.out.println("ADMIN CAN SEE PERTICULAR SCREENING TEST REPORT");

    }

    @When("Admin clicks on perticular page breadcrumbs-Screening Test")
    public void adminClicksOnPerticularPageBreadcrumbsScreeningTest() {
        ObjPHSTMBPage.ScreeningTestpageNavigation();
        System.out.println("ADMIN CLICKS ON PERTICULAR PAGE BREADCRUMBS-SCREENING TEST");

    }

    @Then("Admin Can Naviagte To The Screening Test Perticular Page")
    public void adminCanNaviagteToTheScreeningTestPerticularPage() throws InterruptedException {
        ObjPHSTMBPage.ValidateScreeningTestpagenavigation();
        System.out.println("ADMIN CAN NAVIGATE TO THE SCREENING TEST PERTICULAR PAGE");
    }
}