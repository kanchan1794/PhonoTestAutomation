package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHClientMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHClientMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewClientMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Clients")));
        WebElement ClientMenu_Link = driver.findElement(By.linkText("Clients"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientMenu_Link);

    }

    public void ClickClientsListSubMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement ClientList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientList_Link);
    }

    public void ValidateClientListPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed() + "**********");
    }

    public void SearchClientRecord() throws InterruptedException {
        Thread.sleep(2000);
        WebElement ClientDropdown_List = driver.findElement(By.xpath("//select[@class='custom-select']"));
        Select dropdown = new Select(ClientDropdown_List);
        // ClientDropdown_List.click();
        dropdown.selectByValue("Active");
        Thread.sleep(2000);
        WebElement ClientSearchSubmit_BTN = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ClientSearchSubmit_BTN.click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript(("window.scrollTo(0, document.body.scrollHeight)"));
        Thread.sleep(2000);
        //((JavascriptExecutor) driver).executeScript(("window.scrollTo(document.body.scrollHeight, 0)"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div:nth-child(1) div.col-12.col-sm-12.col-lg-12 div.card.card-accent-primary header.mainheading-body.card-header:nth-child(1) > h3:nth-child(1)")));
        dropdown.selectByValue("All");
        Thread.sleep(2000);
        ClientSearchSubmit_BTN.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.col-12.col-sm-12.col-lg-12 div.card.card-accent-primary div.row:nth-child(2) div.col-4 > input.form-control:nth-child(2)")));
        WebElement EnterSearchValue = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body.c-wrapper:nth-child(2) main.c-main div.container-fluid div.fade.show div.col-12.col-sm-12.col-lg-12 div.card.card-accent-primary div.row:nth-child(2) div.col-4 > input.form-control:nth-child(2)"));
        EnterSearchValue.sendKeys("w@1.com");
        Thread.sleep(2000);
        ClientSearchSubmit_BTN.click();
        Thread.sleep(2000);
        String s = Keys.chord(Keys.CONTROL, "a");
        EnterSearchValue.sendKeys(s);
        // sending DELETE key
        Thread.sleep(2000);
        EnterSearchValue.sendKeys(Keys.DELETE);
        ClientSearchSubmit_BTN.click();

    }

    public void ClickToViewClientCredentials() throws InterruptedException {
      //  Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[1]/*[1]")));
        WebElement ClientCredentials = driver.findElement(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[1]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientCredentials);
        ClientCredentials.click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientCredentials);

    }

    public void CopyClientCredentials() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]")));
        WebElement ClientCredentials = driver.findElement(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistCredentials_Verify);
        ClientCredentials.click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();

    }

    public void VerifyClientCredentialsAlertBox() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed());
//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/button[1]/*[1]")).click();
        System.out.println("**********" + driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed() + "**********");
       //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);

    }


    public void ClickToViewClientDetails() throws InterruptedException {

        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[2]/*[1]")));
        WebElement ClientDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[2]/*[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClientDetails);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(ClientDetails).click().perform();
        ClientDetails.click();

      //  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientDetails);
    }


//    public void VerifyViewClientDetailsPage() throws InterruptedException {
//
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'View Client')]")).isDisplayed());
//
//        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'View Client')]")).isDisplayed() + "**********");
//        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);
//
//        Thread.sleep(2000);
//        //driver.navigate().back();
//    }

    public void ClickOnClientEditButton() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
        WebElement ClickClientEditButton = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickClientEditButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickClientEditButton);

        // ClickClientEditButton.click();


        //

    }

    public void EditClientDetails() throws InterruptedException {

        System.out.println("View button display status :-" + driver.findElement(By.xpath("//button[contains(text(),'View')]")).isDisplayed());
        WebElement EnterLocation = driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EnterLocation);
EnterLocation.clear();

        EnterLocation.sendKeys("Mumbai");
//        String valueToSend = "Pune";
//
//        // Use JavaScript Executor to send the value to the input field
//        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", EnterLocation, valueToSend);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnterLocation);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by pixel
        js.executeScript("window.scrollBy(0, 500)");
        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
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
        Actions at = new Actions(driver);
        at.sendKeys(Keys.ARROW_UP).build().perform();
    }

    public void ClickToViewClientuserGoals() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//td[contains(text(),'w@1.com')]")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[3]/*[1]")));
        WebElement ClientuserGoals = driver.findElement(By.xpath("//tbody/tr[1]/td[17]/div[1]/div[3]/*[1]"));
        ClientuserGoals.click();
            //((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClientuserGoals);
        }
    public void ClickToAddClientuserGoals() throws InterruptedException {

        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add User Goal')]")));
        WebElement AddClientuserGoals = driver.findElement(By.xpath("//button[contains(text(),'Add User Goal')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddClientuserGoals);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AddClientuserGoals);
    }

    public void AddClientuserGoals() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add User Goal')]")));
        WebElement SelectCategory = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-3:nth-child(1) div.col-md-12.col-lg-12 div.row div.col-3:nth-child(1) div.d-flex.flex-column div:nth-child(2) div.d-flex.align-items-center > select.custom-select"));
        Select dropdown = new Select(SelectCategory);
        // ClientDropdown_List.click();
        dropdown.selectByValue("Pre- Linguistic Categories");
        Thread.sleep(2000);
        WebElement SelectSubCategory = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-3:nth-child(1) div.col-md-12.col-lg-12 div.row div.col-3:nth-child(2) div.d-flex.flex-column div:nth-child(2) div.d-flex.align-items-center > select.custom-select"));
        Select SubCategorydropdown = new Select(SelectSubCategory);
        // ClientDropdown_List.click();
        SubCategorydropdown.selectByValue("Eye-contact");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")));
        WebElement SelectGoal = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"));
        //EditSpec.click();
        //EditSpec.sendKeys("Unclear Speech");

        Actions actions = new Actions(driver);
        actions.moveToElement(SelectGoal);
        actions.click();
        actions.sendKeys("Sandeep - Game Testing");
        actions.build().perform();
        System.out.println(SelectGoal.getText());


        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectGoal);

        WebElement MaintainActivityOrder = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-4:nth-child(3) div.col-lg-4:nth-child(2) label.c-switch.form-check-label.c-switch-pill.c-switch-primary.switch > span.c-switch-slider"));

        // Check if the toggle button is already enabled
        if (!MaintainActivityOrder.isSelected()) {
            // If not enabled, click on the toggle button to enable it
            MaintainActivityOrder.click();
        }
        Thread.sleep(2000);
        WebElement InfoVideos = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-4:nth-child(3) div.col-md-4.col-lg-4:nth-child(3) label.c-switch.form-check-label.c-switch-pill.c-switch-primary.switch > span.c-switch-slider"));

        // Check if the toggle button is already enabled
        if (!InfoVideos.isSelected()) {
            // If not enabled, click on the toggle button to enable it
            InfoVideos.click();
        }

        Thread.sleep(2000);

        WebElement VideoTitle = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-3:nth-child(4) div.col-md-4.col-lg-4 div.info-video-container > input.form-control:nth-child(3)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", VideoTitle);
        VideoTitle.sendKeys("Learn Phonics");

        WebElement SelectVideo = driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div.card:nth-child(2) div.card-body div.row.form-group.mt-3:nth-child(4) div.col-md-4.col-lg-4 div.info-video-container div.mt-2:nth-child(4) div.d-flex.flex-column div:nth-child(2) div.d-flex.align-items-center > select.custom-select"));
        Select videodropdown = new Select(SelectVideo);
        videodropdown.selectByValue("https://phonologix-documents.s3.ap-south-1.amazonaws.com/tutorials/0103202410402862/fruits.jpg");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectVideo);

        WebElement UploadImage = driver.findElement(By.xpath("//div[contains(text(),'Browse')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UploadImage);
        VideoTitle.sendKeys("Learn Phonics");

        Thread.sleep(2000);
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickSubmit);
        System.out.println("USER GOAL HAS BEEN ADDED");
        driver.findElement(By.cssSelector("div.c-app.c-default-layout:nth-child(2) div.c-wrapper div.c-body:nth-child(2) main.c-main div.container-fluid div.fade.show div:nth-child(1) span.d-flex.mb-2 > svg:nth-child(1)")).click();

        Thread.sleep(2000);
    }
    public void ClientsPageNavigation() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);

        WebElement PageNumber = driver.findElement(By.xpath("//select[@class='custom-select pagination-select']"));
        Select PageNumberDropdown = new Select(PageNumber);
        PageNumberDropdown.selectByValue("2");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectVideo);

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//button[contains(text(),'Previous')]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

   driver.navigate().back();
   Thread.sleep(2000);
   driver.navigate().back();
    }

    }





//public void GoBack() {
//    System.out.println("*************** Navigating Back Now ***************");
//    driver.navigate().back();
//    System.out.println("***************CurrentUrl***************:-" + driver.getCurrentUrl());
//}