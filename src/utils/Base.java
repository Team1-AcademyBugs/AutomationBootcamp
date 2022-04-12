package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected WebDriver driver;
	
	
	public Base(WebDriver driver) {
		this.driver = driver;
		
		
	}
	public WebDriver chromeDriver() {
	 driver = new ChromeDriver();
	 return driver;
	}
	public void openSite(String site) {
		this.driver.get(site);
	}
	public void sendText(By path,String text) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(path));
		element.sendKeys(text);
	}
	
}
