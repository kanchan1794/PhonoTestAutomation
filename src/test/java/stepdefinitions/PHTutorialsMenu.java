package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHMediaManagerMenuPage;
import pageobjectclasses.PHTutorialsMenuPage;

import java.awt.*;

public class PHTutorialsMenu extends PHBrowserConfig {


    PHTutorialsMenuPage ObjPHTMBPage = new PHTutorialsMenuPage(driverThread.get());

    @When("Admin clicks on Tutorials menu")
    public void adminClicksOnTutorialsMenu() throws InterruptedException {
        ObjPHTMBPage.ClickTutorialsMenu();
        System.out.println("ADMIN CAN CLICK ON TUTORIALS MENU");
    }

    @Then("Admin can see Tutorials Details")
    public void adminCanSeeTutorialsDetails() {
        
    }

    @When("Admin Enters click on Add Tutorials")
    public void adminEntersClickOnAddTutorials() throws InterruptedException, AWTException {
        ObjPHTMBPage.AddTutorial();
        System.out.println("ADMIN CAN CLICK ON ADD TUTORIALS ");
        
    }

    @Then("Admin Can Add New Tutorials")
    public void adminCanAddNewTutorials() {
    }
}