package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println(driver.getTitle());
		
		act.sendKeys("Hello").build().perform();
		
		WebElement text = driver.findElement(By.xpath("//div/h1[contains(@class,'mt-3')]"));
		
		System.out.println(text.getText());
		
		driver.quit();

	}

}
