package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHSlotMenuPage;

public class PHSlot extends PHBrowserConfig {

    PHSlotMenuPage ObjPHSLMPage = new PHSlotMenuPage(driverThread.get());


    @When("Admin clicks on Slot menu")
    public void adminClicksOnSlotMenu() throws InterruptedException {
        ObjPHSLMPage.ClickSlotsMenu();
        System.out.println("ADMIN CLICK ON Slot Menu");
    }

    @Then("Admin can see Slot Submenu Options")
    public void adminCanSeeSlotSubmenuOptions() {
        System.out.println("ADMIN CAN SEE Slot SUBMENU OPTIONS");


    }

    @When("Admin clicks on Slot-CalendarView submenu")
    public void adminClicksOnSlotCalendarViewSubmenu() {
        ObjPHSLMPage.ClickCalendarViewSubMenu();
        System.out.println("ADMIN CAN CLICK ON CALENDARE VIEW SUBMENU");


    }

    @Then("Admin Can See The Slot Calendar")
    public void adminCanSeeTheSlotCalendar() throws InterruptedException {
        ObjPHSLMPage.ValidateSlotCalendareViewPage();
        System.out.println("ADMIN CAN SEE SLOT CALENDAR");


    }

    @When("Admin Select The therapist Name From DropDown")
    public void adminSelectTheTherapistNameFromDropDown() throws InterruptedException {
        ObjPHSLMPage.CVSelectTherapist();
        System.out.println("ADMIN CAN SELECT THERAPIST NAME FROM DROPDOWN");


    }

    @Then("Admin Can See Slot Calendar For Selected Therapist")
    public void adminCanSeeSlotCalendarForSelectedTherapist() {

        System.out.println("ADMIN CAN SEE SLOT CALENDAR FOR SELECTED");

    }

    @When("Admin Can Select Status from DropDown-List")
    public void adminCanSelectStatusFromDropDownList() throws InterruptedException {
        ObjPHSLMPage.SelectStatus();

        System.out.println("ADMIN CAN SELECT STATUS FROM DROPDOWN");


    }

    @Then("Admin Can See Slot Calendar For Perticular Status")
    public void adminCanSeeSlotCalendarForPerticularStatus() {

        System.out.println("ADMIN CAN SEE SLOT CALENDAR FOR PERTICULAR STATUS");


    }

    @When("Admin Can Select Start-Time from DropDown-List")
    public void adminCanSelectStartTimeFromDropDownList() {

        System.out.println("ADMIN CAN SELECT START-TIME FROM DROPDOWN");


    }

    @Then("Admin Can See Slot Calendar For Perticular Start-Time")
    public void adminCanSeeSlotCalendarForPerticularStartTime() {
        System.out.println("ADMIN CAN SEE SLOT CALENDAR FOR PERTICULAR START-TIME");

    }

    @When("Admin clicks on Slot-Zoom Report submenu")
    public void adminClicksOnSlotZoomReportSubmenu() {
        ObjPHSLMPage.ClickZoomReportSubMenu();
        System.out.println("ADMIN CAN CLICK ON ZOOM REPORT SUB MENU");

        
    }

    @Then("Admin Can See The Slot-Zoom Report")
    public void adminCanSeeTheSlotZoomReport() {
        System.out.println("ADMIN CAN SEE THE SLOT ZOOM REPORT");


    }

    @When("Admin Select Start-Date And End-Date And click On Submit Button")
    public void adminSelectStartTimeAndEndTimeAndClickOnSubmitButton() throws InterruptedException {
        ObjPHSLMPage.SelectStartDateEndDate();
        System.out.println("ADMIN CAN SELECT START-DATE AND END-DATE");
        
    }

    @Then("Admin Can See Zoom Report For Selected Duration")
    public void adminCanSeeZoomReportForSelectedDuration() {
        
    }

    @When("Admin Select Email From DropDown List")
    public void adminSelectEmailFromDropDownList() {


    }

    @Then("Admin Can See Zoom Report For Selected Email")
    public void adminCanSeeZoomReportForSelectedEmail() {
    }
}