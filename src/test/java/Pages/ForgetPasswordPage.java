package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage extends PageBase{
	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


    @FindBy(xpath = "//*[@id=\"client\"]/auth-client-login/form/div[3]/div/a")
    private WebElement ForgetPasswordLbl;




    public void ClickOnForgetPasswordLbl() {
    	ForgetPasswordLbl.click();
        
    }



}
