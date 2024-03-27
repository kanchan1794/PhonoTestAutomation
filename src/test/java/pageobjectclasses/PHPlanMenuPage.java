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
       // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/*[1]")));
        WebElement PlanDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanDetails);
PlanDetails.click();
Thread.sleep(2000);
//driver.navigate().back();
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanDetails);
    }

    public void SearchPlanRecord() throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
        WebElement SearchPlanRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
      SearchPlanRecord_List.sendKeys("regular");

      Thread.sleep(2000);
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        SearchPlanRecord_List.sendKeys(s);
        // sending DELETE key
        SearchPlanRecord_List.sendKeys(Keys.DELETE);

      Thread.sleep(2000);


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

    public void EditPlanDetails() throws InterruptedException {

        System.out.println("View button display status :-" + driver.findElement(By.xpath("//button[contains(text(),'View')]")).isDisplayed());
        WebElement EditPlanTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title']"));
        EditPlanTitle.clear();
        Thread.sleep(2000);
        EditPlanTitle.sendKeys("Premium");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title']")));
        System.out.println(EditPlanTitle.getText());
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        SubmitButton.click();
        System.out.println("Saved");
        Thread.sleep(2000);
       // driver.navigate().back();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/button[1]/*[1]")).click();
    }
    public void DeletePlan() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[4]/td[10]/div[1]/div[3]/*[1]")));
        WebElement DeletePlan = driver.findElement(By.xpath("//tbody/tr[4]/td[10]/div[1]/div[3]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DeletePlan);
        DeletePlan.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/button[1]/*[1]")).click();


    }
    public void ClickPlanAddSubMenu() throws InterruptedException {
        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add")));
        WebElement PlanAdd_Link = driver.findElement(By.linkText("Add"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanAdd_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanAdd_Link);

    }
    public void AddNewPlan() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title']")));
        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title']"));
        EnterTitle.sendKeys("Premium plus");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(1) div.col-md-6.col-lg-6:nth-child(2) > input.form-control:nth-child(2)")));
        WebElement EnterSession = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(1) div.col-md-6.col-lg-6:nth-child(2) > input.form-control:nth-child(2)"));
        EnterSession.clear();
        EnterSession.sendKeys("1");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(2) div.col-md-6.col-lg-6:nth-child(1) > input.form-control:nth-child(2)")));
        WebElement Price = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(2) div.col-md-6.col-lg-6:nth-child(1) > input.form-control:nth-child(2)"));
        Price.clear();
        Price.sendKeys("700");
        WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > form > div > div:nth-child(2) > div:nth-child(2) > input")));
        WebElement DiscountedPrice = driver.findElement(By.cssSelector("#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > form > div > div:nth-child(2) > div:nth-child(2) > input"));
        DiscountedPrice.clear();
        DiscountedPrice.sendKeys("500");

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(3) div.col-md-6.col-lg-6 > input.form-control:nth-child(2)")));
        WebElement Validity = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.card form:nth-child(1) div.card-body div.row.form-group.mt-3:nth-child(3) div.col-md-6.col-lg-6 > input.form-control:nth-child(2)"));
       Validity.clear();
        Validity.sendKeys("1");
        WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("customized_dashboard_checkbox")));
        WebElement checkbox1 = driver.findElement(By.id("customized_dashboard_checkbox"));

        // Check the checkbox (if it's not already checked)
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        SubmitButton.click();
        //driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/button[1]/*[1]")).click();


        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanAdd_Link);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanAdd_Link);

    }


    }
