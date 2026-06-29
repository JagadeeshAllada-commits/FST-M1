package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println(driver.getTitle());
		
		WebElement clickMe_btn = driver.findElement(By.id("genButton"));
		
		clickMe_btn.click();
		
		WebElement dynamic_text = driver.findElement(By.id("word"));
		
		if(wait.until(ExpectedConditions.textToBePresentInElement(dynamic_text, "release"))) {
			System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
		}
		
		driver.quit();
	}

}
