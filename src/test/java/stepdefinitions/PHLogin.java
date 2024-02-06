package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHLoginPage;

public class PHLogin extends PHBrowserConfig{
	
	//PHLogInPage ObjPHLogInPage=new PHLogInPage(driverThread.get());
	PHLoginPage ObjPHLoginPage = new PHLoginPage(driverThread.get());

	
	@Given("Browser Is Open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside the steps: browser is open");
	}

	@Given("User Is On Login Page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHLoginPage.GoToLogInPage();
	}

	@When("User Enters Username and Password")
	public void user_enters_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHLoginPage.EnterCredentials();
	}

	@When("User Clicks On Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ObjPHLoginPage.ClickOnLoginButton();
	}

	@Then("User Is Navigated To Dashboard")
	public void user_is_navigated_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is abele to login and on dash baord");
	}


}
