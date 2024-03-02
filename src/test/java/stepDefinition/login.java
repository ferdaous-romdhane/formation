package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.setUp;
import io.cucumber.java.en.*;
import pageObject.pageLogin;

public class login {
	
	
	public WebDriver driver = setUp.driver;
	
	// Initialisation pages objects
	pageLogin signUp = new pageLogin(driver);
	
	@When("saisir le mail pour le login {string}")
	public void saisir_le_mail_pour_le_login(String string) {
		signUp.email(string);
	}

	@When("saisir le password pour le login {string}")
	public void saisir_le_password_pour_le_login(String string) {
		signUp.Password(string);
	}

	@When("cliquer sur le boutton login2")
	public void cliquer_sur_le_boutton_login2() {
		signUp.Login();
	}

}
