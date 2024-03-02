package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageAchat {
	
public WebDriver driver;
	
	//Creation Constructeur
	
	public pageAchat(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Identifications des elements
	
	
	@FindBy (how=How.XPATH, using="//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	public static WebElement ViewvCart;
	
	public void ViewvCart() {
		ViewvCart.click();
		
	}
	
	@FindBy (how=How.XPATH, using="//button[normalize-space()='Add to cart']")
	public static WebElement Add_to_cart;
	
	public void Add_to_cart() {
		Add_to_cart.click();
		
	}
	@FindBy (how=How.XPATH, using="//u[normalize-space()='View Cart']")
	public static WebElement ViewvCart2;
	
	public void ViewvCart2() {
		ViewvCart2.click();
		
	}
	
	@FindBy (how=How.XPATH , using="//a[normalize-space()='Proceed To Checkout']")
	public static WebElement Checkout;
	public void Checkout() {
		Checkout.click();
	}
	
	@FindBy (how=How.XPATH ,using="//a[normalize-space()='Place Order']")
	public static WebElement Place_Order;
	public void Place_Order() {
		Place_Order.click();
	}

	@FindBy (how=How.NAME , using="name_on_card")
	public static WebElement name_on_card;
	
	public void name_on_card(String string) {
		name_on_card.sendKeys("ferdaous");
	}
	
	
	@FindBy (how=How.NAME , using="card_number")
	public static WebElement card_number;  
	
	public void card_number(String string) {
		card_number.sendKeys(string);
	}
	
	@FindBy (how=How.NAME , using="cvc")
	public static WebElement cvc;
	
	@FindBy (how=How.NAME , using="expiry_month")
	public static WebElement expiry_month;
	
	@FindBy (how=How.NAME , using="expiry_year")
	public static WebElement expiry_year;
		
	public void cvc_et_day_Expiration(String string1,String string2,String string3) {
		cvc.sendKeys(string1);
		expiry_month.sendKeys(string2);
		expiry_year.sendKeys(string3);

	}
	
	@FindBy (how=How.ID, using="submit")
	public static WebElement submit;
	
	public void submit() {
		submit.click();
	}
	
}
