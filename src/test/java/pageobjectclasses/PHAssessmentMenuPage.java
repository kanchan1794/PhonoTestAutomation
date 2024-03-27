package pageobjectclasses;

//import io.cucumber.messages.types.Duration;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PHAssessmentMenuPage {
    private WebDriver driver = null;

    public PHAssessmentMenuPage(WebDriver driver) {
        //super(driver);
        this.driver = driver;
    }

    public void ClicksOnAssessmentMenu() throws InterruptedException {

        Thread.sleep(3000);
        WebElement Assessmentcroll = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/ul[1]/div[2]"));
        Assessmentcroll.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Assessments")));
        WebElement AssessmentMenu_Link = driver.findElement(By.linkText("Assessments"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", AssessmentMenu_Link);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AssessmentMenu_Link);

    }
    public void SelectCalendarDates() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"datePicker\"]/div/input[1]")));
        WebElement SelectFromDate = driver.findElement(By.xpath("//*[@id=\"datePicker\"]/div/input[1]"));
        Thread.sleep(3000);
        String desiredDate = "2023-11-01";
                // Execute JavaScript to set the date in the input field
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", SelectFromDate, desiredDate);

        WebElement SelectTodate = driver.findElement(By.xpath("//*[@id=\"datePicker\"]/div/input[2]"));
        Thread.sleep(3000);
        String desiredDate2 = "2024-02-25";
        // Execute JavaScript to set the date in the input field
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", SelectTodate, desiredDate2);
        WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        Thread.sleep(3000);
        SubmitButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"allAppointment\"]/div/div/div/div/div[1]")));
        //WebElement recordsTable = driver.findElement(By.xpath("//*[@id=\"allAppointment\"]/div/div/div/div/div[1]"));
    }
}