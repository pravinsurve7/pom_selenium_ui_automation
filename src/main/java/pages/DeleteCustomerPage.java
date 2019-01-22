package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class DeleteCustomerPage extends LoadableComponent<DeleteCustomerPage>{

	private WebDriver driver;
	
	@FindBy (xpath = "//a[contains(text(),'Delete Customer')]")
	WebElement btnDeleteCustomer;
	
	@FindBy (xpath = "//p[contains(text(),'Delete Customer Form')]")
	WebElement txtDeleteCustomer;
	
	@FindBy (xpath = "//input[@name='cusid']")
	WebElement txtCustomerId;
	
	@FindBy (xpath = "//input[@name='AccSubmit']")
	WebElement btnSubmit;
	
	@FindBy (xpath = "//input[@type='reset']")
	WebElement btnReset;

	@Override
	protected void isLoaded() throws Error {
		txtDeleteCustomer.isDisplayed();
	}

	@Override
	protected void load() {
		txtDeleteCustomer.isDisplayed();
	}
	
	public DeleteCustomerPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public DeleteCustomerPage goToCustomerPage() {
		btnDeleteCustomer.click();
		return new DeleteCustomerPage(driver).get();
	}
	
	public boolean deleteCustomer(String customerId) {
		boolean flag = false;
		txtCustomerId.sendKeys(customerId);
		btnSubmit.click();
		flag = true;
		return flag;
	}

}
