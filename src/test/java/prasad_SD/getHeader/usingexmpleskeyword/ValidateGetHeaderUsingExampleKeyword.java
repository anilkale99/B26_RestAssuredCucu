package prasad_SD.getHeader.usingexmpleskeyword;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGetHeaderUsingExampleKeyword {

		
		String urlString = null;
		Response response = null;
		
		@Given("Hit books API")
		public void hit_books_api() {
				response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
		}
		
		
			
		@Then("Validate headers {string} and its value {string}")
		public void validate_headers_and_its_value(String headerParamater, String expectedValue) {
		   
				String actualHeaderValue = response.getHeader(headerParamater);
				
				System.out.println("Header paramater: " +headerParamater);
				System.out.println("Actual header paramater value : " + actualHeaderValue);
				System.out.println("Expected header paramater value : " + expectedValue);
				
				Assert.assertEquals(actualHeaderValue, expectedValue);
			
		}
		
}
