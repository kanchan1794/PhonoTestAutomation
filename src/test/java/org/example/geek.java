package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//io.github.bonigarcia.wdm.WebDriverManager

public class geek {

    public static void main(String args[])
    {
//ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Downloads\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // WebDriver driver = new ChromeDriver();
        // Maximize the browser
      //  driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.google.com");
    }

}
