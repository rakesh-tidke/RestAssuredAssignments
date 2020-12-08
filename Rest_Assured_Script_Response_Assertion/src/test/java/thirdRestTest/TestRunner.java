package thirdRestTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:FeatureFiles/Third.feature", glue="thirdRestTest")
public class TestRunner {

}
