package get_SD;

import java.util.regex.Matcher;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGetResponse {
	
	String url = null;
	Response response = null;

	@Given("Hit books API")
	public void hit_books_api() {
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
		
		String tempString = "dafjd8akf";
		String tempString1 = "121212A";
		
		//boolean b = Matcher("{4}-/f{2}","2020-06-04T08:48:39.000Z");
		//Assert.assertTrue("Failed- atr value Not matching", b);
		
	}
	@Then("Validate API returns multiple books json")
	public void validate_api_returns_multiple_books_json() {
	    System.out.println("All logs "+ response.then().log().all());
	    int bookCount = response.body().jsonPath().getList("books").size();
	    System.out.println("Total book count = "+bookCount);
	    Assert.assertTrue("falied-Multiple books not present", bookCount > 1);
	}
	@Then("Validate attribute at json path {string} and its value {string}")
	public void Validate_attribute_at_json_path(String jsonPathStr , String expvalue) {
	    String actAttibutValue = response.body().jsonPath().getString(jsonPathStr);
	    System.out.println("actual atr from response = "+actAttibutValue);
	    Assert.assertTrue("Failed- atr value Not matching", b);
	}
	
}
