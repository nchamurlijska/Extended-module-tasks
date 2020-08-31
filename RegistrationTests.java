package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class RegistrationTests {

	@Test
	void registrationWithInvalidEmailFormat() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "nina999", "nina999@abv", "22.10.2000", "Nina1010", "kejfeirf");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		assertEquals(false, signInButton.isEnabled());
		driver.close();
	}

	@Test
	void registrationWithUsernameTooShort() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "nin", "nina888@abv.bg", "22.05.1990", "Nina888", "tigjrlrsg");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		assertEquals(false, signInButton.isEnabled());
		driver.close();
	}

	@Test
	void registrationWithUsernameTooLong() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "ninachamurlijska99999", "nina1010@abv.bg", "22.05.1990", "Nina1010", "Nina1010");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		assertEquals(false, signInButton.isEnabled());
		driver.close();
	}

	@Test
	void registrationWithPasswordWithoutUpperLetter() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "nina1010", "nina1010@abv.bg", "22.05.1970", "nina1010", "Nina1010");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		WebElement passwordpolicymsg = driver.findElement(By.xpath("//span[@class='invalid-feedback']"));
		passwordpolicymsg.isDisplayed();
		assertEquals(false, signInButton.isEnabled());
		driver.close();
	}

	@Test
	void registrationFields() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		WebElement registerButton = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		registerButton.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.isDisplayed();
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
		emailField.isDisplayed();
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.isDisplayed();
		WebElement confirmPasswordField = driver.findElement(By.id("defaultRegisterPhonePassword"));
		confirmPasswordField.isDisplayed();
		WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
		publicInfoField.isDisplayed();
		assertTrue(true);
		driver.close();
	}
	
	@Test
	void registrationWithEmailTaken() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "nina1010", "TestUser1@abv.bg", "22.05.1995", "Nina1010", "Nina1010");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		WebElement emailpolicymsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		emailpolicymsg.isDisplayed();
		assertEquals("Email taken", emailpolicymsg.getText());
		driver.close();
	}
	
	@Test
	void registrationWithUsernameTaken() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "TESTUSER", "nina1010@abv.bg", "22.05.1995", "Nina1010", "Nina1010");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		WebElement usernamepolicymsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		usernamepolicymsg.isDisplayed();
		assertEquals("Username taken", usernamepolicymsg.getText());
		driver.close();
	}
	
	@Test
	void registrationWithUsernameWithFirstLetterinBG() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "Íina", "nina1010@abv.bg", "22.05.1995", "Nina1010", "Nina1010");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		WebElement registrationpolicymsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		registrationpolicymsg.isDisplayed();
		assertEquals("Registration failed!", registrationpolicymsg.getText());
		driver.close();
	}
	
}
