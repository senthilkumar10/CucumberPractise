package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("^User is entering google\\.com$")
	public void user_is_entering_google_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	    
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	  driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	   
	}

	@Then("^the user shoulld see the search results$")
	public void the_user_shoulld_see_the_search_results() throws Throwable {
	  boolean status = driver.findElement(By.partialLinkText("Dumbo")).isDisplayed();
	  if(status) {
		  System.out.println("Results Displayed");
	  }else {
		  System.out.println("Results No Displayed");
	  }
	  driver.quit();
	}

}
