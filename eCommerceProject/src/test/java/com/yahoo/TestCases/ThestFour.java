package com.yahoo.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class ThestFour extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testFour() throws Exception {
		
		System.out.println("Test Four");
		
		driver = initializeDriver();
		
		driver.get("http://tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		
		Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}

}
