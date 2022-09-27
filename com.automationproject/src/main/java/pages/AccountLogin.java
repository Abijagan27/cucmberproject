package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;


public class AccountLogin extends TestBase {
	public AccountLogin() {
		PageFactory.initElements(webDriver, this);
	}
	
	
    @FindBy(id = "input-email")
    private WebElement inputEmailField;

	@FindBy(id = "input-password")
	private WebElement enterPasswordField;

	@FindBy(css = "input[type='submit']")
	private WebElement submitBtn;

	public void enterEmail(String email) {
	inputEmailField.sendKeys(email);
	}

	public void enterPassword(String password) {
	enterPasswordField.sendKeys(password);
	}

	public void clickSubmitBtn() {
	submitBtn.submit();
//	return new MyAccountPage();
	}

	public void login(String email, String password) {
	enterEmail(email);
	enterPassword(password);
	clickSubmitBtn();
	//return clickSubmitBtn();
	}
}

 

