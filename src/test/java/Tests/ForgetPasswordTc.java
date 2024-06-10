package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
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
    	ForgetPasswordPageObject = new ForgetPasswordPage(driver);
      
    }
    
    @Test
    public void clickOnForgetPasswordLbl() throws InterruptedException {
    	Thread.sleep(5000);    	
    	ForgetPasswordPageObject.ClickOnForgetPasswordLbl();
       
      }

}
