package com.w2a.feature;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() {
		
		System.out.println("@Given----user navigates to facebook website");
	    
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() {
		
		System.out.println("@When---user validates the homepage title");
	   
	}

	@Then("^user entered username$")
	public void user_entered_username() {
		
		System.out.println("@Then---user entered username");
	   
	}

	@And("^user entered password$")
	public void user_entered_password() {
		
		System.out.println("@And---user entered password");
	    
	}

	@Then("^user should be succesfully logged in$")
	public void user_should_be_succesfully_logged_in() {
		
		System.out.println("@Then---user should be succesfully logged in");
	   
	}

}
