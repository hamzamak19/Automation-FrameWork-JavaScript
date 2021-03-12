
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features=
                "src/test/resources/Features/Register.feature",
        tags="@nazoor"
//        junit="--step-notifications"

)

public class Runner1Test
{

}