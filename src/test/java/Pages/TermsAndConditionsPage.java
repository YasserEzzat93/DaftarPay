package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends PageBase{
	public TermsAndConditionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "")
	private WebElement TermsAndConditionsBtn;



	public void ClickOnLoginBtn() {
		TermsAndConditionsBtn.click();

	}

}
