package testCases;

import org.testng.annotations.Test;

import automation_mamun.DriverWrapper;
import landingPages.FlightSearchPage;

public class FlightFinderTest extends DriverWrapper{
	FlightSearchPage flightPage = new FlightSearchPage ();
	
	@Test
	public void FlightFinder() {
		
		flightPage.clickOnOneway();
		flightPage.departingFrom(3);
		flightPage.onDate("12");
		flightPage.arrivingIn(2);
		flightPage.returningDate("14");
		flightPage.clickOnBusinessClass();
		flightPage.airLine(1);
		flightPage.clickOnContinue();
		 		
	}
	

}
