package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.WebDriverWrapper;

public class LoginPage extends LoadableComponent<LoginPage>{

	@FindBy (xpath = "//input[@name='uid']")
	WebElement txtUserId;
	
	@FindBy (xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy (xpath = "//input[@type='reset']")
	WebElement btnReset;
	
	private WebDriver driver;
	private WebDriverWrapper wrapper;

	private final int timeOutInSeconds = 5;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wrapper = new WebDriverWrapper(driver);
	}
	@Override
	protected void isLoaded() throws Error {
		wrapper.waitForElementToVisible(txtUserId, timeOutInSeconds);
		txtUserId.isDisplayed();
	}

	@Override
	protected void load() {
		wrapper.waitForElementToVisible(txtUserId, timeOutInSeconds);
		txtUserId.isDisplayed();
	}
	
	public HomePage login(String username, String password) {
		wrapper.waitForElementToVisible(txtUserId, timeOutInSeconds);
		txtUserId.sendKeys(username);
		txtPassword.sendKeys(password);
		btnSubmit.click();
		return new HomePage(driver).get();
	}
}
