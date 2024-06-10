package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends PageBase{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/a")
	private WebElement LoginBtnInHomePage;

	public void clickLogin() {
		LoginBtnInHomePage.click();
	}

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/app-page/div/app-page-content/div/app-gridster/gridster/gridster-item/app-widget/div/div/app-dynamic-component/lib-login-portal/div/div/div/div/section/div/div/div[2]/div[2]/div/div/a")
	private WebElement RegisterBtnInLoginPage;

	public void clickRegisterBtnInLoginPage() {
		RegisterBtnInLoginPage.click();
	}



	@FindBy(id = "NationalId_number")
	private WebElement NIDInRegisterTxt;
	
	@FindBy(id  = "phone_number")
	private WebElement PhoneInRegisterTxt;
	
	@FindBy(xpath  = "//*[@id=\"cdk-step-content-0-0\"]/form/div[3]/button")
	private WebElement FirstNextBtnOnClientRegister;

	public void FirstStepinClientRegister(String NID , String Phone){

		NIDInRegisterTxt.sendKeys(NID);
		PhoneInRegisterTxt.sendKeys(Phone);
		FirstNextBtnOnClientRegister.click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/app-page/div/app-page-content/div/app-gridster/gridster/gridster-item/app-widget/div/div/app-dynamic-component/lib-client-registration-portal/div/div/div/div/section/div/div/div[2]/div[1]/ul/li[2]/a")
	private WebElement openregisterMerchant;

	public void clickMerchantRegisterBtnInregisterPage() {
		openregisterMerchant.click();
	}








	public void openClientRegister() 
	{
		clickLogin();
		clickRegisterBtnInLoginPage();
	}


	public void openMerchantRegister() 
	{
		clickLogin();
		clickRegisterBtnInLoginPage();
		clickMerchantRegisterBtnInregisterPage();

	}

}
