package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/project.feature", 
glue = {"StepDefinition"}, monochrome=true,
plugin = {"pretty","html:target/Cucumber/htmlreports.html",
"junit:target/JUunit/junitreports.xml"})

public class Test2 {

}


