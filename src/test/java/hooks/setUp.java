package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;

public class setUp {

	public static  WebDriver driver;
	
	@Before
	public void initial() {
		driver=driverManager.get_driver();
	}
	@AfterStep
	public void affiche() {
		System.out.println("etape en cours");
	}
	@BeforeStep
	public void takeScreenShot(Scenario scenareo) {
		final byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@After
	public void finish() {
		driverManager.fermeture();
	}
}
