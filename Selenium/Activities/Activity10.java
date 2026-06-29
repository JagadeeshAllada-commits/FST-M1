package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Title of the page: " +driver.getTitle());
		
		//all buttons
		
		WebElement corgo_lock_btn = driver.findElement(By.xpath("//div[@role='button'][1]"));
		WebElement corgo_toml_btn = driver.findElement(By.xpath("//div[@role='button'][2]"));
		WebElement src_btn = driver.findElement(By.xpath("//div[@role='button'][3]"));
		WebElement target_btn = driver.findElement(By.xpath("//div[@role='button'][4]"));
		
		act.click(corgo_lock_btn).build().perform();
		
		act.moveToElement(corgo_toml_btn).click().pause(200).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		act.doubleClick(src_btn).build().perform();
		act.contextClick(target_btn).build().perform();
		act.click(driver.findElement(By.xpath("//div[@id='menu']/div[1]/ul[1]/li[1]"))).pause(200).build().perform();
		
		System.out.println(driver.findElement(By.id("result")).getText());

		driver.quit();

	}

}
