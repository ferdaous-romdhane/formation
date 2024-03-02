package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.setUp;
import io.cucumber.java.en.*;
import pageObject.pageFormulaire;
import pageObject.pageLogin;
import pageObject.pageAcceuil;

public class creationCompte {

	public WebDriver driver = setUp.driver;

	// Initialisation pages objects
	pageAcceuil acceuil = new pageAcceuil(driver);
	pageFormulaire formulaire = new pageFormulaire(driver);
//	pageSignUp sign=new pageSignUp(driver);

	@Given("ouvrir url de la page {string}")
	public void ouvrir_url_de_la_page(String string) {
		acceuil.URL(string);
	}

	@When("cliquer sur le boutton signup1")
	public void cliquer_sur_le_boutton_signup1() {
		acceuil.clic_bt_sign_up1();
	}

	@When("saisir le name {string}")
	public void saisir_le_name(String string) {
		acceuil.saisir_name(string);
	}

	@When("saisir le mail {string}")
	public void saisir_le_mail(String string) {
		acceuil.saisir_mail(string);
	}

	@When("cliquer sur le boutton signup2")
	public void cliquer_sur_le_boutton_signup2() {
		acceuil.clic_bt_sign_up2();
	}

	@When("choisir le genre")
	public void choisir_le_genre() {
		formulaire.genre();

	}

	@When("saisir le Password {string}")
	public void saisir_le_password(String string) {
		formulaire.password(string);
	}

	@When("saisir le DateOfBithday avec le jour {string} , mois {string} , annee {string}")
	public void saisir_le_date_of_bithday_avec_le_jour_mois_annee(String string1, String string2, String string3) {
		formulaire.days(string1);
		formulaire.months(string2);
		formulaire.years(string3);
	}

	@When("choisir le Newsletter")
	public void choisir_le_newsletter() {
		formulaire.newsletter();
	}

	@When("choisir le Offer")
	public void choisir_le_offer() {

		formulaire.option();
	}

	@When("saisir le FirstName {string}")
	public void saisir_le_first_name(String string) {
		formulaire.first_name(string);
	}

	@When("saisir le LastName {string}")
	public void saisir_le_last_name(String string) {
		formulaire.last_name(string);

	}

	@When("saisir le Adress1 {string}")
	public void saisir_le_adress1(String string) {
		formulaire.address1(string);
	}

	@When("saisir le Adress2 {string}")
	public void saisir_le_adress2(String string) {
		formulaire.address2(string);
	}

	@When("saisir le Country {string}")
	public void saisir_le_country(String string) {
		formulaire.country(string);
	}

	@When("saisir le Sate {string}")
	public void saisir_le_sate(String string) {
		formulaire.state(string);
	}

	@When("saisir le City {string}")
	public void saisir_le_city(String string) {
		formulaire.city(string);
	}

	@When("saisir le ZipCode {string}")
	public void saisir_le_zip_code(String string) {
		formulaire.zipcode(string);
	}

	@When("saisir MobileNumber {string}")
	public void saisir_mobile_number(String string) {
		formulaire.mobile_number(string);
	}

	@When("Clique sur CreateAcount")
	public void clique_sur_create_acount() {
		formulaire.account();
	}

//	@When("saisir le mail pour le login {string}")
//	public void saisir_le_mail_pour_le_login(String string) {
//		sign.email(string);
//	}
//
//	@When("saisir le password pour le login {string}")
//	public void saisir_le_password_pour_le_login(String string) {
//		sign.Password(string);
//	}
//
//	@When("cliquer sur le boutton login2")
//	public void cliquer_sur_le_boutton_login2() {
//		sign.Login();
//	}

}
