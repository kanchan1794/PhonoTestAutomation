package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class PHDemoGoalsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHDemoGoalsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickScreeningTestMenu() throws InterruptedException {
        Thread.sleep(2000);

        WebElement ScreeningTestScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        ScreeningTestScroll.click();
        WebElement ScreeningTestMenu_Link = driver.findElement(By.xpath("//a[@href='/screening-tests']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScreeningTestMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/screening-tests']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ScreeningTestMenu_Link);
        Thread.sleep(3000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void ViewScreeningTestreport() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]")));
        WebElement ViewReport_Link = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]"));
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddMediaButton);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].C", AddMediaButton);
        ViewReport_Link.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Report')]")));
        Thread.sleep(3000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    driver.navigate().back();

    }
    public void ScreeningTestpageNavigation()
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'3')]"))));
        WebElement ScreeningTestPageNavigation_Click= driver.findElement(By.xpath("//a[contains(text(),'3')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ScreeningTestPageNavigation_Click);

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ScreeningTestPageNavigation_Click);
    }

    public void ValidateScreeningTestpagenavigation() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")));//h3[contains(text(),'Therapists')]);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed() + "**********");

       Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }
}











    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
