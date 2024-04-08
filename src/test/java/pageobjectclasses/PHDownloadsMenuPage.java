package pageobjectclasses;

import junit.framework.Assert;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHDownloadsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHDownloadsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickDownlodsMenu() throws InterruptedException {

        WebElement DownloadsScroll = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/ul/div[2]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 4; i++) {
            actions.sendKeys(DownloadsScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



//        WebElement DownloadsScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        DownloadsScroll.click();
        WebElement DownlodsMenu_Link = driver.findElement(By.xpath("//a[@href='/allAppointmentDetails']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DownlodsMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DownlodsMenu_Link);
        Thread.sleep(3000);
    }

    public void ClickOnDownloadSessionreport()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Download Sessions Report')]")));
        WebElement ClickOnDownloadSessionReport = driver.findElement(By.xpath("//button[contains(text(),'Download Sessions Report')]"));
   ClickOnDownloadSessionReport.click();
    }
    public void SelectRequiredDetails() throws InterruptedException {

        Thread.sleep(2000);
        WebElement SelectClient = driver.findElement(By.xpath("//*[@id=\"selectClient\"]/div/div[1]/div[2]"));
        //EditSpec.click();
        //EditSpec.sendKeys("Unclear Speech");
        Actions actions = new Actions(driver);
        actions.moveToElement(SelectClient);
        actions.click();
        actions.sendKeys("AAA");
        actions.sendKeys(Keys.RETURN);
        actions.click();
        actions.build().perform();

        Thread.sleep(2000);
        WebElement SelectTherapist = driver.findElement(By.xpath("//div[@id='selectTherapist']"));
        Actions actions1 = new Actions(driver);
        //actions1.sendKeys(SelectTherapist, Keys.TAB).build().perform();
        actions1.moveToElement(SelectTherapist);
        actions1.click();
        actions1.sendKeys("Mayank Sahu");
        actions1.sendKeys(Keys.RETURN);
        //actions1.click();
        Thread.sleep(2000);
        actions1.build().perform();



//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"selectTherapist\"]/div/div[1]/div[2]")));
//        WebElement SelectTherapist = driver.findElement(By.xpath("//*[@id=\"selectTherapist\"]/div/div[1]/div[2]"));
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(SelectTherapist);
//        actions1.click();
//        actions1.sendKeys("SOURABH MIRAJE");
//        actions1

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("duration")));
        WebElement Duration_dropdown = driver.findElement(By.id("duration"));
        Duration_dropdown.click();
        Select Category = new Select(Duration_dropdown);
        Category.selectByValue("Last 7 Days");

        Thread.sleep(2000);
        WebElement DownloadReport_Button = driver.findElement(By.xpath("//button[contains(text(),'Download Report')]"));
        DownloadReport_Button.click();






    }

}