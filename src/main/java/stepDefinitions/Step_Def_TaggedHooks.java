package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_TaggedHooks {

	@Given("^this is first step$")
	public void this_is_first_step() throws Throwable {
	 System.out.println("This is First Step");   
	 
	}

	@When("^this is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("This is Second Step");
	}

	@Then("^this is third step$")
	public void this_is_third_step() throws Throwable {
		System.out.println("This is Third Step");
	}

	
}
