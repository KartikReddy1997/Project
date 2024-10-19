package PageObjects;


import BasePage.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static BasePage.Basepage.driver;

public class AmazonProductPage {

    private final WebDriver driver;
    public AmazonProductPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using="//body[1]/div[4]/div[1]/div[3]/div[8]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[38]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement add_to_cart_button;

public  void addProductToCart() throws InterruptedException {
    Basepage.switchWindow("iPhone 15 Pro");
    add_to_cart_button.click();
    Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
}
}
