package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def_BackgroundExample {
	
	@Given("^The student finished high school$")
	public void the_student_finished_high_school() throws Throwable {
	   System.out.println("The student finished high school");
	}

	@Given("^The student finished High secondary school$")
	public void the_student_finished_High_secondary_school() throws Throwable {
	   System.out.println("The student finished High secondary school");
	}

	@Given("^The student applied for Medicine course$")
	public void the_student_applied_for_Medicine_course() throws Throwable {
	   System.out.println("The student applied for Medicine course");
	}

	@When("^Then student cleared the entrance exam$")
	public void then_student_cleared_the_entrance_exam() throws Throwable {
	   System.out.println("Then student cleared the entrance exam");
	}

	@Then("^The student is eligble to join the Medical college$")
	public void the_student_is_eligble_to_join_the_Medical_college() throws Throwable {
	   System.out.println("The student is eligble to join the Medical college");
	}

	@Given("^The student applied for Engineering course$")
	public void the_student_applied_for_Engineering_course() throws Throwable {
	    System.out.println("The student applied for Engineering course");
	}

	@When("^Then student has a sayable cutoff$")
	public void then_student_has_a_sayable_cutoff() throws Throwable {
	   System.out.println("Then student has a sayable cutoff");
	}

	@Then("^The student is eligble to join the Engineering college$")
	public void the_student_is_eligble_to_join_the_Engineering_college() throws Throwable {
	    System.out.println("The student is eligble to join the Engineering college");
	}


}
