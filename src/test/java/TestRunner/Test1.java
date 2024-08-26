package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Feature//project.feature",
glue = { "StepDefinition"},  monochrome=true,

/*tags = "@Sanity",*/
/*tags = "@Sanity or @System",*/

plugin = { "pretty","html:target/Cucumber/htmlreports.html",
		"json:target/JSON/Reports.json"})
public class Test1 extends AbstractTestNGCucumberTests{

}


