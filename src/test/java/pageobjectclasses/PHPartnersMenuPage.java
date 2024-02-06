package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHPartnersMenuPage extends PHBrowserConfig {

    private WebDriver driver = null;


    public PHPartnersMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewPartnerMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Partners")));
        WebElement PartnerMenu_Link = driver.findElement(By.xpath("//a[text()='Partners']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnerMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnerMenu_Link);

    }

    public void ClickPartnerListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'/partners/list')]")));

        WebElement PartnerList_Link = driver.findElement(By.xpath("//*[contains(@href,'/partners/list')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnerList_Link);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'/partners/list')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnerList_Link);


    }


    public void ClickOnPartnersPageBreadCrumbs() {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'4')]")));
        WebElement PartnerPageBreadCrumbs_Link = driver.findElement(By.xpath("//a[contains(text(),'4')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnerPageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnerPageBreadCrumbs_Link);

    }

    public void ValidatePartnersPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")));
      //  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Partners')]")).isDisplayed() + "**********");
       Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[contains(@href,'/partners/list')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(@href,'/partners/list')]")));

        //driver.findElement(By.xpath("//*[contains(@href,'/partners/list')]")).click();
    }

    public void ClickToViewPartnersCredentials() {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/*[1]")));
        WebElement PartnersCredentials = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
       PartnersCredentials.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnersCredentials);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnersCredentials);

    }

    public void CopyPartnersCredentials() {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]")));
        WebElement PartnersCredentials_Copy = driver.findElement(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistCredentials_Verify);
        PartnersCredentials_Copy.click();



    }

    public void VerifyPartnersCredentialsAlertBox() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed() + "**********");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);
driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
    }

    public void SearchPartnersRecord() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement PartSearchRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        PartSearchRecord_List.sendKeys("08794476826");
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartSearchRecord_List);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartSearchRecord_List);
        Thread.sleep(2000);
        PartSearchRecord_List.clear();
    }

    public void ValidatepartnersListPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Partners List')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Partners List')]")).isDisplayed() + "**********");
    }

    public void ClickToViewPartnersDetails()  {

        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[2]/td[10]/div[1]/div[2]/*[1]")));
        WebElement PartnersDetails = driver.findElement(By.xpath("//tbody/tr[2]/td[10]/div[1]/div[2]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnersDetails);
       PartnersDetails.click();
        // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnersDetails);
    }
    public void VerifyViewPartnersDetailsPage() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'View Partner')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'View Partner')]")).isDisplayed() + "**********");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);

    }

    public void ClickOnPartnersEditButton() {

       // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
        WebElement ClickPartnerEditButton = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistDetails);
        ClickPartnerEditButton.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistDetails);

    }

    public void EditPartnersDetails() throws InterruptedException {

       System.out.println("View button display status :-" + driver.findElement(By.xpath("//button[contains(text(),'View')]")).isDisplayed());
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Bonus on Purchase (%)']")));
       WebElement EditBonusOnPurchase = driver.findElement(By.xpath("//input[@placeholder='Enter Bonus on Purchase (%)']"));
      EditBonusOnPurchase.clear();
      Thread.sleep(2000);
       EditBonusOnPurchase.sendKeys("90");
       System.out.println(EditBonusOnPurchase.getText());
       ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
       Thread.sleep(3000);
       WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        Thread.sleep(3000);

        SubmitButton.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitButton);
       System.out.println("Saved");
       Thread.sleep(2000);

    }

    public void VerifyPartnersListScrollVertical() throws InterruptedException {
        WebElement ScrollMiddlePartner = driver.findElement(By.xpath("//div[contains(text(),'Partner 1')]"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", ScrollMiddlePartner);
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");
    }

    public void VerifyPartnersListScrollHorizantal() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");


    }
}