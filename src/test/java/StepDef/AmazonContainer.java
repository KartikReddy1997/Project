package StepDef;


import BasePage.Basepage;
import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class AmazonContainer extends Basepage {
    private WebDriver driver;
    AmazonCartPage cartPage;
    AmazonHomePage homePage;
    AmazonLoginPages loginPages;
    AmazonProductPage productPage;
    AmazonSearchPage searchPage;

    AmazonContainer(){
        driver = Basepage.getDriver();
        initPages();
    }

    private void initPages() {
        cartPage=new AmazonCartPage(driver);
        homePage=new AmazonHomePage(driver);
        loginPages=new AmazonLoginPages(driver);
        productPage=new AmazonProductPage(driver);
        searchPage=new AmazonSearchPage(driver);
    }

}
