package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class ProfileTests {

	@Test
	void profilePictureField() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButton = driver.findElement(By.id("nav-link-new-post"));
		newPostButton.click();
		WebElement picUploadField = driver.findElement(By.xpath("//div[@class='uploadfilecontainer']"));
		picUploadField.isDisplayed();
		driver.close();
	}
	
	@Test
	void maganeMyPosts() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Profile.navigateToProfile(driver);
		WebElement oldPost = driver.findElement(By.className("gallery-item-info"));
		oldPost.click();
		WebElement deletePostFunction = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']"));
		deletePostFunction.click();
		WebElement deletePostConfirm = driver.findElement(By.xpath("//div[@class='delete-confirm']"));
		deletePostConfirm.isDisplayed();
		WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
		yesButton.click();
		oldPost.isDisplayed();
		List<WebElement> allPosts = driver.findElements(By.xpath("//strong[@class='profile-stat-count']"));
		assertEquals(allPosts.size(), 11);
		driver.close();
	}
	
	@Test
	void profileModifyOption() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Profile.navigateToProfile(driver);
		WebElement modifyButton = driver.findElement(By.xpath("//div[@class='col-12 col-lg-6 profile-user-settings']"));
		modifyButton.click();
		WebElement publicInfo = driver.findElement(By.xpath("//div[@class='row mt-3']//div[@class='col-8']"));
		publicInfo.sendKeys("alabalalala");
		WebElement saveChangesButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		saveChangesButton.click();
		String publicInfoText = driver.findElement(By.xpath("//p[contains(text(),'jmvmhk,vk.kv., .,v j')]")).getText();
		publicInfoText.equals(publicInfo);
		//assertTrue(true);
		driver.close();
	}
	
	@Test
	void editProfileWithAlreadyUsedEmail() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Profile.navigateToProfile(driver);
		WebElement modifyProfileButton = driver.findElement(By.xpath("//div[@class='col-12 col-lg-6 profile-user-settings']"));
		modifyProfileButton.click();
		WebElement username = driver.findElement(By.xpath("//form[@class='ng-pristine ng-valid ng-touched']//div[1]//div[1]"));
		username.sendKeys("nina777");
		WebElement email = driver.findElement(By.xpath("//ngb-modal-window[@class='modal fade show d-block profile-edit-modal']//div[2]//div[1]//input[1]"));
		email.sendKeys("zaet@abv.bg");
		WebElement password = driver.findElement(By.xpath("//div[3]//div[1]//input[1]"));
		password.sendKeys("Nina777");
		WebElement confirmPassword = driver.findElement(By.xpath("//div[4]//div[1]//input[1]"));
		confirmPassword.sendKeys("Nina777");
		WebElement publicInfo = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		publicInfo.sendKeys("thrjhkrlsgsl");
		WebElement save = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		save.click();
		assertEquals(false, save.isEnabled());
		WebElement emailmsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		emailmsg.isDisplayed();
		assertEquals("Email taken", emailmsg.getText());
		driver.close();
			
	}
	
	@Test
	void filterPostsFunctionality() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Profile.navigateToProfile(driver);
		WebElement filterPosts = driver.findElement(By.xpath("//div[@class='btn-group btn-group-toggle post-filter-buttons']"));
		filterPosts.isDisplayed();
		filterPosts.isEnabled();
		driver.close();
			
	}
	
	
}
