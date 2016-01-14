package br.com.mystudies.seleninum;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class SeleniumIT {
	
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/selenium-test/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testSelinum() throws Exception {
		selenium.open("/selenium-test/");
		selenium.type("id=name", "Robson");
		selenium.type("id=password", "Ana");
		selenium.click("css=input[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		
		
		assertThat(selenium.getBodyText(), equalTo("Welcome Robson"));		
	}

	
	
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
	
	
}