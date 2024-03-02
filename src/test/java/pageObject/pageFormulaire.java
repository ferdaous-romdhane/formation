package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class pageFormulaire {
	
	
	public WebDriver driver;
	
	public pageFormulaire(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how=How.ID, using="id_gender2")
	public static WebElement genre;
	
	public void genre()
	{
		genre.click();
	}
	
	@FindBy (how=How.NAME, using="password")
	public static WebElement password;	
	
	public void password(String string)
	{
		password.sendKeys(string);
	}
	
	@FindBy (how=How.NAME, using="days")
	public static WebElement days;
	
	public void days (String string) {
		Select select = new Select(days);
	select.selectByValue(string);
	}
	
	@FindBy (how=How.NAME, using="months")
	public static WebElement months;
	
	public void months (String string) {
		Select select = new Select(months);
	select.selectByValue(string);
	}

	@FindBy (how=How.NAME, using="years")
	public static WebElement years;
	
	public void years (String string) {
		Select select = new Select(years);
	select.selectByValue(string);
	}
	
	@FindBy (how=How.ID, using="newsletter")
	public static WebElement newsletter;
	
	public void newsletter()
	{
		newsletter.click();
	}
	
	@FindBy (how=How.NAME, using="optin")
	public static WebElement option;
	
	public void option()
	{
		option.click();
	}
	
	@FindBy (how=How.NAME, using="first_name")
	public static WebElement first_name;
	
	public void first_name(String string)
	{
		first_name.sendKeys(string);
	}
	
	@FindBy (how=How.NAME, using="last_name")
	public static WebElement last_name;
	
	public void last_name(String string)
	{
		last_name.sendKeys(string);
	}
	
	@FindBy (how=How.NAME, using="company")
	public static WebElement company;
	
	public void company(String string)
	{
		company.sendKeys(string);
	}
	
	@FindBy (how=How.NAME, using="address1")
	public static WebElement address1;
	
	public void address1(String string)
	{
		address1.sendKeys(string);
	}
	
	@FindBy (how=How.NAME, using="address2")
	public static WebElement address2;
	
	public void address2(String string)
	{
		address2.sendKeys(string);
	}
	
	@FindBy (how=How.ID, using="country")
	public static WebElement country;
	
	public void country (String string) {
		Select select = new Select(country);
	select.selectByValue(string);
	}
	
	@FindBy (how=How.ID, using="state")
	public static WebElement state;
	
	public void state(String string)
	{
		state.sendKeys(string);
	}
	
	@FindBy (how=How.ID, using="city")
	public static WebElement city;
	
	public void city(String string)
	{
		city.sendKeys(string);
	}
	
	@FindBy (how=How.ID, using="zipcode")
	public static WebElement zipcode;
	
	public void zipcode(String string)
	{
		zipcode.sendKeys(string);
	}
	
	@FindBy (how=How.ID, using="mobile_number")
	public static WebElement mobile_number;
	
	public void mobile_number(String string)
	{
		mobile_number.sendKeys(string);
	}
	
	@FindBy (how=How.XPATH, using="//button[normalize-space()='Create Account']")
	public static WebElement account;
	
	public void account()
	{
		account.click();
	}
	
	@FindBy (how=How.XPATH, using="//b[normalize-space()='Account Created!']")
	public static WebElement message ;

}
