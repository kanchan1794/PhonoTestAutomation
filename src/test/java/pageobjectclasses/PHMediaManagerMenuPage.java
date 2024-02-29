package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v117.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PHMediaManagerMenuPage extends PHBrowserConfig{
    private WebDriver driver = null;

    public PHMediaManagerMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }




    public void ClickMediaManagerMenu() throws InterruptedException {
        Thread.sleep(2000);

        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        MediaManagerScroll.click();
        WebElement MediaManagerMenu_Link = driver.findElement(By.xpath("//a[@href='/media-manager/list']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MediaManagerMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/media-manager/list']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", MediaManagerMenu_Link);
Thread.sleep(3000);

        WebElement Middle_Scroll = driver.findElement(By.xpath("//h4[contains(text(),'SouthKoreaFlag')]"));
        //scroll to middle with Javascript Executor
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", Middle_Scroll);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }



    public void SearchMedia() throws InterruptedException {
        WebElement SearchMedia = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        //EditSpec.click();
        //EditSpec.sendKeys("Unclear Speech");

        Actions actions = new Actions(driver);
        actions.moveToElement(SearchMedia);
        actions.click();
       // actions.sendKeys("Fruits");
        //Thread.sleep(2000);
        //actions.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        actions.sendKeys("Vehicles");
      //  Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        actions.sendKeys(Keys.BACK_SPACE);
        actions.build().perform();


    }


    public void SearchDetails() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")));
        WebElement Searchdetails = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
        Searchdetails.sendKeys("kids");
        Thread.sleep(3000);
        WebElement SearchSubmit = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        SearchSubmit.click();
        Thread.sleep(3000);
        SearchSubmit.click();




    }


    public void AddmediaFile() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Media File')]")));
        WebElement AddMediaButton = driver.findElement(By.xpath("//button[contains(text(),'Add Media File')]"));
        AddMediaButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/form/div/div[1]/div[1]/div/div/div/select")));
        WebElement Category_dropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/form/div/div[1]/div[1]/div/div/div/select"));
        Category_dropdown.click();
        Select Category = new Select(Category_dropdown);
        Category.selectByValue("Fruits");
        //       WebElement SelectCategoryDrp =  driver.findElement(By.xpath("//select[@name='select']"));
//       SelectCategoryDrp.click();
//        Select drpCategory = new Select(driver.findElement(By.xpath("//select[@name='select']")));
        Thread.sleep(3000);
        // drpCategory.selectByVisibleText("Fruits");
        Thread.sleep(3000);
        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title here']"));
        EnterTitle.sendKeys("Fruits Media");

        //        Actions actions = new Actions(driver);
//        actions.moveToElement(EnterTitle);
//        actions.sendKeys("fruits media");
        Thread.sleep(3000);
        WebElement EnterDescription = driver.findElement(By.tagName("textarea"));
        EnterDescription.sendKeys("Fruits Media File");
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(EnterDescription);
//        actions1.sendKeys("Fruits Media File");


        //-----*** WITH THE HELP OF ROBOT CLASS FILE UPLOAD------//
        // file path passed as parameter to StringSelection

        StringSelection s = new StringSelection("C:\\Users\\prana\\Downloads\\fruits.jpg");
        // Clipboard copy
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
        //identify element and click
        driver.findElement(By.xpath("//div[contains(text(),'Browse')]")).click();
        // Robot object creation
        Robot r = new Robot();
        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);
        //pressing ctrl+v
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        //releasing ctrl+v
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ClickSubmit.click();





//------ WITH THE HELP OF SENDKEYS FILE UPLOAD
//        //WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10 seconds timeout
//        //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Browse')]")));
//
//        WebElement BrowseFile = driver.findElement(By.xpath("//div[contains(text(),'Browse')]")); // Replace with the actual ID or other locator of your file input
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(BrowseFile).perform();
        // Provide the file path to the input element using sendKeys
      //  BrowseFile.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");
      //  BrowseFile.sendKeys(filePath);
        // element.click();
        //FileUpload.sendKeys("C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\src\\test\\java\\File\\fruits.jpg");
    }


}








    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
//    public void SearchTransactionrecords()
//    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='filter-input-focus']")));
//        WebElement SearchTransactionrecord = driver.findElement(By.xpath("//input[@id='filter-input-focus']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SearchTransactionrecord);
//        SearchTransactionrecord.sendKeys("Sandeep");
//
//        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", SearchTransactionrecord);
//
//    }
//    public void ValidateTransactionRecordsPage() throws InterruptedException {
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//td[contains(text(),'pay_NHF47yKSDuxgWZ')]")).isDisplayed()+"**********");
//
//    }
//    public void ClickOnTransactionpageBreadCrumbs()
//    {
//
//        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        Wait.until((ExpectedConditions.visibilityOfElementLocated((By.linkText("5")))));
//        WebElement TraPageBreadCrumbs_Link = driver.findElement(By.linkText("5"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TraPageBreadCrumbs_Link);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TraPageBreadCrumbs_Link);
//
//    }
//
//    public void ValidateTRanSearchPageBreadCrumbsPage() throws InterruptedException {
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//
//        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed() + "**********");
//        Thread.sleep(2000);
//
//    }
//    public void GOPreviousPage() throws InterruptedException {
//
//        Thread.sleep(2000);
//       ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//        WebElement GoBackTrPage = driver.findElement(By.linkText("1"));
//        GoBackTrPage.click();
//       // JavascriptExecutor js = (JavascriptExecutor)driver;
//        //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])")));
//driver.navigate().back();
//
//
////        WebElement TRScrollUP = driver.findElement(By.xpath("//h3[contains(text(),'Transactions')])"));
////
//////TRScrollUP.isDisplayed();
//
//
//    }
//    public void VerifyTransactionListScrollVertical() throws InterruptedException {
//
//        Thread.sleep(4000);
//        WebElement TransactionMenu_Link = driver.findElement(By.xpath("//a[@href='/transactions']"));
//        TransactionMenu_Link.click();
//        //Thread.sleep(4000);
//
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollTop=300");
//    }
//
//    public void VerifyTransactionListScrollHorizantal() throws InterruptedException {
//        Thread.sleep(4000);
//
//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div.sc-aXZVg.dKvPpX > div > div.table-responsive\").scrollLeft=300");
//
//
//    }
//
//
//

