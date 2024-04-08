package pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHDemoGoalsMenuPage extends PHBrowserConfig {
    private WebDriver driver = null;

    public PHDemoGoalsMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClickDemoGoalsMenu() throws InterruptedException {
        Thread.sleep(2000);

//        WebElement DemoGoalsScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        DemoGoalsScroll.click();
        WebElement DemoGoalsMenu_Link = driver.findElement(By.xpath("//a[@href='/demogoals/add']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", DemoGoalsMenu_Link);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/demogoals/add']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DemoGoalsMenu_Link);


//
//
//        Thread.sleep(3000);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");
//
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void ValidateDemoGoalspage() throws InterruptedException {
       Thread.sleep(4000);

        Assert.assertTrue(this.driver.findElement(By.xpath("//h3[contains(text(),'Demo Goals')]")).isDisplayed());
        System.out.println("" + this.driver.findElement(By.xpath("//h3[contains(text(),'Demo Goals')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ON DEMO GOAL PAGE ");

//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")));//h3[contains(text(),'Therapists')]);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed());
//
//        System.out.println("**********" + driver.findElement(By.xpath("//h3[contains(text(),'Screening Tests')]")).isDisplayed() + "**********");

//       Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }


    public void ADD_demogaols() throws InterruptedException {

        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();


    }


    public void admin_can_fill_details()throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'modal-body')]//div[contains(@class,'')]//div[1]//div[1]//div[1]//div[1]//select[1]")));
        WebElement Category_drp = driver.findElement(By.xpath("//div[contains(@class,'modal-body')]//div[contains(@class,'')]//div[1]//div[1]//div[1]//div[1]//select[1]"));
        Category_drp.click();
        Select Category = new Select(Category_drp);
        Category.selectByValue("Pre- Linguistic Categories");

        //Thread.sleep(2000);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
        WebElement SubCategory_drp = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
        SubCategory_drp.click();
        Select SubCategory = new Select(SubCategory_drp);
        SubCategory.selectByValue("Eye-contact");

        Thread.sleep(2000);

        WebDriverWait Wait2 =new WebDriverWait(driver,Duration.ofSeconds(30));
        Wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]")));
        WebElement PleaseSelect_drp = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/select[1]"));
        PleaseSelect_drp.click();
        Select Please = new Select(PleaseSelect_drp);
        Please.selectByIndex(1);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
//        Select Please = new Select(driver.findElement(By.xpath("//option[contains(text(),'Test meraj - MEraj test')]")));
//        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//option[contains(text(),'Test meraj - MEraj test')]")));
//        Please.selectByValue("Test meraj-MEraj test");




    }
    public void SelectCategoryAndSubCategory() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demoCategorie")));
        WebElement Category_dropdown = driver.findElement(By.id("demoCategorie"));
        Category_dropdown.click();
        Select Category = new Select(Category_dropdown);
        Category.selectByValue("Pre- Linguistic Categories");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='c-wrapper']//div[2]//div[1]//div[1]//div[1]//select[1]")));
        WebElement SubCategory_dropdown = driver.findElement(By.xpath("//div[@class='c-wrapper']//div[2]//div[1]//div[1]//div[1]//select[1]"));
        SubCategory_dropdown.click();
        Select SubCategory = new Select(SubCategory_dropdown);
        SubCategory.selectByValue("Eye-contact");


    }

    public void Admin_enter_search_keyword() throws InterruptedException{

        driver.findElement(By.id("filter-input-focus")).sendKeys("Multiple Goals Testing - Multiple Goals Testing");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.id("filter-input-focus")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();
    }

    public void relevant_search_is_generated(){
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Search:')]")).isDisplayed());
       System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Search:')]")).isDisplayed());
       System.out.println("ADMIN CAN SEE SEARCH RECORD ");

    }

     public void DeletDemoGoals()throws InterruptedException{

        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]")).click();

          Thread.sleep(2000);

//         // code for scroll bar inside the window
//         WebElement Scroll = driver.findElement(By.xpath("//div[@class='table-responsive']"));
//         JavascriptExecutor js = (JavascriptExecutor) driver;
//         js.executeScript("arguments[0].scrollTop = 500;", Scroll);
//
//         Thread.sleep(2000);
//
//
//         // code for scroll bar for entire web page
        JavascriptExecutor js = (JavascriptExecutor) driver;

         // Scroll down vertically by 500 pixels
         js.executeScript("window.scrollBy(0, 500)");

     }


}











    //super(driver);
//    public void ValidateTransactionPage() throws InterruptedException {
//        //VALIDATE LOGIN TEXT ON PAGE
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed());
//        System.out.println("**********"+driver.findElement(By.xpath("//h3[contains(text(),'Transactions')]")).isDisplayed()+"**********");
//    }
