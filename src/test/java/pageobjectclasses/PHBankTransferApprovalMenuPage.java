package pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHBankTransferApprovalMenuPage extends PHBrowserConfig {

    private WebDriver driver = null;

    public PHBankTransferApprovalMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickBankTransferApprovalMenu() throws InterruptedException {
//        WebElement BankTransferApprovalScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        BankTransferApprovalScroll.click();
//           Thread.sleep(2000);
           WebElement BanktransferMenu = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]"));
           Actions actions = new Actions(driver);
           actions.moveToElement(BanktransferMenu).click().perform();
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bank Transfer Approval")));
           WebElement BankTransferApprovalMenu_Link = driver.findElement(By.linkText("Bank Transfer Approval"));
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BankTransferApprovalMenu_Link);
           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", BankTransferApprovalMenu_Link);
           //actions.moveToElement(BankTransferApprovalMenu_Link)
//      //  ((JavascriptExecutor) driver).executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", BankTransferApprovalMenu_Link);
//      //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BankTransferApprovalMenu_Link);
//        Actions a = new Actions(driver);
//        a.moveToElement(BankTransferApprovalMenu_Link).perform();
//        a.moveToElement(BankTransferApprovalMenu_Link).click().perform();


    }

    public void SearchBankTransferApprovalRecord() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement Search_BankTransferApprovalRecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));

        Search_BankTransferApprovalRecord.sendKeys("Sandeep Test");
    //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Search_BankTransferApprovalRecord);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", Search_BankTransferApprovalRecord);
        Thread.sleep(4000);
        Search_BankTransferApprovalRecord.getText();
        Search_BankTransferApprovalRecord.clear();
    }
    public void ViewPaymentProof()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]")));
        WebElement ViewPaymentProof = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ViewPaymentProof);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ViewPaymentProof);

    }

//    public void VerifyBankTransferApprovalListScrollVertical() throws InterruptedException {
//        Thread.sleep(4000);
//
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");
//
//
//    }

    public void VerifyBankTrasnferApprvalListScrollHorizantal() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");


    }
}
