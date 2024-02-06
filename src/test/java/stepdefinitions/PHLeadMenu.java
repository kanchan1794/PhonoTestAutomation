package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLeadMenuPage;

public class PHLeadMenu extends PHBrowserConfig {

    PHLeadMenuPage ObjPHLMBPage = new PHLeadMenuPage(driverThread.get());

    @When("Admin clicks on Lead menu")
    public void adminClicksOnLeadMenu() {
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
}
