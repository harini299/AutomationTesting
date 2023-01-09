package Stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html-report.html"},
        features = {"src/test/Features/"},
        tags ="@TC_FOOTER_2.6"
)
public class TestRun {

}
