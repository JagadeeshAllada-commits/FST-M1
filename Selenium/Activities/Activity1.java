package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		WebElement about_us_btn = driver.findElement(By.linkText("About Us"));
		about_us_btn.click();
		
		System.out.println("About us page title : " + driver.getTitle());
		
		driver.quit();
		

	}

}
