package pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title']")));
        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title']"));
        EnterTitle.sendKeys("Learn Phonics");
        Thread.sleep(3000);
        WebElement EnterDescription = driver.findElement(By.tagName("textarea"));
        EnterDescription.sendKeys("Learn Phonics From Scratch");
//

        WebElement Uploadvideo = driver.findElement(By.cssSelector("#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > form > div > div:nth-child(3) > div:nth-child(1) > div > div > div.custom-filepicker-browse-button.undefined"));
        Uploadvideo.click();
        // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("file:C:/Users/prana/File/kids learning.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

// to paste the link & then to release the button
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);



//        WebElement Uploadvideo = driver.findElement(By.cssSelector("#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > form > div > div:nth-child(3) > div:nth-child(1) > div > div > div.custom-filepicker-browse-button.undefined"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Uploadvideo);
//        // Provide the file path to the input element using sendKeys
//        Uploadvideo.click();
//        String filePath = "file:C:/Users/prana/File/kids learning.mp4";
//        Uploadvideo.sendKeys(filePath);
//        //Uploadvideo.sendKeys("file:C:/Users/prana/File/kids learning.mp4");

        Thread.sleep(2000);

        WebElement UploadImage = driver.findElement(By.xpath("//div[contains(text(),'Browse')]")); // Replace "fileInput" with the actual ID or other locator of your file input
        UploadImage.click();
        // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
        Robot rb1 = new Robot();
        rb1.delay(2000);

        StringSelection ss1 = new StringSelection("file:C:/Users/prana/File/kids.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

// to paste the link & then to release the button
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        rb1.delay(2000);

        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        rb1.delay(2000);

        //Enter
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");




//        WebElement UploadImage = driver.findElement(By.xpath("//div[contains(text(),'Browse')]")); // Replace "fileInput" with the actual ID or other locator of your file input
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UploadImage);
//        // Provide the file path to the input element using sendKeys
//        UploadImage.sendKeys("file:C:/Users/prana/File/kids image.jpg");


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ClickSubmit.click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);
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
