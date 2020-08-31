package iSkilloTestsWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	public static void Registration(WebDriver driver, String username, String email, String dateOfBirth, String password, String publicInfo) {
		WebElement registerButton = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		registerButton.click();
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys(username);
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='email']"));
		emailField.sendKeys(email);
		WebElement dateField = driver.findElement(By.xpath("//input[@placeholder='Birth date']"));
		dateField.sendKeys(dateOfBirth);
		WebElement passwordField = driver.findElement(By.id("defaultRegisterFormPassword"));
		passwordField.sendKeys(password);
		WebElement confirmPasswordField = driver.findElement(By.id("defaultRegisterPhonePassword"));
		confirmPasswordField.sendKeys(password);
		WebElement publicInfoField = driver.findElement(By.name("pulic-info"));
		publicInfoField.sendKeys(publicInfo);
		
	}
}
