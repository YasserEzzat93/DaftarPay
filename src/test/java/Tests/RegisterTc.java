package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ForgetPasswordPage;
import Pages.LoginPage;
import Pages.RegisterPage;

public class RegisterTc extends TestBase {

	public LoginPage LoginPageObject;
	public ForgetPasswordPage ForgetPasswordPageObject;
	public RegisterPage RegisterPageObject;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		LoginPageObject = new LoginPage(driver);
		ForgetPasswordPageObject = new ForgetPasswordPage(driver);
		RegisterPageObject = new RegisterPage(driver);


	}

	@Test
	public void OpenClientReigsterPage() 
	{
		RegisterPageObject.openClientRegister();

	}


	@Test
	public void CheckValidationOnNID() throws InterruptedException 
	{
		RegisterPageObject.openClientRegister();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);  
		Thread.sleep(3000);
		RegisterPageObject.FirstStepinClientRegister("12345","98454");


	}

	@Test
	public void test () {
		RegisterPageObject.FirstStepinClientRegister("", "");
	}




















































	@Test
	public void OpenMerchantReigsterPage() 
	{
		RegisterPageObject.openMerchantRegister();
	}

}
