package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHTherapistMenuPage;

public class PHDBTherapistMenu extends PHBrowserConfig {

    PHTherapistMenuPage ObjPHTMBPage = new PHTherapistMenuPage(driverThread.get());

    public PHDBTherapistMenu() {

    }

    @Given("Admin is on phonologix dashborad")
    public void adminIsOnPhonologixDashborad() throws Exception {
        ObjPHTMBPage.DashpboardPageURL();

    }

    @When("Admin clicks on Therapist menu")
    public void admin_clicks_on_therapist_menu() {
        // Write code here that turns the phrase above into concrete actions
        ObjPHTMBPage.ViewTherapistMenu();
        System.out.println("'-----ADMIN CLICKS ON THERAPIST MENU -----");
    }

    @Then("Admin can see List and Add Submenu")
    public void admin_can_see_list_and_add_submenu() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("'-----ADMIN CAN SEE LIST AND ADD SUBMENU -----");
    }

    @When("Admin clicks on List submenu")
    public void admin_clicks_on_list_submenu() {
        // Write code here that turns the phrase above into concrete actions
        ObjPHTMBPage.ClickTherapistListSubMenu();
        System.out.println("'-----ADMIN CLICKS ON LIST SUB MENU -----");
    }

    @Then("Admin can see The details of list of therapist")
    public void admin_can_see_the_details_of_list_of_therapist() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("'-----ADMIN CAN SEE LIST OF THERAPIST-----");
    }


    @When("Admin Enters Search Keywords")
    public void adminEntersSearchKeywords() throws InterruptedException {
        ObjPHTMBPage.SearchThreapistRecord();
        System.out.println("------ADMIN ENTERS VALUES TO SEARCH THE RECORD------");


    }

    @Then("Relevant Search Results Generated")
    public void relevantSearchResultsGenerated() throws InterruptedException {
        ObjPHTMBPage.ValidateTherapistListPage();
        System.out.println("------ADMIN CAN SEE RELEVANT SEARCH RESULTS------");


    }

    @When("Admin clicks on save excel file button")
    public void adminClicksOnSaveExcelFileButton() throws InterruptedException {
        ObjPHTMBPage.TherapistSaveExcelFile();
        System.out.println("------ADMIN CAN CLICK ON EXPORT AS XLSX FILE BUTTON------");


    }

    @Then("File gets downloaded")
    public void fileGetsDownloaded() {
        System.out.println("------EXPORT AS XLSX FILE GETS DOWNLOADED------");

    }

    @When("Admin clicks on perticular page breadcrumbs")
    public void adminClicksOnPerticularPageBreadcrumbs() throws InterruptedException {
        ObjPHTMBPage.ClickOnPageBreadCrumbs();
        System.out.println("------ADMIN CLICKS ON PAGE BREAD CRUMBS------");


    }

    @Then("admin can see the data on perticular page")
    public void adminCanSeeTheDataOnPerticularPage() throws InterruptedException {
        ObjPHTMBPage.ValidateSearchPageBreadCrumbsPage();

        System.out.println("------ADMIN CAN SEE THE DATA ON PERTICULAR PAGE------");

    }

    @And("Admin can scroll vertically inside the list table")
    public void adminCanScrollVerticallyInsideTheListTable() throws InterruptedException {
        ObjPHTMBPage.VerifyTherapistListScrollVertical();
        System.out.println("------ADMIN CAN SCROLL VERTICALLY INSIDE THE LIST TABLE------");

    }

    @And("Admin can scroll horizantally inside the list table")
    public void adminCanScrollHorizantallyInsideTheListTable() throws InterruptedException {
        ObjPHTMBPage.VerifyTherapistListScrollHorizantal();
        System.out.println("------ADMIN CAN SCROLL HORIZANTALLY INSIDE THE LIST TABLE------");

    }

    @When("Admin Clicks On Key Icon To View Therapist Credentials")
    public void adminClicksOnKeyIconToViewTherapistCredentials() throws InterruptedException {

        ObjPHTMBPage.ClickToViewTherapistCredentials();
        System.out.println("------ADMIN CLICKS ON KEY ICON TO VIEW CREDENTIALS------");
    }

    @Then("Admin Can Copy Therapist Credentials")
    public void adminCanCopyTherapistCredentials() throws InterruptedException {
        ObjPHTMBPage.CopyTherapistCredentials();
        System.out.println("------ADMIN CAN COPY THERAPIST CREDENTIALS------");

    }

    @And("Admin Can verify Therapist Credentials AlertBox")
    public void adminCanVerifyTherapistCredentialsAlertBox() throws InterruptedException {
        ObjPHTMBPage.VerifyTherapistCredentialsAlertBox();
        System.out.println("------ADMIN CAN VERIFY THERAPIST CREDENTIALS ALERTBOX------");

    }

    @When("Admin Clicks On View Icon To View Therapist Details")
    public void adminClicksOnViewIconToViewTherapistDetails() throws InterruptedException {
        ObjPHTMBPage.ClickToViewTherapistDetails();
        System.out.println("------ADMIN CAN CLICKS ON VIEW ICON TO SEE THERAPIST DETAILS------");

    }

    @Then("Admin Can Vierify Therapist Details Page")
    public void adminCanVierifyTherapistDetailsPage() throws InterruptedException {
        ObjPHTMBPage.VerifyViewTherapistDetailsPage();
        System.out.println("------ADMIN VERIFIES THERAPIST DETAILS PAGE------");
    }


    @When("Admin clicks on edit button to edit the therapist details")
    public void adminClicksOnEditButtonToEditTheTherapistDetails() throws InterruptedException {
        ObjPHTMBPage.ClickOnEditButton();
        System.out.println("------ADMIN CLICKS ON EDIT BUTTON TO EDITS THERAPIST DETAILS------");

    }

    @Then("Admin can edit the therapist details")
    public void adminCanEditTheTherapistDetails() throws InterruptedException {
        ObjPHTMBPage.EditTherapistDetails();
        System.out.println("------ADMIN EDITS THERAPIST DETAILS HERE------");
//ObjPHTMBPage.GoBack();
//        System.out.println("------ADMIN NAVIGATING BACK------");

    }

    @When("Admin clicks on Add submenu")
    public void adminClicksOnAddSubmenu() throws InterruptedException {
        ObjPHTMBPage.ClickTherapistAddSubMenu();
        System.out.println("-----ADMIN CLICKS ON ADD SUBMENU");
    }

    @Then("Admin can add new therapist details")
    public void adminCanAddNewTherapistDetails() throws InterruptedException {
        ObjPHTMBPage.AddNewTherapistDetails();
        System.out.println("ADMIN CAN ADD NEW THERAPIST");
    }

    @And("Admin navigates on dashboard page")
    public void adminNavigatesOnDashboardPage() {
        ObjPHTMBPage.GoBackHomePage();

        System.out.println("ADMIN NAVIGATES TO DASHBOARD PAGE");
    }


}


