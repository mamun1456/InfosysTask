package landingPages;

import org.openqa.selenium.By;

import automation_mamun.BasePage;

public class FlightSearchPage extends BasePage{
	
	private By oneWayRadioButton = By.xpath(".//input[name='tripType']");
	private By departingFromDropDown = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select");
	private By OnDropDown = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]");
	private By arrivingInDroppDown = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select");
	private By returningDropDown = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]");
	private By businessClassRadioButton = By.xpath(".//input[name='servClass']");
	private By AirlineDropDown = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select");
	private By continueButton = By.id(".//input[name='.//input[name='servClass']");
	
	
	public void clickOnOneway() {
		clickOn(oneWayRadioButton);
	}
	public void departingFrom(int index) {
		selectFromDropDown(departingFromDropDown, index );
	}
	public void onDate(String visibleText) {
		selectFromDropDown(OnDropDown, visibleText);
	}
	public void arrivingIn(int index) {
		selectFromDropDown(arrivingInDroppDown, index );
	}
	public void returningDate(String visibleText) {
		selectFromDropDown(returningDropDown, visibleText);
	}
	public void clickOnBusinessClass() {
		clickOn(businessClassRadioButton);
	}
	public void airLine(int index) {
		selectFromDropDown(AirlineDropDown, index );
	}
	public void clickOnContinue() {
		clickOn(continueButton);
	}
	

}
