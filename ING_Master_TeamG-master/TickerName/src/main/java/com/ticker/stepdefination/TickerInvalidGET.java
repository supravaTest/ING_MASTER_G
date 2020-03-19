package com.ticker.stepdefination;

import com.TickerNames.pages.GETTickerInvalidpages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TickerInvalidGET {
	
	@Given("GetBase URL to validate for Get Operations")
	public void getbase_URL_to_validate_for_Get_Operations() {
	  GETTickerInvalidpages.GetBaseURI_400();
	}

	@When("send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		 GETTickerInvalidpages.GetAPIRequest();
	   
	}

	@Then("Valdate incorrect details for the Get Operations")
	public void valdate_incorrect_details_for_the_Get_Operations() {
		 GETTickerInvalidpages.ValidateAPIResponse();
	}




}
