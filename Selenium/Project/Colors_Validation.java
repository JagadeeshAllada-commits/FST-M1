package crm_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Colors_Validation extends CRM_Project{
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@BeforeMethod()
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
		System.out.println("Logged Successfully: "+title);
		
	}
	
	@Test()
	public void getting_colors() {
		WebElement navbar = driver.findElement(By.tagName("nav"));
		Color nav_color = Color.fromString(navbar.getCssValue("color"));
		System.out.println(nav_color.asHex());
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
