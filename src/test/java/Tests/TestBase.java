package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;







public class TestBase {

	public static WebDriver driver;

	@BeforeSuite

	@Parameters ({"browser"})
	public void startDriver(@Optional("chrome") String browserName) 
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");    	
			driver = new ChromeDriver();  
		}

		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		//	public void startDriver () {
		//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		//		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://test.daftarpay.co/IMOREGATEWAY/IMORECORE/portal/org/daftarMain/landing#/index/LandingPage");
		//	} 
	}










	//	@AfterSuite
	//	public void StopDriver() 
	//	{
	//		driver.quit();
	//	}
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());
		}
	}




}
