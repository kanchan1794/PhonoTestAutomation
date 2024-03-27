package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class PHLogsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHLogsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickLogsMenu() throws InterruptedException {
        Thread.sleep(2000);

        WebElement LogsmenuScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        LogsmenuScroll.click();
        WebElement LogsmenuScroll_Link = driver.findElement(By.xpath("//a[@href='/logs/list']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LogsmenuScroll_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/logs/list']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LogsmenuScroll_Link);
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

    public void Logspagenavigation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'2')]"))));
        WebElement LogsPageNavigation_Click = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LogsPageNavigation_Click);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LogsPageNavigation_Click);
    }

    public void validdateLogsPageNavigation() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Logs')]")));//h3[contains(text(),'Therapists')]);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Logs')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Logs')]")).isDisplayed() + "**********");
        Thread.sleep(2000);

    }

    public void SearchLogfunctionality() throws InterruptedException {
        Thread.sleep(2000);
        WebElement ScrollTillLogtext = driver.findElement(By.xpath("//a[contains(text(),'Logs')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollTillLogtext);

        try {
            // Locate the search input field by its ID (replace "searchFieldID" with the actual ID)
            WebElement searchField = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));

            // Enter the search query
            searchField.sendKeys("FAILED");

            // Submit the search form (assuming it's submitted by pressing Enter key)
            // searchField.submit();
            searchField.sendKeys(Keys.ENTER);

            // You can also use the below code to submit the form if it's not automatically submitted by pressing Enter
            // searchField.sendKeys(Keys.ENTER);

            // Wait for the page to load (you may need to use explicit waits for more complex scenarios)
            Thread.sleep(2000); // Waiting for 2 seconds (2000 milliseconds) for demonstration purposes

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
Thread.sleep(3000);
driver.navigate().back();
        }


    }
    public void Scrollvrticalinsidelogtable()
    {
        try {
            // Replace "tableElement" with the locator of your table element
            WebElement tableElement = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));

            // Replace "scrollAmount" with the desired amount of scrolling (positive integer for scrolling down, negative for up)
            int scrollAmount = 500;

            // Scroll vertically inside the table using JavaScript
            String script = "arguments[0].scrollTop += arguments[1];";
            ((JavascriptExecutor) driver).executeScript(script, tableElement, scrollAmount);

            // Wait for a while after scrolling
            Thread.sleep(2000); // You may adjust the time as needed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver.quit();
        }

    }
    public void ScrollHorzizantalinsidelgtable()
    {
        try {
            // Replace "tableElement" with the locator of your table element
            WebElement tableElement = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));

            // Replace "scrollAmount" with the desired amount of scrolling (positive integer for scrolling right, negative for left)
            int scrollAmount = 500;

            // Scroll horizontally inside the table using JavaScript
            String script = "arguments[0].scrollLeft += arguments[1];";
            ((JavascriptExecutor) driver).executeScript(script, tableElement, scrollAmount);

            // Wait for a while after scrolling
            Thread.sleep(2000); // You may adjust the time as needed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
    }











    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
