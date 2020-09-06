package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

class iSkilloTests {
		
	private void closeWebDriver() {
		// TODO Auto-generated method stub

	}
			
	
	@Test
	void unregisteredUserLikeDislikeOption() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		WebElement anyPost = driver.findElement(By.xpath("//div[@class='row post-list-container']//div[1]//app-post-detail[1]//div[1]//div[2]//img[1]"));
		anyPost.click();
		WebElement likeDislikeButton = driver.findElement(By.xpath("//i[@class='no-pointer like far fa-heart fa-2x']"));
		likeDislikeButton.isDisplayed();
		assertEquals(true, likeDislikeButton.isEnabled());
		//Boolean checkIfdislikeButtonPresent= driver.findElements(By.xpath("//input[@id='checkbox2']")).size()!= 0;
		driver.close();
	}

	@Test
	void otherUserProfileIsVisible() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Actions pressEnter = new Actions(driver);        
		pressEnter.sendKeys(Keys.ENTER);
		WebElement nameOfUser = driver.findElement(By.xpath("//div[@class='row post-list-container ng-star-inserted']//div[1]//app-post-detail[1]//div[1]//app-small-user-profile[1]//div[1]//div[1]//img[1]"));
		nameOfUser.click();
		WebElement userProfilePage = driver.findElement(By.xpath("//body/app-root/div[@class='container-fluid']/app-profile[@class='ng-star-inserted']/div[@class='row']/div[1]"));
		userProfilePage.isDisplayed();
		driver.close();
	}
	
	@Test
	void logoLocation() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		WebElement logoIcon = driver.findElement(By.id("homeIcon"));
		logoIcon.isDisplayed();
		logoIcon.click();
		WebElement siteHomepage = driver.findElement(By.xpath("//div[@class='container-fluid']//div[@class='container']"));
		siteHomepage.isDisplayed();
		driver.close();
	}

	@Test
	void listOfAvailableUsersOnHomepage() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Registration.Registration(driver, "nina1111", "nina1111@abv.bg", "01.01.2000", "Nina1111", "nina1111");
		WebElement signInButton = driver.findElement(By.id("sign-in-button"));
		signInButton.click();
		WebElement successfulRegistrationMsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		successfulRegistrationMsg.isDisplayed();
		assertEquals("Successful registration", successfulRegistrationMsg.getText());
		WebElement listOfUsers = driver.findElement(By.xpath("//div[@class='col-12 offset-md-3 col-md-6 all-users-container']"));
		listOfUsers.isDisplayed();
		WebElement userNameAndPic = driver.findElement(By.xpath("//app-small-user-profile[6]//div[1]//div[1]"));
		userNameAndPic.isEnabled();
		userNameAndPic.click();
		WebElement userProfile = driver.findElement(By.xpath("//body/app-root/div[@class='container-fluid']/app-profile[@class='ng-star-inserted']/div[@class='row']/div[1]"));
		userProfile.isDisplayed();
		driver.close();
	}
	
	@Test
	void listOfPostsOnHomepageAfterLogin() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		WebElement homepage = driver.findElement(By.xpath("//app-all-posts[@class='ng-star-inserted']"));
		homepage.isDisplayed();
		driver.close();
	}
	
	@Test
	void countOfLikesVisibleForUnregisteredUser() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		WebElement listOfPosts = driver.findElement(By.xpath("//div[@class='row post-list-container']"));
		listOfPosts.isDisplayed();
		WebElement randomPost = driver.findElement(By.xpath("//body//div[5]"));
		randomPost.click();
		randomPost.isSelected();
		WebElement countOfLikes = driver.findElement(By.xpath("//div[@class='container post-info-container']//div[2]"));
		countOfLikes.isDisplayed();
		assertEquals("3", countOfLikes.getSize());
		driver.close();
	}
	

	@Test
	void commentOfPostOfUnregisteredUser() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		WebElement listOfPosts = driver.findElement(By.xpath("//div[@class='row post-list-container']"));
		listOfPosts.isDisplayed();
		WebElement randomPost = driver.findElement(By.xpath("//body//div[5]"));
		randomPost.click();
		randomPost.isSelected();
		WebElement commentField = driver.findElement(By.xpath("//form[@class='comment-form ng-pristine ng-invalid ng-touched']//fieldset//div"));
		commentField.isEnabled();
		commentField.sendKeys("trkhgerlgb");
		Actions pressEnter = new Actions(driver);        
		pressEnter.sendKeys(Keys.ENTER);
		WebElement msg = driver.findElement(By.xpath("//div[@class='toast-warning ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		msg.isDisplayed();
		assertEquals("You must login", msg.getText());
		driver.close();		
	}
	
	
}




		
		