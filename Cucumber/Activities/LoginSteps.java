package stepDefenitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest{
	@Given("the user is on the login page")
	public void loginPage() {
		driver.get("https://training-support.net/webelements/login-form");
	}

	@When("the user enters {string} and {string}")
	public void enter_creds_with_params(String user_name , String pass_word) {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
		
	}
	
	@When("the user enters username and password")
	public void enter_creds() {
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		
	}
	
	@And("clicks the submit button")
	public void click_submitBtn() {
		WebElement submit_btn = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		submit_btn.click();
	}
	
	@Then("get the confirmation message and verify it")
	public void verification_loginSuccess() {
		String login_success_text = driver.findElement(By.tagName("h2")).getText();
		Assertions.assertEquals("Welcome Back, Admin!", login_success_text);
	}
	
	@Then("get the confirmation text and verify message as {string}")
	public void verify_login(String login_text) {
		String message = "NOT FOUND";
        if (login_text.contains("Invalid")) {
            message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2#subheading"))).getText();
        } else {
            message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
        }
        // Assert message
        Assertions.assertEquals(login_text, message);
    }
}
