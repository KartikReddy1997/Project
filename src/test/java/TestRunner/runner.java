package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/Features/Amazon.feature"},
        monochrome = true,
        glue = {"StepDef","Hooks"},tags = "@DESKTOP",
        plugin = {
                "pretty", "html:target/cucumber-report/single",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class runner {

}


