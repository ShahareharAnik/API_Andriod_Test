package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src\\test\\resources\\Feature\\Android.feature"},
        glue = {"StepDefinition"}, monochrome = true, dryRun = false, // runs feature file from class, so false to stop
        plugin = {
                "pretty", "html:build/reports/feature.html"
        },tags = "@login or @MakePayment or @MortgageRequest or @ExpenseReport"
)
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
