package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHInvoicesMenuPage {
    private WebDriver driver = null;

    public PHInvoicesMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickInvoicesMenu()
    {
//       // WebElement InvoicesScroll = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/ul[1]/div[2]"));
//        //InvoicesScroll.click();
//       // WebElement hoverable = driver.findElement(By.id("hover"));
//        new Actions(driver)
//                .moveToElement(InvoicesScroll)
//                .perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Invoices")));
        WebElement InvoicesMenu_Link = driver.findElement(By.linkText("Invoices"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InvoicesMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", InvoicesMenu_Link);

    }

    public void ClickOnViewInvoice()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[1]")));
        WebElement ViewInvoice_Link = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[1]"));
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

        //((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }


}
