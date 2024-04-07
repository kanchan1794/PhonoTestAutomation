package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.IOException;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty", "html:target/Destination"},
        features = {"src/test/java/featurefiles"},
        glue = {"stepdefinitions"},
		//plugin = {"pretty","html:target/cucumber.html"},
        plugin = {"json:target/cucumber.json"},
       // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
      // tags = "@Login or @DemoGoalsMenu or @DemoGoals-CategoryAndSubCategory or @DemoGoalsDeleteFunction"
      //tags = "@Login or  @LogsMenu or @logspageNavigation or @LogsSearch or  @ScrollInsidetable-Logs"
        //tags = "@Login or  @LogsMenu or @logspageNavigation"


        ///---------------------TILL THE TIME EXECUTION-------------------///
		//THERAPIST MENU
		tags = "@Login or @TherapistMenu or @TherapistListSubMenu or @TherapistShowCredentials or  @TherapistViewDetails or @PageBreadCrumbs or @TherapistListTableScrollDown "
		//PARTNERS MENU
		//tags ="@Login or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown"
		//CLIENTS MENU
		//tags="@Login or @ClientMenu or @ClientListSubMenu or @ClientViewCredentialIcon or @ClientViewDetails or @EditClientDetails or @ClientMenuPageNavigation"
		//LEADS MENU
		//tags = "@Login or @LeadMenu or @LeadListSubMenu or @ViewLeadsDetails or  @EditLeadsDetails or @LeadsPageNavigation"
       //PLAN MENU
		//tags = "@Login or @PlanMenu or @PlanListSubMenu or @PlanEditDetails or @AddPlanDetails or @DeletePlan"
		//TRANSACTION MENU
		//tags ="@Login or @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown"
        //PAYMENT_LINK MENU
		//tags="@Login or   @PaymentLinkMenu or   @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom or @PaymentLinkCreateSubMenu "
		//INVOICES MENU
		//tags="@Login or @InvoicesMenu or @InvoicePageBreadCrumbs or @InvoiceScrollInsidetable or @InvoiceSearch"
		//BANK TRANSFER APPROVAL MENU
		//tags ="@Login or @BankTransferApprovalMenu  or @BankTransferViewPaymentProof or @BankTransferApprovalListTableScrollDown"
		//MEDIA MANAGER
		//tags="@Login or @MediaManagerMenu or @MediaManagerSearch or @AddMediaFile or @MediaManagerNextPreviousButton or @HandlingMedia "
		//TUTORIALS MENU
		//tags="@Login or @TutorialsMenu or @AddTutorials"
		//MASTER VIDEOS MEUU
		//tags = "@Login or @MasterVideoMenu or @AddMasterVideos"
		//SCREENING TEST MENU
		//tags = "@Login or @ScreeningTestMenu or @ViewScreeningReport or @ScreeningTestpagenavigation"
       //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
        //tags="@Login or @DownloadMenu or @DownloadSessionReport"
        //tags ="@Login or @TherapistMenu or @TherapistAddSubMenu"


		//or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown or @ClientMenu or   @LeadMenu or @PlanMenu or  @PlanListSubMenu or @PlanViewDetails or  @TransactionMenu or  @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown or @PaymentLinkMenu or @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom or   @PaymentLinkCreateSubMenu or @InvoicesMenu or  @InvoicePageBreadCrumbs or @BankTransferApprovalMenu or @BankTransferApprovalListTableScrollDown or @MasterVideoMenu or @AddMasterVideos or @ScreeningTestMenu or @ViewScreeningReport or @ScreeningTestpagenavigation or @DemoGoalsMenu or @DemoGoals-CategoryAndSubCategory or DemoGoalsDeleteFunction "



)

public class TestRunner {
}

//
//}
