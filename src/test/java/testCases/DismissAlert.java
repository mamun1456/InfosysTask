package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation_mamun.DriverWrapper;

public class DismissAlert extends DriverWrapper{
	@Test
	public static void alertHandles() throws InterruptedException{
		getDriver().switchTo().frame("");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("")).click();
		Thread.sleep(2000);
		getDriver().switchTo().alert().accept();
		Thread.sleep(2000);
		
	}

}
