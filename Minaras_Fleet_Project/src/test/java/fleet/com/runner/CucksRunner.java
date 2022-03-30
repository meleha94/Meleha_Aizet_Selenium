package fleet.com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "timeline:target/timeline-report"
        },
        features = {
                "src/test/resources/feature"
        },
        glue = "fleet/com/step_definition",
        dryRun = false,
        tags = "@login",
        publish = true
)
public class CucksRunner {
}
