package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class iSkilloTests {

	@Test
	void registration() {
		System.setProperty("webdriver.chrome.driver", "F:\\QA\\QA extended module\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.skillo-bg.com:4300/posts/all");
		String webPageTitle = driver.getTitle();
		assertEquals("ISkillo", webPageTitle);
		WebElement loginLink = driver.findElement(By.id("nav-link-login"));
		loginLink.click();
		WebElement registerButton = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		registerButton.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("santa1");
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
		emailField.sendKeys("barbie22@yahoo");
		WebElement dateField = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
		dateField.sendKeys("22.05.2000");
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.sendKeys("Santa1");
		WebElement confirmPasswordField = driver.findElement(By.id("defaultRegisterPhonePassword"));
		confirmPasswordField.sendKeys("Santa1");
		WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
		publicInfoField.sendKeys("Santa1");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		assertEquals(false, signInButton.isEnabled());
	}


	@Test
	void loginwithblankcredentials() {
		System.setProperty("webdriver.chrome.driver", "F:\\QA\\QA extended module\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.skillo-bg.com:4300/posts/all");
		String webPageTitle = driver.getTitle();
		assertEquals("ISkillo", webPageTitle);
		WebElement loginLink = driver.findElement(By.id("nav-link-login"));
		loginLink.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys(" ");
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.sendKeys(" ");
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		assertEquals(false, logInButton.isEnabled());
	}
	
	@Test
	void newpostbutton() {
		System.setProperty("webdriver.chrome.driver", "F:\\QA\\QA extended module\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.skillo-bg.com:4300/posts/all");
		String webPageTitle = driver.getTitle();
		assertEquals("ISkillo", webPageTitle);
		WebElement loginLink = driver.findElement(By.id("nav-link-login"));
		loginLink.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("nina555");
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.sendKeys("Nina555");
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		WebElement profileButton = driver.findElement(By.id("nav-link-profile"));
		profileButton.click();
		WebElement newPostButton = driver.findElement(By.xpath("//div[contains(text(),'New post')]"));
		newPostButton.click();
		assertEquals(true, newPostButton.isEnabled());;
	}
		
	@Test
	void followbuttonfunctionality() {
		System.setProperty("webdriver.chrome.driver", "F:\\QA\\QA extended module\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://training.skillo-bg.com:4300/posts/all");
		//String webPageTitle = driver.getTitle();
		//assertEquals("ISkillo", webPageTitle);
		WebElement loginLink = driver.findElement(By.id("nav-link-login"));
		loginLink.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("nina555");
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.sendKeys("Nina555");
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		WebElement searchField = driver.findElement(By.id("search-bar"));
		searchField.click();
		searchField.sendKeys("Chocho");
		
	}
}


		
		