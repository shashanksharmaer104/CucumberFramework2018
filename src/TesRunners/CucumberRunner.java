package TesRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
		glue= "",
		plugin  = { "pretty", "html:target/cucumber-reports" },
		monochrome = true)
public class CucumberRunner {

}
