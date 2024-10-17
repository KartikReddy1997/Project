package BasePage;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class Basepage {
    public static WebDriver driver;

      public  static WebDriver getDriver() {

          if (driver == null) {
              System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
              ChromeOptions chromeOptions = new ChromeOptions();
              chromeOptions.addArguments("--remote-allow-origins=*");
              driver = new ChromeDriver(chromeOptions);
              driver.manage().window().maximize();
          }
          return driver;

    }

    public static void switchWindow(String windowTitle) {

        Set<String> s = driver.getWindowHandles();
        for (String windowHandle : s) {
            String Title = driver.switchTo().window(windowHandle).getTitle();
            if (Title.contains(windowTitle)) {
                break;
            }
        }

    }
}
