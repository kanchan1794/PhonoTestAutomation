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
    public void adminCanSeeDemoGoalsDetails() {
        System.out.println("ADMIN CAN SEE DEMO GOALS DETAILS");

    }

    @When("Admin First Select Category And Sub-Category value")
    public void adminFirstSelectCategoryValue() {
        System.out.println("ADMIN CAN FIRST SELECT CATEGORY AND SUB-CATEGORY VALUE");


    }

    @Then("Admin Can See Selected Category And SubCategory Demo goals Record")
    public void adminCanSeeSelectedCategoryAndSubCategoryDemoGoalsRecord() {
        System.out.println("ADMIN CAN SEE SELECTED CATEGORY AND SUB-CATEGORY DEMO GOALS RECORD");
    }

    @When("Admin clicks on Delete button to delete perticular demo goal")
    public void adminClicksOnDeleteButtonToDeletePerticularDemoGoal() {
        System.out.println("ADMIN CLICKS ON DELETE BUTTON TO DELETE PERTICULAR DEMO GOALS");

    }

    @Then("Admin Can delete perticular demo goalm record")
    public void adminCanDeletePerticularDemoGoalmRecord() {
    }
}