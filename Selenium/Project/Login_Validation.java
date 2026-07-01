package crm_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Login_Validation extends CRM_Project{
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test()
	@Parameters({"username", "password"})
	public void logging_into_the_site(String username, String password) {
		driver.get("https://crm.alchemy.hguy.co/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username_field = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submit_button = driver.findElement(By.id("login-button"));
		
		username_field.sendKeys(username);
		password_field.sendKeys(password);
		submit_button.click();
		
		By home_locator = By.xpath("//div[@class='app-shell']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(home_locator));
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "SuiteCRM");
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
		
}
