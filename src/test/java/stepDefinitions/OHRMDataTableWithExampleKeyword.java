package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRMDataTableWithExampleKeyword {

	WebDriver driver;

	@Given("^Proceed to Login$")
	public void proceed_to_Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^User enters \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_and_Password(String userName, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^Clicked button$")
	public void clicked_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}


	@Then("^Home page Landed$") public void Home_page_Landed() throws Throwable {
		String text1 = driver.findElement(By.id("MP_link")).getAttribute("value");
		Assert.assertEquals("Marketplace", text1); driver.quit(); 
	}

}
