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

public class Header_Img_Validation extends CRM_Project{
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test
	public void get_the_url_of_the_header_image() {
		driver.get("https://crm.alchemy.hguy.co/");
		By img = By.xpath("//div/scrm-logo-ui/scrm-image/img[contains(@class,'image')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(img));
		String img_url = driver.findElement(img).getAttribute("src");
		System.out.println(img_url);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
