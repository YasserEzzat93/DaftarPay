package Tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.ForgetPasswordPage;

public class ForgetPasswordTc extends TestBase{

	public LoginPage LoginPageObject;
	public ForgetPasswordPage ForgetPasswordPageObject;




	@BeforeMethod
	public void setUp() throws InterruptedException {

		LoginPageObject = new LoginPage(driver);
		ForgetPasswordPageObject = new ForgetPasswordPage(driver);


	}
	public void OpenLoginPage() 
	{
		ForgetPasswordPageObject.ClickOnLoginBtn();
	}
	@Test
	public void clickOnForgetPasswordLbl() throws InterruptedException {
		OpenLoginPage();
		Thread.sleep(5000);    	
		ForgetPasswordPageObject.ClickOnForgetPasswordLbl();

	}

}
