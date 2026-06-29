package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println(driver.getTitle());
		
		WebElement name = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
		WebElement date = driver.findElement(By.xpath("//input[@data-testid='event-date']"));
		WebElement additional_data = driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"));
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		name.sendKeys("Jags");
		email.sendKeys("test@test.com");
		date.sendKeys("20-06-2026");
		additional_data.sendKeys("Additionl info added");
		submit.click();
		
		WebElement confirm = driver.findElement(By.id("action-confirmation"));
		driver.quit();
	}

}
