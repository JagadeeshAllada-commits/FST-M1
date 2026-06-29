package example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.xpath("//div/button[contains(text(), 'Open A New Tab')]"));
		button.click();
		
		String mainWindow = driver.getWindowHandle();
		
		Set<String> tabs = driver.getWindowHandles();
		
		for(String tab : tabs) {
			System.out.println(tab);
			if(tab!=mainWindow) {
				driver.switchTo().window(tab);
				System.out.println(driver.getTitle());
			}
		}
		driver.quit();
		

	}

}
