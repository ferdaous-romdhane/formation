package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageAcceuil {
	
public WebDriver driver;
	
	//Creation Constructeur
	
	public pageAcceuil(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Identifications des elements
	
	@FindBy (how=How.XPATH, using="//a[normalize-space()='Signup / Login']")
	public static WebElement bt_signup1;
	
	@FindBy (how=How.NAME, using="name")
	public static WebElement name;
	
	@FindBy (how=How.XPATH , using="//input[@data-qa='signup-email']")
	public static WebElement mail;
	
	@FindBy (how=How.XPATH , using="//button[normalize-space()='Signup']")
	public static WebElement bt_signup2;
	
	public void URL(String url) {
		driver.get(url);
	}
	
	public void clic_bt_sign_up1() {
		bt_signup1.click();
		
	}
	public void saisir_name(String text) {
		name.sendKeys(text);
		
	}
	public void saisir_mail(String text) {
		mail.sendKeys(text);
		
	}
	public void clic_bt_sign_up2() {
		bt_signup2.click();
		
	}
	
	
	
}
