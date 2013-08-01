package scratch.cucumber.test;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Karl Bennett
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/cucumber-html-report", "json-pretty:target/cucumber-json-report.json"})
public class ITRunCucumber {
}
