package generated.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/generated",
    glue = {"generated.steps"},
    tags = "@TC_EXPLORE_20260614124654",
    plugin = {"pretty", "html:target/cucumber-reports/TC_EXPLORE_20260614124654"}
)
public class TCEXPLORE20260614124654Runner {
}
