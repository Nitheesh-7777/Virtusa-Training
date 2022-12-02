package Testng;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CSC\\Downloads\\selenium-java-4.6.0\\chromedriver_win32\\chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.print("Ready for Testing.");
	}
	@Test
	public void TestingOnProcess()
	{
		String WebsiteTitle=driver.getTitle();
		String ActualTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(ActualTitle, WebsiteTitle);
		
		
		
		/*
		 * System.out.println(WebsiteTitle);
		 */		
	}
	@AfterMethod
	public void End()
	{
		driver.close();
		System.out.println("Testing will be ended.");
	}

}
