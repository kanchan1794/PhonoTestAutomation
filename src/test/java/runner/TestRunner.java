package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/featurefiles"},
        glue = {"stepdefinitions"},
		plugin = {"json:target/cucumber.json"},
		//tags = "@Login or @TutorialsMenu or @AddTutorials"
		//tags = "@Login or @MediaManagerMenu or @MediaManagerSearch or @AddMediaFile"
		//tags = "@Login or @PlanMenu or   @PlanListSubMenu or PlanViewDetails"
		tags ="  @Login or @TherapistMenu or @TherapistListSubMenu or @TherapistShowCredentials or  @TherapistViewDetails or @PageBreadCrumbs or @TherapistListTableScrollDown or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown or @ClientMenu or   @LeadMenu or   @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown "

		//tags = "@Login or @InvoicesMenu or   @InvoicePageBreadCrumbs"
		//tags="@Login or @SlotMenu or @SlotZoomReportSubmenu"
		//tags = "@Login or @PartnersMenu"
       //tags ="@Login or @PartnersMenu or @PartnersListSubMenu or @PartnersListTableScrollDown "
       //  tags ="@Login or @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown"



//tags="@Login or   @PaymentLinkMenu or   @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom or @PaymentLinkCreateSubMenu or @InvoicesMenu or   @InvoicePageBreadCrumbs or   @BankTransferApprovalMenu or @BankTransferApprovalListTableScrollDown"

//tags ="@Login or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown"
		//or @TherapistListSubMenu or @TherapistExcelFileDownload or @PageBreadCrumbs or @TherapistListTableScrollDown or @TherapistShowCredentials or @TherapistViewDetails or
// or @TherapistAddSubMenu  or @Dashboard

		//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



)

public class TestRunner {

}
