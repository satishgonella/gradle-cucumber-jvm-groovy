package calc;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by satish on 02/07/17.
 */
public class MyStepdefs {
    @Given("^I have entered (\\d+) into the calculator$")
    public void iHaveEnteredIntoTheCalculator(int arg0) throws Throwable {
      System.out.println("@given");
    }

    @When("^I press divide$")
    public void i_press_divide() throws Throwable {
        System.out.println("@When");

    }

    @Then("^the stored result should be (\\d+)\\.(\\d+)$")
    public void the_stored_result_should_be(int arg1, int arg2) throws Throwable {
        System.out.println("@then");
    }
}
