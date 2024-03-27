package stepdefinitions;

import CommonUtils.ScreenRecorderUtil;
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
    public void adminClicksOnMediaManagerMenu() throws Exception {
        ScreenRecorderUtil.startRecord("MEDIA MANAGER-PHONOLOGIX ADMIN DASHBOARD");
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
    public void adminCanAddNewMediaFile() throws Exception {

        System.out.println("ADMIN CAN ADD NEW MEDIA FILE");
        ScreenRecorderUtil.stopRecord();
    }

    @And("Admin Can Click On next Button To See The Media On next Page")
    public void adminCanClickOnNextButtonToSeeTheMediaOnNextPagePage() throws InterruptedException {
        ObjPHMMMBPage.MediaManagerNextButton();

        System.out.println("ADMIN CAN CLICK ON NEXT BUTTON TO SEE THE MEDIA ON NEXT PAGE");

    }

    @Then("Admin Can Navigate Back To The First Page By Clicking On Previous Button")
    public void adminCanNavigateBackToTheFirstPageByClickingOnPreviousButton() throws InterruptedException {
        ObjPHMMMBPage.MediaManagerPreviousButton();
        System.out.println("ADMIN CAN NAVIAGTE BACK TO THE FIRST PAGE BY CLICKING ON PREVIOUS BUTTON");
    }

    @And("Admin Can Click On Preview Icon")
    public void adminCanClickOnPreviewIcon() throws InterruptedException {
        ObjPHMMMBPage.HandleMedia();

    }

    @And("Admin Can Click On Edit Media icon")
    public void adminCanClickOnEditMediaIcon() throws InterruptedException {
        ObjPHMMMBPage.ClickEditMediaIcon();

    }

    @And("Admin Can Click On Media Usuage Icon")
    public void adminCanClickOnMediaUsuageIcon() throws InterruptedException {
        ObjPHMMMBPage.ClickToSeeUsuageOfMedia();
    }
}