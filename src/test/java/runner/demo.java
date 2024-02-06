package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

    public static void main(String args[])
    {
//ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogix\\PhonoTest-main\\PhonoTest-main\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // WebDriver driver = new ChromeDriver();
        // Maximize the browser
        //  driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
    }
}
