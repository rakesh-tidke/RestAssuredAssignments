package fourthRestTest;

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
	    response = RestAssured.get("/api/");
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    
		int statusCode = response.getStatusCode();
		System.out.println("Status code: "+ statusCode);
		Assert.assertTrue(statusCode != 200);
		
		response = RestAssured.given()
				.headers("Content-Type", "application/json")
				.log().all().get("/api/")
				.then()
				.assertThat().statusCode(400).log().all().extract().response();
	}
}
