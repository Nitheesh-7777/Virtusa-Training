import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSC\\Downloads\\selenium-java-4.6.0\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).click();
		/* driver.findElement(By.cssSelector()); */
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("login-button")).click();
	}

}
