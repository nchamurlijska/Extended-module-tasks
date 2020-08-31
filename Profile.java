package iSkilloTestsWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile {

	public static void navigateToProfile(WebDriver driver) {
		WebElement profileButton = driver.findElement(By.id("nav-link-profile"));
		profileButton.click();
	}
	
}
