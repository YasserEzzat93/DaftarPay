package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FAQSPage extends PageBase{
	
	public FAQSPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "")
	private WebElement ContactUsBtn;



	public void ClickOnLoginBtn() {
		ContactUsBtn.click();

	}

}
