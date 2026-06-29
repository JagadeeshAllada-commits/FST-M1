package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println(driver.getTitle());
		
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th[contains(@class,'cursor-pointer')]"));
		System.out.println("No of Columns: " +col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No of rows: " +row.size());
		
		WebElement fifth_book_name = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		System.out.println("5th book name: " +fifth_book_name.getText());
		
		WebElement price_header = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
		price_header.click();
		
		WebElement afterSort_fifth_book_name = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		System.out.println("5th book name: " +afterSort_fifth_book_name.getText());
		
		driver.quit();

	}

}
