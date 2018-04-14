package automation_mamun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

public class BasePage {
	public static WebElement webAction(final By locator) {
		Wait<WebDriver>wait = new FluentWait<WebDriver>(DriverWrapper.getDriver()).withTimeout(15,TimeUnit.SECONDS)
				.pollingEvery(1,TimeUnit.SECONDS)
				.ignoring(java.util.NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(ElementNotFoundException.class)
				.withMessage("Webdriver waited for 15 second but element cpouldnot found");
		
		WebElement element = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
			
		});
		return element;
					
	}  
	
	public void clickOn(By locator) {
		try{
			webAction(locator).click();
			}catch(NoSuchElementException e) {
				Assert.fail("Element not found with this locator "+locator.toString());
				e.printStackTrace();
			}
	}
	
	public void sendText(By locator, String text) {
		try {
			webAction(locator).sendKeys(text);
		}catch(NoSuchElementException e) {
			Assert.fail("Eelment not found with this locator "+locator.toString());
			e.printStackTrace();
			
		}
	}
		
	public String getTextFromELement(By locator) {
		String text = null;
		try {
			text = webAction(locator).getText();			
		}catch(NoSuchElementException e){
			Assert.fail("Eelment not found with this locator "+locator.toString());
			e.printStackTrace();
			
		}
		return text;
	}
	 
	public void selectFromDropDown(By dropdownField, String visibleText) {
        
		Select dropdown = new Select(webAction(dropdownField));
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectFromDropDown(By dropdownField, int index) {
        Select dropdown = new Select(webAction(dropdownField));
        dropdown.selectByIndex(index);
    }
	
}
