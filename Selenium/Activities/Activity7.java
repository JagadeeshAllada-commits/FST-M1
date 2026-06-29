package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the Page: " +driver.getTitle());
		
		WebElement text_field = driver.findElement(By.id("textInput"));
		
		System.out.println("Input box is visible: "+text_field.isEnabled());
		
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("Input box is visible: "+text_field.isEnabled());
		
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("Input box is visible: "+text_field.isEnabled());
		
		driver.quit();

	}

}
