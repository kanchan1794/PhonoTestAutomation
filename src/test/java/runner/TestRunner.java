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
//tags = "@Login or @ScreeningTestMenu or @ViewScreeningReport or @ScreeningTestpagenavigation"

//tags="@Login or @MediaManagerMenu or @MediaManagerSearch or @AddMediaFile or @MediaManagerNextPreviousButton or @HandlingMedia "


        ///---------------------TILL THE TIME EXECUTION-------------------///
		//tags = "@Login or @TherapistMenu or @TherapistListSubMenu or @TherapistShowCredentials or  @TherapistViewDetails or @PageBreadCrumbs or @TherapistListTableScrollDown "
        //or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown or @ClientMenu or   @LeadMenu or @PlanMenu or  @PlanListSubMenu or @PlanViewDetails or  @TransactionMenu or  @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown or @PaymentLinkMenu or @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom or   @PaymentLinkCreateSubMenu or @InvoicesMenu or  @InvoicePageBreadCrumbs or @BankTransferApprovalMenu or @BankTransferApprovalListTableScrollDown or @MasterVideoMenu or @AddMasterVideos or @ScreeningTestMenu or @ViewScreeningReport or @ScreeningTestpagenavigation or @DemoGoalsMenu or @DemoGoals-CategoryAndSubCategory or DemoGoalsDeleteFunction "

//tags = "@Login or @ClientMenu or @ClientListSubMenu"
		//tags = "@Login or @MasterVideoMenu or @AddMasterVideos",
		        //tags = "@Login or @PlanMenu or @PlanListSubMenu or @PlanEditDetails or @AddPlanDetails or @DeletePlan"
		//tags ="  @Login or @TherapistMenu or @TherapistListSubMenu or @TherapistShowCredentials or  @TherapistViewDetails or @PageBreadCrumbs or @TherapistListTableScrollDown or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown or @ClientMenu or   @LeadMenu or   @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown "
		//tags="@Login or @SlotMenu or @SlotZoomReportSubmenu"
        //tags ="@Login or @PartnersMenu or @PartnersListSubMenu or @PartnersListTableScrollDown "
//         tags ="@Login or @TransactionMenu or   @TransactionPageBreadCrumbs or   @TransactionListTableScrollDown"

//tags="@Login or   @PaymentLinkMenu or   @PaymentLinkListSubmenu or @PaymentLinkListScrollTOP-Bottom or @PaymentLinkCreateSubMenu "

//tags="@Login or @AssessmentMenu or @AssessmentCalendarSelection"

//tags="@Login or @InvoicesMenu or @InvoicePageBreadCrumbs or @InvoiceScrollInsidetable or @InvoiceSearch"
  //tags ="@Login or @BankTransferApprovalMenu  or @BankTransferViewPaymentProof or @BankTransferApprovalListTableScrollDown"

//tags ="@Login or @PartnersMenu or   @PartnersListSubMenu or   @PartnersShowCredentials or   @PartnersViewDetails or   @PartnersageBreadCrumbs or @PartnersListTableScrollDown"
		//or @TherapistListSubMenu or @TherapistExcelFileDownload or @PageBreadCrumbs or @TherapistListTableScrollDown or @TherapistShowCredentials or @TherapistViewDetails or
// or @TherapistAddSubMenu  or @Dashboard

		//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
tags="@Login or @ClientMenu or @ClientListSubMenu or @ClientViewCredentialIcon or @ClientViewDetails or @EditClientDetails or @ClientUserGoals or  @ClientMenuPageNavigation"
//tags = "@Login or @LeadMenu or @LeadListSubMenu or @ViewLeadsDetails or  @EditLeadsDetails or @LeadsPageNavigation"

)

public class TestRunner {
}

//
//}
