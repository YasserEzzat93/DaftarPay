package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.graph.SuccessorsFunction;

import Pages.LoginPage;

public class LoginTestCases extends TestBase{
	
	public LoginPage LoginPageObject;
	
	

    @BeforeMethod
    public void setUp() throws InterruptedException {

         
        
         
    	LoginPageObject = new LoginPage(driver);
      
      
    }

    @Test
    public void LoginWithValidData() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin("1069975926", "123456");
       
      }
    
    @Test
    public void LoginWithinValidData() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin("1069975926", "123456");
      }
    
    @Test
    public void LoginWithEmptyData() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin("", "");
       
      }
    
    @Test
    public void LoginWithEmptyPassword() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin("1069975926", "");  
       
      }
    
    @Test
    public void LoginWithEmptyNID() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin("", "123456");
    	//Assert.assertTrue(SuccessNotification.getText().contains(""));
      }
    

    
    @Test
    public void LoginWithCorrectCrnandCorrectPassword() throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLoginAsMerchant("2121212", "12345");
       
      }



}
