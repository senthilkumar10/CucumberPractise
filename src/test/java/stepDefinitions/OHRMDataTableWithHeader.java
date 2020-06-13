package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRMDataTableWithHeader {
	
	WebDriver driver;

	@Given("^Login to Orange HRM$")
	public void login_to_Orange_HRM() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^Input UN and Password as below$")
	public void input_UN_and_Password_as_below(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String,String>> cred = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("txtUsername")).sendKeys(cred.get(0).get("UserName"));
		driver.findElement(By.id("txtPassword")).sendKeys(cred.get(0).get("Password"));

	}

	@When("^Click on the Login button to land Home Page$")
	public void click_on_the_Login_button_to_land_Home_Page() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
	

}
