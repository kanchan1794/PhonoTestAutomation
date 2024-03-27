package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHPaymentLinkMenuPage;

public class PHPaymentLinkMenu extends PHBrowserConfig {

    PHPaymentLinkMenuPage ObjPHPLMPage = new PHPaymentLinkMenuPage(driverThread.get());

    @When("Admin clicks on PaymentLink menu")
    public void adminClicksOnTransactionMenu() throws Exception {
        ScreenRecorderUtil.startRecord("PAYMENTLINK MENU-ADMIN DASHBOARD");
        ObjPHPLMPage.ViewPaymentLinkMenu();
        System.out.println("ADMIN CAN CLICK ON PaymentLink MENU");
    }

    @Then("Admin can see PaymentLink Submenu list and create")
    public void adminCanSeePaymentLinkDetails() {
        System.out.println("ADMIN CAN SEE PAYMENTLINK SUBMENU LIST AND CREATE");
    }

    @When("Admin clicks on PaymentLink-List submenu")
    public void adminClicksOnPaymentLinkListSubmenu() {
        ObjPHPLMPage.ClickPaymentListSubMenu();
        System.out.println("ADMIN CAN CLICK ON PAYMENT_LINK LIST SUBMENU");
    }

    @Then("Admin can see The details of list of PaymentLinks")
    public void adminCanSeeTheDetailsOfListOfPaymentLinks() {
        System.out.println("ADMIN CAN SEE THE DETAILS OF LIST OF PAYMENTSLINKS");

    }

    @And("Admin Can Check the Working Of Scorll Bar Functionality")
    public void adminCanSeeTheWorkingOfScorllBarFunctionality() throws InterruptedException {
        ObjPHPLMPage.PaymentLinkScrollBarFunction();
        System.out.println("ADMIN CAN CHECK THE WORKING OF SCROLL BAR FUNCTIONALITY");


    }

    @When("Admin clicks on PaymentLink-Create submenu")
    public void adminClicksOnPaymentLinkCreateSubmenu() {
       ObjPHPLMPage.ClickPaymentLinkCreateSubMenu();
        System.out.println("ADMIN CAN CLICK ON CREATE PAYMENT LINK SUBMENU");
    }

    @Then("Admin Can Create New Payment Link")
    public void adminCanCreateNewPaymentLink() throws Exception {
        ObjPHPLMPage.ValidateCreatePaymentLinkPage();
        ObjPHPLMPage.CreateNewPaymentLink();
        System.out.println("ADMIN CAN CREATE NEW PAYMENT LINK");
        Thread.sleep(2000);
//ScreenRecorderUtil.stopRecord();
    }

    @When("Admin Enters Search Keywords For Payment Link")
    public void adminEntersSearchKeywordsForPaymentLink() throws InterruptedException {
        ObjPHPLMPage.SearchPaymentLinkRecord();
        System.out.println("ADMIN ENTERS SEARCH KEYWORDS FOR PAYMENT LINK");

    }

    @Then("Relevant Search Results Generated For Payment Link")
    public void relevantSearchResultsGeneratedForPaymentLink() {
        System.out.println("RELEVANT SEARCH RESULTS GENERATED FOR PAYMENT LINK");
    }
}
