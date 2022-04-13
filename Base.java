package com.AutomationBootCamp_Team1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	private WebDriver driver;
	//protected final Wait<WebDriver>wait;
	
	public Base(WebDriver driver) {
		//this.wait= new WebDriverWait (driver,5);
		this.driver=driver;
	}
	
	//public static void click2(WebElement locator) {
		//WebDriverWait wait= (WebDriverWait) new WebDriver(locator,45);
		//wait.until(ExpectedConditions.visibilityOf(locator));
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
		//wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
	//locator.click();
//	}
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\denniss.raigoso\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> findElements (By locator){
		return driver.findElements(locator);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	public void click (By locator) {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		//WebDriverWait wait=new WebDriverWait(driver, 100);
		//WebElement driver = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(locator).click();
	}
	public void espera (By locator) {
		WebDriverWait wait=new WebDriverWait(driver, 100);
		WebElement driver = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void select(String inputText, By locator) {
		Select select=new Select(driver.findElement(locator));
		select.selectByVisibleText(inputText);
	}
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public void visit(String url) {
		driver.get(url);
	}
	

}
