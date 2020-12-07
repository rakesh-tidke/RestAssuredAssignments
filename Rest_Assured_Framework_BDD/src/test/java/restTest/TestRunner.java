package restTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "classpath:FeatureFiles/first.feature", glue= "restTest")
public class TestRunner {

}
