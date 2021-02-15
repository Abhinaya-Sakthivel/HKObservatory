package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:build/reports/tests/cucumber-extent/cucumber_report.html"
        },
        features = {"src/resources"},
        glue = {"Steps",
                "src/main/java/Utilities"},
        tags = "@testing",
        publish = true
       )
public class TaestRunner {
}
