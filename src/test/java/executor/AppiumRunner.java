package executor;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/features",
        glue = {"stepDef"},
        tags = "@calculator",
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        }
        //plugin = { "com.cucumber.listener.ExtentCucumberFormatter:test-output/Appium-Test-Report/AppiumReport.html"}
)

public class AppiumRunner extends AbstractTestNGCucumberTests {
}
