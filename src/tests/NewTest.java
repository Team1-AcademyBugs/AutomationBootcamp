package tests;

import org.testng.annotations.Test;

import pages.RegisterPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	
	private WebDriver driver;
	RegisterPage registerPage;
	
  @Test
  public void f() {
	  registerPage.registerUser();
  }
  @BeforeMethod
  public void beforeClass() {
	  registerPage = new RegisterPage(driver);
	  driver = registerPage.chromeDriver();
	  
  }

  @AfterMethod
  public void afterClass() {
  }

}
