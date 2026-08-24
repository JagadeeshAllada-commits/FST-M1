package testng_activites;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.Reporter;


public class Activity9 {
	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
	}
	
	@BeforeMethod
	public void defaultAlert() {
		driver.switchTo().defaultContent();
		Reporter.log("Retrun to main page");
	}
	
	@Test
	public void simpleAlertTestCase() {
		WebElement button = driver.findElement(By.id("simple"));
		button.click();
		Reporter.log("Clicked on Simple alert button");
		
		Alert simple_alert = driver.switchTo().alert();
		String text = simple_alert.getText();
		simple_alert.accept();
		Reporter.log("Accepted the simple alert");
		Assert.assertEquals(text, "You've just triggered a simple alert!");
		
	}
	
	@Test
	public void confirmAlertTestCase() {
		WebElement button = driver.findElement(By.id("confirmation"));
		button.click();
		Reporter.log("Clicked on confirmation alert button");
		
		Alert confirm_alert = driver.switchTo().alert();
		String text = confirm_alert.getText();
		confirm_alert.dismiss();
		Reporter.log("Dismissed the confirmation alert");		
		Assert.assertEquals(text, "You've just triggered a confirmation alert!");
		
	}
	
	@Test
	public void promptAlertTestCase() {
		WebElement button = driver.findElement(By.id("prompt"));
		button.click();
		Reporter.log("Clicked on confirmation alert button");
	
		Alert prompt_alert = driver.switchTo().alert();
		String text = prompt_alert.getText();
		prompt_alert.sendKeys("This is Jags");
		prompt_alert.accept();
		Reporter.log("Added the prompt and accepted the prompt alert");
		Assert.assertEquals(text, "I'm a Prompt! Type something into me!");
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
