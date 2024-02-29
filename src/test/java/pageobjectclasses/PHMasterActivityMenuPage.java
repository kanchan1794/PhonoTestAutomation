package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class PHMasterActivityMenuPage extends PHBrowserConfig {


    private WebDriver driver = null;

    public PHMasterActivityMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ViewMasterActivityMenu() throws InterruptedException {
        //driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]/div[1]")).click();
        Thread.sleep(3000);
        WebElement MasterActivityScroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        MasterActivityScroll.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Master Activity")));
        WebElement MasterActivityMenu_Link = driver.findElement(By.linkText("Master Activity"));
        //MasterActivityMenu_Link.sendKeys(Keys.PAGE_DOWN);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MasterActivityMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", MasterActivityMenu_Link);

    }

    public void ClickMasterActivityListSubMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("List")));
        WebElement MasterActivityListSubMenu_Link = driver.findElement(By.linkText("List"));
        Actions actions = new Actions(driver);
        actions.moveToElement(MasterActivityListSubMenu_Link).click().perform();

    }

    public void SelectCategoryAndSubCategory() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));
        WebElement Category_dropdown = driver.findElement(By.id("category"));
        Category_dropdown.click();
        Select Category = new Select(Category_dropdown);
        Category.selectByValue("Identification");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("subCategory")));
        WebElement SubCategory_dropdown = driver.findElement(By.id("subCategory"));
        SubCategory_dropdown.click();
        Select SubCategory = new Select(SubCategory_dropdown);
        SubCategory.selectByValue("nouns");

        WebElement CategorySubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        CategorySubmit.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});");
        WebElement ScrollCenter = driver.findElement(By.tagName("footer"));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ScrollCenter, 0, -50);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
        //SCROLL TO TOP OF THE PAGE
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[contains(text(),'Master Activities')]")));

       // ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Category.selectByValue("All");
        Thread.sleep(2000);
        SubCategory.selectByValue("All");
        Thread.sleep(2000);
        CategorySubmit.click();
    }

    public void SelectGameType() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")));
        WebElement GameType_dropdown = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]"));
        GameType_dropdown.click();
        Select GameType = new Select(GameType_dropdown);
        WebElement SelectGameType = driver.findElement(By.xpath("//option[contains(text(),'Move with Voice')]"));
        GameType.selectByValue(String.valueOf(SelectGameType));
        WebElement GameTypeSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        GameTypeSubmit.click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});");
//        WebElement ScrollCenter = driver.findElement(By.tagName("footer"));
//        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ScrollCenter, 0, -50);
//        new Actions(driver)
//                .scrollFromOrigin(scrollOrigin, 0, 200)
//                .perform();
        //SCROLL TO TOP OF THE PAGE


    }

    public void SeacrhByUsingNameDescription() throws AWTException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='']")));
        WebElement MasterActivitySearchName = driver.findElement(By.linkText("List"));
MasterActivitySearchName.sendKeys("Testing");
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyPress(KeyEvent.VK_S);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyPress(KeyEvent.VK_I);
//        robot.keyPress(KeyEvent.VK_N);
//        robot.keyPress(KeyEvent.VK_G);
//        Thread.sleep(2000);
        WebElement SearchSubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        SearchSubmit.click();

        //        Actions actions = new Actions(driver);
//        actions.moveToElement(MasterActivityListSubMenu_Link).click().perform();

    }

}

        //Category_dropdown.clear();

//        MasterActivityCategory_List.click();

//        WebElement MasterActivityCategory_List = driver.findElement(By.id("category"));
//        MasterActivityCategory_List.click();
//        List<WebElement> allOptions = driver.findElements(By.id("category"));
//
//      String option = "Identification";
//        // Iterate the list using for loop
//
//        for (int i = 0; i < allOptions.size(); i++) {
//
//            if (allOptions.get(i).getText().contains(option)) {
//
//                allOptions.get(i).click();
//
//                System.out.println("Identification Option is Selected");
//
//                break;
//
//            }




//        public void ValidateClientListPage() throws InterruptedException {
//        Thread.sleep(4000);
//        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed());
//
//        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Clients List')]")).isDisplayed() + "**********");
//    }
//
//    public void SearchClientRecord() throws InterruptedException {
//        Thread.sleep(2000);
//        WebElement ClientDropdown_List = driver.findElement(By.xpath("//select[@class='custom-select']"));
//        Select dropdown = new Select(ClientDropdown_List);
//       // ClientDropdown_List.click();
//        dropdown.selectByValue("Active");
//        Thread.sleep(2000);
//        WebElement ClientSearchSubmit_BTN = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//        ClientSearchSubmit_BTN.click();
//
//    }
//
//    public void GoBack() {
//        System.out.println("*************** Navigating Back Now ***************");
//        driver.navigate().back();
//        System.out.println("***************CurrentUrl***************:-" + driver.getCurrentUrl());
//    }
//
