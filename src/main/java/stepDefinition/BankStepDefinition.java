package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomerPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ConfigurationProperties;
import utils.ExcelFileReader;
import utils.PropertyReader;

public class BankStepDefinition {

	WebDriver driver;
	Scenario scenario;
	LoginPage loginPage;
	HomePage homePage;
	CustomerPage customerPage;
	String customerId = "";
	Map<String, String> customerDetails = new HashMap<String, String>();

	@Before
	public void before (Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("^I read data from excel ([^\"]*)$")
	public void read_data_from_excel(String rowId) throws Throwable {
		customerDetails = ExcelFileReader.readDataForAutomationID("Customer", rowId);
	}

	@Given("^url is loaded$")
	public void url_is_loaded() throws Throwable {
		driver = BrowserFactory.getDriver("CHROME");
		String url = PropertyReader.readConfig(ConfigurationProperties.BANK_URL);
		driver.get(url);
		loginPage = new LoginPage(driver);
	}

	@When("^I login using valid ([^\"]*) and ([^\"]*)$")
	public void i_login_using_valid_username_and_password(String username, String password) throws Throwable {
		homePage = loginPage.login(username, password);
	}

	@When("^I login$")
	public void i_login() throws Throwable {
		String username = PropertyReader.readConfig(ConfigurationProperties.USERNAME);
		String password = PropertyReader.readConfig(ConfigurationProperties.PASSWORD);
		homePage = loginPage.login(username, password);
	}

	@Then("^I should see on home page$")
	public void i_should_see_on_home_page() throws Throwable {
		homePage.get();
	}

	@Then("^I logout$")
	public void i_logout() throws Throwable {
		homePage.logout();
	}

	@When("^I create new customer$")
	public void i_create_new_customer() throws Throwable {
		customerPage = homePage.goToCustomerPage();
		customerId = customerPage.enterCustomerDetails(customerDetails.get("CUSTOMERNAME"),
				customerDetails.get("GENDER"), customerDetails.get("DATEOFBIRTH"), customerDetails.get("ADDRESS"),
				customerDetails.get("CITY"), customerDetails.get("STATE"), customerDetails.get("PINNO"),
				customerDetails.get("PHONENO"), customerDetails.get("EMAIL"));
		scenario.write("Customer details : " + customerDetails.get("CUSTOMERNAME") + ", " + customerDetails.get("EMAIL"));
	}

	@Then("^I should get customerId$")
	public void i_should_get_customerID() throws Throwable {
		Assert.assertEquals(customerId.length() > 1, true);
		scenario.write("Customer Id : " + customerId);
	}

	@After
	public void after () {
		if (driver != null) {
			driver.quit();
		}
	}
}
