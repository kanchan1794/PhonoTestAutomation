package runner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class DownloadCucumberReportAsImage {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Downloads\\chromedriver.exe");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
Thread.sleep(3000);
        // Open the Cucumber HTML report
        //driver.get("file:C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html");
        driver.get("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\file-src-test-java-featurefiles-02_PHTherapist-feature.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(5000);
//driver.findElement(By.xpath("//a[contains(text(),'Test Phonologix Dashboard Functionality')]")).click();
 driver.findElement(By.xpath("//td[contains(text(),'Test Phonologix Therapist Menu Functionality')]")) ;
 Thread.sleep(4000);
        driver.findElement(By.xpath("//span[contains(text(),'Test Login And Dashboard Fuctionality')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[contains(text(),'Steps')]")).click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement Scroll = driver.findElement(By.xpath("//span[contains(text(),'User Navigates To Assessments Report Page')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Scroll);
        Thread.sleep(5000);

        // Take a screenshot of the webpage
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot as an image file
        String outputFilePath = "DashBoard.png";

        try {
            FileUtils.copyFile(screenshotFile, new File(outputFilePath));
            System.out.println("Screenshot saved as: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser
       // driver.quit();
    }
}

