package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws Exception {
		
		prop = new Properties();
		String propPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties" 	;
		FileInputStream fis = new FileInputStream(propPath);
		prop.load(fis);
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", 
		    		"F:\\Software\\Codes\\eCommerceProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Software\\Codes\\JavaPrograms\\com.facebook.drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

    public String takeScreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		
		return destinationFilePath;
}

}
