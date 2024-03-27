package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLogsMenuPage;
import pageobjectclasses.PHScreeningTestMenuPage;

import java.awt.*;

public class PHLogMenu extends PHBrowserConfig {


    PHLogsMenuPage ObjPHLMBPage = new PHLogsMenuPage(driverThread.get());

    @When("Admin clicks on Logs menu")
    public void adminClicksLogMenu() throws Exception {
        ScreenRecorderUtil.startRecord("Logs Menu Functionality");
        ObjPHLMBPage.ClickLogsMenu();
        System.out.println("ADMIN CAN CLICK ON LOGS MENU");
    }

    @Then("Admin can see Logs Details")
    public void adminCanSeeLogsDetails() {
        System.out.println("ADMIN CAN SEE LOGS DETAILS");
    }

    @When("Admin Click on One of The Page Bread Crumbs")
    public void adminClickOnOneOfThePageBreadCrumbs() throws Exception {
        ScreenRecorderUtil.stopRecord();
        ObjPHLMBPage.Logspagenavigation();
        System.out.println("ADMIN CLICK ON ONE OF THE PAGE BREAD CRUMBS");

    }

    @Then("Admin Can See Logs On Selected Logs Page")
    public void adminCanSeeLogsOnSelectedLogsPage() throws InterruptedException {
        ObjPHLMBPage.validdateLogsPageNavigation();
        System.out.println("ADMIN CAN SEE LOGS ON SELECTED LOGS PAGE");

    }

    @When("Admin Enters Keywords To Search the Logs Details")
    public void adminEntersKeywordsToSearchTheLogsDetails() throws InterruptedException {
        ObjPHLMBPage.SearchLogfunctionality();
        System.out.println("ADMIN ENTERS KEYWORDS TO SEARCH THE LOG DETAILS");
    }

    @Then("Admin Can See Searched Results In Logs List")
    public void adminCanSeeSearchedResultsInLogsList() {
        System.out.println("ADMIN CAN SEE SEARCHED RESULTS IN LOG LIST");

    }

    @And("Admin Can Scroll Horizantal Inside Logs table")
    public void adminCanScrollHorizantalInsideLogsTable() {
        ObjPHLMBPage.ScrollHorzizantalinsidelgtable();
        System.out.println("ADMIN CAN SCROLL HORIZANTAL INSIDE LOG TABLE");

    }

    @And("Admin can scroll vertically inside the Logs table")
    public void adminCanScrollVerticallyInsideTheLogsTable() throws Exception {
        ObjPHLMBPage.Scrollvrticalinsidelogtable();
        System.out.println("ADMIN CAN SCROLL VERTICALLY INSIDE THE LOGS TABLE");

    }
}