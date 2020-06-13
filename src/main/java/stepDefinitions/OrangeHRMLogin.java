package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMLogin {

	WebDriver driver;
	
	@Given("^the login page of Orange HRM is launched$")
	public void the_login_page_of_Orange_HRM_is_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^the user enters the valid userName and Password$")
	public void the_user_enters_the_valid_userName_and_Password() throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page() throws Throwable {
	  String text = driver.findElement(By.id("MP_link")).getAttribute("value");
	  Assert.assertEquals("Marketplace", text);
	  driver.quit();
	}

	
	
}
