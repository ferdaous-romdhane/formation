package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.setUp;
import io.cucumber.java.en.*;
import pageObject.pageAchat;
import pageObject.pageLogin;

public class AchatEtPaiement {
	
	
	public WebDriver driver = setUp.driver;
	
	// Initialisation pages objects
	pageAchat achat =new pageAchat(driver);
	
	
	@Given("cliquer sur le lien view card")
	public void cliquer_sur_le_lien_view_card() {
		achat.ViewvCart();
	}
	@Given("cliquer sur le bouton add to card")
	public void cliquer_sur_le_bouton_add_to_card() {
	    achat.Add_to_cart();
	}
	
	@Given("cliquer sur le lien view card2")
	public void cliquer_sur_le_lien_view_card2() {
		achat.ViewvCart2();
	}

	@When("cliquer sur procced to chekout")
	public void cliquer_sur_procced_to_chekout() {
		achat.Checkout();
	}
	@When("cliquer sur le bouton place order")
	public void cliquer_sur_le_bouton_place_order() {
		achat.Place_Order();
	}
	@When("saisir le Name on Card {string}")
	public void saisir_le_name_on_card(String string) {
		achat.name_on_card(string);
	}

	@When("saisir le Card Number {string}")
	public void saisir_le_card_number(String string) {
		achat.card_number(string);
	}

	@When("saisir cvc  et day Expiration {string} {string} {string}")
	public void saisir_cvc_et_day_expiration(String string1, String string2, String string3) {
		achat.cvc_et_day_Expiration(string1, string2, string3);
	}

	@When("cliquer sur confirm order")
	public void cliquer_sur_confirm_order() {
		achat.submit();
	}

	@When("cliquer sur le boutton continuer")
	public void cliquer_sur_le_boutton_continuer() {
	    
	}


}
