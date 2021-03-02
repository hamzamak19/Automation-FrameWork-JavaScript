
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features=
                "src/test/resources/Features/CucumberFile.feature",

        plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json"},
        tags="@nazoor"
//        junit = "--step-notifications"

)

public class Runner1Test
{

}