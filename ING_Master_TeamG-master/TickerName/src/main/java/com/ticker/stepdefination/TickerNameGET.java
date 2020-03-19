package com.ticker.stepdefination;

import org.json.simple.parser.ParseException;

import com.TickerNames.pages.GETTickernamesPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TickerNameGET {
	
	@Given("GetBase URL for Get Operations")
	public void getbase_URL_for_Get_Operations() {
		
		GETTickernamesPages.GetBaseURI();
	}
	    
	

	@When("Send the Request for Get Operations")
	public void send_the_Request_for_Get_Operations() {
		
		GETTickernamesPages.GetAPIRequest();
	   
	}

	@Then("Validate the Get Operations")
	public void validate_the_Get_Operations() throws ParseException {
		
		
		GETTickernamesPages.ValidateAPIResponse();
	
	}

}
