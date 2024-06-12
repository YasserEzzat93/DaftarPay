package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;

//import java.util.concurrent.TimeUnit;

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
		RegisterPageObject.FirstStepinClientRegister("1069975966","123456");


	}

	@Test
	public void EnterClientOTP () throws InterruptedException {
		RegisterPageObject.openClientRegister();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);  
		Thread.sleep(1500);
		RegisterPageObject.FirstStepinClientRegister("1069975968","545210102");
		Thread.sleep(1500);
		RegisterPageObject.EnterOtp("123456");
		RegisterPageObject.ClickOnVerifyOtp();
	}


	@Test
	public void VerifyNafath () throws InterruptedException {

		EnterClientOTP();
		RegisterPageObject.ClickOnVerifyNafath();
	}

	@Test
	public void VerifyNafath2323 () throws InterruptedException {
		VerifyNafath();
		RegisterPageObject.EnterPinCode("123456");
	}
	
	
	@Test
	public void CreateClientAccountWithValidData() throws InterruptedException 
	
	{
		RegisterPageObject.openClientRegister();
		//Thread.sleep(1500);
		RegisterPageObject.CreateClientWithCompleteInfo("1069975948", "524878787", "123654", "123456");
	}



















































	@Test
	public void OpenMerchantReigsterPage() throws InterruptedException 
	{
		RegisterPageObject.openMerchantRegister();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooqewewks"));
	}

	@Test
	public void EnterCrnOTP() throws InterruptedException {
		OpenMerchantReigsterPage();
		RegisterPageObject.EnterCrnOtp("123456");	
	}


}




























// Example 1: Assert page title
//assert driver.getTitle().equals("Expected Title");
//
// Example 2: Assert URL
//assert driver.getCurrentUrl().equals("Expected URL");
//
// Example 3: Assert element presence
//assert driver.findElement(By.id("elementId")).isDisplayed();
//
// Example 4: Assert element text
//assert driver.findElement(By.xpath("//div")).getText().equals("Expected Text");
//
// Example 5: Assert element attribute value
//assert driver.findElement(By.name("elementName")).getAttribute("attributeName").equals("Expected Value");
