package stepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition(DataTable tableValues) throws Throwable {
		System.out.println("i_want_to_write_a_step_with_precondition ");
		
		List<Map<String, String>> values = tableValues.asMaps(String.class, String.class);
		for(int i=0; i<values.size(); i++) {
			System.out.println("---- " + values.get(i).get("NUMBER"));
			System.out.println("---- " + values.get(i).get("WORDS"));
		}
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		System.out.println("i_complete_action");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		System.out.println("some_other_action");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		System.out.println("i_validate_the_outcomes");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		System.out.println("i_want_to_write_a_step_with_name");
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("i_check_for_the_in_step");
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
		System.out.println("i_verify_the_success_in_step");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
		System.out.println("i_verify_the_Fail_in_step");
	}
}
