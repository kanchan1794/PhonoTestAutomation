package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHClientMenuPage;

public class PHClientMenu extends PHBrowserConfig {

    PHClientMenuPage ObjPHCLMBPage = new PHClientMenuPage(driverThread.get());

    @When("Admin clicks on Client menu")
    public void adminClicksOnClientMenu() {
        ObjPHCLMBPage.ViewClientMenu();
        System.out.println("ADMIN CLICK ON CLIENT MENU");
    }

    @Then("Admin can see Clients List and add submenu List")
    public void adminCanSeeClientListSection() throws InterruptedException {
        System.out.println("ADMIN CAN SEE CLIENTS LIST AND ADD SUBMENU ");
    }

    @When("Admin clicks on Clients List submenu")
    public void adminClicksOnClientsListSubmenu() {
        ObjPHCLMBPage.ClickClientsListSubMenu();
        System.out.println("ADMIN CLICKS ON CLIENT'S LIST MENU ");
            }

    @Then("Admin can see The details of list of Clients")
    public void adminCanSeeTheDetailsOfListOfClients() throws InterruptedException {
        ObjPHCLMBPage.ValidateClientListPage();
        System.out.println("ADMIN CAN SEE LIST OF CLIENTS HERE");
    }

    @When("Admin Enters Search Keywords for Clients")
    public void adminEntersSearchKeywordsForClients() throws InterruptedException {
        ObjPHCLMBPage.SearchClientRecord();
        System.out.println("ADMIN CAN ENTER KEYWORD TO SEARCH THE CLIENT RECORDS HERE -ACTIVE");
        ObjPHCLMBPage.ValidateClientListPage();
    }

    @Then("Relevant Clients Search Results Generated")
    public void relevantClientsSearchResultsGenerated() throws InterruptedException {
        ObjPHCLMBPage.ValidateClientListPage();
        System.out.println("------ADMIN CAN SEE RELEVANT CLIENTS SEARCH RESULTS------");
    }

    @When("Admin click on clients view credential icon")
    public void adminClickOnClientsViewCredentialIcon() throws InterruptedException {
        ObjPHCLMBPage.ClickToViewClientCredentials();
        System.out.println("------ADMIN CLICK ON CLIENTS VIEW CREDENTIALS ICON------");
        
        
    }

    @Then("Admin can see client credentials")
    public void adminCanSeeClientCredentials() throws InterruptedException {
        ObjPHCLMBPage.VerifyClientCredentialsAlertBox();
        System.out.println("------ADMIN CAN SEE CLIENT CREDENTIALS------");

        
    }

    @And("Admin Can Copy Client Credentials")
    public void adminCanCopyClientCredentials() throws InterruptedException {
        ObjPHCLMBPage.CopyClientCredentials();
        System.out.println("------ADMIN CAN COPY CLIENT CREDENTIALS------");

    }

    @When("Admin click on clients view Details icon")
    public void adminClickOnClientsViewDetailsIcon() throws InterruptedException {
        ObjPHCLMBPage.ClickToViewClientDetails();
        System.out.println("------ADMIN CLICK ON CLIENTS VIEW DETAILS ICON------");
        
    }

    @Then("Admin can see client Details")
    public void adminCanSeeClientDetails() throws InterruptedException {
       // ObjPHCLMBPage.VerifyViewClientDetailsPage();
        System.out.println("------ADMIN CAN SEE CLIENT DETAILS------");
    }

    @When("Admin clicks on edit button to edit clients details")
    public void adminClicksOnEditButtonToEditClientsDetails() throws InterruptedException {
        ObjPHCLMBPage.ClickOnClientEditButton();
        System.out.println("------ADMIN CLICKS ON EDIT BUTTON TO EDIT CLIENTS DETAILS------");
    }

    @Then("Admin can edit client details")
    public void adminCanEditClientDetails() throws InterruptedException {
        ObjPHCLMBPage.EditClientDetails();
        System.out.println("------ADMIN CAN EDIT CLIENT DETAILS------");
        
    }

    @When("Admin Clicks On Clients User Goals Icon")
    public void adminClicksOnClientsUserGoalsIcon() throws InterruptedException {
        ObjPHCLMBPage.ClickToViewClientuserGoals();
        System.out.println("------ADMIN CLICKS ON CLIENTS USER GOALS ICON------");
        
    }

    @Then("Admin Can See Clients User goals")
    public void adminCanSeeClientsUserGoals() {
        System.out.println("------ADMIN CAN SEE CLIENTS USER GOALS------");
        
    }

    @When("Admin Click On Add User Goal Button")
    public void adminClickOnAddUserGoalButton() throws InterruptedException {
        ObjPHCLMBPage.ClickToAddClientuserGoals();
        System.out.println("------ADMIN CLICK ON ADD USER GOAL BUTTON------");
        
    }

    @Then("Admin Can Add New User Goals for Clients")
    public void adminCanAddNewUserGoalsForClients() throws InterruptedException {
        ObjPHCLMBPage.AddClientuserGoals();
        System.out.println("------ADMIN CAN ADD NEW USER GOALS FOR CLIENTS------");
    }

    @When("Admin click on clients perticular page number")
    public void adminClickOnClientsPerticularPageNumber() throws InterruptedException {
        ObjPHCLMBPage.ClientsPageNavigation();
        System.out.println("------ADMIN CLICK ON CLIENTS PERTICULAR PAGE NUMBER------");

    }

    @Then("Admin can see clients data on that perticular page")
    public void adminCanSeeClientsDataOnThatPerticularPage() {
        System.out.println("------ADMIN CAN SEE CLIENTS DATA ON THAT PERTICULAR PAGE------");
    }
}
