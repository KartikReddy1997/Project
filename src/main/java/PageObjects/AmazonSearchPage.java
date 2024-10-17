package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static BasePage.Basepage.driver;

public class AmazonSearchPage {


    private final WebDriver driver;
    public AmazonSearchPage(WebDriver driver) {

        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    public  void  pickProduct(String product) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> items=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        //System.out.println(items.size());
        for(WebElement i:items) {
            System.out.println(i.getText());
            if(i.getText().toLowerCase().contains(product.toLowerCase())) {
                i.click();
                return;
            }
        }

    }
}
