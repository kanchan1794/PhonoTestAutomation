package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHTransactionMenuPage extends PHBrowserConfig{
    private WebDriver driver = null;

    public PHTransactionMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }




    public void ViewTransactionMenu() throws InterruptedException {

        Thread.sleep(2000);

//        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        MediaManagerScroll.click();

        // Locate the menu bar element (replace 'your_menu_locator' with the actual locator of your menu bar)
        WebElement TransactionScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(TransactionScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/transactions']")));
        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TransactionMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TransactionMenu_Link);

    }//super(driver);
    public void ValidateTransactionPage() throws InterruptedException {
        //VALIDATE LOGIN TEXT ON PAGE
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
    }
    public void SearchTransactionrecords() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchTransactionrecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchTransactionrecord);
        SearchTransactionrecord.sendKeys("Sandeep");
        Thread.sleep(3000);
        String s = Keys.chord(Keys.CONTROL, "a");
        SearchTransactionrecord.sendKeys(s);
        // sending DELETE key
        SearchTransactionrecord.sendKeys(Keys.DELETE);

        Thread.sleep(2000);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchTransactionrecord);

    }
    public void ValidateTransactionRecordsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");

    }
    public void ClickOnTransactionpageBreadCrumbs() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'3')]"))));
        WebElement TransactionPage_link = driver.findElement(By.xpath("//a[contains(text(),'3')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TransactionPage_link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TransactionPage_link);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll up by a certain amount in each iteration of the loop
        for (int i = 0; i < 10; i++) { // Adjust the loop condition as needed
            // Execute JavaScript to scroll UP
            js.executeScript("window.scrollBy(0, -250);"); // Adjust the scroll amount as needed
            // Add a delay to give time for the page to scroll
            try {
                Thread.sleep(500); // Adjust the delay time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ValidateTRanSearchPageBreadCrumbsPage() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed() + "**********");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll up by a certain amount in each iteration of the loop
        for (int i = 0; i < 10; i++) { // Adjust the loop condition as needed
            // Execute JavaScript to scroll up
            js.executeScript("window.scrollBy(0, -250);"); // Adjust the scroll amount as needed
            // Add a delay to give time for the page to scroll
            try {
                Thread.sleep(500); // Adjust the delay time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'1')]"))));
        WebElement GObackPreviousPage= driver.findElement(By.xpath("//a[contains(text(),'1')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", GObackPreviousPage);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", GObackPreviousPage);


    }

    public void VerifyTransactionListScrollVertical() throws InterruptedException {

        JavascriptExecutor jsc = (JavascriptExecutor) driver;
        // Scroll up by a certain amount in each iteration of the loop
        for (int i = 0; i < 10; i++) { // Adjust the loop condition as needed
            // Execute JavaScript to scroll up
            jsc.executeScript("window.scrollBy(0, -250);"); // Adjust the scroll amount as needed
            // Add a delay to give time for the page to scroll
            try {
                Thread.sleep(500); // Adjust the delay time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Get the height of the page
        Long pageHeight = (Long) js.executeScript("return document.body.scrollHeight;");

        // Calculate the middle position of the page
        int middlePosition = pageHeight.intValue() / 2;

        // Scroll to the middle of the page
        js.executeScript("window.scrollTo(0, " + middlePosition + ");");


        WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/div/div/div[1]"));

        // Create JavascriptExecutor object
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        // Scroll down inside the table by 250 pixels
        js1.executeScript("arguments[0].scrollTop += 300;", table);

        // Wait for a brief moment (optional)
        try {
            Thread.sleep(2000); // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll up inside the table by 250 pixels
        js1.executeScript("arguments[0].scrollTop -= 300;", table);

    }

    public void VerifyTransactionListScrollHorizantal() throws InterruptedException {

        // Replace "tableLocator" with your table locator
        WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/div/div/div[1]"));

        // Using JavascriptExecutor to scroll right inside the table
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll right by setting scrollLeft to a large value
        js.executeScript("arguments[0].scrollLeft = 10000;", table);

        // Wait for a brief moment (optional)
        try {
            Thread.sleep(2000); // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll left by setting scrollLeft back to 0
        js.executeScript("arguments[0].scrollLeft = 0;", table);



    }




}
