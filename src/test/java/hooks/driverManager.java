package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {
	public static WebDriver driver;
	public static WebDriver get_driver() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		return driver;
	}
	public static void fermeture() {
		driver.close();
	}

}
