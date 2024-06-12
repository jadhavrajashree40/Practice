package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Login page");
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("enter username and password");
    }
    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("navigated to home page");
    }
}
