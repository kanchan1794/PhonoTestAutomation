package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHMasterVideoMenuPage;
import pageobjectclasses.PHTutorialsMenuPage;

import java.awt.*;

public class PHMasterVideosMenu extends PHBrowserConfig {


    PHMasterVideoMenuPage ObjPHMVMBPage = new PHMasterVideoMenuPage(driverThread.get());

    @When("Admin clicks on Master Videos menu")
    public void adminClicksOnMasterVideosMenu() throws InterruptedException {
        ObjPHMVMBPage.ClickMasterVideoMenu();
        System.out.println("ADMIN CAN CLICK ON TUTORIALS MENU");
    }


    @Then("Admin can see Master Videos Details")
    public void adminCanSeeMasterVideosDetails() {
        System.out.println("ADMIN CAN SEE MASTER VIDEOS DETAILS");
        
    }

    @When("Admin click on Add Master Videos")
    public void adminEntersClickOnAddMasterVideos() throws InterruptedException, AWTException {
        ObjPHMVMBPage.AddMasterVideo();
        System.out.println("ADMIN CAN CLICK ON Add Master Videos");

    }

    @Then("Admin Can Add New Master Videos")
    public void adminCanAddNewMasterVideos() {
        System.out.println("ADMIN CAN ADD NEW MASTER VIDEOS");

    }
}