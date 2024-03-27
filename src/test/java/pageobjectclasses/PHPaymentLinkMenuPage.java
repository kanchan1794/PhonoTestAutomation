package pageobjectclasses;

//import io.cucumber.messages.types.Duration;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class PHPaymentLinkMenuPage {
    private WebDriver driver = null;

    public PHPaymentLinkMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewPaymentLinkMenu()
    {
        WebElement PaymentLinkScroll = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/ul[1]/div[2]"));
        PaymentLinkScroll.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Payments Link")));
        WebElement PaymentLinkMenu_Link = driver.findElement(By.linkText("Payments Link"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLinkMenu_Link);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLinkMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PaymentLinkMenu_Link);

    }

    public void ClickPaymentListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement PaymentList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PaymentList_Link);


//        driver.findElement(By.linkText("List")).click();
//        driver.findElement(By.xpath("//input[@placeholder='45 records...']")).sendKeys("Delayed Speech");
//        System.out.println("------Admin Can See Search Record Under Delayed Speech Specalities------");

    }

    public void PaymentLinkScrollBarFunction() throws InterruptedException {
        Thread.sleep(4000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Developed by Cling Multi Solutions Pvt Ltd')]")));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=500");
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        //WebElement PaymentLink_ScrollFun = driver.findElement(By.xpath("//a[contains(text(),'Developed by Cling Multi Solutions Pvt Ltd')]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLink_ScrollFun);
//       Thread.sleep(2000);
//        ((JavascriptExecutor) driver)
//                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

    }

    public void ClickPaymentLinkCreateSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create")));
        WebElement CreatePayment_Link = driver.findElement(By.linkText("Create"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CreatePayment_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CreatePayment_Link);

    }

    public void CreateNewPaymentLink() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Enter_Fullname = driver.findElement(By.xpath("//input[@placeholder='Enter full name']"));
        Enter_Fullname.sendKeys("Rahul Sharma");
        //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Enter_Fullname);
        Thread.sleep(2000);
        WebElement Enter_EmailAddress = driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
        Enter_EmailAddress.sendKeys("Rahul@gmail.com");
        Thread.sleep(2000);

        WebElement Enter_MobileNumber = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
        Enter_MobileNumber.sendKeys("8877665544");
        Thread.sleep(2000);

        WebElement Enter_Amount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
        Enter_Amount.sendKeys("500");
        Thread.sleep(2000);

        WebElement Enter_PaymentTitle= driver.findElement(By.xpath("//input[@placeholder='Enter payment title']"));
        Enter_PaymentTitle.sendKeys("Demo Payment");
        Thread.sleep(2000);

        WebElement Enter_Description = driver.findElement(By.xpath("//textarea[@placeholder='Enter payment title']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Enter_Description);
        Enter_Description.sendKeys("Demo Payment Link Description");
        Thread.sleep(2000);

        WebElement Click_CreateLink = driver.findElement(By.xpath("//button[contains(text(),'Create Link')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Click_CreateLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Click_CreateLink);
   Thread.sleep(2000);
   driver.navigate().back();
    }

    public void ValidateCreatePaymentLinkPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Create Payments Link')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Create Payments Link')]")).isDisplayed() + "**********");
    System.out.println("ADMIN IS ON THE CREATE PAYMENT LINK PAGE");
    }

    public void SearchPaymentLinkRecord() throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchPlanRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        SearchPlanRecord_List.sendKeys("https://rzp.io/i/kK3JlI4");

        Thread.sleep(2000);
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        SearchPlanRecord_List.sendKeys(s);
        // sending DELETE key
        SearchPlanRecord_List.sendKeys(Keys.DELETE);

        Thread.sleep(2000);


    }


}
