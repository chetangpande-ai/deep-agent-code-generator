package generated.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/generated",
    glue = {"generated.steps"},
    tags = "@TC_MANUAL_001",
    plugin = {"pretty", "html:target/cucumber-reports/TC_MANUAL_001"}
)
public class TCMANUAL001Runner {
}
