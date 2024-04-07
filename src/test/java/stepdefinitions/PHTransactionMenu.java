package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHTransactionMenuPage;

public class PHTransactionMenu extends PHBrowserConfig {


    PHTransactionMenuPage ObjPHTRMBPage = new PHTransactionMenuPage(driverThread.get());

    @When("Admin clicks on Transaction menu")
    public void adminClicksOnTransactionMenu() throws Exception {
       // ScreenRecorderUtil.startRecord("TRANSACTION MENU-PHONOLOGIX ADMIN DASHBOARD");
        ObjPHTRMBPage.ViewTransactionMenu();
        System.out.println("ADMIN CAN CLICK ON TRANSACTION MENU");
    }

    @Then("Admin can see Transaction details")
    public void adminCanSeeTransactionDetails() throws InterruptedException {
        ObjPHTRMBPage.ValidateTransactionPage();
        System.out.println("ADMIN CAN SEE TRANSACTION DETAILS ");

    }

    @When("Admin Enters Search Keywords For Transaction")
    public void adminEntersSearchKeywordsForTransaction() throws InterruptedException {
        ObjPHTRMBPage.SearchTransactionrecords();
        System.out.println("ADMIN CAN ENTERS SEARCH KEYWORDS FOR TRANSACTION");


    }

    @Then("Admin Can See Specific Transaction Search Results")
    public void adminCanSeeSpecificTransactionSearchResults() throws InterruptedException {
        ObjPHTRMBPage.ValidateTransactionRecordsPage();
        System.out.println("ADMIN CAN SEE SPECIFIC TRANSACTION SEARCH RESULTS");
    }

    @When("Admin clicks on perticular page breadcrumbs from transaction menu")
    public void adminClicksOnPerticularPageBreadcrumbsFromTransactionMenu() throws InterruptedException {
        ObjPHTRMBPage.ClickOnTransactionpageBreadCrumbs();
        System.out.println("ADMIN CLICK ON TRANSACTION PAGE BREAD CRUMBS");


    }

    @Then("admin can see the data on perticular page from transsaction menu")
    public void adminCanSeeTheDataOnPerticularPageFromTranssactionMenu() throws InterruptedException {
        ObjPHTRMBPage.ValidateTRanSearchPageBreadCrumbsPage();
        System.out.println("ADMIN CAN SEE DATA ON PERTICULAR PAGE");
       //ObjPHTRMBPage.GOPreviousPage();
       System.out.println("ADMIN CAN GO TO PREVIOUS PAGE");
    }

    @And("Admin can scroll vertically inside the Transaction list table")
    public void adminCanScrollVerticallyInsideTheTransactionListTable() throws InterruptedException {
        ObjPHTRMBPage.VerifyTransactionListScrollVertical();
        System.out.println("ADMIN CAN SCROLL VERTICAL INSIDE TABLE--TRANSACTION");

    }

    @And("Admin can scroll horizantally inside the Transaction list table")
    public void adminCanScrollHorizantallyInsideTheTransactionListTable() throws Exception {
        ObjPHTRMBPage.VerifyTransactionListScrollHorizantal();
        System.out.println("ADMIN CAN SCROLL HORIZANTAL INSIDE TABLE--TRANSACTION");
        //ScreenRecorderUtil.stopRecord();

    }
}