package com.ticker.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/com/ticker/feature"
,glue={"com.ticker.stepdefination"},
plugin = {"pretty" ,"html:target/Cucumber-reprots"})
public class Testrunner {

}
