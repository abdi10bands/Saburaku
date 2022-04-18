import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\features"}, //the path of the feature files
        glue={"stepdefinitions"}, //the path of the step definition files
        format= {"pretty","html:test-output", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"}
)

public class TestRunner {
}
