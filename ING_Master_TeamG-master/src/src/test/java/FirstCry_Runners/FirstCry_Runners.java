package FirstCry_Runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./src/test/java/FirstCry_Features"
					,glue={"FirstCry_StepDef"}
					,plugin = { "pretty", "html:testOutput/cucumber.html","json:testOutput/cucumber.json" }
					,tags = "@Home"
					,monochrome = true
					,dryRun = false )	
public class FirstCry_Runners {

}
