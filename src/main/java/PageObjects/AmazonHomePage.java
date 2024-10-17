package PageObjects;

import BasePage.Basepage;
import Variables.BrowserConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends Basepage {

private final WebDriver driver;
    public AmazonHomePage(WebDriver driver) {

        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using="//div[@id='nav-cart-count-container']")
    WebElement cart;
    @FindBy(how = How.XPATH, using="//input[@name='field-keywords']")
    WebElement searchbar;
    @FindBy(how = How.XPATH, using="//input[@id='nav-search-submit-button']")
    WebElement searchicon;
    @FindBy(how = How.XPATH, using="//span[@id='nav-link-accountList-nav-line-1']")
    WebElement signin;


   // private static By cart=By.xpath("//div[@id='nav-cart-count-container']");
//    private static By searchbar=By.xpath("//input[@name='field-keywords']");
//    private static By searchicon=By.xpath("//input[@id='nav-search-submit-button']");
//    private static By signin=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");




    public void LaunchURL()
    {
        String URL= BrowserConfig.property.getProperty("URL");
        driver.get(URL);

    }

    public void clickCart()    {

      cart.click();
    }

    public  void searchForProduct(String product){
        searchbar.sendKeys(product);
        searchicon.click();
    }


    public  void clickSignIN(){

        signin.click();
    }
}
