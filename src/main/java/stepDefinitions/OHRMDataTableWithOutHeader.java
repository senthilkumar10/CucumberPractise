package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRMDataTableWithOutHeader {
	
	WebDriver driver;

	@Given("^You are on the Login Page$")
	public void you_are_on_the_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^You enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<String> credentials = dataTable.asList(String.class);
		 driver.findElement(By.id("txtUsername")).sendKeys(credentials.get(0));
		 driver.findElement(By.id("txtPassword")).sendKeys(credentials.get(1));

	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^You should see the home page$")
	public void you_should_see_the_home_page() throws Throwable {
		String text = driver.findElement(By.id("MP_link")).getAttribute("value");
		Assert.assertEquals("Marketplace", text);
		driver.quit();
	}

}
