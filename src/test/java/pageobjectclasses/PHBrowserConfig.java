package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PHBrowserConfig {

    //----------------Remote Code--------------\\

    public static ThreadLocal<WebDriver> driverThread = ThreadLocal.withInitial(() -> {
       //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = null;
        try {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--disable-gpu"); // Applicable to Windows OS only
            options.addArguments("headless");
            options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security mode



            //System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-WorkSpace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
           // System.setProperty("webdriver.chrome.driver", "/ec2-user/chromedriver");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize(); // Maximize the browser window
        } catch (Exception e) {
            // Handle exceptions, log them, or throw a custom exception
            e.printStackTrace();
        }
        return driver;
    });


    //------------------Local System Code--------------------\\

 //public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>();
              //--public  WebDriver driver= null;
//static{
  // try{

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\Downloads\\chromedriver-win64 ");
//  System.setProperty("webdriver.chrome.driver","C:\\Users\\prana\\Downloads\\chromedriver.exe");
// ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//       WebDriver driver = new ChromeDriver(options);
//        driverThread.set(driver);
//        driver.manage().window().maximize();
//    }
//    catch(Exception e){
//        e.printStackTrace();
//    }
    }
