package pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PHLoginPage {
	
	private WebDriver driver=null;
	public PHLoginPage(WebDriver driver) {
	//public PHLogInPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void GoToLogInPage() throws InterruptedException {
		//BrowserConfig.SetDriver();
				
		driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
		
		Thread.sleep(2000);
	}
	
	public void EnterCredentials() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aryan79067@gmail.com");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);


	}
	
	public void ClickOnLoginButton() throws InterruptedException {
		   Thread.sleep(2000);

	           driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
