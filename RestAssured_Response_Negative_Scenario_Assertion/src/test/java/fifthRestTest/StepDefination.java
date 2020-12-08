package fifthRestTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefination {
	
	Response response;
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    RestAssured.baseURI = "https://api.ratesapi.io";
	}
	
	@Test
	@When("posted with correct information")
	public void posted_with_correct_information() {
	    response = RestAssured.get("/api");
	}
	
	@Test
	@Then("validate positive response object")
	public void validate_positive_response_object() {
	  
		int statusCode = response.getStatusCode();
		System.out.println("Status code = "+ statusCode);
		
		Assert.assertEquals(statusCode, 400);
		
		Assert.assertTrue(statusCode != 200);
		
	}

}
