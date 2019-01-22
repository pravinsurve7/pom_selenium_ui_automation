package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.WebDriverWrapper;

public class HomePage extends LoadableComponent<HomePage>{

	@FindBy (xpath = "//marquee")
	WebElement homePageMarquee;
	
	@FindBy (xpath = "//a[contains(text(),'Manager')]")
	WebElement btnManager;
	
	@FindBy (xpath = "//a[contains(text(),'New Customer')]")
	WebElement btnCustomer;
	
	@FindBy (xpath = "//a[contains(text(),'Log out')]")
	WebElement btnLogout;
	
	private WebDriver driver;
	private WebDriverWrapper wrapper;

	private final int timeOutInSeconds = 5;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wrapper = new WebDriverWrapper(driver);
	}
	@Override
	protected void isLoaded() throws Error {
		wrapper.waitForElementToVisible(homePageMarquee, timeOutInSeconds);
		homePageMarquee.isDisplayed();
	}

	@Override
	protected void load() {
		wrapper.waitForElementToVisible(homePageMarquee, timeOutInSeconds);
		homePageMarquee.isDisplayed();
	}

	public HomePage goToManagerPage() {
		btnManager.click();
		return new HomePage(driver).get();
	}
	
	public CustomerPage goToCustomerPage() {
		btnCustomer.click();
		return new CustomerPage(driver).get();
	}
	
	public LoginPage logout() {
		btnLogout.click();
		wrapper.handleAlert(driver, 0);
		return new LoginPage(driver).get();
	}
}
