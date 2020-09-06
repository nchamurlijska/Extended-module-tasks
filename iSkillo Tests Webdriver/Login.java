package iSkilloTestsWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void login(WebDriver driver, String username, String password) {
		WebElement usernameField = driver.findElement(By.id("defaultLoginFormUsername"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='defaultLoginFormPassword']"));
		passwordField.sendKeys(password);
		WebElement logInButton = driver.findElement(By.id("sign-in-button"));
		logInButton.click();
		
	}
	
	public static void navigateToLogin(WebDriver driver) {
		WebElement loginLink = driver.findElement(By.id("nav-link-login"));
		loginLink.click();
	}
	
	
}
