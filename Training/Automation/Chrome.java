import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CSC\\Downloads\\selenium-java-4.6.0\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	
		  driver.findElement(By.id("user-name")).click();
		  driver.findElement(By.cssSelector());
		  driver.findElement(By.id("password")).click();
		  driver.findElement(By.id("login-button")).click();
		 
		/* input */
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.className("gb_Ca gbii")).click();
		driver.findElement(By.className("gb_Ve")).click();
		driver.findElement(By.className("q")).click();
	
		driver.findElement(By.className("gb_d")).click();;
		
	}

}
