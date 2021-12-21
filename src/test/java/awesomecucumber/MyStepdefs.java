package awesomecucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I'm dummy")
    public void iMDummy() {

    }


    @When("I do dummy things")
    public void i_do_dummy_things() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("dummy thing happens")
    public void dummy_thing_happens() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I'm on the store page")
    public void i_m_on_the_store_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I add a {string} to the cart")
    public void i_add_a_to_the_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see {int} {string} in the cart")
    public void i_see_in_the_cart(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}