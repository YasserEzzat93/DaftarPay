package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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

	///////////////Create Client Account///////////////////////////////////////////////////

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






	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/div/form/div[1]/div/div[2]/code-input/span[1]/input")
	private WebElement OTPLbl;

	public void EnterOtp(String OTP) {
		OTPLbl.sendKeys(OTP);
	}


	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/div/form/div[3]/button")
	private WebElement VerifyOtpBtn;

	public void ClickOnVerifyOtp() {
		VerifyOtpBtn.click();
	}


	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/div/form/div[2]/button")
	private WebElement NafathBtn;

	public void ClickOnVerifyNafath() {
		NafathBtn.click();
	}

	@FindBy(id = "clientPassword")
	private WebElement CreatePinCode;

	@FindBy(id = "customCheck1")
	private WebElement ConfirmTerms;

	@FindBy(id = "customCheck2")
	private WebElement ConfirmCheckFromSimah;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-3\"]/div/form/div/div[4]/button")
	private WebElement CreateAccountBtn;



	public void EnterPinCode(String Pin) {
		CreatePinCode.sendKeys(Pin);
		ConfirmTerms.click();
		ConfirmCheckFromSimah.click();
		CreateAccountBtn.click();
	}




































	///////////////Create Merchant Account///////////////////////////////////////////////////

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
