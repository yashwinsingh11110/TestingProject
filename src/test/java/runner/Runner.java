package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
            "src/test/resources/features/CreateUser.feature",
            "src/test/resources/features/Login.feature"
        },
        glue = {
            "stepDefinitions",
            "hooks"
        },
        dryRun = false,
        plugin = {
            "pretty",
            "html:target/cucumber-report/cucumber_html.html",
            "json:target/cucumber-report/cucumber_json.json",
            "junit:target/cucumber-report/cucumber_junit.junit"
        },
        monochrome = false
)
public class Runner extends AbstractTestNGCucumberTests {
}
