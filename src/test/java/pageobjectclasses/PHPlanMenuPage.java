package pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHPlanMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHPlanMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewPlanMenu() throws InterruptedException {
        Thread.sleep(2000);
       // WebElement PlanScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        //PlanScroll.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Plans")));
        WebElement PlanMenu_Link = driver.findElement(By.linkText("Plans"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanMenu_Link);
    }
    public void ClickPlanListSubMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement PlanList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanList_Link);
    }

    public void ClickToViewPlanDetails() throws InterruptedException {

        Thread.sleep(2000);
        WebElement PlanDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanDetails);
    }

    public void SearchPlanRecord() throws InterruptedException {
        Thread.sleep(2000);
        WebElement SearchPlanRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
       // SearchPlanRecord_List.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchPlanRecord_List);
        Actions action = new Actions(driver);
        action.click(SearchPlanRecord_List);
        action.keyDown(Keys.CONTROL).sendKeys("regular").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchPlanRecord_List);


    }

    public void ClickOnPlanEditButton() throws InterruptedException {

        Thread.sleep(2000);
        WebElement ClickEditButton_Plan = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
        ClickEditButton_Plan.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistDetails);

    }
    public void EditTherapistDetails() throws InterruptedException {
        {
        }

    }
}