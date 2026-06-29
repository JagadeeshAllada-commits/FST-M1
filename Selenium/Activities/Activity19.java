package example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.id("confirmation"));
		button.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert confrimationAlert = driver.switchTo().alert();
		System.out.println(confrimationAlert.getText());

		confrimationAlert.accept();
		
		button.click();
		wait.until(ExpectedConditions.alertIsPresent());
		confrimationAlert.dismiss();
		
		driver.quit();
	}

}
