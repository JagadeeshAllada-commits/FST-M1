package example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.id("simple"));
		button.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		
		simpleAlert.accept();
		
		driver.quit();

	}

}
