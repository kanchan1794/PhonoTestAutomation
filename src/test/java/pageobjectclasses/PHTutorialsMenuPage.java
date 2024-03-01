package pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PHTutorialsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHTutorialsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickTutorialsMenu() throws InterruptedException {
        Thread.sleep(2000);

        WebElement TutorialScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        TutorialScroll.click();
        WebElement TutorialsMenu_Link = driver.findElement(By.xpath("//a[@href='/tutorials']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TutorialsMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/tutorials']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TutorialsMenu_Link);
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

    public void AddTutorial() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Tutorial')]")));
        WebElement AddMediaButton = driver.findElement(By.xpath("//button[contains(text(),'Add Tutorial')]"));
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddMediaButton);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].C", AddMediaButton);
        AddMediaButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title here']")));
        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title here']"));
        EnterTitle.sendKeys("Learn Phonics");
        Thread.sleep(3000);
        WebElement EnterDescription = driver.findElement(By.tagName("textarea"));
        EnterDescription.sendKeys("Learn Phonics From Scratch");
//        bElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        WebElement Uploadvideo = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")); // Replace "fileInput" with the actual ID or other locator of your file input
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Uploadvideo);
        // Provide the file path to the input element using sendKeys
        Uploadvideo.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");

        WebElement UploadImage = driver.findElement(By.xpath("//div[contains(text(),'Browse')]")); // Replace "fileInput" with the actual ID or other locator of your file input
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UploadImage);
        // Provide the file path to the input element using sendKeys
        UploadImage.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ClickSubmit.click();
    }
}











    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
