package StepDefinitionsForOrangeHRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				 glue= {"StepDefinitionsForOrangeHRM"},
				 plugin= {"json:target/cucumber.json"},
				 tags ="@SmokeTest")
public class Smoke {
	
}
