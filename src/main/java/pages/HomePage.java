package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	
	@FindBy(name="userName")
	WebElement userNameTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	@FindBy(xpath="//td[@width='112']/span")
	WebElement loginErrorMsg;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignOnLink() {
		signOnLink.click();
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public void enterUserName(String username) {
		userNameTxtField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTxtField.sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean LoginErrorMsg() {
		return loginErrorMsg.isDisplayed();
	}
	
	
}
