package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Timesheet_Entry_For_CEO_Step_Definitions {

	@Given("user is on the Login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login page");
	    	
	}

	@When("login by using correct credentials")
	public void login_by_using_correct_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("login page");
	}

	@When("Go to Time through Menu")
	public void go_to_time_through_menu() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("login page");
	}

	@When("Click on Time")
	public void click_on_time() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("login page");
	}

	@When("search CEO name")
	public void search_ceo_name() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("login page");
	}

	@Then("{string} should be displayed")
	public void should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("login page");
	}



}
