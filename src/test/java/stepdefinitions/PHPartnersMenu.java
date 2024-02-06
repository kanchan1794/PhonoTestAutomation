package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHPartnersMenuPage;

public class PHPartnersMenu extends PHBrowserConfig {


    PHPartnersMenuPage ObjPHPMBPage = new PHPartnersMenuPage(driverThread.get());

    @When("Admin clicks on Partners menu")
    public void adminClicksOnPartnersMenu() {
        ObjPHPMBPage.ViewPartnerMenu();
        System.out.println("ADMIN CAN CLICK ON PARTNERS MENU");
    }

    @Then("Admin can see partners List and Add Submenu")
    public void adminCanSeePartnersListAndAddSubmenu() {
     System.out.println("ADMIN CAN SEE PARTNERS LIST AND ADD SUBMENU ");

    }

    @When("Admin clicks on Partners List submenu")
    public void adminClicksOnPartnersListSubmenu() {
        ObjPHPMBPage.ClickPartnerListSubMenu();
        System.out.println("ADMIN CAN CLICK ON PARTNERS LIST SUBMENU ");


    }

    @Then("Admin can see The details of list of Partners")
    public void adminCanSeeTheDetailsOfListOfPartners() {
        System.out.println("ADMIN CAN SEE THE PARTNERS LIST DETAILS ");


    }

    @When("Admin Enters Search Keywords for to see partners record")
    public void adminEntersSearchKeywordsForToSeePartnersRecord() throws InterruptedException {

        ObjPHPMBPage.SearchPartnersRecord();
        System.out.println("ADMIN CAN PASS KEYWORD TO SEARCH THE PARTNERS RECORD ");

    }

    @Then("Relevant partners Search Results Generated")
    public void relevantPartnersSearchResultsGenerated() throws InterruptedException {
        ObjPHPMBPage.ValidatepartnersListPage();
        System.out.println("RELEVANT PARTNERS RESULT GENERATED ");

    }

    @And("Admin can scroll vertically inside the Partners list table")
    public void adminCanScrollVerticallyInsideThePartnersListTable() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnersListScrollVertical();
        System.out.println("------ADMIN CAN SCROLL VERTICALLY INSIDE THE PARTNERS LIST TABLE------");
    }

    @And("Admin can scroll horizantally inside the Partners list table")
    public void adminCanScrollHorizantallyInsideThePartnersListTable() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnersListScrollHorizantal();
        System.out.println("------ADMIN CAN SCROLL HORIZANTALLY INSIDE THE PARTNERS LIST TABLE------");



    }

    @When("Admin Clicks On Key Icon To View Partners Credentials")
    public void adminClicksOnKeyIconToViewPartnersCredentials() {

        ObjPHPMBPage.ClickToViewPartnersCredentials();
        System.out.println("------ADMIN CAN CLICKS ON KEY ICON TO VIEW PARTNERS CREDENTIALS");



    }

    @Then("Admin Can Copy Partners Credentials")
    public void adminCanCopyPartnersCredentials() {
        ObjPHPMBPage.CopyPartnersCredentials();
        System.out.println("------ADMIN CAN COPY PARTNERS CREDENTALS");
        
    }

    @And("Admin Can verify Partners Credentials AlertBox")
    public void adminCanVerifyPartnersCredentialsAlertBox() throws InterruptedException {
        ObjPHPMBPage.VerifyPartnersCredentialsAlertBox();
        System.out.println("------ADMIN CAN VERIFY PARTNERS CREDENTIALS BOX");
    }

    @When("Admin clicks on perticular Partners page breadcrumbs")
    public void adminClicksOnPerticularPartnersPageBreadcrumbs() {
        ObjPHPMBPage.ClickOnPartnersPageBreadCrumbs();
        System.out.println("------ADMIN CAN CLICK ON PARTNERS PERTICULAR PAGE BREADCRUMBS");
        
    }

    @Then("admin can see the data on perticular Partners page")
    public void adminCanSeeTheDataOnPerticularPartnersPage() throws InterruptedException {
        ObjPHPMBPage.ValidatePartnersPageBreadCrumbsPage();
        System.out.println("------ADMIN CAN SEE DATA ON PERTICULAR PARTNER PAGE");
    }

    @When("Admin Clicks On View Icon To View Partners Details")
    public void adminClicksOnViewIconToViewPartnersDetails() {
        ObjPHPMBPage.ClickToViewPartnersDetails();
        System.out.println("------ADMIN CAN CLICK ON VIEW ICON TO SEE PARTNER DETAILS");
    }

    @Then("Admin Can verify Partners Details Page")
    public void adminCanVerifyPartnersDetailsPage() throws InterruptedException {
        ObjPHPMBPage.VerifyViewPartnersDetailsPage();
        System.out.println("------ADMIN CAN VERIFY PARTNER DETAILS PAGE HERE");
        
    }

    @When("Admin clicks on edit button to edit the partners details")
    public void adminClicksOnEditButtonToEditThePartnersDetails() {
        ObjPHPMBPage.ClickOnPartnersEditButton();
        System.out.println("------ADMIN CAN CLICK ON EDIT ICON TO EDIT PARTNER DETAILS");
        
    }

    @Then("Admin can edit the partners details")
    public void adminCanEditThePartnersDetails() throws InterruptedException {
        ObjPHPMBPage.EditPartnersDetails();
        System.out.println("------ADMIN CAN CLICK ON SUBMIT BUTTON TO SAVE PARTNER DETAILS");

    }
}
