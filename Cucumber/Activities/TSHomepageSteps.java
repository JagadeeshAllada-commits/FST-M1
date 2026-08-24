package stepDefenitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TSHomepageSteps extends BaseTest{
	@Given("user is on the TS homepage")
	public void openPage() {
		driver.get("https://training-support.net/");
	}
	
	@When("the user clicks on the About Us link")
	public void click_aboutUs() {
		WebElement aboutUs_btn = driver.findElement(By.xpath("//a[text()='About Us']"));
		aboutUs_btn.click();
	}
	
	@Then("they are redirected to another page")
	public void validation_page() {
		Assertions.assertEquals("About Training Support", driver.getTitle());
	}
}
