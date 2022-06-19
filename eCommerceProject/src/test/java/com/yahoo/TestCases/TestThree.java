package com.yahoo.TestCases;

import org.testng.annotations.Test;

import resources.Base;

public class TestThree extends Base {
		
		@Test
		public void testThree() throws Exception {
			
			System.out.println("Test Three");
			
			driver = initializeDriver();
			
			driver.get("https://twitter.com/i/flow/login");
			
			Thread.sleep(3000);
			
			driver.close();
		}

}
