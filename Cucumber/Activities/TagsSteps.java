package stepDefenitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsSteps extends BaseTest{
	
	@Given("User is on the page")
	public void user_is_on_the_page() {
		driver.get("https://training-support.net/webelements/alerts");
	}

	@When("User clicks the Simple Alert button")
	public void simple_alert() {
		WebElement simple_btn =  driver.findElement(By.id("simple"));
		simple_btn.click();
	}
	
	@When("User clicks the Confirm Alert button")
	public void confirm() {
		WebElement confirm_btn = driver.findElement(By.id("confirmation"));
		confirm_btn.click();
	}
	
	@When("User clicks the Prompt Alert button")
	public void prompt() {
		WebElement prompt_btn = driver.findElement(By.id("prompt"));
		prompt_btn.click();
	}
	
	@Then("Alert opens")
	public void alert_opens() {
		Alert alert = driver.switchTo().alert();
	}
	
	@And("Read the text from it and print it")
	public void read_alert() {
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text);
	}
	
	@And("Close the alert")
	public void simple_handle() {
		driver.switchTo().alert().accept();
	}
	
	@And("Close the alert with Cancel")
	public void confim_handle() {
		driver.switchTo().alert().dismiss();
	}
	
	@And("Write a custom message in it")
	public void prompt_handle() {
		driver.switchTo().alert().sendKeys("Its Prompt Alert");
	}
	
	@And("Read the result text")
	public void result() {
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
	}
}
