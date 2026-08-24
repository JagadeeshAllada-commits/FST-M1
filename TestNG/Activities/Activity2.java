package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class Activity2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		
	}
	
	@Test
	public void page_title() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test
	public void button_click() {
		WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
	}
	
	@Test(enabled = false)
	public void skipped_method() {
		
	}
	
	@Test
	public void skipped_method_exception() {
		throw new SkipException("Skipped Test Case");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
