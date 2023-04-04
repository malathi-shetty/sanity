package cucumber_check;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	 features = "features/sanity.feature",
	//	features = "features",
		glue = "stepdef",
	//	dryRun = true
		dryRun=false,
		//publish = true
		tags="@valid"
	
		)
public class TestRunner {

}
