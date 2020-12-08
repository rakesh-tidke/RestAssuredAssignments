package seventhRestTest;

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

	@When("posted with future date information")
	public void posted_with_future_date_information() {
	   response = RestAssured.get("/api/27-08-2020");
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	   
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertTrue(statusCode == 400);
		
		Assert.assertFalse(statusCode != 400);
		
		Assert.assertEquals(400, statusCode);
		
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		
		Assert.assertEquals("HTTP/1.1 400 Bad Request", statusLine);
		
	}
}
