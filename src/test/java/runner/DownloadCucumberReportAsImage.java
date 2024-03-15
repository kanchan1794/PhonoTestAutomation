package runner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        driver.get("file:C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(5000);
        // Take a screenshot of the webpage
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot as an image file
        String outputFilePath = "cucumber_report.png";
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

