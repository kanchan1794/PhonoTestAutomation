package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHClientMenuPage;
import pageobjectclasses.PHMasterActivityMenuPage;

import java.awt.*;

public class PHMasterActivityMenu extends PHBrowserConfig {

    PHMasterActivityMenuPage ObjPHMAMPage = new PHMasterActivityMenuPage(driverThread.get());

    @When("Admin clicks on Master Activity menu")
    public void adminClicksOnMasterActivityMenu() throws InterruptedException {
        ObjPHMAMPage.ViewMasterActivityMenu();
        System.out.println("ADMIN CLICK ON MASTER ACTIVITY MENU");
    }


    @Then("Admin can see Master Activity-List and Add Submenu")
    public void adminCanSeeMasterActivityListAndAddSubmenu() {
        System.out.println("ADMIN CAN SEE LIST AND ADD SUBMENU");
        
    }

    @When("Admin clicks on Master Activity List submenu")
    public void adminClicksOnMasterActivityListSubmenu() {
        ObjPHMAMPage.ClickMasterActivityListSubMenu();
        System.out.println("ADMIN CLICK ON MASTER ACTIVITY LIST SUBMENU");

        
    }

    @Then("Admin can see The details of list of Master Activity")
    public void adminCanSeeTheDetailsOfListOfMasterActivity() {
        System.out.println("ADMIN CAN SEE THE DETAILED LIST OF MASTER ACTIVITY");
        
    }

    @When("Admin Enters Search Keywords for Master Activity")
    public void adminEntersSearchKeywordsForMasterActivity() throws AWTException, InterruptedException {
        ObjPHMAMPage.SeacrhByUsingNameDescription();
        System.out.println("ADMIN ENTERS SEARCH KEYWORDS FOR MASTER ACTIVITY");

    }

    @Then("Relevant Master Activity Search Results Generated")
    public void relevantMasterActivitySearchResultsGenerated() {
        System.out.println("RELEVANT MASTER ACTIVITY SEARCH RESULTS GENERATED");
        
    }

    @When("Admin Select Value from Category And Sub Category DropDown List")
    public void adminSelectValueFromCategoryDropDownList() throws InterruptedException {
        ObjPHMAMPage.SelectCategoryAndSubCategory();
        System.out.println("ADMIN SELECT VALUE FROM CATEGORY AND SUBCATEGORY DROPDOWN LIST");
        
    }

    @Then("Admin Can See Selected Category And SubCategory Record")
    public void adminCanSeeSelectedCategoryRecord() {
        System.out.println("ADMIN CAN SEE SELECTED CATEGORY AND SUBCATEGORY RECORD");
        
    }

//    @When("Admin Select Value from Sub-Category DropDown List")
//    public void adminSelectValueFromSubCategoryDropDownList() {
//
//    }
//
//    @Then("Admin Can See Selected Sub-Category Record")
//    public void adminCanSeeSelectedSubCategoryRecord() {
//
//    }

    @When("Admin Select Value from Game Type DropDown List")
    public void adminSelectValueFromGameTypeDropDownList() throws InterruptedException {
       // ObjPHMAMPage.SelectGameType();
        System.out.println("ADMIN CAN SELECT VALUE FROM GAME TYPE DROPDOWNLIST");
        
    }

    @Then("Admin Can See Selected Game Type Record")
    public void adminCanSeeSelectedGameTypeRecord() {
        System.out.println("ADMIN CAN SEE SELECTED GAME TYPE RECORD");
        
    }

    @And("Admin Search Record By ID")
    public void adminSearchRecordByID() {
        
    }

    @When("Admin Click on Edit Icon")
    public void adminClickOnEditIcon() {
        
    }

    @Then("Admin Can Edit The Master Activity Details")
    public void adminCanEditTheMasterActivityDetails() {
        
    }

    @When("Admin Click On Delete Icon")
    public void adminClickOnDeleteIcon() {
        
    }

    @Then("Admin Can Delete The Master Activity")
    public void adminCanDeleteTheMasterActivity() {
        
    }

    @When("Admin Click On Play Icon")
    public void adminClickOnPlayIcon() {
        
    }

    @Then("Admin Can Play The Master Activity")
    public void adminCanPlayTheMasterActivity() {
        
    }

    @When("Admin Select Page number from DropDownList")
    public void adminSelectPageNumberFromDropDownList() {
        
    }

    @Then("Admin Can Naviagte To The Perticular Page")
    public void adminCanNaviagteToThePerticularPage() {
        
    }

    @When("Admin Can Scroll Horizantal Inside Master Activity table")
    public void adminCanScrollHorizantalInsideMasterActivityTable() {
    }
}
