package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/FeatureFiles",
				glue= {"stepDefinitions","hooks"},
				monochrome=true,
				plugin= {"html:report/webreport",
						 "json:report/JsonReport.json"}
				)

public class Runnerclass {
	
	//It should combine feature file and step definition
	
	

}