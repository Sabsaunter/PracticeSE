package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature", glue= {"steps","hooks"}, monochrome = true, publish = true, tags="@smoke")
public class RunTest extends AbstractTestNGCucumberTests{

}
