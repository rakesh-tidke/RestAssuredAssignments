package thirdRestTest;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefination {
	
	Response response;
	
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		RestAssured.baseURI = "https://api.ratesapi.io";
	}

	@When("posted with correct information")
	public void posted_with_correct_information() {
	  response = RestAssured.get("/api/latest");
	}

	@Then("validate the positive response code received")
	public void validate_the_positive_response_code_received() {
	    	
		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);
		
		Assert.assertFalse(statusCode != 200);
		
		String contentType = response.getContentType();
		Assert.assertEquals("application/json", contentType);
	}

}
