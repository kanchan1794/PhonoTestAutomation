package pageobjectclasses;

//import io.cucumber.messages.types.Duration;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PHSlotMenuPage {
    private WebDriver driver = null;

    public PHSlotMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickSlotsMenu() throws InterruptedException {

       Thread.sleep(3000);
        WebElement SlotScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
       SlotScroll.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Slots")));
        WebElement SlotsMenu_Link = driver.findElement(By.linkText("Slots"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", SlotsMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SlotsMenu_Link);

        //        Actions action = new Actions(driver);
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();
//        action.moveToElement(SlotsMenu_Link).click();


//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Slots")));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//        Thread.sleep(3000);
//        WebElement SlotsMenu_Link = driver.findElement(By.linkText("Slots"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SlotsMenu_Link);
//      SlotsMenu_Link.click();
       // Actions action = new Actions(driver);
        //action.scrollToElement(SlotsMenu_Link).perform();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SlotsMenu_Link);

    }

    public void ClickCalendarViewSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Calendar View")));
        WebElement CalendarView_Link = driver.findElement(By.linkText("Calendar View"));

         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CalendarView_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CalendarView_Link);

    }
        public void ValidateSlotCalendareViewPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Calendar View')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Calendar View')]")).isDisplayed() + "**********");
    System.out.println("ADMIN IS ON THE SLOTS-CALENDAR VIEW PAGE");
    }
    public void CVSelectTherapist() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        WebElement SelectTherapist = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));

//set the dropdown value to '' using javascript
        SelectTherapist.click();
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[contains(text(),'sayali')]")));
        Thread.sleep(3000);
        System.out.println("SELECT THERAPIST NAME");




    }


    public void SelectStatus() throws InterruptedException {
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
       // WebElement SelectStatus = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        WebElement SelectStatus=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
        SelectStatus.click();
        Select DRP_SelectStatus = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
        DRP_SelectStatus.selectByValue("booked");



//set the dropdown value to '' using javascript
//        SelectTherapist.click();
//        Thread.sleep(3000);
//        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[contains(text(),'sayali')]")));
//        Thread.sleep(3000);
//        System.out.println("SELECT THERAPIST NAME");
    }


    public void ClickZoomReportSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Zoom Report")));
        WebElement ZoomReport_Link = driver.findElement(By.linkText("Zoom Report"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ZoomReport_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ZoomReport_Link);

    }
    public void SelectStartDateEndDate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/div[1]/input[1]")));
        WebElement SelectStartDate = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/input[1]"));
      //  driver.findElement(By.xpath("//a[normalize-space()='20']")).click();

        // SelectStartDate.click();

      Thread.sleep(3000);
        SelectStartDate.sendKeys("01-01-2024");

        //Press tab to shift focus to time field

      //  dateBox.sendKeys(Keys.TAB);

        //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectStartDate);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SelectStartDate);

    }

}

