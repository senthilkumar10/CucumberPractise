package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFiles/OrangeHRM.feature",glue="stepDefinitions")
public class Runnerclass {
	
	//It should combile feature file and step definition
	
	

}
