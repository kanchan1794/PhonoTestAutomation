package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
        LeadsSearchRecord_List.sendKeys("8766566787");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadsSearchRecord_List);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        LeadsSearchRecord_List.sendKeys(s);
        // sending DELETE key
        LeadsSearchRecord_List.sendKeys(Keys.DELETE);


    }

    public void SelectValueFromLeadDropdownlist() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        WebElement LeadDropDownList = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        //EditSpec.click();
        //EditSpec.sendKeys("Unclear Speech");

        Actions actions = new Actions(driver);
        actions.moveToElement(LeadDropDownList);
        actions.click();
        actions.sendKeys("Rajnish Mishra");
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
        System.out.println(LeadDropDownList.getText());

        Thread.sleep(2000);
        actions.moveToElement(LeadDropDownList);
        actions.click();
        actions.sendKeys("All");
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
        System.out.println(LeadDropDownList.getText());

        //        LeadDropDownList.sendKeys("Rajnish Mishra");
//        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadDropDownList);
//        LeadDropDownList.sendKeys(Keys.RETURN);
    }

    public void ClickLeadsViewIcon() throws InterruptedException {
        // Thread.sleep(2000);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/*[1]")));
        WebElement LeadsDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/div[1]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadsDetails);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadsDetails);
        LeadsDetails.click();
    }

    public void ClickOnLeadsEditButton() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
        WebElement ClickLeadsEditButton = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickLeadsEditButton);
        // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickLeadsEditButton);
        ClickLeadsEditButton.click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        // ClickClientEditButton.click();
        Thread.sleep(2000);
    }

    public void EditLeadsDetails() throws InterruptedException {

        System.out.println("View button display status :-" + driver.findElement(By.xpath("//button[contains(text(),'View')]")).isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Partner Code']")));
        WebElement EnterPartnerCode = driver.findElement(By.xpath("//input[@placeholder='Enter Partner Code']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[contains(text(),'Partner Code')]")));
        //((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
        EnterPartnerCode.click();
        EnterPartnerCode.sendKeys("001");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down the page by pixel
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);

        WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitButton);
        //js.executeScript("Window.scrollBy(0,25");
        SubmitButton.click();


        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitButton);
        System.out.println("Saved");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/button[1]/*[1]")).click();
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }
    public void LeadsPagenavigation() throws InterruptedException {
        //Thread.sleep(000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'2')]")));
        WebElement PageBreadCrumbs_Link = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PageBreadCrumbs_Link);

   Thread.sleep(2000);
       ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
Thread.sleep(2000);

       // ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void ValidateSearchPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Leads')]")));//h3[contains(text(),'Therapists')]);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Leads')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Leads')]")).isDisplayed() + "**********");
        //driver.navigate().back();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");



    }


    public void ClickConvertLeads() throws InterruptedException {
        // Thread.sleep(2000);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]")));
        WebElement ConvertLeads = driver.findElement(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadsDetails);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", LeadsDetails);
        ConvertLeads.click();
    }

    public void ConvertLeads() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        WebElement TherapistDropDownList = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(TherapistDropDownList);
        actions.click();
        actions.sendKeys("Mayank Sahu (mayank.21910632@viit.ac.in)");
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
        System.out.println(TherapistDropDownList.getText());

        // JavascriptExecutor js = (JavascriptExecutor) driver;

        //// Scroll down the page by 500 pixels
        //js.executeScript("window.scrollBy(0,1000)");
//        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[contains(text(),'Source')]")));
        Actions actions1 = new Actions(driver);

        // Scroll down the page seven times using Page Down key
//        for (int i = 0; i < 6; i++) {
//            actions1.sendKeys(Keys.PAGE_DOWN).perform();
//            try {
//                Thread.sleep(1000); // Adding a short delay between scrolls
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page 7 times
        for (int i = 0; i < 7; i++) {
            js.executeScript("window.scrollBy(0, window.innerHeight)");
            try {
                Thread.sleep(1000); // Adding a short delay to allow page content to load
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
           // driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(1) form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(5) div.col-md-6.col-lg-6:nth-child(2) > input.form-control:nth-child(2)")).click();
            //driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(1) form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(5) div.col-md-6.col-lg-6:nth-child(2) > input.form-control:nth-child(2)")).clear();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/input[1]")));
element.sendKeys("a@gmail.com");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
           // driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/input[1]")).sendKeys("a@gmail.com");
            Thread.sleep(2000);
            //js.executeScript("window.scrollBy(0,500)");
            //((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
            WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
            //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitButton);
            //js.executeScript("Window.scrollBy(0,25");
            //js.executeScript("window.scrollBy(0,500)");
            SubmitButton.click();
            Thread.sleep(2000);
            driver.navigate().back();
        }
    }
}
