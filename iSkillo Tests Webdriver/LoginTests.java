package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class LoginTests {

	@Test
	void loginWithBlankCredentials() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		WebElement usernameField = driver.findElement(By.id("defaultLoginFormUsername"));
		usernameField.sendKeys("");
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='defaultLoginFormPassword']"));
		passwordField.sendKeys("");
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		assertEquals(false, logInButton.isEnabled());
		driver.close();
	}
	
	@Test
	void wrongCredentials() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina77", "Nina777");
		WebElement wrongCredentialsMessage = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		wrongCredentialsMessage.isDisplayed();
		//Alert msg = driver.switchTo().alert();
		//msg.notify();
		//String message = driver.switchTo().alert().getText();
		assertEquals("Wrong username or password!", wrongCredentialsMessage.getText());
		driver.close();
	}
	 
	@Test
	void rememberMeBox() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement rememberMe = driver.findElement(By.className("remember-me"));
		rememberMe.isDisplayed();
		rememberMe.click();
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		WebElement logOutButton = driver.findElement(By.className("fas fa-sign-out-alt fa-lg"));
		logOutButton.click();
		WebElement logOutMessage = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		logOutMessage.isDisplayed();
		WebElement usernameField = driver.findElement(By.id("defaultLoginFormUsername"));
		usernameField.isDisplayed();
		WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
		passwordField.isDisplayed();
		assertEquals("nina777", usernameField.getText());
		assertEquals("Nina777", passwordField.getText());
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		//assertEquals(true, signInButton.isEnabled());
		WebElement logInMsg = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		logInMsg.isDisplayed();
		assertEquals("Successful login", logInMsg.getText());
		driver.close();
	}	

}
