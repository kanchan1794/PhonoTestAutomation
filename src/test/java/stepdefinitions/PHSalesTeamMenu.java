package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHSalesTeamMenuPage;

public class PHSalesTeamMenu extends PHBrowserConfig {

    PHSalesTeamMenuPage ObjPHSTMPage = new PHSalesTeamMenuPage(driverThread.get());

    @When("Admin clicks on Sales Team menu")
    public void adminClicksOnTransactionMenu() {
        ObjPHSTMPage.ClickSalesTeamMenu();
        System.out.println("ADMIN CAN CLICK ON SALES TEAM MENU");
    }
    @Then("Admin can see Sales Team Submenu Options")
    public void adminCanSeeSalesTeamSubmenuOptions() {
        System.out.println("ADMIN CAN SEE SALES TEAM SUBBMENU OPTIONS");

    }

    @When("Admin clicks on SalesTeam-list submenu")
    public void adminClicksOnSalesTeamListSubmenu() {
        System.out.println("ADMIN CAN CLICK ON SALES TEAM LIST -SUBMENU");

    }

    @Then("Admin can see The details of list of Sales Team")
    public void adminCanSeeTheDetailsOfListOfSalesTeam() {
        System.out.println("ADMIN CAN SEE THE DETAILS OF LIST OF SALES TEAM");

    }

    @When("Admin clicks on Sales Team-Add submenu")
    public void adminClicksOnSalesTeamAddSubmenu() {

    }

    @Then("Admin Can Add Details Of Sales Team")
    public void adminCanAddDetailsOfSalesTeam() {
    }
}
