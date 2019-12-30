package stepDef;

import android.Calculator_Locator_Appium_One;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;

import java.util.List;

public class CalculatorSteps {

    Calculator_Locator_Appium_One calculator_appium_one = new Calculator_Locator_Appium_One();

    @Given("^When the app connection is configured$")
    public void when_the_app_connection_is_configured() throws Throwable {
        calculator_appium_one.setCapabilities();
    }

    @When("^User opens the Calculator App and enters the digits for Addition$")
    public void user_opens_the_Calculator_App_and_enters_the_digits_for_Addition() throws Throwable {
        calculator_appium_one.startCalculator();
    }

    @Then("^Calculator produces the result$")
    public void calculator_produces_the_result() throws Throwable {
        calculator_appium_one.processing();
    }

    @When("^User opens the Calculator App and enters first set of number$")
    public void user_opens_the_Calculator_App_and_enters_first_set_of_number(List<String> list) throws Throwable {

        calculator_appium_one.enterInout(list.get(list.size()-1));
    }

    @Then("^Enter the required operation$")
    public void enter_the_required_operation(List<String> list) throws Throwable {

        calculator_appium_one.selectOperation(list.get(list.size()-1));
    }

    @When("^Enters second set of number$")
    public void enters_second_set_of_number(List<String> list) throws Throwable {

        calculator_appium_one.enterInout(list.get(list.size()-1));
    }

}
