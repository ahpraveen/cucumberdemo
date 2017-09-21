package BDDCucumber.BDDCucumberDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/BDDCucumber/BDDCucumberDemo/Example.feature",
		glue = {"BDDCucumber.StepDefinitions"},
		plugin = {"pretty", "html:target/cucumber"}
		)
public class RunCukesTest {

}