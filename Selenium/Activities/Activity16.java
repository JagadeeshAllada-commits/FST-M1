package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title of the page: "+driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Two");
		System.out.println("Selected by visible text: " + select.getFirstSelectedOption().getText());
		
		select.selectByIndex(2);
		System.out.println("Selected by index: " + select.getFirstSelectedOption().getText());
		
		select.selectByValue("four");
		System.out.println("Selected by value: " + select.getFirstSelectedOption().getText());
		
		
		List<WebElement> options = select.getOptions();
		for(WebElement option : options){
			System.out.println(option.getText());
		}
			
		driver.quit();

	}

}
