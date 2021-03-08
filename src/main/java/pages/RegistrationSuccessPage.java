package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegistrationSuccessPage extends TestBase{

	@FindBy(xpath="//table[@width='492']/tbody/tr[3]")
	WebElement registrationSuccessMsg;
	
	public RegistrationSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean registrationSuccessMessage() {
		return registrationSuccessMsg.isDisplayed();
	}
}
