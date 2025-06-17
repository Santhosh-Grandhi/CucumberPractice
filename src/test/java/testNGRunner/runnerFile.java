package testNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",
glue="stepDefinitions",monochrome=true,tags="@MobileTest")
public class runnerFile extends AbstractTestNGCucumberTests {

}
