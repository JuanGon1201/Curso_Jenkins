package co.com.AutoServicesRest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consumeServicesAPI.feature",
        glue = "co.com.AutoServicesRest.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Test"
)

public class testRunnerService {
}
