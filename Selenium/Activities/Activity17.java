package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		
		WebElement multi_Select = driver.findElement(By.xpath("//select[contains(@class,'h-80')]"));
		
		Select multiSelect = new Select(multi_Select);
		
		multiSelect.selectByVisibleText("HTML");
		multiSelect.selectByIndex(3);
		multiSelect.selectByIndex(4);
		multiSelect.selectByIndex(5);
		multiSelect.selectByValue("nodejs");
		multiSelect.deselectByIndex(4);
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement option : selectedOptions) {
			System.out.println("Selected Options: " + option.getText());
		}
		
		driver.quit();

	}

}
