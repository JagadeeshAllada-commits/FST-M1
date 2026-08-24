package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		submit_button.click();
		
		String login_text = driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals(login_text, "Welcome Back, Admin!");
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
