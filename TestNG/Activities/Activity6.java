package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class Activity6 {
	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	@Test
	@Parameters({"username","password"})
	public void registration(String username, String password) {
		WebElement user_name = driver.findElement(By.id("username"));
		WebElement pass_word = driver.findElement(By.id("password"));
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		user_name.sendKeys(username);
		pass_word.sendKeys(password);
		submit_button.click();
		
		String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
	}
	
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
