package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectclasses.PHBrowserConfig;
import pageobjectclasses.PHInvoicesMenuPage;

public class PHInvoices extends PHBrowserConfig {


    PHInvoicesMenuPage ObjPHInMPage = new PHInvoicesMenuPage(driverThread.get());

    @When("Admin clicks on Invoices menu")
    public void adminClicksOnClientMenu() {
        ObjPHInMPage.ClickInvoicesMenu();
        System.out.println("ADMIN CLICK ON INVOICES MENU");
    }

    @Then("Admin can see Invoices List")
    public void adminCanSeeInvoicesList() throws InterruptedException {
        ObjPHInMPage.ValidateInvoicePage();
        System.out.println("ADMIN CAN SEE INVOICE LIST");

    }

    @When("Admin Clicks On View Invoice Link")
    public void adminClicksOnViewInvoiceLink() {
        ObjPHInMPage.ClickOnViewInvoice();
        System.out.println("ADMIN CAN CLICK ON VIEW INVOICE LINK TO VIEW THE INVOCIES");

    }

    @Then("Admin Can See Invoice Information")
    public void adminCanSeeInvoiceInformation() throws InterruptedException {
        System.out.println("ADMIN CAN SEE INVOICE INFORMATION");
    }

    @When("Admin clicks on perticular Invoices page breadcrumbs")
    public void adminClicksOnPerticularInvoicesPageBreadcrumbs() {
        ObjPHInMPage.ClickOnInvoicesPageBreadCrumbs();
        System.out.println("ADMIN CAN CLICK ON PERTICULAR INVOICE PAGE BREADCRUMBS");


    }

    @Then("admin can see the data on perticular Invoices page")
    public void adminCanSeeTheDataOnPerticularInvoicesPage() throws InterruptedException {
        ObjPHInMPage.ValidateInvoicePageBreadCrumbsPage();
        System.out.println("ADMIN CAN SEE DATA ON PRTICULAR INVOICE PAGE ");

    }
}

