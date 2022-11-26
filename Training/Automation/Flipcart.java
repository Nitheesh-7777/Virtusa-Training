
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
public class Flipcart {

	public static WebDriver driver;
	public static String driverPath = "C:\\workspace\\tools\\selenium\\";
	public static String sBookKey = "Selenium";
	private static final String sSearchBox = "fk-top-search-box";
	private static final String sSearchResult = "//li[contains(text(),'in')]//span";
	private static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	public static void initWebDriver(String URL) throws InterruptedException {

		// Setting up Chrome driver path.
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		// Launching Chrome browser.
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}



	public static void endSession() {
		driver.close();
		driver.quit();
	}

}