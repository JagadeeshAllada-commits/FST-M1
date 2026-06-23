package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println(driver.getTitle());
		
		WebElement user_name = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement click_btn = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		user_name.sendKeys("admin");
		password.sendKeys("password");
		click_btn.click();
		
		driver.quit();
		
		

	}

}
