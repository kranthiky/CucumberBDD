package StepDefinitionsForOrangeHRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/MyLeaves.feature",
				 glue= {"StepDefinitionsForOrangeHRM"},
				 plugin = {"json:target/cucumber-reports/cucumber.json"})
public class TestRunner {
	
}
