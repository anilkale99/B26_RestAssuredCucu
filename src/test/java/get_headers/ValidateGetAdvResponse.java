package get_headers;

import java.util.Iterator;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ValidateGetAdvResponse {
	
	String url = null;
	Response response = null;

	@Given("Hit books API")
	public void hit_books_api() {
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
	}
	
	@Then("Validate headers")
	public void Validate_headers() {
		String oneHeader = response.getHeader("connection");
		System.out.println("value - "+oneHeader);
		Assert.assertTrue(oneHeader.equals("keep-alive"));
		Headers allHeadears =  response.getHeaders();
		
		for (Header singleHeader : allHeadears) {
			System.out.println("Header name " + singleHeader.getName() + " - " + singleHeader.getValue());
		}
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
		System.out.println("Validation step");
		boolean result = false;
		int bookCount = response.body().jsonPath().getList("books").size();
		for (int i = 0; i < bookCount; i++) {
			String jsonPathReplace =  jsonPathStr.replace("XX", ""+i+"");
			System.out.println("newly built json path = "+jsonPathReplace);
			String actuTitle = response.body().jsonPath().getString(jsonPathReplace);
			if(actuTitle.equals(expvalue)) {
				System.out.println("attribute value present");
				result = true;
				break;
			}else {
				result = false;
			}
		}
		Assert.assertTrue("Failed- atr value Not matching", result);
	}
	
}
