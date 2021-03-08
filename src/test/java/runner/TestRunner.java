package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\Desktop\\eclipse\\BDDPOMAug2nd\\src\\main\\java\\feature",
				 glue = "step_definitions",
				 plugin = {"pretty", "html:target/Cucumber-html-report", "json:target/Cucumber-Json-report"},
				 monochrome = true)
//				 tags = {"~@Smoke"} & html report ????

public class TestRunner {

}
