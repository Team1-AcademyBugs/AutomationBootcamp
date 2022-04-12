package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Base;
import utils.Locators;
public class RegisterPage extends Base{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	public void registerUser() {
		openSite(Locators.signUpURL);
		sendText(Locators.firstNameField,"Juan");
	}

	
	
}
