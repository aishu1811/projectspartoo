package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Utilityclass {



@Given("user have to open spartoo webpage")
public void user_have_to_open_spartoo_webpage() {
    System.out.println("abcdef");
    throw new cucumber.api.PendingException();
}

@When("user have to enter the product to be searched")
public void user_have_to_enter_the_product_to_be_searched() {
    System.out.println("12345");
    throw new cucumber.api.PendingException();
}

@When("user enter into the new product page")
public void user_enter_into_the_new_product_page() {
    System.out.println("ABCDEF");
    throw new cucumber.api.PendingException();
}

@Then("user will close the window")
public void user_will_close_the_window() {
    System.out.println("!@#$%");
    throw new cucumber.api.PendingException();
}

}
