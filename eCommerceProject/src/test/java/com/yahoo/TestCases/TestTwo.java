package com.yahoo.TestCases;

import org.testng.annotations.Test;

import resources.Base;

public class TestTwo extends Base{
	
	@Test
	public void testTwo() throws Exception {
		
		System.out.println("Test Two");
		
		driver = initializeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
