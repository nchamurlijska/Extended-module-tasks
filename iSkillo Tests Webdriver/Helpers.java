package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helpers {
	
	static WebDriver driver;

	public static WebDriver initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "F:\\QA\\QA extended module\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void navigateToUrl(WebDriver driver) {
		driver.get("http://training.skillo-bg.com:4300/posts/all");
		String webPageTitle = driver.getTitle();
		assertEquals("ISkillo", webPageTitle);
	}
	
	 @After
	 public static void closeWebDriver() {
		 driver.close();
	 }
}
