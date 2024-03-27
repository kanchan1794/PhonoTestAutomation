package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHAssessmentMenuPage;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHSlotMenuPage;

public class PHAssessment extends PHBrowserConfig {

    PHAssessmentMenuPage ObjPHSLMPage = new PHAssessmentMenuPage(driverThread.get());


    @When("Admin clicks on Assessment menu")
    public void adminClicksOnAssessmentMenu() throws InterruptedException {
        ObjPHSLMPage.ClicksOnAssessmentMenu();
        System.out.println("ADMIN CLICK ON Slot Menu");
    }

    @Then("Admin can see Assessment Details")
    public void adminCanSeeAssessmentDetails() {
        System.out.println("ADMIN CAN SEE ASSESSMENT DETAILS");

    }

    @When("Admin Select to and from calendar dates")
    public void adminSelectToAndFromCalendarDates() throws InterruptedException {
        ObjPHSLMPage.SelectCalendarDates();
        System.out.println("ADMIN SELECT TO AND FROM CALENDAR DATES");

    }

    @Then("Admin Can See assessment record for selected calendar dates")
    public void adminCanSeeAssessmentRecordForSelectedCalendarDates() {
        System.out.println("ADMIN CAN SEE ASSESSMENT RECORD FOR SELECTED CALENDAR DATES");

    }

    @When("Admin Select duration from dropdown list")
    public void adminSelectDurationFromDropdownList() {
        System.out.println("ADMIN SELECT DURATION FROM DROPDOWN LIST");

    }

    @Then("Admin Can See assessment record for that perticular duration")
    public void adminCanSeeAssessmentRecordForThatPerticularDuration() {
        System.out.println("ADMIN CAN SEE ASSESSMENT RECORD FRO THAT PERTICULAR DURATION");

    }

    @When("Admin can enters value to search for assessment record")
    public void adminCanEntersValueToSearchForAssessmentRecord() {
        System.out.println("ADMIN CAN ENTERS VALUE TO SEARCH FOR ASSESSMENT RECORD");

    }

    @Then("Admin Can See relevant search record")
    public void adminCanSeeRelevantSearchRecord() {
        System.out.println("ADMIN CAN SEE RELEVANT SEARCH RECORD");

    }

    @And("Admin Can Scroll Horizantal Inside Assessment table")
    public void adminCanScrollHorizantalInsideAssessmentTable() {
        System.out.println("ADMIN CAN SCROLL HORIZANTAL INSIDE ASSESSMENT TABLE");

    }

    @Then("Admin Can Scroll vertical Inside Assessment table")
    public void adminCanScrollVerticalInsideAssessmentTable() {
        System.out.println("ADMIN CAN SCROLL VERTICAL INSIDE ASSESSMENT TABLE");
    }
}