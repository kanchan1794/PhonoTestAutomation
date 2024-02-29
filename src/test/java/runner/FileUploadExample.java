package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Downloads\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage with a file input element
        driver.get("https://uploadnow.io/en");
        //driver.manage().window().maximize();
        // Maximize the browser
        driver.manage().window().maximize();
        // Locate the file input element using its ID or other locator
        WebElement fileInput = driver.findElement(By.xpath("//button[contains(text(),'Add files')]")); // Replace "fileInput" with the actual ID or other locator of your file input
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileInput);
        // Provide the file path to the input element using sendKeys
        fileInput.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");

        // Perform any other necessary actions or submit the form

//        // Close the WebDriver
//        driver.quit();
    }
}
