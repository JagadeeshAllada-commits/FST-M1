package testng_activites;

import static org.testng.Assert.assertEquals;
import java.io.FileReader;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class Activity10 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/simple-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@DataProvider(name = "csvDataProvider")
	public static Object[][] readCsv() throws Exception {
		CSVReader reader = new CSVReader(new FileReader("src/test/resources/input.csv"));
		reader.skip(1);
		List<String[]> allRows = reader.readAll();

		Object[][] data = new Object[allRows.size()][];
		for (int i = 0; i < allRows.size(); i++) {
			data[i] = allRows.get(i);
		}
		reader.close();

		return data;
	}

	@Test(dataProvider = "csvDataProvider")
	public void testForm(String[] rows) {
		WebElement fullName = driver.findElement(By.id("full-name"));
		fullName.sendKeys(rows[0]);
		driver.findElement(By.id("email")).sendKeys(rows[1]);
		driver.findElement(By.name("event-date")).sendKeys(rows[2]);
		driver.findElement(By.id("additional-details")).sendKeys(rows[3]);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		String message = driver.findElement(By.id("action-confirmation")).getText();
		assertEquals(message, "Your event has been scheduled!");

		driver.navigate().refresh();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}