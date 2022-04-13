package com.AutomationBootCamp_Team1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SelectOptionsTest {

	private WebDriver driver;
	SelectOptions SelectOption;
	@BeforeEach
	void setUp() throws Exception {
		SelectOption=new SelectOptions(driver);
		driver =SelectOption.chromeDriverConnection();
		SelectOption.visit("https://academybugs.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		SelectOption.SelectOption();
		
	}

}
