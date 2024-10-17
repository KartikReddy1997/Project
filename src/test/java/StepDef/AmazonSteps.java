package StepDef;

import BasePage.Basepage;
import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;



public class AmazonSteps extends Basepage{

    AmazonContainer Amazon=new AmazonContainer();


    @Given("I am on Amazon application")
    public void iAmOnAmazonApplication() {
        Amazon.homePage.LaunchURL();
    }

    @When("I move to cart")
    public void iMoveToCart() {
        Amazon.homePage.clickCart();
    }

    @Then("User should see You cart is empty")
    public void userShouldSeeYouCartIsEmpty() {

        Amazon.cartPage.verifyCartContent();
    }


    @When("User search for a particular {string}")
    public void userSearchForAParticular(String product) throws InterruptedException {
        Amazon.homePage.searchForProduct(product);
        Amazon.searchPage.pickProduct(product);

    }

    @And("User adds the {string} to the cart")
    public void userAddsTheToTheCart(String product) throws InterruptedException {
        Basepage.switchWindow(product);
        Thread.sleep(2000);
        Amazon.productPage.addProductToCart();

    }

    @And("Validate {string} is added to the cart")
    public void validateProductIsAddedToTheCart(String product) {
        Amazon.cartPage.verifyCartContent(product);
        System.out.println("verify product");
    }
}
