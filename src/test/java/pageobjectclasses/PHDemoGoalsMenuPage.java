package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class PHDemoGoalsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHDemoGoalsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickDemoGoalsMenu() throws InterruptedException {
        Thread.sleep(2000);

        WebElement DemoGoalsScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        DemoGoalsScroll.click();
        WebElement DemoGoalsMenu_Link = driver.findElement(By.xpath("//a[@href='/demogoals/add']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DemoGoalsMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/demogoals/add']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DemoGoalsMenu_Link);
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
    public void SearchDemoGoalsRecord() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement Search_DemoGoalsRecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
//Search_BankTransferApprovalRecord.sendKeys("Sandeep");
        Thread.sleep(2000);
        Search_DemoGoalsRecord.sendKeys("Eye-contact");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        Search_DemoGoalsRecord.sendKeys(s);
        // sending DELETE key
        Thread.sleep(2000);
        Search_DemoGoalsRecord.sendKeys(Keys.DELETE);
        Thread.sleep(2000);

    }
    public void ValidateDemoGoalspage() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")));//h3[contains(text(),'Therapists')]);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed() + "**********");

       Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }


    public void SelectCategoryAndSubCategory() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demoCategorie")));
        WebElement Category_dropdown = driver.findElement(By.id("demoCategorie"));
        Category_dropdown.click();
        Select Category = new Select(Category_dropdown);
        Category.selectByValue("Pre- Linguistic Categories");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"demoGam\"]/div/div/div[1]/div[2]/div/div/div/select")));
        WebElement SubCategory_dropdown = driver.findElement(By.xpath("//*[@id=\"demoGam\"]/div/div/div[1]/div[2]/div/div/div/select"));
        SubCategory_dropdown.click();
        Select SubCategory = new Select(SubCategory_dropdown);
        SubCategory.selectByValue("Eye-contact");

//        WebElement CategorySubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//        CategorySubmit.click();
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});");
//        WebElement ScrollCenter = driver.findElement(By.tagName("footer"));
//        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ScrollCenter, 0, -50);
//        new Actions(driver)
//                .scrollFromOrigin(scrollOrigin, 0, 200)
//                .perform();
//        //SCROLL TO TOP OF THE PAGE
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Demo Goals')]")));

        // ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Category.selectByValue("All");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        //SubCategory.selectByValue("All");
        //Thread.sleep(2000);
       // CategorySubmit.click();

        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }
    public void DeletDemoGoals()
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]"))));
        WebElement DeleteDemoGoals= driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", DeleteDemoGoals);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", DeleteDemoGoals);
    }

//    public void ValidateScreeningTestpagenavigation() throws InterruptedException {
//        Thread.sleep(4000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")));//h3[contains(text(),'Therapists')]);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed());
//
//        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed() + "**********");
//
//       Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//    }
}











    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
