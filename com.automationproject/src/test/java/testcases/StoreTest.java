package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import baseclass.TestBase;
import pages.Storepage;
import pages.AccountLogin;

public class StoreTest extends TestBase {
	Storepage sp;
	AccountLogin accountLogin;  // an object is been created for the next page account login

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		sp = new Storepage(); // initialization of the object yp for the Your Store Page  is done here
	}

	@Test(priority=1)
	public void testSomething()
	{
		sp.clickmyAccount();
		sp.clickmyloginbtn();
	}
	


	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}
  
}
