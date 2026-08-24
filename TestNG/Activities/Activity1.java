package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

	WebDriver driver;
	
		@BeforeClass
	    public void setUp() {
	        driver = new FirefoxDriver();
	        driver.get("https://training-support.net");
	    }
		
		@Test(priority=1)
		public void testing() {
			String title = driver.getTitle();                   
			System.out.println(title);
			Assert.assertEquals(title, "Training Support");
		}
		
		@Test(priority=2)
		public void about_us_test(){
			WebElement about_us_button = driver.findElement(By.xpath("//a[text()='About Us']"));
			about_us_button.click();
			String about_us_title = driver.getTitle();
			System.out.println(about_us_title);
			Assert.assertEquals(about_us_title, "About Training Support");
		}
		
		@AfterClass
		public void close() {
			driver.quit();
	}
}
