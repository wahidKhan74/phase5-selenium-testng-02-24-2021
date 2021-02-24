package com.ecommerce.webapp.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class AmazonHomePageTest {

	// 1. formulate test domain URL
	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-02-22-2021/driver/geckodriver";
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(siteURL);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyAmazoneHomePageTitle() {
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();		
		assertEquals(actual, expected);		
	}
	
	@Test
	public void verifyAmazoneHomePageSourceURL() {
		String expected = siteURL;
		String actual = driver.getCurrentUrl();		
		assertEquals(actual, expected);		
	}

}
