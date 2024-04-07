package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHPlanMenuPage;

public class PHPlanMenu extends PHBrowserConfig {

    PHPlanMenuPage ObjPHPMBPage = new PHPlanMenuPage(driverThread.get());

    @When("Admin clicks on Plan menu")
    public void adminClicksOnLeadMenu() throws Exception {
        //ScreenRecorderUtil.startRecord("Plan Menu");
        ObjPHPMBPage.ViewPlanMenu();
        System.out.println("ADMIN CLICK ON PLAN MENU");
    }

    @Then("Admin can see Plans List and Add Submenu")
    public void adminCanSeeLeadsListSection() {

        System.out.println("ADMIN CAN SEE PLANS LIST AND ADD SUBMENU");
    }

    @When("Admin clicks on plan List submenu")
    public void adminClicksOnLeadListSubmenu() {
       ObjPHPMBPage.ClickPlanListSubMenu();
        System.out.println("ADMIN CAN CLICK ON PLAN LIST SUBMENU");

    }

    @Then("Admin can see The details of list of Plans")
    public void adminCanSeeTheDetailsOfListOfLeads() {
        System.out.println("ADMIN CAN SEE THE DETAILS OF LIST OF PLANS");

    }

    @When("Admin Can Click On Plans view Icon")
    public void admincanclickonplansviewicon() throws InterruptedException {
       // ObjPHLMBPage.SearchLeadRecord();
        ObjPHPMBPage.ClickToViewPlanDetails();
        System.out.println("ADMIN CAN CLICK ON PLANS VIEW ICON");

    }

    @Then("Admin Can See Plans Details")
    public void admincanseepplansdetails() {
        System.out.println("ADMIN CAN SEE PLAN DETAILS");
    }

    @When("Admin Enters Search Keywords inside Plan")
    public void adminEntersSearchKeywordsInsidePlan() throws InterruptedException {
        ObjPHPMBPage.SearchPlanRecord();
        System.out.println("ADMIN ENTERS SEARCH KEYWORDS INSIDE PLAN");
    }

    @Then("Relevant Plans Search Results Generated")
    public void relevantPlansSearchResultsGenerated() {
        System.out.println("RELEVANT PLANS SEARCH RESULT GENERATED");
        
    }

    @When("Admin clicks on edit button to edit the plan details")
    public void adminClicksOnEditButtonToEditThePlanDetails() throws InterruptedException {
        ObjPHPMBPage.ClickOnPlanEditButton();
        System.out.println("ADMIN CLICKS ON EDIT BUTTON TO EDIT THE PLAN DETAILS");
        
    }

    @Then("Admin can edit the plan details")
    public void adminCanEditThePlanDetails() throws Exception {
ObjPHPMBPage.EditPlanDetails();
        System.out.println("ADMIN CAN EDIT THE PLAN DETAILS");
       // ScreenRecorderUtil.stopRecord();
    }

    @When("Admin Clicks on plan Add Submenu")
    public void adminClicksOnPlanAddSubmenu() throws InterruptedException {
        ObjPHPMBPage.ClickPlanAddSubMenu();
        System.out.println("ADMIN CLICKS ON PLAN SUBMENU");
    }

    @Then("Admin can Add New plan details")
    public void adminCanAddNewPlanDetails() throws Exception {
        ObjPHPMBPage.AddNewPlan();
        System.out.println("ADMIN CAN ADD NEW PLAN DETAILS");

    }

    @When("Admin Clicks on Delete Icon")
    public void adminClicksOnDeleteIcon() throws InterruptedException {
        ObjPHPMBPage.DeletePlan();
        System.out.println("ADMIN CLICKS ON DELETE ICON");
        
    }

    @Then("Admin Can Delete Plan Record")
    public void adminCanDeletePlanRecord() throws Exception {
        System.out.println("ADMIN CAN DELETE PLAN RECORD");
        //ScreenRecorderUtil.stopRecord();
    }

}

