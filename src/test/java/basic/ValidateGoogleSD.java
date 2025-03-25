package basic;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGoogleSD {
	
	String url = null;
	Response response = null;
	 
	@Given("Prepare URL")
	public void Prepare_URL() throws InterruptedException {
	    url = "http://www.google.com/";
	}
	
	@When("hit google Site should open and accessible")
	public void hit_google_site_should_open_and_accessible() {
		response = RestAssured.given().get("http://www.google.com/");
	}
	
	@Then("Check valid status code {int} OK")
	public void check_valid_status_code_ok(int expStatCode) {
		int actualstCode = response.statusCode();
		Assert.assertTrue("Status code not matching", actualstCode == expStatCode);
	}
	
	@When("hit amazon Site should open and accessible")
	public void hit_amazon_site_should_open_and_accessible() {
		response = RestAssured.given().get("http://www.amazon.com/");
	}
	
	


}
