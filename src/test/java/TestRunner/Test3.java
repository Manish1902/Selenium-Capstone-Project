package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//DataTable",
glue = { "StepDefinition" },  monochrome = true, 
plugin = { "pretty","html:target/Cucumber/dataTablereports.html" })

public class Test3 extends AbstractTestNGCucumberTests{

}
