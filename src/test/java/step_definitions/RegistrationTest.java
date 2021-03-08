package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegistrationSuccessPage;

public class RegistrationTest extends TestBase{
	HomePage hp;
	RegisterPage rp;
	RegistrationSuccessPage rsp;
	
	@Before
	public void openBrowser() {
		initialization();
		hp = new HomePage();
		rp = new RegisterPage();
		rsp = new RegistrationSuccessPage();
	}
	
	@After
	public void closeBroswer() {
		tearDown();
	}

	@Given("user is in register page")
	public void user_is_in_register_page() {
		hp.clickRegisterLink();
	}

	@When("enter valid informations {string} and {string}")
	public void enter_valid_informations_and(String username, String password) {
		rp.enterUserName(username);
		rp.enterPassword(password);
		rp.enterConfirmPassword(password);  
	}
	
	@And("clicks submit")
	public void clicks_submit() {
		rp.clickSubmitBtn();
	}

	@Then("user should be registered")
	public void user_should_be_registered() {
	    Assert.assertTrue(rsp.registrationSuccessMessage());
	}
}
