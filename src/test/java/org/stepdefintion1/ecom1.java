package org.stepdefintion1;

import org.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ecom1 extends BaseClass{

@Given("The user has to be in shopee home page")
public void the_user_has_to_be_in_shopee_home_page() {
	browserLaunch("chrome");
	urllaunch("https://shopee.sg/");
	implicitlyWait(20);
	driver.manage().window().maximize(); 
}

@When("The user has to search any product")
public void the_user_has_to_search_any_product() {
  
  
}

@When("The user has to check all the fuctionality in the product")
public void the_user_has_to_check_all_the_fuctionality_in_the_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("The user click add to cart and check other functions")
public void the_user_click_add_to_cart_and_check_other_functions() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("The user navigate to the payment page and the login functions")
public void the_user_navigate_to_the_payment_page_and_the_login_functions() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


}
