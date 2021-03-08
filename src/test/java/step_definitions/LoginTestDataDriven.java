package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginSuccessPage;

public class LoginTestDataDriven extends TestBase {
	HomePage hp;
	LoginSuccessPage lsp;
	
	@Before
	public void openBrowser() {
		initialization();
		hp = new HomePage();
		lsp = new LoginSuccessPage();
	}
	
	@After
	public void closeBroswer() {
		tearDown();
	}
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		System.out.println(hp.getHomePageTitle());
	}

	@When("^user provides valid \"(.*)\" & valid \"(.*)\"$") 
	public void user_provides_valid_username_valid_password(String username, String password) {
		hp.enterUserName(username);
		hp.enterPassword(password);
	}

	@And("clicks submit button")
	public void clicks_submit_button() {
		hp.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		Assert.assertEquals(lsp.getLoginSuccessPageTitle(), "Login: Mercury Tours");
	}

	@And("login success page should get displayed")
	public void login_success_page_should_get_displayed() {
		Assert.assertTrue(lsp.LoginSuccessMsg());
	}
	
	@When("user provides invalid {string} & invalid {string}")
	public void user_provides_invalid_invalid(String username, String password) {
		hp.enterUserName(username);
		hp.enterPassword(password);
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() {
		Assert.assertEquals(hp.getHomePageTitle(), "Welcome: Mercury Tours");
	}

	@And("error message saying enter correct credentials should get displayed")
	public void error_message_saying_enter_correct_credentials_should_get_displayed() {
		Assert.assertTrue(hp.LoginErrorMsg());
	}


}
