package fifthRestTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "classpath:FeatureFiles/Fifth.feature", glue= "fifthRestTest")
public class TestRunner {

}
