import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Cucumber_Features/Login.Feature",glue="Cucumber")

public class LoginTest
{
	
}
