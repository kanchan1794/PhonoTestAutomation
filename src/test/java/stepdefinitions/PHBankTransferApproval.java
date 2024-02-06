package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBankTransferApprovalMenuPage;
import pageobjectclasses.PHBrowserConfig;

public class PHBankTransferApproval extends PHBrowserConfig {

    PHBankTransferApprovalMenuPage ObjPHBTAMPage = new PHBankTransferApprovalMenuPage(driverThread.get());


    @When("Admin clicks on Bank Tarnsfer Approval Menu")
    public void adminClicksOnBankTransferApprovalMenu() throws InterruptedException {
        ObjPHBTAMPage.ClickBankTransferApprovalMenu();
        System.out.println("ADMIN CLICK ON BANK TRANSFER APPROVAL MENU");
    }

    @Then("Admin can see Bank Tarnsfer Approval  List")
    public void adminCanSeeBankTarnsferApprovalList() {

        System.out.println("ADMIN CAN SEE BANK TRANSFER APPROVAL LIST");


    }

    @When("Admin Clicks On View Payment Proof")
    public void adminClicksOnViewPaymentProof() {
        ObjPHBTAMPage.ViewPaymentProof();

        System.out.println("ADMIN CAN CLICK ON VIEW PAYMENT PROOF");


    }

    @Then("Admin Can See Payment Information")
    public void adminCanSeePaymentInformation() {
        System.out.println("ADMIN CAN SEE PAYMENT INFORMATION");

    }

    @And("Admin Can Search Record From Bank Transfer Approval List")
    public void adminCanSearchRecordFromBankTransferApprovalList() throws InterruptedException {
        ObjPHBTAMPage.SearchBankTransferApprovalRecord();
        System.out.println("ADMIN CAN SEARCH FOR BANK TRANSFER APPROVAL RECORD");

    }


    @And("Admin can scroll horizantally inside the bank transfer approval list table")
    public void adminCanScrollHorizantallyInsideTheBankTransferApprovalListTable() throws InterruptedException {
   ObjPHBTAMPage.VerifyBankTrasnferApprvalListScrollHorizantal();
   System.out.println("ADMIN CAN SCROLL HORIZANTALLY INSIDE THE BANK TRANSFER APPROVAL LIST TABLE");

    }
}
