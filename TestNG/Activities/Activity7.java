package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class Activity7 {

	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	@DataProvider(name = "Credentials")
    public static Object[][] creds() {
        return new Object[][] { 
            { "admin1", "password1", "Invalid Credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid Credentials" }
        };
    }
	
	@Test(dataProvider = "Credentials")
	public void loginTest(String username, String password, String expectedMessage) {

		WebElement user_name = driver.findElement(By.id("username"));
        WebElement pass_word = driver.findElement(By.id("password"));
        WebElement login_Button = driver.findElement(By.xpath("//button[text()='Submit']"));
 
        // Enter the credentials and click Log in
        user_name.sendKeys(username);
        pass_word.sendKeys(password);
        login_Button.click();
 
        // Assert login message
        String loginMessage = driver.findElement(By.id("subheading")).getText();
        Assert.assertEquals(loginMessage, expectedMessage);
    }
	
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
}
