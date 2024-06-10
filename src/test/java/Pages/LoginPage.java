//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//public class LoginPage {
//
//
//	private WebDriver driver;
//
//    public LoginPage(WebDriver driver) {
//    
//        this.driver = driver;
//        System.out.println("-?>>>>>>>>>>>>"+driver);
//    }
//
//    @FindBy(id = "NationalId_number")
//    private WebElement NationalId;
//
//    @FindBy(id = "client-login-Password")
//    private WebElement passwordInput;
//
//    @FindBy(className  = "e-btn btn-hover1")
//    private WebElement loginButton;
//
//    public void enterUsername(String ID) {
//    	
//    	System.out.println("-?>>>>>>>>>>>>"+ID);
//    	NationalId.sendKeys(ID);
//    	System.out.println(NationalId);
//    	
//    }
//
//    public void enterPassword(String password) {
//        passwordInput.sendKeys(password);
//    }
//
//    public void clickLogin() {
//        loginButton.click();
//    }
//    
//    public void enterUsername22(String username , String password) {
//    	NationalId.sendKeys(username);
//    	passwordInput.sendKeys(password);
//    	loginButton.click();
//    }
//    
//
//    
//    
//}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
		super(driver);
	}
    
    
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/a")
	private WebElement LoginBtnInHomePage;



    @FindBy(xpath = "//*[@id=\"NationalId_number\"]")
    private WebElement NationalId;

    @FindBy(id = "client-login-Password")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/app-root/app-site/div[1]/div/div[2]/app-page/div/app-page-content/div/app-gridster/gridster/gridster-item/app-widget/div/div/app-dynamic-component/lib-login-portal/div/div/div/div/section/div/div/div[2]/div[1]/div/div/div/div[1]/auth-client-login/form/div[4]/button")
    private WebElement loginButton;

    
    
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/app-page/div/app-page-content/div/app-gridster/gridster/gridster-item/app-widget/div/div/app-dynamic-component/lib-login-portal/div/div/div/div/section/div/div/div[2]/div[1]/ul/li[2]/a")
    private WebElement LoginBtnAsMerchant;
    
    @FindBy(id = "business_crn_id")
    private WebElement CrnTxt;
    
    @FindBy(id = "business_login_password")
    private WebElement CrnPassword;
    
    @FindBy(xpath = "//*[@id=\"business\"]/auth-business-login/form/div[4]/button")
    private WebElement LoginAsMerchant;
    
	public void ClickOnLoginBtn() {
		LoginBtnInHomePage.click();

	}
    
    
    

    public void enterNID(String ID) {
        NationalId.sendKeys(ID);
        
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
    
    
    
    public void MakeLogin(String ID , String password) 
    {
    	ClickOnLoginBtn();
    	NationalId.sendKeys(ID);
    	passwordInput.sendKeys(password);
    	loginButton.click();
    	
    }
    
    
    public void MakeLoginAsMerchant(String Crn , String password) 
    {
    	ClickOnLoginBtn();
    	LoginBtnAsMerchant.click();
    	CrnTxt.sendKeys(Crn);
    	CrnPassword.sendKeys(password);
    	LoginAsMerchant.click();
    	
    }
    
}

