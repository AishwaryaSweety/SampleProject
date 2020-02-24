package p9;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@CucumberOptions(tags= {"@unit"})
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
//@CucumberOptions(monochrome=true,plugin= {"pretty","junit:cucumberuni.xml"})
@RunWith(Cucumber.class)
public class Runner {
	
}

