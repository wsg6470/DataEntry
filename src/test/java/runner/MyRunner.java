package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\shano\\eclipse-workspace\\DataEntryJob\\src\\test\\java\\Feature\\login.feature"},
		glue = {"stepDefinition"},
		monochrome = true)

public class MyRunner {
	

}
