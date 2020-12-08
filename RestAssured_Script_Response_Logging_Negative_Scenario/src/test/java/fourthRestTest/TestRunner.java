package fourthRestTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:FeatureFiles/Fourth.feature", glue="fourthRestTest")
public class TestRunner {

}
