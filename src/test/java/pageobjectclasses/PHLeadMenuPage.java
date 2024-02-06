package pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHLeadMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHLeadMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewLeadMenu() {

        WebElement LeadMenu_Link = driver.findElement(By.linkText("Leads"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Leads")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadMenu_Link);
    }

    public void ListLeadSubMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement LeadList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadList_Link);
    }

    public void SearchLeadRecord() throws InterruptedException {
        // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement LeadsSearchRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        LeadsSearchRecord_List.sendKeys("aryan");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadsSearchRecord_List);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        LeadsSearchRecord_List.clear();

    }

    public void SelectValueFromLeadDropdownlist() throws InterruptedException {
        // Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        WebElement LeadDropDownList = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        LeadDropDownList.sendKeys("Rajnish Mishra");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadDropDownList);
        LeadDropDownList.sendKeys(Keys.RETURN);
    }

    public void ClickLeadsViewIcon() throws InterruptedException {
        // Thread.sleep(2000);
        Thread.sleep(2000);
        WebElement LeadsDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadsDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadsDetails);

    }
}