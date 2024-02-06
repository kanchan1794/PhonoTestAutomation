package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHDashboardPage;

import java.io.IOException;

@SuppressWarnings("unused")
public class PHDashboard extends PHBrowserConfig {
	PHDashboardPage ObjPHDBPage=new PHDashboardPage(driverThread.get());

	public PHDashboard() throws IOException {	}

	@Given("Browser is open and user is logged in")
	public void browser_is_open_and_user_is_logged_in() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.UserLoggedIn();
		System.out.println("------User Is LoggedIN------");
	}

	@Given("User Can Select The Value From Dropdownlist")
	public void user_can_select_the_value_from_dropdownlist() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    ObjPHDBPage.SelectDropdownlistValues();
		System.out.println("------User Can Select Value From DropDown------");

	}

	@When("User Click On Plan Expiry Report")
	public void user_click_on_plan_expiry_report() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.GetPlanExpiryreport();
	}

	@Then("User Navigates To Plan Expiry Report Page")
	public void user_navigates_to_plan_expiry_report_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.ViewPlanExpiryReport();	
		Thread.sleep(2000);
		//ObjPHDBPage.NaviagteBack();
	}
	@When("User Click On Slot Booked Report")
	public void user_click_on_slot_booked_report() throws InterruptedException {
		ObjPHDBPage.GetSlotBookedReport();
	}

	@Then("User Navigates To Slot Booked Report Page")
	public void user_navigates_to_slot_booked_report_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.ViewSlotBookedlist();	
		Thread.sleep(2000);
		ObjPHDBPage.NaviagteBack();
	}

	@When("User Click On Slot Complete Report")
	public void user_click_on_slot_complete_report() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.GetSlotCompletedReport();
		
		}

	@Then("User Navigates To Slot Complete Report Page")
	public void user_navigates_to_slot_complete_report_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.ViewSlotCompletedlist();	
		Thread.sleep(2000);
		ObjPHDBPage.NaviagteBack();
	}
	@When("User Click On Assessments Report")
	public void user_click_on_assessments_report() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.GetAssesmentReport();
	}

	@Then("User Navigates To Assessments Report Page")
	public void user_navigates_to_assessments_report_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHDBPage.ViewAssessmentlist();	
		Thread.sleep(2000);
		ObjPHDBPage.NaviagteBack();

	}



	
}
