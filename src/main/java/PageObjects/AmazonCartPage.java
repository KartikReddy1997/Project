package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static BasePage.Basepage.driver;

public class AmazonCartPage {


    private final WebDriver driver;
    @FindBy(how = How.XPATH, using="//h3[normalize-space()='Your Amazon Cart is empty']")
    WebElement emptycart;
    public AmazonCartPage(WebDriver driver) {

        this.driver =driver;
        PageFactory.initElements(driver, this);
    }



    public void verifyCartContent(String product)
    {

    }
    public void verifyCartContent(){

//       WebElement emptycart =driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']"));
        System.out.println(">>>>>"+emptycart.getText());

    }

}
