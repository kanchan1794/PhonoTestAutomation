package pageobjectclasses;

import org.openqa.selenium.*;
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
        WebElement BankTransferApprovalScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        BankTransferApprovalScroll.click();
           Thread.sleep(2000);
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
//Search_BankTransferApprovalRecord.sendKeys("Sandeep");
Thread.sleep(2000);
        Search_BankTransferApprovalRecord.sendKeys("Sandeep");
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        Search_BankTransferApprovalRecord.sendKeys(s);
        // sending DELETE key
        Thread.sleep(2000);
        Search_BankTransferApprovalRecord.sendKeys(Keys.DELETE);

        //int length = Search_BankTransferApprovalRecord.getAttribute("Sandeep").length();
        //for (int i = 0; i < length; i++) {
          //  Search_BankTransferApprovalRecord.sendKeys(Keys.BACK_SPACE);
//        Actions actions = new Actions(driver);
//
//        actions.click(driver.findElement(By.xpath("//input[@id='filter-input-focus']")))
//                .keyDown(Keys.CONTROL)
//                .sendKeys("Sandeep")
//                .keyUp(Keys.CONTROL)
//                .sendKeys(Keys.BACK_SPACE)
//                .build()
//                .perform();

    }

    public void ViewPaymentProof() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]")));
        WebElement ViewPaymentProof = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ViewPaymentProof);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ViewPaymentProof);

    }


//public void VerifyBankTrasnferApprvalListScrollHorizantal() throws InterruptedException {
//    {
//// Find the table element you want to scroll horizontally
//        WebElement BankTransferApprovaltableToScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
//
//        // Use JavascriptExecutor to scroll horizontally within the table
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//
//        // Adjust the scrollLeft property to scroll to a specific horizontal position within the table
//        jsExecutor.executeScript("arguments[0].scrollLeft = 300;", BankTransferApprovaltableToScroll);
//
//    }
//}


    public void ScrollverticalInsideBTAMenuetable() {
        // Initialize JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by pixels
        js.executeScript("window.scrollBy(0, 70);");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));

        WebElement vertcialScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
       JavascriptExecutor js1 = (JavascriptExecutor) driver;

        // Scroll down within the table by setting scrollTop
        js1.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", vertcialScroll);

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Scroll back up within the table
        js.executeScript("arguments[0].scrollTop = 0", vertcialScroll);
        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ScrollHorizantalInsideBTAMenutable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Define the CSS selector of the table or its scrollable parent element
        String tableSelector = "div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.col-12.col-sm-12.col-lg-12 div.card.card-accent-primary div.sc-aXZVg.dKvPpX div:nth-child(1) > div.table-responsive:nth-child(1)";

        // Scroll horizontally to the right inside the table
        js.executeScript("document.querySelector('" + tableSelector + "').scrollLeft += 200");

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll horizontally to the left inside the table
        js.executeScript("document.querySelector('" + tableSelector + "').scrollLeft -= 200");

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
