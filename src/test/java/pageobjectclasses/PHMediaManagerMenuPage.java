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
//
//        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
//        MediaManagerScroll.click();

        WebElement MediaManagerScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Perform a sequence of DOWN arrow key presses to scroll down (adjust the number of times based on your needs)
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(MediaManagerScroll, Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(1000);  // Add a delay to give the page time to react, adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/media-manager/list']")));
        WebElement MediaManagerMenu_Link = driver.findElement(By.xpath("//a[@href='/media-manager/list']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MediaManagerMenu_Link);


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", MediaManagerMenu_Link);
Thread.sleep(3000);

//        WebElement Middle_Scroll = driver.findElement(By.xpath("//h4[contains(text(),'SouthKoreaFlag')]"));
//        //scroll to middle with Javascript Executor
//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", Middle_Scroll);
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }



    public void SearchMedia() throws InterruptedException {

        WebElement SearchMedia = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(SearchMedia);
        actions.click();
        actions.sendKeys("vehicles");
        actions.sendKeys(Keys.RETURN);
        actions.build().perform();
        //System.out.println(SearchMedia.getText());
        Thread.sleep(2000);
        String s = Keys.chord(Keys.CONTROL, "a");
        SearchMedia.sendKeys(s);
        // sending DELETE key
        SearchMedia.sendKeys(Keys.DELETE);


    }


    public void SearchDetails() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")));
        Thread.sleep(2000);
        WebElement Searchdetails = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(Searchdetails).click().sendKeys("kids").sendKeys(Keys.ENTER).perform();


        //Searchdetails.sendKeys("kids");
        Thread.sleep(2000);
        WebElement SearchSubmit = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        SearchSubmit.click();
        Thread.sleep(2000);
        //SearchSubmit.click();
        //Thread.sleep(3000);
        // sending Ctrl+a by Keys.Chord()
        String s = Keys.chord(Keys.CONTROL, "a");
        Searchdetails.sendKeys(s);
        // sending DELETE key
        Searchdetails.sendKeys(Keys.DELETE);
    }


    public void AddmediaFile() throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Media File')]")));
        WebElement AddMediaButton = driver.findElement(By.xpath("//button[contains(text(),'Add Media File')]"));
        AddMediaButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/form/div/div[1]/div[1]/div/div/div/select")));
        WebElement Category_dropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/main/div/div/div/div/form/div/div[1]/div[1]/div/div/div/select"));
        Category_dropdown.click();
        Select Category = new Select(Category_dropdown);
        Category.selectByValue("Fruits");
        Thread.sleep(2000);
        // drpCategory.selectByVisibleText("Fruits");
        //Thread.sleep(3000);
        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title here']"));
        EnterTitle.sendKeys("Fruits Media");
        Thread.sleep(3000);
        WebElement EnterDescription = driver.findElement(By.tagName("textarea"));
        EnterDescription.sendKeys("Fruits Media File");
        WebElement Browsefile=  driver.findElement(By.xpath("//div[contains(text(),'Browse')]"));
Browsefile.click();
       // driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("file:C:/Users/prana/File/fruits.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

// to paste the link & then to release the button
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(4000);


        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ClickSubmit.click();

    }
    public void MediaManagerNextButton() throws InterruptedException {
        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement NextButton=driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
        Actions action = new Actions(driver);
        action.moveToElement(NextButton).click().perform();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }

    public void MediaManagerPreviousButton() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement PreviousButton=driver.findElement(By.xpath("//button[contains(text(),'Previous')]"));
        Actions action = new Actions(driver);
        action.moveToElement(PreviousButton).click().perform();
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
//        Thread.sleep(2000);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }
        }
    public void HandleMedia() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        WebElement ClickPreviewIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/*[1]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickPreviewIcon);
        Actions actions = new Actions(driver);

        // Perform click action
        actions.click(ClickPreviewIcon).perform();
        driver.findElement(By.xpath("//button[contains(text(),'View in Full Screen')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
    }
    public void ClickEditMediaIcon() throws InterruptedException {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/*[1]")));
        WebElement ClickEditIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/*[1]"));
        ClickEditIcon.click();

        WebElement EnterTitle = driver.findElement(By.xpath("//input[@placeholder='Enter title here' and @value='Fruits Media']"));
        EnterTitle.clear();
        EnterTitle.sendKeys("Fruits Image");
        Thread.sleep(3000);
        //Thread.sleep(5000);
        WebElement ClickSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickSubmit);
        ClickSubmit.click();
    }
    public void ClickToSeeUsuageOfMedia() throws InterruptedException {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/*[1]")));
        WebElement ClickIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/*[1]"));
        ClickIcon.click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    }







