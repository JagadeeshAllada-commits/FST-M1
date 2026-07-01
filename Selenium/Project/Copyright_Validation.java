package crm_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Copyright_Validation extends CRM_Project {
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test
	public void get_the_copyright_text() {
		driver.get("https://crm.alchemy.hguy.co/");
		By copyright_locator = By.xpath("//a[contains(text(),'Supercharged ')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(copyright_locator));
		WebElement copyright = driver.findElement(copyright_locator);
		System.out.println(copyright.getText());
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
