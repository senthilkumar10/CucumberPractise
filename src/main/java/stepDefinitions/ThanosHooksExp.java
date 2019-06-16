package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThanosHooksExp {

	@Given("^Thanos has infinity stones$")
	public void thanos_has_infinity_stones() throws Throwable {
		System.out.println("Thanos has infinity stones");
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
		System.out.println("Thanos snaps his fingers");
	}

	@Then("^Half of the living things die$")
	public void half_of_the_living_things_die() throws Throwable {
		System.out.println("Half of the living things die");
	}
	
	
}
