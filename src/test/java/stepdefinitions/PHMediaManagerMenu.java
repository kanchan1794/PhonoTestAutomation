package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHMediaManagerMenuPage;
import pageobjectclasses.PHTransactionMenuPage;

import java.awt.*;

public class PHMediaManagerMenu extends PHBrowserConfig {


    PHMediaManagerMenuPage ObjPHMMMBPage = new PHMediaManagerMenuPage(driverThread.get());

    @When("Admin clicks on Media Manager menu")
    public void adminClicksOnMediaManagerMenu() throws InterruptedException {
        ObjPHMMMBPage.ClickMediaManagerMenu();
        System.out.println("ADMIN CAN CLICK ON MEDIA MANAGER MENU");
    }

    @Then("Admin can see Media Manager Details")
    public void adminCanSeeMediaManagerDetails() {
        System.out.println("ADMIN CAN SEE MEDIA MANAGER DETAILS");

        
    }

    @When("Admin selects options from search dropdown list")
    public void adminSelectsOptionsFromSearchDropdownList() throws InterruptedException {
        ObjPHMMMBPage.SearchMedia();
        System.out.println("ADMIN CAN SELECTS OPTIONS FROM SEARCH DROPDOWN LIST");
        
    }

    @Then("Admin can see the selected options media details")
    public void adminCanSeeTheSelectedOptionsMediaDetails() {
        System.out.println("ADMIN CAN SEE THE SELECTED OPTIONS MEDIA DETAILS");
        
    }

    @When("Admin can enters value to search")
    public void adminCanEntersValueToSearch() throws InterruptedException {
        ObjPHMMMBPage.SearchDetails();
        System.out.println("ADMIN CAN ENTERS VALUE TO SEARCH");
        
    }

    @Then("Admin Can see perticular search result")
    public void adminCanSeePerticularSearchResult() {
        System.out.println("ADMIN CAN SEE PERTICULAR SEARCH RESULT");

        
    }

    @When("Admin Enters click on Add Media File")
    public void adminEntersClickOnAddMediaFile() throws InterruptedException, AWTException {
        ObjPHMMMBPage.AddmediaFile();
        System.out.println("ADMIN CLICK ON ADD MEDIA FILE");
    }

    @Then("Admin Can Add New Media file")
    public void adminCanAddNewMediaFile() {

        System.out.println("ADMIN CAN ADD NEW MEDIA FILE");
    }
}