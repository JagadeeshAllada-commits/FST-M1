package crm_project;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Title_Validation extends CRM_Project {
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test
	public void verify_the_website_title() {
		driver.get("https://crm.alchemy.hguy.co/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "SuiteCRM");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
