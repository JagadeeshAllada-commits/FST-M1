package crm_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Traverse_Validation extends CRM_Project{
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		act = new Actions(driver);
	}
	
	@BeforeMethod()
	public void logging_into_the_site() {
		driver.get("https://crm.alchemy.hguy.co/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username_field = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submit_button = driver.findElement(By.id("login-button"));
		
		username_field.sendKeys("admin");
		password_field.sendKeys("5Nx#I6BK%r3$8vz0ch");
		submit_button.click();
		
		By home_locator = By.xpath("//div[@class='app-shell']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(home_locator));
		
		String title = driver.getTitle();
		System.out.println("Logged Successfully: "+title);
		
	}
	
	@Test()
	public void traversing_tables() {
		WebElement acounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		act.moveToElement(acounts).perform();
		
		WebElement submenu = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("div.dropdown-menu.submenu")
						)
				);

		WebElement view_account = driver.findElement(By.xpath("//a[contains(@class,'sub-nav-link')]/span[text()='View Accounts']"));
		view_account.click();
		By viewAccount_locator = By.xpath("//div/scrm-module-title[@class='list-view-title']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewAccount_locator));
		
		List<WebElement> accounts_list = driver.findElements(By.xpath("//a/scrm-varchar-detail"));
		
		for(WebElement li : accounts_list) {
			int index = accounts_list.indexOf(li)+1;
			if(index%2!=0) {
				System.out.println(li.getText());
			}
		}
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
}
