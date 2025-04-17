package Runnerfiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/basic/"},
		glue={"basic"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report9.json",
		}
		)
public class RunnerForGoogleBasic_old {

}
