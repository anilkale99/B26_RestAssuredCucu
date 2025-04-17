package basic1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateGoogleSD {
	
	@Given("Prepare URL")
	public void Prepare_URL() throws InterruptedException {
	    System.out.println("BAsic1-Step 1");
	    Thread.sleep(2000);
	}
	
	@Then("Check valid status code 200OK")
	public void check_valid_status_code_200ok() {
		System.out.println("BAsic1-Step 2");
	}
	
	@When("hit google Site should open and accessible")
	public void hit_google_site_should_open_and_accessible() {
		System.out.println("BAsic1-Step 3");
	}


}
