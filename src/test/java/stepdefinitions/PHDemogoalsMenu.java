package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHDemoGoalsMenuPage;
import pageobjectclasses.PHScreeningTestMenuPage;

import java.awt.*;

public class PHDemogoalsMenu extends PHBrowserConfig {


    PHDemoGoalsMenuPage ObjPHDGMBPage = new PHDemoGoalsMenuPage(driverThread.get());

    @When("Admin clicks on Demo Goals menu")
    public void adminClicksOnDemoGoalsMenu() throws InterruptedException {
        ObjPHDGMBPage.ClickDemoGoalsMenu();
        System.out.println("ADMIN CAN CLICK ON TUTORIALS MENU");
    }


    @Then("Admin can see Demo Goals Details")
    public void adminCanSeeDemoGoalsDetails() throws InterruptedException{
        ObjPHDGMBPage.ValidateDemoGoalspage();
        System.out.println("ADMIN CAN SEE DEMO GOALS DETAILS");

    }

    @When("Admin First Select Category And Sub-Category value")
    public void adminFirstSelectCategoryValue() throws InterruptedException{
        ObjPHDGMBPage.SelectCategoryAndSubCategory();
        System.out.println("ADMIN CAN FIRST SELECT CATEGORY AND SUB-CATEGORY VALUE");


    }

    @Then("Admin Can See Selected Category And SubCategory Demo goals Record")
    public void adminCanSeeSelectedCategoryAndSubCategoryDemoGoalsRecord() {
        System.out.println("ADMIN CAN SEE SELECTED CATEGORY AND SUB-CATEGORY DEMO GOALS RECORD");
    }

    @When("Admin clicks on Delete button to delete perticular demo goal")
    public void adminClicksOnDeleteButtonToDeletePerticularDemoGoal() throws InterruptedException{
        ObjPHDGMBPage.DeletDemoGoals();
        System.out.println("ADMIN CLICKS ON DELETE BUTTON TO DELETE PERTICULAR DEMO GOALS");

    }

    @Then("Admin Can delete perticular demo goalm record")
    public void adminCanDeletePerticularDemoGoalmRecord() {
    }

    @When("admin click on ADD button")
    public void adminClickOnADDButton() throws InterruptedException{
        ObjPHDGMBPage.ADD_demogaols();
        System.out.println("admin click on ADD button");


    }

    @Then("admin can fill category & sub category details")
    public void adminCanFillCategorySubCategoryDetails() throws InterruptedException{
        ObjPHDGMBPage.admin_can_fill_details();
        System.out.println("admin can fill category & sub category details");
    }

    @When("Admin enter search keyword")
    public void adminEnterSearchKeyword() throws InterruptedException{
        ObjPHDGMBPage.Admin_enter_search_keyword();
        System.out.println("Admin enter search keyword");
        
    }

    @Then("relevant search is generated")
    public void relevantSearchIsGenerated() {
        ObjPHDGMBPage.relevant_search_is_generated();
        System.out.println("relevant search is generated");
    }
}