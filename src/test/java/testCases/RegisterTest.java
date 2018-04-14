package testCases;

import org.testng.annotations.Test;

import automation_mamun.DriverWrapper;
import landingPages.RegisterPage;

public class RegisterTest extends DriverWrapper{
	RegisterPage registerPage = new RegisterPage();

    @Test

    public void Register ( ) {
        registerPage.clickOnRegister();
        registerPage.enterFirstName("Khan");
        registerPage.lastName("Mamun");
        registerPage.enterEmailTextField("mamun1456@gmail.com");
        registerPage.enterUserName("xyz1234");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickOnSubmit();
       
    }   
}
