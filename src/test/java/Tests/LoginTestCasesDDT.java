package Tests;


import java.io.IOException;

//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Pages.LoginPage;
import data.ExcelReader;

public class LoginTestCasesDDT extends TestBase{
	
	public LoginPage LoginPageObject;
	
	

	
	

    @BeforeMethod
    public void setUp() throws InterruptedException {
     
         
    	LoginPageObject = new LoginPage(driver);
   
    }
    
    @DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}
	

    @Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
    public void LoginWithValidData(String NID , String Password) throws InterruptedException {
    	Thread.sleep(5000);    	
    	LoginPageObject.MakeLogin(NID,Password);
       
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
