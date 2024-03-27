package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLeadMenuPage;

public class PHLeadMenu extends PHBrowserConfig {

    PHLeadMenuPage ObjPHLMBPage = new PHLeadMenuPage(driverThread.get());

    @When("Admin clicks on Lead menu")
    public void adminClicksOnLeadMenu() throws Exception {
        ScreenRecorderUtil.startRecord("LEADS MENU-PHONOLOGIX ADMIN DASHBOARD");
        ObjPHLMBPage.ViewLeadMenu();
        System.out.println("ADMIN CLICK ON LEADS MENU");
    }

    @Then("Admin can see Leads List and Add Submenu")
    public void adminCanSeeLeadsListSection() {

        System.out.println("ADMIN CAN SEE LEADS LIST AND ADD SUBMENU");
    }

    @When("Admin clicks on Lead List submenu")
    public void adminClicksOnLeadListSubmenu() {
        ObjPHLMBPage.ListLeadSubMenu();
        System.out.println("ADMIN CAN CLICK ON LEAD LIST SUBMENU");

    }

    @Then("Admin can see The details of list of Leads")
    public void adminCanSeeTheDetailsOfListOfLeads() {
        System.out.println("ADMIN CAN SEE THE DETAILS OF LIST OF LEADS");

    }

    @When("Admin Enters Search Keywords for Leads")
    public void adminEntersSearchKeywordsForLeads() throws InterruptedException {
        ObjPHLMBPage.SearchLeadRecord();
        System.out.println("ADMIN ENTERS SEARCH KEYWORDS FOR LEADS");

    }

    @Then("Relevant Search Results For Leads Generated")
    public void relevantSearchResultsForLeadsGenerated() {
        System.out.println("RELEVANT SEARCH RESULTS FOR LEADS GENERATED");
    }

    @When("Admin select value from lead dropdown list")
    public void adminSelectValueFromLeadDropdownList() throws InterruptedException {
        ObjPHLMBPage.SelectValueFromLeadDropdownlist();
        System.out.println("ADMIN SELECT VALUE FROM LEAD DROPDOWN LIST");

    }

    @Then("admin can see relevant lead record")
    public void adminCanSeeRelevantLeadRecord() {
        System.out.println("ADMIN CAN SEE RELEVANT LEAD RECORD");

    }

    @When("Admin Can Click On view Icon")
    public void adminCanClickOnViewIcon() throws InterruptedException {
        ObjPHLMBPage.ClickLeadsViewIcon();
        System.out.println("ADMIN CAN CLICK ON VIEW ICON");
    }

    @Then("Admin Can See Leads Details")
    public void adminCanSeeLeadsDetails() {

        System.out.println("ADMIN CAN SEE LEADS DETAILS");
    }

    @When("Admin click on Leads edit button")
    public void adminClickOnLeadsEditButton() throws InterruptedException {
        ObjPHLMBPage.ClickOnLeadsEditButton();
        System.out.println("ADMIN CLICKS ON LEADS EDIT BUTTON");

        
    }

    @Then("Admin can edit leads details")
    public void adminCanEditLeadsDetails() throws InterruptedException {
        ObjPHLMBPage.EditLeadsDetails();
        System.out.println("ADMIN CAN EDIT LEADS DETAILS");

    }

    @When("Admin Clicks on Convert Leads Link")
    public void adminClicksOnConvertLeadsLink() throws InterruptedException {
        ObjPHLMBPage.ClickConvertLeads();
        System.out.println("ADMIN CLICKS ON CONVERT LEADS LINK");


    }

    @Then("Leads gets converted")
    public void linkGetsConverted() throws Exception {
        ObjPHLMBPage.ConvertLeads();
        System.out.println("LEADS GET CONVERTED");
        //ScreenRecorderUtil.stopRecord();
    }

    @When("Admin click on leads perticular page number")
    public void adminClickOnLeadsPerticularPageNumber() throws InterruptedException {
        ObjPHLMBPage.LeadsPagenavigation();
        System.out.println("ADMIN CLICK ON LEADS PERTICULAR PAGE NUMBER");
        
    }

    @Then("Admin can navigate to that leads page")
    public void adminCanNavigateToThatLeadsPage() throws Exception {
        ObjPHLMBPage.ValidateSearchPageBreadCrumbsPage();
        System.out.println("ADMIN CAN NAVIGATE TO THAT LEADS PAGE");
        ScreenRecorderUtil.stopRecord();
    }
}
