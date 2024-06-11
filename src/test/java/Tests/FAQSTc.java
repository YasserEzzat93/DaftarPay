package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.FAQSPage;

public class FAQSTc extends TestBase{
	
	public LoginPage LoginPageObject;
	public FAQSPage faqsPageObject;




	@BeforeMethod
	public void setUp() throws InterruptedException {

		LoginPageObject = new LoginPage(driver);
		faqsPageObject = new FAQSPage(driver);


	}

}
