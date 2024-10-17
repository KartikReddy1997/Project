package StepDef;

import PageObjects.AmazonHomePage;
import PageObjects.AmazonLoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetails {
    AmazonContainer Amazon=new AmazonContainer();

    @When("User clicks on signin button")
    public void userClicksOnSigninButton() {
        Amazon.homePage.clickSignIN();
        System.out.println("user clicks on Sign in");
    }

    @And("Enters {string} and {string}")
    public void entersAnd(String username, String password) {
        Amazon.loginPages.userSignIN(username,password);
        System.out.println("user sends username and pwd");

    }

    @Then("User Should Login Successfully")
    public void userShouldLoginSuccessfully() {

        System.out.println("user Login Successfully");
    }


}
