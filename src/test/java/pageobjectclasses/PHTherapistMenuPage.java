package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class PHTherapistMenuPage extends PHBrowserConfig {

    private WebDriver driver = null;

    public PHTherapistMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void DashpboardPageURL() throws Exception {
        //BrowserConfig.SetDriver();
        //driver.get("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");

        //driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
        Thread.sleep(2000);
        //VALIDATE PAGE URL
        System.out.println("***************CurrentUrl***************:-" + driver.getCurrentUrl());

//        String ActualResult = driver.getCurrentUrl();
//        String ExpectedResult = "https://staging.dh8h2bodd8qh6.amplifyapp.com/dashboard";
//        System.out.println("ExpectedResult :-" + ExpectedResult);
//        System.out.println("ActualResult :-" + ActualResult);
//        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    public void ViewTherapistMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Therapists")));
        WebElement TherapistMenu_Link = driver.findElement(By.linkText("Therapists"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistMenu_Link);


        //driver.findElement(By.linkText("Therapists")).click();
        //System.out.println("------Admin Clicks on Therapist Menu------");

    }

    public void ClickTherapistListSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement TherapistList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistList_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistList_Link);


//        driver.findElement(By.linkText("List")).click();
//        driver.findElement(By.xpath("//input[@placeholder='45 records...']")).sendKeys("Delayed Speech");
//        System.out.println("------Admin Can See Search Record Under Delayed Speech Specalities------");


    }

    public void SearchThreapistRecord() throws InterruptedException {
        Thread.sleep(2000);
        WebElement SearchRecord_List = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
        SearchRecord_List.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchRecord_List);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchRecord_List);

    }

    public void ValidateTherapistListPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Therapists List')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Therapists List')]")).isDisplayed() + "**********");
    }

    public void TherapistSaveExcelFile() throws InterruptedException {

        Thread.sleep(2000);
        WebElement SaveExcelFile = driver.findElement(By.xpath("//button[contains(text(),'Export as xlsx')]"));
        // SaveExcelFile.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveExcelFile);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Export as xlsx')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SaveExcelFile);
    }

    public void ClickOnPageBreadCrumbs() throws InterruptedException {
        //Thread.sleep(000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'3')]")));
        WebElement PageBreadCrumbs_Link = driver.findElement(By.xpath("//a[contains(text(),'3')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PageBreadCrumbs_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PageBreadCrumbs_Link);

    }

    public void ValidateSearchPageBreadCrumbsPage() throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Therapists')]")));//h3[contains(text(),'Therapists')]);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Therapists')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Therapists')]")).isDisplayed() + "**********");


    }

    public void VerifyTherapistListScrollVertical() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");


    }

    public void VerifyTherapistListScrollHorizantal() throws InterruptedException {
        Thread.sleep(4000);

        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");


    }

    public void ClickToViewTherapistCredentials() throws InterruptedException {
        Thread.sleep(2000);
        WebElement TherapistCredentials = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistCredentials);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials);

    }

    public void CopyTherapistCredentials() throws InterruptedException {
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]")));
        WebElement TherapistCredentials = driver.findElement(By.xpath("//span[contains(text(),'Click here to copy the Credentials')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistCredentials_Verify);
        TherapistCredentials.click();


    }

    public void VerifyTherapistCredentialsAlertBox() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//h5[contains(text(),\"User's Credentials\")]")).isDisplayed() + "**********");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);

    }

    public void ClickToViewTherapistDetails() throws InterruptedException {

        Thread.sleep(2000);
        WebElement TherapistDetails = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[2]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[2]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistDetails);
    }


    public void VerifyViewTherapistDetailsPage() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'View Therapist')]")).isDisplayed());

        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'View Therapist')]")).isDisplayed() + "**********");
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistCredentials_Verify);

    }

    public void ClickOnEditButton() throws InterruptedException {

        Thread.sleep(2000);
        WebElement ClickEditButton = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        //PageBreadCrumbs_Link.sendKeys("Delayed Speech");
        //// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Edit')]")));
        ClickEditButton.click();


        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistDetails);

    }

    public void EditTherapistDetails() throws InterruptedException {

        System.out.println("View button display status :-" + driver.findElement(By.xpath("//button[contains(text(),'View')]")).isDisplayed());
        WebElement EditSpec = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        //EditSpec.click();
        //EditSpec.sendKeys("Unclear Speech");

        Actions actions = new Actions(driver);
        actions.moveToElement(EditSpec);
        actions.click();
        actions.sendKeys("Unclear Speech");
        actions.build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")));
        System.out.println(EditSpec.getText());
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        SubmitButton.click();


        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitButton);
        System.out.println("Saved");
        Thread.sleep(2000);

        // Thread.sleep(12000);
//
//        //body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]
//        WebElement EditSpecalities = driver.findElement(By.xpath("//label[contains(text(),'Specialities')]/following-sibling::div"));
//       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditSpecalities);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")));
////EditSpecalities.getText();
//        //        //((JavascriptExecutor) driver).executeScript("element.focus();");
////        ((JavascriptExecutor) driver).executeScript("element.focus();");
////        EditSpecalities.sendKeys(Keys.SHIFT+"Stammering/Stuttering");
//////        Actions actions = new Actions(driver);
////        actions.moveToElement(EditSpecalities);
////        actions.click();
////        actions.sendKeys("Stammering/Stuttering");
////        actions.build().perform();
//       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EditSpecalities);
//        //EditSpecalities.sendKeys("Stammering/Stuttering");
//        //EditSpecalities.getText();
//
//        System.out.println("EditSpecalities text Before Edit is:-"+EditSpecalities.getText());
//        EditSpecalities.sendKeys("Stammering/Stuttering");
//        System.out.println("EditSpecalities text After Edit is:-"+EditSpecalities.getText());
//       // System.out.println("Updated Specalities Of Therapist :-"+driver.findElement(By.xpath("//div[contains(text(),'Stammering/Stuttering')]")).isDisplayed());


//
//        EditSpecalities.click();
//


    }

    public void GoBack() {
        System.out.println("*************** Navigating Back Now ***************");
        driver.navigate().back();
        System.out.println("***************CurrentUrl***************:-" + driver.getCurrentUrl());
    }


    public void ClickTherapistAddSubMenu() throws InterruptedException {

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add")));
//
//        WebElement TherapistAdd_Link = driver.findElement(By.linkText("Add"));
//       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistAdd_Link);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add")));

        Thread.sleep(5000);
        WebElement TherapistAdd_Link = driver.findElement(By.linkText("Add"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistAdd_Link);





    }

    public void AddNewTherapistDetails() throws InterruptedException {

Thread.sleep(3000);
        WebElement AddTherapistName = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddTherapistName);
//        WebDriverWait THNamewait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement until = THNamewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Name']")));
        AddTherapistName.sendKeys("Rahul Arora"+Keys.TAB);
System.out.println("ADD NEW NAME");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        WebElement AddTherapistSpecalities = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddTherapistSpecalities);
//        WebDriverWait ThSpecwait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        ThSpecwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")));
        //AddTherapistSpecalities.sendKeys(Keys.TAB);
        //AddTherapistSpecalities.sendKeys(Keys.SPACE);
//        Actions action=new Actions(driver);
//        action.click(AddTherapistSpecalities);
      //  AddTherapistSpecalities.sendKeys("Unclear Speech");

//set the dropdown value to '' using javascript
        AddTherapistSpecalities.click();
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[contains(text(),'Delayed Speech')]")));
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[contains(text()='Delayed Speech')]")).click();
//        WebElement AddTherapistSp_txtBox=driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
//        AddTherapistSp_txtBox.click();
//        AddTherapistSp_txtBox.clear();
//        AddTherapistSp_txtBox.sendKeys("Delayed Speech"+Keys.ENTER);

//        AddTherapistSpecalities.sendKeys("//div[contains(text(),'Delayed Speech')]");
//        js.executeScript("arguments[0].value='Unclear Speech'", AddTherapistSpecalities);

       // driver.findElement(By.xpath("//*[contains(text()='Delayed Speech')]")).click();
        System.out.println("ADD NEW SPECALITIES");



        WebElement AddTherapistEmail = driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THEmailwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THEmailwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Email']")));
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        AddTherapistEmail.sendKeys(("kanchan" + randomInt + "@gmail.com"));
        System.out.println(AddTherapistEmail);

        WebElement AddTherapistMobileNumber = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THMobilewait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THMobilewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Mobile Number']")));

        AddTherapistMobileNumber.sendKeys(("8877665544"));
        System.out.println(AddTherapistMobileNumber);



        Thread.sleep(3000);
        //SELECT DATE OF BIRTH
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        WebElement AddTherapistDOB = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
//        WebDriverWait THDOBwait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        THDOBwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")));
        //Fill date as dd/mm/yyyy as 09/25/2013
//        Thread.sleep(3000);
AddTherapistDOB.sendKeys("09-02-2005");

       //js.executeScript("arguments[0].value='09-02-2005'", AddTherapistDOB


        Thread.sleep(3000);


//
//        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@max='2005-12-02']")));
//
//        js.executeScript("arguments[0].value='09-02-2005'", AddTherapistDOB);
//        Thread.sleep(3000);
//        System.out.println(AddTherapistDOB);

        WebElement AddTherapistDOJ = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THDOJwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THDOJwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")));
        //Fill date as dd/mm/yyyy as 09/25/2013

        AddTherapistDOJ.sendKeys("29-11-2022");

        System.out.println(AddTherapistDOJ);

        WebElement AddTherapistLangUnderstood = driver.findElement(By.xpath("//div[@id='react-select-3-placeholder']"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THLangUnderstoodwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THLangUnderstoodwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='react-select-3-placeholder']")));
        //Fill date as dd/mm/yyyy as 09/25/2013

        AddTherapistLangUnderstood.sendKeys("English");

        System.out.println(AddTherapistLangUnderstood);


        WebElement AddTherapistLangSpoken = driver.findElement(By.xpath("//div[@id='react-select-4-placeholder']"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THLangSpokenwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THLangSpokenwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='react-select-4-placeholder']")));
        //Fill date as dd/mm/yyyy as 09/25/2013

        AddTherapistLangSpoken.sendKeys("Bengali");

        System.out.println(AddTherapistLangSpoken);


        WebElement ClickSubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THSubmitnwait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THSubmitnwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        //Fill date as dd/mm/yyyy as 09/25/2013
        ClickSubmitButton.click();

        System.out.println("Clicked on submit button");


    }

    public void GoBackHomePage() {
        System.out.println("*************** Navigating Back Home Page Now ***************");
        WebElement ClickHomePage_Link = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTherapistName);
        WebDriverWait THHomePagewait = new WebDriverWait(driver, Duration.ofSeconds(20));
        THHomePagewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
        //Fill date as dd/mm/yyyy as 09/25/2013
        ClickHomePage_Link.click();

        System.out.println("Clicked on Home page link ");


    }

    public void ViewPartnersMenu() {
        GoBackHomePage();

        WebElement PartnersMenu_Link = driver.findElement(By.linkText("Partners"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PartnersMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Partners")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PartnersMenu_Link);


        //driver.findElement(By.linkText("Therapists")).click();
        //System.out.println("------Admin Clicks on Therapist Menu------");

    }

    public void ClickPartnersListSubMenu() {
        WebElement TherapistList_Link = driver.findElement(By.linkText("List"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistList_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistList_Link);


//    public void ClickPartenrsAddSubMenu() {
//        //GoBack();
//        WebElement TherapistPartner_Link = driver.findElement(By.linkText("Partners"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TherapistPartner_Link);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Partners")));
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TherapistPartner_Link);


//        driver.findElement(By.linkText("List")).click();
//        driver.findElement(By.xpath("//input[@placeholder='45 records...']")).sendKeys("Delayed Speech");
//        System.out.println("------Admin Can See Search Record Under Delayed Speech Specalities------");


    }

}



