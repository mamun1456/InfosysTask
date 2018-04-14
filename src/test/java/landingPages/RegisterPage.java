package landingPages;

import org.openqa.selenium.By;

import automation_mamun.BasePage;

public class RegisterPage extends BasePage{
	private By registerText = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	private By firstNameTextField = By.name("firstName");
	private By lastNameTextField = By.name("lastName");
	private By emailTextField = By.xpath("//*[@id=\"userName\"]");
	private By userNameTextField  = By.xpath("//*[@id=\"email\"]");
	private By passwordTextField = By.name("password");
	private By confirmPasswordTextField = By.name("confirmPassword");
	private By submitButton = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");
	
	
	public void clickOnRegister() {
		clickOn(registerText);
	}
	public void enterFirstName(String enterFirstName) {
		sendText(firstNameTextField,enterFirstName);
	}
	public void lastName(String enterLastName) {
		sendText(lastNameTextField,enterLastName);
	}
	public void enterEmailTextField(String enterEmail) {
		sendText(emailTextField,enterEmail);
	}
	public void enterUserName(String enterUserName) {
		sendText(userNameTextField,enterUserName);
	}
	public void enterPassword(String password) {
		sendText(passwordTextField,password);
	}
	public void enterConfirmPassword(String password) {
		sendText(confirmPasswordTextField,password);
	}
	public void clickOnSubmit() {
		clickOn(submitButton);
	}
		
	
}
