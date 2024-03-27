package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHScreeningTestMenuPage;
import pageobjectclasses.PHTutorialsMenuPage;

import java.awt.*;

public class PHScreeningTestMenu extends PHBrowserConfig {


    PHScreeningTestMenuPage ObjPHSTMBPage = new PHScreeningTestMenuPage(driverThread.get());

    @When("Admin clicks on Screening Test menu")
    public void adminClicksOnScreeningTestMenu() throws Exception {
        ScreenRecorderUtil.startRecord("SCREENING TEST MENU-PHONOLOGIX ADMIN DASHBOARD");
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
    public void adminCanNaviagteToTheScreeningTestPerticularPage() throws Exception {
        ObjPHSTMBPage.ValidateScreeningTestpagenavigation();
        System.out.println("ADMIN CAN NAVIGATE TO THE SCREENING TEST PERTICULAR PAGE");
        Thread.sleep(2000);
        ScreenRecorderUtil.stopRecord();
    }

    @When("Admin enters value to search for screening test record")
    public void adminEntersValueToSearchForScreeningTestRecord() throws InterruptedException {
        ObjPHSTMBPage.SearchScreeningTestRecord();
        System.out.println("ADMIN CAN ENTERS VALUE TO SEARCH FOR SCREENING TEST RECORD");
        
    }

    @Then("Admin can see perticular screening test result")
    public void adminCanSeePerticularScreeningTestResult() {
        System.out.println("ADMIN CAN SEE PERTICULAR SCREENING TEST");
    }
}