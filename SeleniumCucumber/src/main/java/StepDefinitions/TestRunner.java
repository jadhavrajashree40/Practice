package StepDefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features",glue={"StepDefinitions"},
monochrome=true,
        plugin={"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
        "html:target/HTMLReports/report.html"},
        tags = "@SmokeTest"
)
public class TestRunner {
}
