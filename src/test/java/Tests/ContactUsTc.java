package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.ContactUsPage;

public class ContactUsTc extends TestBase{
	
	public LoginPage LoginPageObject;
	public ContactUsPage ContactUsPageObject ;




	@BeforeMethod
	public void setUp() throws InterruptedException {

		LoginPageObject = new LoginPage(driver);
		ContactUsPageObject = new ContactUsPage(driver);

	}


}
