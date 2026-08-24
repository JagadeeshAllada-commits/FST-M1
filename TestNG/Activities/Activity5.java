package testng_activites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	
	@BeforeClass
	public void set_up() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups = {"HeaderTests" , "ButtonTests"})
	public void pageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test(groups = "HeaderTests")
	public void header_testcase1() {
		String header3 = driver.findElement(By.xpath("//h3[contains(text(),'3')]")).getText();
		Assert.assertEquals(header3, "Heading #3");
	}
	
	@Test(groups = "HeaderTests")
	public void header_testcase2() {
		WebElement header5 = driver.findElement(By.xpath("//h5[contains(text(),'5')]"));
		Color fifth_color = Color.fromString(header5.getCssValue("color"));
		Assert.assertEquals(fifth_color.asHex(), "#9333ea");
	}
	
	@Test(groups = "ButtonTests")
	public void button_testcase1() {
		WebElement emarald_button = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
		String emarald_button_text = emarald_button.getText();
		Assert.assertEquals(emarald_button_text, "Emerald");
	}
	
	@Test(groups = "ButtonTests")
	public void button_testcase2() {
		WebElement color_button = driver.findElement(By.xpath("//button[contains(text(),'Amber')]"));
		Color color = Color.fromString(color_button.getCssValue("color"));
		Assert.assertEquals(color.asHex(), "#581c87");
	}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
}
