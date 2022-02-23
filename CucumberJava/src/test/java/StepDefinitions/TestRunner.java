package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JUN�TReports/report.xml"}
		)
public class TestRunner {

}
