package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }



	/*
	
	@Before
	public void beforeScenario() {
		System.out.println("This will run before every scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("This will run after every scenario");
	}
	
	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run before First scenario");
	}
	
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("This will run before Second scenario");
	}
	
	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run before Third scenario");
	}
	
	@After("@First")
	public void afterFirst() {
		System.out.println("This will run after First Scenario");
	}
	
	@After("@Second")
	public void afterSecond() {
		System.out.println("This will run after Second Scenario");
	}
	
	@After("@Third")
	public void afterThird() {
		System.out.println("This will run after Third Scenario");
	}
	

	  @Before(order=1) public void beforeSnapping() {
	  System.out.println("Thanos collecting the infinity stones"); }
	  
	  @After(order=1) public void afterSnapping() {
	  System.out.println("Taking rest in Garden"); }
	  
	  @Before(order=0) public void beforeToBeforScenario() {
	  System.out.println("Thanos born"); }
	  
	  @After(order=0) public void afterToAfterScenario() {
	  System.out.println("Thanos Died"); }
	 
	 */
}
