package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println(driver.getTitle());
		
		WebElement username_xpath = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password_xpath = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement btn_xpath = driver.findElement(By.xpath("//button[@data-svelte-h='svelte-gtkoxm']"));
		
		username_xpath.sendKeys("admin");
		password_xpath.sendKeys("password");
		btn_xpath.click();
		
		driver.quit();

	}

}
