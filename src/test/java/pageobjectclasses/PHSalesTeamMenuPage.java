package pageobjectclasses;

//import io.cucumber.messages.types.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class PHSalesTeamMenuPage {
    private WebDriver driver = null;

    public PHSalesTeamMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickSalesTeamMenu()
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sales Team")));
        WebElement SalesTeamMenu_Link = driver.findElement(By.linkText("Sales Team"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesTeamMenu_Link);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PaymentLinkMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SalesTeamMenu_Link);

    }

    public void ClickSalesTeamListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement SalesTeamList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesTeamList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SalesTeamList_Link);
    }

    public void ClickSalesTeamAddSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add")));
        WebElement AddSalesTeam_Link = driver.findElement(By.linkText("Add"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddSalesTeam_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AddSalesTeam_Link);

    }

    public void AddSalesTeamDetails() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Enter_Fullname = driver.findElement(By.xpath("//input[@placeholder='Enter Name']']"));
      Enter_Fullname.sendKeys("Karan Bhale");
        //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Enter_Fullname);
       Thread.sleep(2000);
        WebElement Enter_EmailAddress = driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
        Enter_EmailAddress.sendKeys("Karan@gmail.com");
        Thread.sleep(2000);

        WebElement Enter_MobileNumber = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
        Enter_MobileNumber.sendKeys("8877665544");
        Thread.sleep(2000);

        Select Status = new Select(driver.findElement(By.xpath("//select[@name='select']")));
        Status.selectByVisibleText("Active");


        WebElement Click_Submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Click_Submit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Click_Submit);
    }

//    public void ValidateCreatePaymentLinkPage() throws InterruptedException {
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Create Payments Link')]")).isDisplayed());
//        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Create Payments Link')]")).isDisplayed() + "**********");
//    System.out.println("ADMIN IS ON THE CREATE PAYMENT LINK PAGE");
//    }

    }
