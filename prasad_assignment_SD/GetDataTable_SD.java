package prasad_assignment_SD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetDataTable_SD {

	Response response = null;

	//Response invalidResponse = null;
	
	
	@Given("Hit books API")
	public void hit_books_api() {

			response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
			System.out.println("output = " + response.statusCode());

	}

	@When("I send Get request to {string}")
	public void i_send_get_request_to(String booksAPI) {
		
			System.out.println("GET API path: " + booksAPI);
			Assert.assertEquals(200, response.statusCode());

	}

	@Then("Validate attribute at json Path and its value")
	public void validate_attribute_at_json_path_and_its_value(DataTable dataTable) {
			
			List<List<String>> bookList = dataTable.asLists(String.class);
			
			for (int i = 0; i < bookList.size(); i++) {
				
				String jsonPathValue 	= 	bookList.get(i).get(0);
				String expectedValue 	=	bookList.get(i).get(1);
				
				String actualAttributeValue = response.body().jsonPath().getString(jsonPathValue);
				System.out.println("actual attribute from response" + actualAttributeValue);
				
				Assert.assertEquals("Failed actual value and expected value do not match: " + jsonPathValue, expectedValue, actualAttributeValue);
				
			}
			
		
	}

}
