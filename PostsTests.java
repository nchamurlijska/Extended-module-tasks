package iSkilloTestsWebdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

class PostsTests {

	@Test
	void newPostButton() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		Profile.navigateToProfile(driver);
		WebElement newPostButton = driver.findElement(By.xpath("//div[contains(text(),'New post')]"));
		newPostButton.click();
		assertEquals(true, newPostButton.isEnabled());
		driver.close();
	}
	
	@Test
	void inviteTextForMakingNewPost() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButton = driver.findElement(By.id("nav-link-new-post"));
		newPostButton.click();
		WebElement inviteText = driver.findElement(By.xpath("//h3[@class='text-center']"));
		inviteText.isDisplayed();
		assertEquals("Post a picture to share with your awesome followers", inviteText.getText());
		driver.close();
	}
	
	@Test
	void createCommentOnCyrillic() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement randomPost = driver.findElement(By.xpath("//div[@class='row post-list-container ng-star-inserted']//div[1]//app-post-detail[1]//div[1]//div[2]//img[1]"));
		randomPost.click();
		WebElement commentsField = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
		commentsField.click();
		commentsField.isSelected();
		commentsField.sendKeys("ַהנאגוייייי!!!");
		Actions pressEnter = new Actions(driver);        
		pressEnter.sendKeys(Keys.ENTER);
		//kak da proverq dali e publikuvan komentara?
		//commentsField.isDisplayed();
		assertEquals("ַהנאגוייייי!!!", commentsField.getText());
		driver.close();
		
	}
	
	@Test
	void newPostVisibleOnHomepage() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButtonHomepage = driver.findElement(By.id("nav-link-new-post"));
		newPostButtonHomepage.click();
		WebElement browseButton = driver.findElement(By.id("choose-file"));
		browseButton.click();
		WebElement uploadImage = driver.findElement(By.xpath("//label[contains(text(),'Drop an Image here')]"));
		uploadImage.sendKeys("C:\\Users\\Nina\\Desktop\\טחעודכום פאיכ.jpg");
		WebElement captionField = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
		captionField.sendKeys("vhndvmc");
		Actions pressEnterKeyboard = new Actions(driver);        
		pressEnterKeyboard.sendKeys(Keys.ENTER);
		WebElement publicButton = driver.findElement(By.xpath("//label[@class='post-status-label custom-control-label']"));
		publicButton.click();
		WebElement createPostButton = driver.findElement(By.id("create-post"));
		createPostButton.click();
		WebElement newPost = driver.findElement(By.xpath("//body/app-root/div[@class='container-fluid']/app-profile/div[@class='row']/div[@class='col-12']/app-profile-posts-section/div[@class='container']/div[@class='row']/div[@class='col-12']/app-post-list/div[@class='container']/div[@class='row no-gutters']/app-post[11]/div[1]/div[2]"));
		newPost.isDisplayed();
		//check if visible on the Homepage?
		driver.close();
	}
	
	@Test
	void countOfPostsOption() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement userwithPostPublished = driver.findElement(By.className("post-user"));
		userwithPostPublished.click();
		WebElement countOfPosts = driver.findElement(By.className("profile-stat-count"));
		countOfPosts.isDisplayed();
		assertEquals("4", countOfPosts.getSize());
		driver.close();
	}
	
	@Test
	void newPostMenuIsClosed() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButton = driver.findElement(By.id("nav-link-new-post"));
		newPostButton.click();
		WebElement newPostMenu = driver.findElement(By.xpath("//form[@class='text-center border border-light form-container ng-untouched ng-pristine ng-invalid']"));
		newPostMenu.isDisplayed();
		WebElement escapeButton = driver.findElement(By.xpath("//i[@class='fas fa-times']"));
		escapeButton.click();
		assertEquals(false, newPostMenu.isDisplayed());
		driver.close();
	}
	
	@Test
	void openingOfAvailableposts() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement post = driver.findElement(By.cssSelector("div.container-fluid:nth-child(2) app-all-posts.ng-star-inserted:nth-child(2) div.container div.row.post-list-container.ng-star-inserted div.col-12.offset-md-1.col-md-10.offset-lg-3.col-lg-6.ng-star-inserted:nth-child(3) app-post-detail:nth-child(1) div.post-feed-container div.post-feed-img:nth-child(3) > img:nth-child(1)"));
		post.click();
		post.isSelected();
		post.isDisplayed();
		driver.close();
	
	}
	
	@Test
	void newPostWithoutPicAndtext() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButton = driver.findElement(By.id("nav-link-new-post"));
		newPostButton.click();
		WebElement newPost = driver.findElement(By.xpath("//form[@class='text-center border border-light form-container ng-untouched ng-pristine ng-invalid']"));
		newPost.isDisplayed();
		WebElement createPostButton = driver.findElement(By.id("create-post"));
		createPostButton.click();
		WebElement uploadpicmsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		uploadpicmsg.isDisplayed();
		assertEquals(false, createPostButton.isEnabled());
		assertEquals("Please upload an image", uploadpicmsg.getText());
		driver.close();
	}
	
	@Test
	void commentPost() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement somePost = driver.findElement(By.xpath("//body/app-root/div[@class='container-fluid']/app-all-posts[@class='ng-star-inserted']/div[@class='container']/div[@class='row post-list-container ng-star-inserted']/div[1]/app-post-detail[1]/div[1]"));
		somePost.click();
		WebElement commentField = driver.findElement(By.xpath("//input[@placeholder='Comment here']"));
		commentField.isSelected();
		commentField.sendKeys("Hellooo!!!");
		Actions pressEnter = new Actions(driver);        
		pressEnter.sendKeys(Keys.ENTER);
		WebElement commentsList = driver.findElement(By.xpath("//div[@class='comment-list-container']"));
		commentsList.isDisplayed();
		assertEquals("Hellooo!!!", commentsList.getText());
		driver.close();
		
	}
	
	@Test
	void newPostWithMoreThanHudredSymbols() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Login.login(driver, "nina777", "Nina777");
		WebElement newPostButton = driver.findElement(By.id("nav-link-new-post"));
		newPostButton.click();
		WebElement inviteText = driver.findElement(By.xpath("//h3[@class='text-center']"));
		inviteText.isDisplayed();
		WebElement newPostField = driver.findElement(By.xpath("//form[@class='text-center border border-light form-container ng-untouched ng-pristine ng-invalid']"));
		newPostField.isDisplayed();
		WebElement browseButton = driver.findElement(By.id("choose-file"));
		browseButton.click();
		WebElement uploadImage = driver.findElement(By.xpath("//label[contains(text(),'Drop an Image here')]"));
		uploadImage.sendKeys("C:\\Users\\Nina\\Desktop\\cats.jpg");
		WebElement captionField = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
		captionField.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		//Actions pressEnterKeyboard = new Actions(driver);        
		//pressEnterKeyboard.sendKeys(Keys.ENTER);
		WebElement publicButton = driver.findElement(By.xpath("//label[@class='post-status-label custom-control-label']"));
		publicButton.click();
		WebElement createPostButton = driver.findElement(By.id("create-post"));
		createPostButton.click();
		WebElement failedpostCreationMsg = driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		failedpostCreationMsg.isDisplayed();
		assertEquals("Creation of post failed!", failedpostCreationMsg.getText());
		driver.close();
	}
	
	@Test
	void ChangeStatusOfPosts() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		Profile.navigateToProfile(driver);
		WebElement allPostsButton = driver.findElement(By.xpath("//label[@class='btn-all btn btn-primary active']"));
		allPostsButton.click();
		WebElement anyPost = driver.findElement(By.xpath("//app-post[1]//div[1]//div[1]//img[1]"));
		anyPost.click();
		WebElement changeStatusBar = driver.findElement(By.xpath("//body[@class='modal-open']/ngb-modal-window[@class='modal fade show d-block post-modal']/div[@class='modal-dialog']/div[@class='modal-content']/app-post-modal/div[@class='post-modal-container']/div[@class='post-modal-comments']/div/div[@class='container post-info-container']/div[@class='row align-items-center']/div[@class='col-12 post-info']/div[1]"));
		changeStatusBar.isDisplayed();
		WebElement changeStatusButton = driver.findElement(By.xpath("//i[@class='fas fa-lock ng-star-inserted']"));
		changeStatusButton.click();
		WebElement changeStatusMsg = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		changeStatusMsg.isDisplayed();
		assertEquals(true, changeStatusMsg);
		driver.close();
	}
	
	@Test
	void LikePostFunctionality() {
		WebDriver driver = Helpers.initializeWebDriver();
		Helpers.navigateToUrl(driver);
		Login.navigateToLogin(driver);
		WebElement firstPost = driver.findElement(By.xpath("//body/app-root/div[@class='container-fluid']/app-all-posts[@class='ng-star-inserted']/div[@class='container']/div[@class='row post-list-container ng-star-inserted']/div[1]"));
		firstPost.click();
		firstPost.isDisplayed();
		WebElement likeOption = driver.findElement(By.xpath("//div[@class='col-12 post-info']//div[1]"));
		likeOption.isDisplayed();
		WebElement likeOptionButton = driver.findElement(By.xpath("//i[@class='like far fa-heart fa-2x ng-star-inserted liked']"));
		likeOptionButton.click();
		WebElement confirmLikeMsg = driver.findElement(By.xpath("//div[@class='toast-success ngx-toastr ng-trigger ng-trigger-flyInOut']"));
		confirmLikeMsg.isDisplayed();
		assertEquals("Post disliked", confirmLikeMsg.getText());
		driver.close();
	}
}

