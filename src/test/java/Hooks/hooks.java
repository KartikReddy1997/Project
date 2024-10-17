package Hooks;

import BasePage.Basepage;

import io.cucumber.java.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class hooks {

//    @Before()
//    public static void initialize (){
//        Basepage.SetDriver();
//    }
//    @After()
//    public static void teardown(){
//        //Basepage.driver.quit();
//    }


    @BeforeAll
    public static void beforefeature() throws IOException {

        Variables.BrowserConfig.init();

    }


    @AfterStep
    public static void verifyCartContent1(Scenario scenario)
    {
        if (!scenario.isFailed())
        {
            byte[] screenshot =((TakesScreenshot)Basepage.driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Passed Screenshot", new ByteArrayInputStream(screenshot));
        }

        if (scenario.isFailed())
        {
            byte[] screenshot =((TakesScreenshot)Basepage.driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
            Basepage.driver.close();
        }


    }

}
