package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",
				glue= {"stepDefinitions","hooks"},
				monochrome=true,
				plugin= {"html:report/webreport",
						 "json:report/JsonReport.json"},
				tags= {"@BackgroundExample"})

public class Runnerclass {
	
	//It should combine feature file and step definition
	
	

}
