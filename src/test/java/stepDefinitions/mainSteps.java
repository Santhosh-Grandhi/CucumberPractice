package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
		
		@Given("I want to write a step with precondition")
		public void i_want_to_write_a_step_with_precondition() {
		    System.out.println("Given statement executed");
		}
		@When("I complete action")
		public void i_complete_action() {
			System.out.println("When statement executed");
		}
		@Then("I validate the outcomes")
		public void i_validate_the_outcomes() {
			System.out.println("Then statement executed");
		}
		@Then("check more outcomes")
		public void check_more_outcomes() {
			System.out.println("And statement executed");
		}
		
		
		@Given("User launching web application")
		public void user_launching_web_application() {
			System.out.println("application is launched");
		}
//		@When("Using credentials {string} and {string}")
//		public void using_credentials_and(String username, String password) {
//			System.out.println(username+" and "+password);
//		}
		
		@When("^Using credentials (.+) and (.+)$")
		public void using_credentials_and(String username, String password) {
			System.out.println(username+" and "+password);
		}
		@Then("Landing page is displayed")
		public void login_page_is_displayed() {
			System.out.println("Landing page is displayed");
		}
		@Then("Application is interactable")
		public void application_is_interactable() {
			System.out.println("application is working fine");
		}

	}
