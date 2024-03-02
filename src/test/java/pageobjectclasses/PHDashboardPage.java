package pageobjectclasses;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PHDashboardPage extends PHBrowserConfig{

	private WebDriver driver=null;
	public PHDashboardPage(WebDriver driver) {
		//public PHLogInPage(WebDriver driver) {
		this.driver=driver;
		//this.driver = new ChromeDriver();
		//PageFactory.initElements(driver, this);
	}

	@SuppressWarnings("deprecation")
	public void UserLoggedIn() throws Exception {
		//BrowserConfig.SetDriver();
		driver.get("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");

		//driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
		Thread.sleep(2000);
		//VALIDATE PAGE URL

		String ActualResult = driver.getCurrentUrl();
		String ExpectedResult = "https://staging.dh8h2bodd8qh6.amplifyapp.com/login";
		System.out.println("ExpectedResult :-"+ExpectedResult);
		System.out.println("ActualResult :-"+ActualResult);
		Assert.assertEquals(ActualResult, ExpectedResult);
		//driver.get(ExpectedResult);


		//VALIDATE LOGIN TEXT ON PAGE
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed());
		System.out.println("**********"+driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed()+"**********");


		//Thread.sleep(2000);
		//new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));


		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aryan79067@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		ValidateDBPage();


		/*
		 * //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
		 * Assert.assertTrue(driver.findElement(By.xpath(
		 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
		 *
		 * System.out.print(driver.findElement(By.xpath(
		 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
		 */
	}
	@SuppressWarnings("deprecation")
	public void ValidateDBPage() throws Exception {
		//AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
		Thread.sleep(4000);
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]")).isDisplayed());
		System.out.println("**********"+driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]")).isDisplayed()+"**********");
	}
	public void SelectDropdownlistValues() throws InterruptedException {

//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-select form23']")));
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-select']")));
//		a.moveToElement(Sub).click().perform();
//Locate the dropdown element
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select form23']"));
		Thread.sleep(2000);
//Execute JavaScript code to select an option
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Last 30 Days';", dropdown);




		//dropdown.selectByValue("Last 30 Days");

	}
	public void GetPlanExpiryreport() throws InterruptedException
	{
		//Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		//Scroll down till the bottom of the page

		//WebElement PlanExpiryReport_Link=driver.findElement(By.xpath("//p[contains(text(),'Plan Expiry Report')]"));
		WebElement PlanExpiryReport_Link=driver.findElement(By.xpath("//p[contains(text(),'Plan Expiry Report')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PlanExpiryReport_Link);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Plan Expiry Report')]")));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlanExpiryReport_Link);
		//PlanExpiryReport_Link.click();
	}
	public void ViewPlanExpiryReport()
	{
		System.out.print("Inside Plan Expiry Report: User Can View List");
		NaviagteBack();
	}

	public void NaviagteBack()
	{
		System.out.println("*************** Navigating Back Now ***************");
		driver.navigate().back();
		System.out.println("***************CurrentUrl***************:-"+driver.getCurrentUrl());
	}
	public void GetSlotBookedReport() throws InterruptedException
	{
		Thread.sleep(2000);
		//WebElement SlotBookReport_Link=driver.findElement(By.id("slotbookreport"));
		WebElement SlotBookReport_Link=driver.findElement(By.xpath("//p[contains(text(),'Slot Book Report')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SlotBookReport_Link);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Slot Book Report')]")));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", SlotBookReport_Link);
		//PlanExpiryReport_Link.click();


		//driver.findElement(By.xpath("//p[contains(text(),'Slot Book Report')]")).click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//p[contains(text(),'Slot Book Report')]")));
	}
	public void ViewSlotBookedlist()
	{
		System.out.print("Inside Slot Booked Report: User Can View List");

	}
	public void GetSlotCompletedReport() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement SlotCompleteReport_Link=driver.findElement(By.xpath("//p[contains(text(),'Slot Complete Report')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SlotCompleteReport_Link);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Slot Complete Report')]")));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", SlotCompleteReport_Link);

		//driver.findElement(By.xpath("//p[contains(text(),'Slot Complete Report')]")).click();
	}
	public void ViewSlotCompletedlist()
	{
		System.out.print("Inside Slot Completed Report: User Can View List");

	}

	public void GetAssesmentReport() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement AssesmentReport_Link=driver.findElement(By.xpath("//p[contains(text(),'Assessments Report')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssesmentReport_Link);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Assessments Report')]")));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", AssesmentReport_Link);

		//driver.findElement(By.xpath("//p[contains(text(),'Assessments Report')]")).click();
	}
	public void ViewAssessmentlist()
	{
		System.out.print("Inside Assessment Report: User Can View List");

	}

	//driver.get(ExpectedResult);


//		//VALIDATE LOGIN TEXT ON PAGE
//		Thread.sleep(4000);
//		Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed());
//		System.out.println("**********"+driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed()+"**********");
//
//
//		//Thread.sleep(2000);
//		//new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
//
//
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aryan79067@gmail.com");
//
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
	// ValidateDBPage();


	/*
	 * //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
	 * Assert.assertTrue(driver.findElement(By.xpath(
	 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
	 *
	 * System.out.print(driver.findElement(By.xpath(
	 * "//h2[contains(text(),'Dashboard')]")).isDisplayed());
	 */
}

