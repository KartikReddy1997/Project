package PageObjects;

import BasePage.Basepage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.ByteArrayInputStream;

public class AmazonLoginPages extends Basepage {

    private final WebDriver driver;
    public AmazonLoginPages(WebDriver driver) {

        this.driver =driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(how = How.XPATH,using="//input[@type='email']")
    WebElement email_textbox;
    @FindBy(how = How.XPATH,using="//input[@id='continue']")
    WebElement email_submit_button;
    @FindBy(how = How.XPATH,using="//input[@type='password']")
    WebElement password_textbox;
    @FindBy(how = How.XPATH,using="//input[@id='signInSubmit']")
    WebElement password_submit_button;

//    static WebDriver driver;

//    public static void LaunchURL()
//    {
//        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.in/");
//    }
//
//    public static void clickCart()
//    {
//        driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
//    }
//
//
//    public static void verifyCartContent()
//    {
//
//        WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
//        System.out.println(">>>>>"+emptycart.getText());
//        driver.close();
//    }

public  void userSignIN(String username, String password){

    email_textbox.sendKeys(username);
    email_submit_button.click();
    password_textbox.sendKeys(password);
    password_submit_button.click();
}

    public  void verifyUserLogin()
    {
        String title =driver.getTitle();
        System.out.println(title);
        if(title==""){
            System.out.println("User Login successful");
        }

    }


}
