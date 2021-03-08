package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPage extends TestBase{
	
	@FindBy(name="email")
	WebElement userNameTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPswd;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userNameTxtField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTxtField.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPswd.sendKeys(confirmPassword);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
}
