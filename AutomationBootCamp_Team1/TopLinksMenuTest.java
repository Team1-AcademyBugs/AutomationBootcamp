package com.AutomationBootCamp_Team1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TopLinksMenuTest {

	private WebDriver driver;
	Top_Navigation_Menu_Design TopLinks;
	@BeforeEach
	void setUp() throws Exception {
		TopLinks=new Top_Navigation_Menu_Design(driver);
		driver =TopLinks.chromeDriverConnection();
		TopLinks.visit("https://academybugs.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		TopLinks.TopLinks();
		
	}

}
