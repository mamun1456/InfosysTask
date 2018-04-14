package automation_mamun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {
	 private static WebDriver driver = null;
	 private static final String URL = null;
	 
	 public static WebDriver getDriver() {
		 return driver;
		 		 
	 }
	 @BeforeClass
	 public void initializeWebDriver() {
		 ConfigReader config = new ConfigReader();
		 
//		 System.setProperty("webdriver.ie.driver", "C:\\Selenium_Automation\\Drivers\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		 System.setProperty("webdriver.ie.driver", ConfigReader.getIEDriverPath());
		 driver = new InternetExplorerDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
//		 driver.get("URL");
		 driver.get(config.getUrl());
//		 System.out.println(driver.getTitle());
		 
	 }
	 @AfterClass
	 public void tearDown() {
		 if(driver != null) {
			 driver.manage().deleteAllCookies();
			 driver.quit();
		 }
	 }
	 
}
