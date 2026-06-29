package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		System.out.println(driver.getTitle());
		
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th[contains(@class,'cursor-pointer')]"));
		System.out.println("No of Columns: " +col.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No of rows: " +row.size());
		
		List<WebElement> third_row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		System.out.println("3rd row of data: " +third_row_data.size());
		
		System.out.println("________Thirt row data______");
		for (WebElement data : third_row_data){
			System.out.println(data.getText());
		}
		
		WebElement sec_cell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println("2nd cell data: " +sec_cell.getText());
		
		driver.quit();
	}

}
