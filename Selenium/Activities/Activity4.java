package example;

import org.openqa.selenium.support.Color; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Title of the current page is " + driver.getTitle());
		
		WebElement third_header = driver.findElement(By.xpath("//h3[contains(@class, 'text-orange-600')]"));
		WebElement fifth_header = driver.findElement(By.xpath("//h5[contains(@class, 'text-purple-600')]"));
		
		
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		String fifth_header_text = fifth_header.getText();
		
		System.out.println(third_header.getText());
		System.out.println(fifthHeaderColor.asHex());
		System.out.println(fifthHeaderColor.asRgb());
		System.out.println(fifthHeaderColor.getColor());
		
		driver.quit();

	}

}
