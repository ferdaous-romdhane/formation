package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageLogin {
	
public WebDriver driver;
	
	public pageLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how=How.XPATH, using="// input[@data-qa='login-email']")
	public static WebElement email;
	
	public void email(String string)
	{
		email.sendKeys(string);
	}
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Password']")
	public static WebElement Password;
	
	public void Password(String string)
	{
		Password.sendKeys(string);
	}
	
	@FindBy (how=How.XPATH, using="//button[normalize-space()='Login']")
	public static WebElement Login;
	
	public void Login()
	{
		Login.click();
	}

}
