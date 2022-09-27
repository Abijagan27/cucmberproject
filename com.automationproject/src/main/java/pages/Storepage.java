package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class Storepage extends TestBase{
	public Storepage() {
		PageFactory.initElements(webDriver, this);
		}
@FindBy(css="#top-links ul li:nth-of-type(2) span:first-of-type")
private WebElement MyAccount;
@FindBy(css="#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
private WebElement Registerbtn;
@FindBy(css="#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a")
private WebElement loginbtn;
public void clickmyAccount()
{
	MyAccount.click();
}
public RegisterPage clickmyregisterbtn()
{
	Registerbtn.click();
	return new RegisterPage();
}
public AccountLogin clickmyloginbtn()
{
	loginbtn.click();
	return new AccountLogin();
	
}
}
