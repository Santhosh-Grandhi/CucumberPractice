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

	}
