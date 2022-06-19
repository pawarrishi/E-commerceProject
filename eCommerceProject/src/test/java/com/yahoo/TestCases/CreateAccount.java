package com.yahoo.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.SignupPage;
import resources.Base;

public class CreateAccount extends Base {
	
	Logger log;
	
	@Test
	public void doCreateAccount() throws Exception {
		
		SignupPage signupPage = new SignupPage(driver);
		signupPage.firstname().sendKeys(prop.getProperty("firstname"));
		log.debug("firstname got entered");
		Thread.sleep(2000);
		signupPage.lastname().sendKeys(prop.getProperty("lastname"));
		log.debug("lastname got entered");
		Thread.sleep(2000);
		signupPage.email().sendKeys(prop.getProperty("email"));
		log.debug("email got entered");
		Thread.sleep(2000);
		signupPage.password().sendKeys(prop.getProperty("password"));
		log.debug("password got entered");
		Thread.sleep(2000);
		signupPage.birthyear().sendKeys(prop.getProperty("birthyear"));
		log.debug("birthyear got entered");
		Thread.sleep(2000);
		signupPage.submit().click();
		log.debug("Clicked on submit button");
		
	}
	
	@BeforeMethod
	public void openApplication() throws Exception {
		
		log = LogManager.getLogger(CreateAccount.class.getName());
		WebDriver driver = initializeDriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
		log.debug("Browser got closed");
	}

}
