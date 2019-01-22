package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.WebDriverWrapper;

public class CustomerPage extends LoadableComponent<CustomerPage>{

	@FindBy (xpath = "//p[contains(text(),'Add New Customer')]")
	WebElement txtAddNewCustomer;
	
	@FindBy (css = "td > input[name='name']")
	WebElement txtCustomerName;
	
	@FindBy (xpath = "//input[@name='rad1']/../text()[2]/../input")
	WebElement btnMale;

	@FindBy (xpath = "//input[@name='rad1']/../text()[3]/../input")
	WebElement btnFemale;
	
	@FindBy (id = "dob")
	WebElement txtDateOfBirth;
	
	@FindBy (name = "addr")
	WebElement txtAddress;
	
	@FindBy (name = "city")
	WebElement txtCity;
	
	@FindBy (name = "state")
	WebElement txtState;
	
	@FindBy (xpath = "//input[@name='pinno']")
	WebElement txtPinNo;
	
	@FindBy (xpath = "//input[@name='telephoneno']")
	WebElement txtTelePhoneNo;

	@FindBy (xpath = "//input[@name='emailid']")
	WebElement txtEmailId;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy (xpath = "//input[@type='reset']")
	WebElement btnReset;
	
	private final String MALE = "MALE";
	
	private final String FEMALE = "FEMALE";
	
	private final String CUSTOMER_NO = "123456";
	
	private WebDriver driver;

	private WebDriverWrapper wrapper;

	private int timeOutInSeconds = 5;
	
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wrapper = new WebDriverWrapper(driver);
	}
	@Override
	protected void isLoaded() throws Error {
		wrapper.waitForElementToVisible(txtAddNewCustomer, timeOutInSeconds);
		txtAddNewCustomer.isDisplayed();
	}

	@Override
	protected void load() {
		wrapper.waitForElementToVisible(txtAddNewCustomer, timeOutInSeconds);
		txtAddNewCustomer.isDisplayed();
	}
	
	public String enterCustomerDetails(String customerName, String gender, String dateOfBirth,
			String address, String city, String state, String pinNo, String phoneNo, String email) {
		
		txtCustomerName.sendKeys(customerName);
		
		if (MALE.equalsIgnoreCase(gender)) {
			btnMale.click();
		} else if (FEMALE.equalsIgnoreCase(gender)) {
			btnFemale.click();
		}
		
		txtDateOfBirth.sendKeys(dateOfBirth);
		txtAddress.sendKeys(address);
		txtCity.sendKeys(city);
		txtState.sendKeys(state);
		txtPinNo.sendKeys(pinNo);
		txtTelePhoneNo.sendKeys(phoneNo);
		txtEmailId.sendKeys(email);
		btnSubmit.click();
		driver.navigate().back();
		return CUSTOMER_NO;
	}
}
