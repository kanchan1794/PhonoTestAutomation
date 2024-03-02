package pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class PHMasterVideoMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHMasterVideoMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickMasterVideoMenu() throws InterruptedException {

        Thread.sleep(2000);

//        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        MediaManagerScroll.click();

        // Locate the menu bar element (replace 'your_menu_locator' with the actual locator of your menu bar)
        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(MediaManagerScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/masterVideo']")));

        WebElement MasterVideoMenu_Link = driver.findElement(By.xpath("//a[@href='/masterVideo']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MasterVideoMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", MasterVideoMenu_Link);

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
    public void AddMasterVideo() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Master Video')]")));

        WebElement AddMasterVideoButton = driver.findElement(By.xpath("//button[contains(text(),'Add Master Video')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddMasterVideoButton);
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].C", AddMediaButton);
        AddMasterVideoButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title']")));

        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title']"));
        EnterTitle.sendKeys("Learn Phonics");

        Thread.sleep(3000);
        WebElement EnterDescription = driver.findElement(By.tagName("textarea"));
        EnterDescription.sendKeys("Learn Phonics From Scratch");
//        bElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

        WebElement Uploadvideo = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/form/div/div[3]/div[1]/div/div/div[2]")); // Replace "fileInput" with the actual ID or other locator of your file input
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Uploadvideo);
        // Provide the file path to the input element using sendKeys
       // Uploadvideo.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");
        Uploadvideo.click();

         WebElement UploadImage = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")); // Replace "fileInput" with the actual ID or other locator of your file input
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UploadImage);
        // Provide the file path to the input element using sendKeys
       UploadImage.click();
        // UploadImage.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");


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
