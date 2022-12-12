package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base_Test {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeTest
	public void openBrowser() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.sab2web.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		

		
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
