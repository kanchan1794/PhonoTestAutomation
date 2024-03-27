package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHInvoicesMenuPage {
    private WebDriver driver = null;

    public PHInvoicesMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickInvoicesMenu() {
        WebElement InvoicesScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 4; i++) {
            actions.sendKeys(InvoicesScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Invoices")));
        WebElement InvoicesMenu_Link = driver.findElement(By.linkText("Invoices"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InvoicesMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", InvoicesMenu_Link);

    }

    public void ClickOnViewInvoice() throws InterruptedException {
        Thread.sleep(2000);
        // Locate the menu bar element (replace 'your_menu_locator' with the actual locator of your menu bar)
        WebElement InvoicesSroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 2; i++) {
            actions.sendKeys(InvoicesSroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]")));
        WebElement ViewInvoice_Link = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ViewInvoice_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ViewInvoice_Link);

    }

    public void ValidateInvoicePage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Invoices')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Invoices')]")).isDisplayed() + "**********");
        System.out.println("ADMIN IS ON THE INVOICE PAGE");
    }

    public void ClickOnInvoicesPageBreadCrumbs() {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'2')]")));
        WebElement InvoicePageBreadCrumbs_Link = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InvoicePageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", InvoicePageBreadCrumbs_Link);

    }

    public void ValidateInvoicePageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Invoices')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Invoices')]")).isDisplayed() + "**********");
        System.out.println("ADMIN IS ON THE INVOICES PAGE NUMBER TWO....");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //driver.findElement(By.xpath(""))
        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }

    public void SearchInvoicesRecord() throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchInvoicesRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        SearchInvoicesRecord_List.sendKeys("699");
        Thread.sleep(2000);
        String s = Keys.chord(Keys.CONTROL, "a");
        SearchInvoicesRecord_List.sendKeys(s);
        SearchInvoicesRecord_List.sendKeys(Keys.DELETE);
    }


    public void ScrollverticalInsideInvoicetable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));

        WebElement vertcialScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down within the table by setting scrollTop
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", vertcialScroll);

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll back up within the table
        js.executeScript("arguments[0].scrollTop = 0", vertcialScroll);

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ScrollHorizantalInsideInvoicetable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Define the CSS selector of the table or its scrollable parent element
        String tableSelector = "div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.col-12.col-sm-12.col-lg-12 div.card.card-accent-primary div.sc-aXZVg.dKvPpX div:nth-child(1) > div.table-responsive:nth-child(1)";

        // Scroll horizontally to the right inside the table
        js.executeScript("document.querySelector('" + tableSelector + "').scrollLeft += 200");

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll horizontally to the left inside the table
        js.executeScript("document.querySelector('" + tableSelector + "').scrollLeft -= 200");

        // Add a wait time if necessary to observe the scroll
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



//        WebElement HorizantalScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
//
//        Actions actions = new Actions(driver);
//
//        // Perform vertical scroll using arrow keys
//        actions.moveToElement(HorizantalScroll)
//                .clickAndHold()
//                .sendKeys("ArrowRight") // You can also use "ArrowUp" for scrolling up
//                .build()
//                .perform();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
    }


}