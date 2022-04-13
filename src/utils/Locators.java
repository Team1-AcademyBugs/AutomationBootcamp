package utils;

import org.openqa.selenium.By;

public class Locators {
	
	public static String signUpURL ="https://academybugs.com/account/?ec_page=register";
	//Register Locators
	public static By firstNameField = By.name("ec_account_register_first_name");
	public static By lastNameField = By.name("ec_account_register_last_name");
	public static By emailField = By.name("ec_account_register_email");
	public static By retypeEmailField = By.name("ec_account_register_retype_email");
	public static By passwordField = By.name("ec_account_register_password");
	public static By retypePasswordField = By.name("ec_account_register_password_retype");
	public static By registerButton = By.xpath("//input[@value='REGISTER']");
	public static By emailLoggedIn = By.xpath("//div[@id=\"ec_account_dashboard\"]/div[2]/div[3]");
	public static By emptyNameField = By.id("ec_account_register_first_name_error");
	public static By emptyLastNameField = By.id("ec_account_register_last_name_error");
	public static By emptyEmailField = By.id("ec_account_register_email_error");
	public static By emptyPasswordField = By.id("ec_account_register_password_error");
	public static By incorrectEmailField = By.id("ec_account_register_email_retype_error");
	public static By incorrectPasswordField = By.id("ec_account_register_password_retype_error");
	public static By existingAccountField = By.xpath("//div[@class='ec_account_error']/div[1]");
	//Error messages
	public static String emptyNameError = "Please enter your First Name";
	public static String emptyLastNameError = "Please enter your Last Name";
	public static String emptyEmailError = "Please enter a valid Email";
	public static String emptyPasswordError = "Please enter a password of at least 6 characters";
	public static String invalidEmailError = "Your email addresses do not match";
	public static String invalidPasswordError = "Your passwords do not match";
	public static String existingEmailError = "The email you have entered already has an account.";
	public static String accountErrorMessage = "The username or password you entered is incorrect. Forgot Your Password?";
	public static String emptyLoginEmailError ="Please enter your Email Address";
	public static String emptyLoginPasswordError = "Please enter your Password";
	public static String confirmShippingUpdated = "Your shipping information was updated successfully.";
	public static String confirmBasicUpdated = "Your personal information was updated successfully.";
	//Log In Locators
	public static By loginEmailField = By.id("ec_account_login_email");
	public static By loginPasswordField = By.id("ec_account_login_password");
	public static By loginButton = By.xpath("//input[@value='SIGN IN']");
	public static By accountErrorField = By.xpath("//div[@class='ec_account_error']/div[1]");
	public static By emptyLoginEmailField = By.id("ec_account_login_email_error");
	public static By emptyLoginPasswordField = By.id("ec_account_login_password_error");
	//Account Navigation Locators
	public static By billingInformationField = By.xpath("//div[@class='ec_account_right']/div[2]/a[1]");
	public static By shippingInformationField = By.xpath("//div[@class='ec_account_right']/div[3]/a[1]");
	public static By basicInformationField = By.xpath("//div[@class='ec_account_right']/div[4]/a[1]");
	public static By updatePasswordField = By.xpath("//div[@class='ec_account_right']/div[5]/a[1]");
	//Update billing information
	public static By selectCountryField = By.xpath("//select[@name='ec_account_billing_information_country']");
	public static By firstNameBillingField = By.name("ec_account_billing_information_first_name");
	public static By lastNameBillingField = By.name("ec_account_billing_information_last_name");
	public static By addressBillingField = By.name("ec_account_billing_information_address");
	public static By cityBillingField = By.name("ec_account_billing_information_city");
	public static By zipCodeBillingField = By.name("ec_account_billing_information_zip");
	public static By phoneBillingField = By.name("ec_account_billing_information_phone");
	public static By updateButtonBillingFIeld = By.xpath("//input[@class='ec_account_button']");
	public static By updateBillingErrorIcon = By.xpath("//span[@class='ec_cart_billing_info_update_loader academy-bug']");
	//Update shipping information
	public static By selectCountryShippingField = By.xpath("//select[@id='ec_account_shipping_information_country']");
	public static By firstNameShippingField = By.xpath("//input[@name='ec_account_shipping_information_first_name']");
	public static By lastNameShippingField = By.xpath("//input[@id='ec_account_shipping_information_last_name']");
	public static By addressShippingField = By.xpath("//input[@id='ec_account_shipping_information_address']");
	public static By cityShippingField = By.id("ec_account_shipping_information_city");
	public static By zipCodeShippingField = By.id("ec_account_shipping_information_zip");
	public static By phoneShippingField = By.id("ec_account_shipping_information_phone");
	public static By updateButtonShippingField = By.xpath("//input[@value='UPDATE']");
	public static By confirmUpdateMessage = By.xpath("//div[@class='ec_account_success']/div[1]");
	//Update basic information
	public static By firstNameBasicField = By.id("ec_account_personal_information_first_name");
	public static By lastNameBasicField = By.id("ec_account_personal_information_last_name");
	public static By emailBasicField = By.id("ec_account_personal_information_email");
	//Update password information
	public static By oldPasswordField = By.id("ec_account_password_current_password");
	public static By newPasswordField = By.id("ec_account_password_new_password");
	public static By retypePasswordBasicField = By.id("ec_account_password_retype_new_password");
	
	
}
