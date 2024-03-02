package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHTransactionMenuPage extends PHBrowserConfig{
    private WebDriver driver = null;

    public PHTransactionMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }




    public void ViewTransactionMenu() throws InterruptedException {

        Thread.sleep(2000);

//        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        MediaManagerScroll.click();

        // Locate the menu bar element (replace 'your_menu_locator' with the actual locator of your menu bar)
        WebElement TransactionScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(TransactionScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/transactions']")));
        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TransactionMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TransactionMenu_Link);

    }//super(driver);
    public void ValidateTransactionPage() throws InterruptedException {
        //VALIDATE LOGIN TEXT ON PAGE
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
    }
    public void SearchTransactionrecords()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchTransactionrecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchTransactionrecord);
        SearchTransactionrecord.sendKeys("Sandeep");

        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchTransactionrecord);

    }
    public void ValidateTransactionRecordsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed()+"**********");

    }
    public void ClickOnTransactionpageBreadCrumbs()
    {

        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        Wait.until((ExpectedConditions.visibilityOfElementLocated((By.linkText("5")))));
        WebElement TraPageBreadCrumbs_Link = driver.findElement(By.linkText("5"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TraPageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TraPageBreadCrumbs_Link);

    }

    public void ValidateTRanSearchPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed() + "**********");
        Thread.sleep(2000);

    }
    public void GOPreviousPage() throws InterruptedException {

        Thread.sleep(2000);
       ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        WebElement GoBackTrPage = driver.findElement(By.linkText("1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GoBackTrPage);
        GoBackTrPage.click();
       // JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])")));
driver.navigate().back();


//        WebElement TRScrollUP = driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])"));
//
////TRScrollUP.isDisplayed();


    }
    public void VerifyTransactionListScrollVertical() throws InterruptedException {

        Thread.sleep(4000);
        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
        TransactionMenu_Link.click();
        //Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");
    }

    public void VerifyTransactionListScrollHorizantal() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");


    }




}
