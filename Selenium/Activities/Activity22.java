package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/webelements/popups");
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.id("launcher"));
		button.click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		submit.click();
		
		driver.quit();
	}

}
