package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class FollowUnfollowTests {

	@Test
	void followButtonFunctionality() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement searchField = driver.findElement(By.id("search-bar"));
		searchField.click();
		searchField.sendKeys("Chocho");
		Select dropdownUser = new Select(driver.findElement(By.xpath("//div[@class='dropdown-container']")));
		//ne namira po ni6to user-a ot dropdown-a?
		dropdownUser.selectByVisibleText("Chocho");
		WebElement dropdownSpecificUserFollowButton = driver.findElement(By.xpath("//button[contains(text(),'Follow')]"));
		dropdownSpecificUserFollowButton.click();
		//WebElement alertMessage = driver.findElement(By.xpath("//*[text()='You followed']"));
		//alertMessage.isDisplayed();
		//Alert alert = driver.switchTo().alert();
		//alert.notify();
		WebElement alertMessage = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		assertEquals("You followed!", alertMessage.getText());
		driver.close();
	}


	@Test
	void listOFFollowers() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement someUser = driver.findElement(By.id("followers"));
		someUser.click();
		WebElement listofFollowers = driver.findElement(By.xpath("//div[@class='container followers-modal-container']"));
		listofFollowers.isDisplayed();
		driver.close();
	}
	
	@Test
	void ConfirmationForFollowedUser() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement searchBar = driver.findElement(By.id("search-bar"));
		searchBar.click();
		searchBar.sendKeys("Lora");
		WebElement unfollowedUser = driver.findElement(By.xpath("//body/app-root/div[contains(@class,'row fixed-header-padding')]/app-header[@class='col-12']/header[@class='header-container']/nav[@class='navbar navbar-expand-md navbar-light bg-light']/div[@class='container']/div[@id='navbarColor01']/form[@class='search-container form-inline my-2 my-lg-0 ng-valid ng-star-inserted ng-touched ng-dirty']/div[@class='dropdown-search ng-star-inserted']/app-search-dropdown/div[@class='dropdown-container']/div[2]/app-small-user-profile[1]/div[1]"));
		unfollowedUser.isSelected();
		WebElement followButton = driver.findElement(By.xpath("//div[contains(@class,'row fixed-header-padding')]//div[2]//app-small-user-profile[1]//div[1]//div[2]//button[1]"));
		followButton.click();
		WebElement confirmMessage = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		confirmMessage.isDisplayed();
		assertEquals("You followed!", confirmMessage.getText());
		driver.close();
	}
}
