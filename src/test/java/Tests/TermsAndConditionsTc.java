package Tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.TermsAndConditionsPage;


public class TermsAndConditionsTc extends TestBase{
	
	public LoginPage LoginPageObject;
	public TermsAndConditionsPage TermsAndConditionsPageObject ;




	@BeforeMethod
	public void setUp() throws InterruptedException {

		LoginPageObject = new LoginPage(driver);
		TermsAndConditionsPageObject = new TermsAndConditionsPage(driver);


	}

}
